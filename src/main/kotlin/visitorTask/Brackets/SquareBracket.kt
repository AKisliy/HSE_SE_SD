package visitorTask.Brackets

import visitorTask.IBracket

class SquareBracket(override var value: Char) : IBracket {
    override fun isOpen(): Boolean {
        return value == '['
    }

    override fun complement(rhs: IBracket): Boolean {
        return rhs.value == ']'
    }

    override fun toString(): String {
        return "[]"
    }
}