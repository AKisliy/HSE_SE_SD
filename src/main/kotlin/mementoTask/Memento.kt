package mementoTask

import java.time.LocalDateTime

data class Memento(val text: String, val time: LocalDateTime){
    override fun toString(): String {
        return "created: $time"
    }
}