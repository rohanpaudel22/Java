import java.util.Scanner;
public class Switch_Statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        switch(age){

            case 18:
            System.out.println("You are going to become an Adult!!");
            break;

            case 24:
            System.out.println("You are going to be successful in your life!!");
            break;

            case 60:
            System.out.println("You are going to get retired!!");
            break;

            default:
            System.out.println("Enjoy your life!!!");
        }

    }
}
