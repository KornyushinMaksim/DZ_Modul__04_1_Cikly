//Задание 3
//        Самовлюблённое число или число Армстронга – натуральное число,
//        которое равно сумме своих цифр, возведенных
//        в степень, равную количеству его цифр.
//        Показать на экране все числа Армстронга в диапазоне от
//        10 до 1 000 000.
//        Например:
//        153 = 1^3 + 5^3 + 3^3

public class Task_3 {
    public static void main(String[] args) {
        int i = 22;
        int countPow = 0;
        int res = 0;
        //System.out.println(countPow);
        //for (i = 10; i < 1000000; i++){
        ////// счётчик
        while (i > 0) {
            int b = i / 10;
            i = b;
            countPow++;
        }
        while (i > 0) {
            int a = i % 10;
            int c = (int) Math.pow(a, countPow);
            int b = i / 10;
            res += c;

        }
        //}
        System.out.println(countPow);
        System.out.println(res);
    }
}
