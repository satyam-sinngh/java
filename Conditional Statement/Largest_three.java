import java.util.Scanner;

public class Largest_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number");

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A>B && A>C) {
            System.out.println("A is greator");
        }
        else if (B > C) {
            System.out.println("B is greator");
        }
        else{
            System.out.println("C is greator");

        }

    }
    
}
