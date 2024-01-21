package singletonTask

import singletonTask.Enums.MessageType

fun main() {
    Journal.writeToJournal(JournalMessage(MessageType.INF, "Program started"))
    println("For testing journal system input two numbers to calculate a/b:")
    print("a = ")
    val a = readln().toIntOrNull()
    if(a == null) {
        Journal.writeToJournal(JournalMessage(MessageType.ERR, "Entered input isn't a valid number"))
    }
    print("b = ")
    val b = readln().toIntOrNull()
    if(b == null)
        Journal.writeToJournal(JournalMessage(MessageType.ERR, "Entered input isn't a valid number"))
    if(a == null || b == null){
        Journal.writeToJournal(JournalMessage(MessageType.WRN, "Division won't be processed, because input is invalid"))
        Journal.writeToJournal(JournalMessage(MessageType.INF, "Program is finished"))
        return
    } else {
        val calculator = DemoCalculator()
        Journal.writeToJournal(JournalMessage(MessageType.INF,"A calculator was created"))
        calculator.division(a, b)
    }
    Journal.writeToJournal(JournalMessage(MessageType.INF, "Program is finished"))
}

fun getCurrentLocation(): String {
    val stackTrace = Thread.currentThread().stackTrace
    return if (stackTrace.size >= 3) {
        val caller = stackTrace[3]
        "File: ${caller.fileName}, Class: ${caller.className}, Method: ${caller.methodName}, Line: ${caller.lineNumber}"
    }
    else {
        "The thread is empty"
    }
}