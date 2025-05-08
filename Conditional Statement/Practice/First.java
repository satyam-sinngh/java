import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the postive or negative integer");
        int X = sc.nextInt();

        if (X >= 0) {
            System.out.println(X + " is positive");
        }
        else{
            System.out.println(X + " is negative");

        }
    }
    
}
