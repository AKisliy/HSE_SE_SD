package visitorTask

interface IBracket {
    var value: Char
    fun isOpen(): Boolean

    fun complement(lhs: IBracket):Boolean
}