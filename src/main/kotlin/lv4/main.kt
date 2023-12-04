package lv4

import lv4.operators.*

fun main() {
    println("1더하기 2 결과는 : ${Calculator(AddOper()).operate(1,2)}입니다.");
}