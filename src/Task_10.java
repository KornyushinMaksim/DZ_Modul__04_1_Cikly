//Задание 10
//        2520 – наименьшее число, которое можно разделить на каждое из чисел от 1 до 10, без остатка.
//        Написать программу, которая рассчитывает наименьшее положительное число,
//        которое делится на все числа от 1 до 20.

public class Task_10 {
    public static void main(String[] args) {
        int i = 2500;

        while (true) {
            int count = 0;
            for (int j = 1; j <= 20; j++) {
                if (i % j == 0) {
                    count++;
                }
                else break;
            }
            if (count == 20) {
                System.out.println(i);
                break;
            }
            i++;
        }

    }
}
