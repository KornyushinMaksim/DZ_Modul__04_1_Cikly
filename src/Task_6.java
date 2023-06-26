//Задание 6
//        Вывести на консоль все восьмизначные числа, цифры в
//        которых не повторяются. Эти числа должны делиться на
//        12345, без остатка. Показать общее количество найденных
//        чисел.

public class Task_6 {
    public static void main(String[] args) {


         for (int k = 12345677; k < 100000000; k++){
            boolean flag = true;
            int i = k;
            for (int s = 0; s < 7;s++) {
                int value_1 = i % 10;
                for (int j = 0; j < 7 - s; j++) {
                    int temp = i / 10;
                    //temp /= 10;
                    int value_2 = temp % 10;
                    if (value_1 == value_2) {
                        flag = false;
                        break ;
                    }
                }
                //i /= 10;
            }
            if (flag) System.out.println(k);
        }
    }
}       //доделать
