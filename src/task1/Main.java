package task1;

/**Написать класс Калькулятор (необобщенный), который
содержит обобщенные статические методы: sum(), multiply(),
divide(), subtract(). Параметры этих методов – два числа
 разного типа, над которыми должна быть произведена
операция. Методы должны возвращать результат своей работы.

*/



public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Calculator calc2 = new Calculator();
        System.out.println(calc.multiply(10,7 ));
        System.out.println(calc.divide(10,2 ));

    }
}