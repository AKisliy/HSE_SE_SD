package mementoTask

fun main(){
    val redactor = TextRedactor()

    val output = OutputController()
    val input = InputController()

    println("Welcome to text redactor")

    while(true){
        output.printMenu()
        val choice = input.getIntInRange(1, 4)
        when(choice){
            1 -> {
                println("Write your text down")
                redactor.writeText(readln())
                println("Successfully written!")
            }
            2 -> {
                println("Input version number")
                var version = input.getInt()
                while(redactor.getVersion(version) == null){
                    println("No such version. Do you want to try again? (0 - No, 1 - Yes)")
                    if(input.getIntInRange(0, 1) == 0)
                        continue
                    println("Input number again:")
                    version = input.getInt()
                }
                println(redactor.getVersion(version))
            }
            3 -> {
                println(redactor.getVersionInString())
            }
            4 -> break
        }
        println("Going back to the menu")
        Thread.sleep(1000)
    }
    println("Thank you for using")
}