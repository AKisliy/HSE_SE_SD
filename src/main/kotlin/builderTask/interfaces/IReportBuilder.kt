package builderTask.interfaces

interface IReportBuilder {
    fun setTitle(title: String)
    fun setTask(task: String)
    fun setAbstract(abstract: String)
    fun setContent(content: String)
    fun setSources(sources: List<String>)
    fun setAppendices(appendices: List<String>)
}