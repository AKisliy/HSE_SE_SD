package builderTask.products

import builderTask.interfaces.IReport
import kotlinx.serialization.Serializable
import kotlin.properties.Delegates

@Serializable
class HomeworkReport: IReport {
    override lateinit var title: String
    override lateinit var task: String
    override lateinit var abstract: String
    override lateinit var content: String
    override lateinit var sources: List<String>
    override lateinit var appendices: List<String>
    var takenTime by Delegates.notNull<Int>()
}