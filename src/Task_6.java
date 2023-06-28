//Задание 6
//        Вывести на консоль все восьмизначные числа, цифры в
//        которых не повторяются. Эти числа должны делиться на
//        12345, без остатка. Показать общее количество найденных
//        чисел.

import java.time.LocalDate;

public class Task_6 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10000000; i < 100000000; i++) {
            int step = 0;
            int number = i;
            boolean flag = true;

            while (number > 0 && flag) {
                int tempCifra = number % 10;
                int stepTemp = 0;
                int numberTemp = i;

                while (numberTemp > 0 && flag) {
                    int tempCifra1 = numberTemp % 10;
                    if (step == stepTemp) {
                        numberTemp++;
                        stepTemp++;
                        continue;
                    }
                    if (tempCifra1 == tempCifra) {
                        flag = false;
                        break;
                    }
                    numberTemp /= 10;
                    stepTemp++;
                }
                number /= 10;
                step++;
            }

            if (flag) {
                System.out.println(i);
                if (i % 12345 == 0) count++;
            }
        }
        System.out.println(count);
    }
}
