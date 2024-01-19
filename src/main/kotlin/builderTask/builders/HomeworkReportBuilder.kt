package builderTask.builders

import builderTask.products.HomeworkReport
import builderTask.interfaces.IReportBuilder

class HomeworkReportBuilder : IReportBuilder {
    private var product: HomeworkReport = HomeworkReport()

    override fun setTitle(title: String) {
        product.title = title
    }

    override fun setTask(task: String) {
        product.task = task
    }

    override fun setAbstract(abstract: String) {
        product.abstract = abstract
    }

    override fun setContent(content: String) {
        product.content = content
    }

    override fun setSources(sources: List<String>) {
        product.sources = sources
    }

    override fun setAppendices(appendices: List<String>) {
        product.appendices = appendices
    }

    fun setTime(takenTime: Int){
        product.takenTime = takenTime
    }

    fun reset(){
        product = HomeworkReport()
    }

    fun getProduct() : HomeworkReport {
        val result = product
        reset()
        return result
    }
}