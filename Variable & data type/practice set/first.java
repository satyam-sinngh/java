import java.util.Scanner;

public class first {
    
    public static void main(String[] args) {
        System.out.println("enter three number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Sum of given number = " + sum);
        int avg = sum/3;
        System.out.println("the average of given number =" + avg);
    }
}
