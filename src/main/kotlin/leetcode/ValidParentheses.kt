package leetcode

import java.util.*

    fun main(){
        isValid("([)][]")
    }
    fun isValid(s: String): Boolean {
        var stack= Stack<Char>()

        for( subS:Char in s){
            if(stack.isNotEmpty()){
                if(checkSubString(stack.peek(),subS)){
                    stack.pop()
                }else{
                    stack.push(subS)
                }
            }else{
                stack.push(subS)
            }
        }
        return stack.empty()
    }

    fun checkSubString(s1:Char,s2:Char):Boolean{
        return when(s1){
            '('-> { s2 == ')'}
            '{'->{ s2 == '}' }
            '['->{ s2 == ']' }
            else -> false
        }
    }
