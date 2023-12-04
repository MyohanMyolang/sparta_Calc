package lv3

import lv3.operators.*


class Calculator {
    fun addOperation(oper: AddOper, num1: Int, num2: Int): Double = oper.operate(num1, num2);
    fun subOperation(oper: MulOper, num1: Int, num2: Int): Double = oper.operate(num1, num2);
    fun divOperation(oper: DivOper, num1: Int, num2: Int): Double = oper.operate(num1, num2);
    fun mulOperation(oper: SubOper, num1: Int, num2: Int): Double = oper.operate(num1, num2);
}