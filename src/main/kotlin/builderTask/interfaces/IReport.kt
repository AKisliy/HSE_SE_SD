package builderTask.interfaces

interface IReport{
    var title: String
    var task: String
    var abstract: String
    var content: String
    var sources: List<String>
    var appendices: List<String>
}