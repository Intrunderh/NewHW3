public class Zadanie2 {
    public static void main(String[] args) {
//        Напишите программу, которая выводит сумму всех чисел, кратных 3 или 5, от 1 до 100
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Сумма всех чисел кратных 3 или 5 = " + sum);
    }
}
