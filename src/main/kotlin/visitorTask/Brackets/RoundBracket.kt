package visitorTask.Brackets

import visitorTask.IBracket

class RoundBracket(override var value: Char) : IBracket {
    override fun isOpen(): Boolean {
        return value == '('
    }

    override fun complement(lhs: IBracket): Boolean {
        return lhs.value == ')'
    }

    override fun toString(): String {
        return "()"
    }
}