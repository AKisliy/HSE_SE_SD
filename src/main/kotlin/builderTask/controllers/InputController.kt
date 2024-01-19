package builderTask.controllers

import builderTask.enums.ReportType

class InputController {
    fun getReportType(): ReportType {
        println("Please, choose report type: 1 - homework report, 2 - lab report")
        var choice = readln().toIntOrNull()
        while(choice == null || choice < 1 || choice > 2){
            println("Wrong input! Try again:")
            choice = readln().toIntOrNull()
        }
        if(choice == 1)
            return ReportType.HOMEWORK_REPORT
        return ReportType.LAB_REPORT
    }

    fun getInt(): Int{
        var input = readln().toIntOrNull()
        while(input == null){
            println("Incorrect input. Try again!")
            input = readln().toIntOrNull()
        }
        return input
    }

    fun getIntInRange(from: Int, to: Int): Int{
        var input = readln().toIntOrNull()
        while(input == null || input < from || input > to){
            println("Incorrect input. Try again!")
            input = readln().toIntOrNull()
        }
        return input
    }
}