//Задание 7
//        Показать битовое представление значения переменной
//        типа int, используя только один цикл, управляющую переменную,
//        вывод на консоль и битовые операции.
//        Не использовать строки и любые другие готовые функции (методы).


import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int dig = scanner.nextInt();

        while (dig > 0){
            int num = dig % 2;
            dig /= 2;
            System.out.print(num);
        }
    }
}           //выводит наоборот, подумать
