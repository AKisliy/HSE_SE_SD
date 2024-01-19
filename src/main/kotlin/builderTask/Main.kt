package builderTask

import builderTask.builders.HomeworkReportBuilder
import builderTask.builders.LabReportBuilder
import builderTask.controllers.AppController
import builderTask.controllers.InputController
import builderTask.enums.ReportType
import builderTask.interfaces.IReportBuilder

fun main(args: Array<String>) {
    val app = AppController()
    val (labs, hws) = app.startApp()

    val inputController = InputController()
    val labBuilder = LabReportBuilder()
    val hwBuilder = HomeworkReportBuilder()

    println("Welcome to reports formatter!")
    while(true){
        val type = inputController.getReportType()
        when(type){
            ReportType.HOMEWORK_REPORT -> {
                makeReport(hwBuilder)
                println("Enter time(in hours) that homework took")
                hwBuilder.setTime(inputController.getInt())
                hws.add(hwBuilder.getProduct())
            }
            ReportType.LAB_REPORT -> {
                makeReport(labBuilder)
                println("Enter tools that you used(divided by commas(\",\")):")
                labBuilder.setUsedTools(readln().split(','))
                labs.add(labBuilder.getProduct())
            }
        }
        println("Want to continue? YES - 1, NO - 2")
        if(inputController.getIntInRange(1,2) == 2)
            break
    }
    println("Thank you for using")
    labs.saveChanges()
    hws.saveChanges()
}

fun makeReport(builder: IReportBuilder){
    println("Enter title:")
    builder.setTitle(readln())
    println("Enter task:")
    builder.setTask(readln())
    println("Enter abstract:")
    builder.setAbstract(readln())
    println("Enter content of your report:")
    builder.setContent(readln())
    println("Enter sources(divided by comma(\",\")):")
    builder.setSources(readln().split(','))
    println("Enter appendices(divided by comma(\",\"):")
    builder.setAppendices(readln().split(','))
}