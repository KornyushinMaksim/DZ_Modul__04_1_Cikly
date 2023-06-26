//Задание 5
//        Напишите программу, которая будет проверять, является
//        ли число, введенное с клавиатуры палиндромом (одинаково
//        читающееся в обоих направлениях). Например, 123454321
//        или 221122 – палиндром. Программа должна вывести YES,
//        если число является палиндромом, и NO – в противоположном случае.

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int dig = scanner.nextInt();
        int count = 0;       //счётчик
        int start;      //с начала числа
        int end;        //с конца
        boolean flag = true;
        start = end = dig;

        while (dig > 0){
            int temp = dig / 10;
            dig = temp;
            count++;
        }
        for (int i = 0; i < count / 2; i++){
            start /= Math.pow(10, (count - (i + 1)));
            end %= 10;
            if (start != end){
                flag = false;
                break;
            }
            end /= 10;
        }
        System.out.println((flag) ? "YES" : "NO");
    }
}
