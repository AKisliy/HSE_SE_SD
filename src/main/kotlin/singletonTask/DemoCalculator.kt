package singletonTask

import singletonTask.Enums.MessageType

class DemoCalculator {
    fun division(a: Int, b: Int) : Double {
        return if (b == 0) {
            Journal.writeToJournal(JournalMessage(MessageType.ERR, "Division by zero"))
            0.0
        } else {
            val result = a/b.toDouble()
            Journal.writeToJournal(JournalMessage(MessageType.INF, "Division result: $result"))
            result
        }
    }
}