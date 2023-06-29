//Задание 12
//        В первый день спортсмен пробежал x километров,
//        а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
//        По числу, указанному с клавиатуры y, определите номер дня,
//        на который пробег спортсмена составит не менее y километров.

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 1;

        System.out.print("Введите количество километров на первый день: ");
        double x = scanner.nextDouble();
        System.out.print ("Введите количество километров что бы узнать день введёного результата: ");
        double y = scanner.nextDouble();

        while (x < y){
            x += (x / 100 * 10);
            day++;
        }
        System.out.printf("Через %d дня(ей) спортсмен добьётся результата", day);
    }
}
