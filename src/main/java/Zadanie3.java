public class Zadanie3 {
    public static void main(String[] args) {
//        Напишите программу, которая выводит все числа Фибоначчи до 100
        int chislo1 = 1;
        int chislo2 = 1;
        int chisloPlus;
        System.out.println(chislo1);
        System.out.println(chislo2);
        for (int i = 3; i <= 100; i++) {
            chisloPlus = chislo1 + chislo2;
            System.out.println(chisloPlus);
            chislo1 = chislo2;
            chislo2 = chisloPlus;
        }

    }
}
