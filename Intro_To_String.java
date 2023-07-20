import java.util.Scanner;

public class Intro_To_String {
    public static void main(String[] args) {
        // String name = new String("Rohan");
        // System.out.println(name);

        String name = "Rohan_Paudel";
        System.out.println(name);

        // different ways to print in java
        int a = 67;
        float b = 57.98f;
        System.out.printf("The integer value is %d\nThe floating value is %.2f\n", a, b);
        System.out.format("The integer value is %d\nThe floating value is %.2f\n", a, b);
        System.out.println();

        // taking string input fom user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to print");
        // String str = sc.next(); //for printing single word without space
        String str = sc.nextLine(); // for printing a sentence
        System.out.println(str);
    }
}
