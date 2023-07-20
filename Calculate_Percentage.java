import java.util.Scanner;
public class Calculate_Percentage {
    public static void main(String[] args) {
        System.out.println("Enter the marks obtained in 5 subjects:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark obtain in first subject");
        int a = sc.nextInt();
        System.out.println("Enter mark obtain in second subject");
        int b = sc.nextInt();
        System.out.println("Enter marks obtain in third subject");
        int c = sc.nextInt();
        System.out.println("Enter mark obtain in fourth subject");
        int d = sc.nextInt();
        System.out.println("Enter mark obtain in fifth subject");
        int e = sc.nextInt();
        System.out.print("Enter Grand Total:");
        int gt = sc.nextInt();
        int sum = a+b+c+d+e;
        System.out.println("Obtained marks: "+ sum);
        float percentage = ((float)sum/gt)*100;
        System.out.print("Percentage:" + percentage +"%");
       

        
    }
}
