package lv3

import lv3.operators.AddOper


fun main() {
    val calc = Calculator()
    println("1 더하기 2 결과는 : ${calc.addOperation(AddOper(), 1, 2)} 입니다")
}