public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // System.out.println("Hello world!");
        var i = 1;
        while (i < 11) {
            System.out.print(i++ + " ");
        }
        System.out.print("\n");
        for (int l = 10; l != 0; l--) {
            System.out.print(l + " ");
        }
        // Задание 2
        System.out.println();
        int friday = 7;
        for (; friday < 32; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + "-е");
        }
        //Задание 3
        int firstYear = 0;
        int thisYear = 2022;
        for (; firstYear <= thisYear - 200; firstYear = firstYear + 79) {

        }
        for (; firstYear <= thisYear + 100; firstYear = firstYear + 79) {
            System.out.println(firstYear);
        }

    }
}