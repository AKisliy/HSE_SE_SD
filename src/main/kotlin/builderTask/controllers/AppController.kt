package builderTask.controllers

import builderTask.enums.FilePaths
import builderTask.ObservableList
import builderTask.products.HomeworkReport
import builderTask.products.LabReport

class AppController {
    private val filesController = FilesController()
    fun startApp(): Pair<ObservableList<LabReport>, ObservableList<HomeworkReport>>{
        val labsList = filesController.getData<MutableList<LabReport>>(FilePaths.LABS_REPORTS.path)
        val homeworksList = filesController.getData<MutableList<HomeworkReport>>(FilePaths.HOMEWORKS_REPORTS.path)

        val labReports = ObservableList(labsList)
        val homeworkReports = ObservableList(homeworksList)

        labReports.addObserver{ _, _ -> filesController.saveChanges(labsList, FilePaths.LABS_REPORTS.path)}
        homeworkReports.addObserver{ _, _ -> filesController.saveChanges(homeworksList, FilePaths.HOMEWORKS_REPORTS.path)}
        return Pair(labReports, homeworkReports)
    }
}