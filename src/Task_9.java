//Задание 9
//        Если перечислить все натуральные числа меньше 10, кратные 3 или 5, мы получаем 3, 5, 6 и 9.
//        Сумма этих кратных – 23. Найдите сумму всех чисел, кратных 3 или 5, начиная с 0
//        и до 1 000.

public class Task_9 {
    public static void main(String[] args) {
        int summa = 0;

        for (int i = 1; i < 10; i++){
            if (i % 3 == 0 || i % 5 == 0) {
                summa += i;
            }
        }
        System.out.printf("Сумма кратных %d - %d", summa);
    }
}
