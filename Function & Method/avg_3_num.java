import java.util.*;
public class avg_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number :");
        double A = sc.nextDouble();

        System.out.println("Enter 2nd number :");
        double B = sc.nextDouble();

        System.out.println("Enter 3rd number :");
        double C = sc.nextDouble();


        System.out.println("Average of number is " + average (A, B, C));

    }

    public static double average(double A,double B, double C) {
        return (A + B + C) / 3;
    }
}
