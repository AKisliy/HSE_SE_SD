package mementoTask

import java.time.LocalDateTime

class TextCreator {
    var text: String? = null
    fun createMemento() : Memento{
        return Memento(text!!, LocalDateTime.now())
    }
    fun setText(version: Memento){
        text = version.text
    }
}