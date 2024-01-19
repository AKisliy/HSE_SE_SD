package builderTask.builders

import builderTask.interfaces.IReportBuilder
import builderTask.products.LabReport

class LabReportBuilder : IReportBuilder {
    private var product: LabReport = LabReport()

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

    fun setUsedTools(usedTools: List<String>){
        product.usedTools = usedTools
    }

    fun getProduct() : LabReport {
        val result = product
        reset()
        return result
    }

    fun reset(){
        product = LabReport();
    }
}