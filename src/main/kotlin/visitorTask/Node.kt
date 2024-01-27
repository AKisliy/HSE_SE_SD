package visitorTask

class Node(val bracket: IBracket)  {
    val children: MutableList<Node?> = mutableListOf()
}