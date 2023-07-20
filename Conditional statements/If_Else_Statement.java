import java.util.Scanner;
public class If_Else_Statement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int a = sc.nextInt();
        if(a>=0){
            System.out.println(a+" is positive.");
        }

        else{
            System.out.println(a+" is negative.");
        }
    }
    
}
