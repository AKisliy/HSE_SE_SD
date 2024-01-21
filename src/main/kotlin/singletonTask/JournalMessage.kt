package singletonTask

import kotlinx.serialization.Serializable
import singletonTask.Enums.MessageType
import java.time.LocalDateTime

@Serializable
class JournalMessage(private val type: MessageType, private val information:String){
    private val time = LocalDateTime.now().toString()
    private val location = getCurrentLocation()
    override fun toString(): String {
        return "$type[at $time]: $information in ($location)\n"
    }
}