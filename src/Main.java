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


}
