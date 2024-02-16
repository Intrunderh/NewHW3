public class Zadanie1 {
    public static void main(String[] args) {
//        Напишите программу, которая выводит все простые числа от 1 до 50.
        for (int i = 1; i <= 50; i++) {
            if (i <= 1) {
                continue;
            }
            if (i % i == 0 || i % 1 == 0) {
                System.out.println(i);
            }
        }
        // Не понял, что тут можно сделать, чтобы оно заработало...

    }
}
