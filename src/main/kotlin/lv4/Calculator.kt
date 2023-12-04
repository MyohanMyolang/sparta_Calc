package lv4

import lv4.operators.AbstractOperation

class Calculator(private val oper: AbstractOperation) {
    fun operate(num1:Int, num2:Int): Double = oper.operate(num1, num2);

}