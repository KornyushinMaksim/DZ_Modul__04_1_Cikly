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
        int i, i_1;
        for (int j = 10; j < 1000000; j++) {
            int res = 0;
            int countPow = 0;
            i_1 = i = j;
            while (i_1 > 0) {
                int b = i_1 / 10;
                i_1 = b;
                countPow++;
            }
            while (i > 0) {
                int a = i % 10;
                int c = (int) Math.pow(a, countPow);
                i /= 10;
                res += c;
            }
            System.out.println(res);
        }
    }
}
