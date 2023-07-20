import java.util.Scanner;
public class TakingInputs {
    public static void main(String[] args) {
        System.out.println("Taking input from users");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = s.nextInt();
        System.out.println("Enter second number:");
        int b = s.nextInt();
        int sum = a+b;
        System.out.println("The sum of two number is");
        System.out.println(sum);

        System.out.println("Enter string to print");
        String str = s.next();
        System.out.println(str);

        System.out.println("Enter data type to check");
        boolean b1 = s.hasNextInt();
        System.out.println(b1);
    }
}
