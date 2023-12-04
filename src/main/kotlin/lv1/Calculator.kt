package lv1

class Calculator {
    fun calc(num1: Int, num2: Int, oper: String): Int? {

        return when(oper){
            "+" -> return num1+num2
            "-" -> return num1-num2
            "*" -> return num1*num2
            "/" -> return num1/num2
            else -> null
        }
    }
}