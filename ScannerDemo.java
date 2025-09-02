import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your marks");
        int marks = sc.nextInt();
        System.out.println("Please enter your name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Please enter your age");
        int age = sc.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("Your marks are " + marks);
        System.out.println("Your age is " + age);
    }
}
