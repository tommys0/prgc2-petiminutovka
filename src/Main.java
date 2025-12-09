import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the part number (1-4): ");
        int part = scanner.nextInt();

        switch (part) {
            case 1:
                uloha1();
                break;
            case 2:
                uloha2();
                break;
            case 3:
                uloha3();
                break;
            case 4:
                uloha4();
                break;
            default:
                System.out.println("Invalid part number. Please enter a number between 1 and 4.");
        }
    }

    static void uloha1() {
        for (int i = 1; i < 10; i++) {
            System.out.println("\n Multiplication " + i);
            for (int j = 0; j < 11; j++) {
                System.out.print(" " + i * j);
            }
        }
    }

    static void uloha2() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int searchMedian = numbers.length / 2;
        int numberList = numbers.length % 2;

        if (numberList == 1) {
            System.out.println(numbers[searchMedian]);
        } else if (numberList == 0) {
            System.out.println(numbers[searchMedian - 1] + ", " + numbers[searchMedian]);
        } else {
            System.out.println("error");
        }
    }

    static void uloha3() {
        int cislo = 6;
        boolean isPrimeNumber = false;
        for (int i = 2; i <= cislo / 2; i++) {
            if (cislo % i == 0) {
                isPrimeNumber = true;
                break;
            }
        }

        if (!isPrimeNumber) {
            System.out.println(cislo + " is prime num.");
        } else {
            System.out.println(cislo + " is not prime num.");
        }
    }

    static void uloha4() {
        for (int i = 1; i <= 100; i++) {
            boolean divisibleByThree = (i % 3 == 0) || (Integer.toString(i).contains("3"));
            boolean divisibleByFive = (i % 5 == 0) || (Integer.toString(i).contains("5"));

            if (divisibleByThree && divisibleByFive) {
                System.out.println("BUM-PRÁSK");
            } else if (divisibleByThree) {
                System.out.println("BUM");
            } else if (divisibleByFive) {
                System.out.println("PRÁSK");
            } else {
                System.out.println(i);
            }
        }
    }
}
