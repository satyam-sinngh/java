import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("enter number to which you want to print");
        int i = 1;
        int sum=0;
        int n = sc.nextInt();
        while (i<=n) {
            System.out.print(i + " ");
            sum = sum+i;
            i++;
        }
        System.out.println();

        System.out.println("Sum of number is: " + sum);

    }
    
}
