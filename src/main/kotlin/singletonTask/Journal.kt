package singletonTask

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import singletonTask.Enums.FilePaths
import java.io.File
import java.io.FileReader
import java.io.FileWriter

object Journal {
    fun writeToJournal(item: JournalMessage) {
        val messagesJson = Json.decodeFromString<MutableList<JournalMessage>>(File(FilePaths.JOURNAL_JSON.path).readText())
        val messagesTxt = FileReader(FilePaths.JOURNAL_TXT.path).use { file ->
            file.readText()
        }

        val txtString = messagesTxt + item.toString()
        FileWriter(FilePaths.JOURNAL_TXT.path).use { file1 ->
            file1.write(txtString)
        }

        messagesJson.add(item)
        val jsonString = Json.encodeToString(messagesJson)
        FileWriter(FilePaths.JOURNAL_JSON.path).use { file2 ->
            file2.write(jsonString)
        }
    }
}