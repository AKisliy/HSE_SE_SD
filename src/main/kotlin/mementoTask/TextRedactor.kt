package mementoTask

import java.time.LocalDateTime

class TextRedactor {
    private val creator: TextCreator = TextCreator()
    private val history: MutableList<Memento> = mutableListOf()

    fun writeText(text: String){
        val memento = Memento(text, LocalDateTime.now())
        creator.setText(memento)
        history.add(memento)
    }

    fun getVersion(index: Int): String?{
        if(index < 0 || index >= history.size)
            return null
        return history[index].text
    }

    fun getVersionInString(): String{
        val sb = StringBuilder()
        for(i in history.indices){
            sb.append("v$i: ${history[i]}")
        }
        return sb.toString()
    }
}