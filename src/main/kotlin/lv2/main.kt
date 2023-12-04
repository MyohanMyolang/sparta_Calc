package lv2


fun main(){
    val calculator = Calculator();
    val num1 = 2;
    val num2 = 2;

    println(calculator.calc(num1,num2,"+"));
    println(calculator.calc(num1,num2,"-"));
    println(calculator.calc(num1,num2,"*"));
    println(calculator.calc(num1,num2,"/"));
    println(calculator.calc(num1,num2,"%"));
    println(calculator.calc(num1,num2,"++"));
}