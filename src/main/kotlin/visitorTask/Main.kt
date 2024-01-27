package visitorTask

import visitorTask.Brackets.CurlyBracket
import visitorTask.Brackets.RoundBracket
import visitorTask.Brackets.SquareBracket
import java.util.*

fun main(){
    println("Input your bracket sequence:")
    val str = readln()
    val stack = Stack<Node>()
    stack.push(Node(getBracket(str[0])!!))
    var index = 1
    while(index < str.length){
        val cur = getBracket(str[index])
        if(!stack.empty() && stack.peek().bracket.complement(cur!!))
        {
            val child = stack.pop()
            if(!stack.isEmpty())
                stack.peek().children.add(child)
        }
        else{
            stack.push(Node(cur!!))
        }
        ++index
    }
}

fun getBracket(value: Char): IBracket? {
    return when (value) {
        '{', '}' -> CurlyBracket(value)
        '[', ']' -> SquareBracket(value)
        '(', ')' -> RoundBracket(value)
        else -> null
    }
}

fun printTree(node: Node){

}