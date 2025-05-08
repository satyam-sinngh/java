import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the full year");
        int X = sc.nextInt();

        // According to given condition.
        if (X % 4 != 0 ) {
            System.out.println("Not a Leap year");
        }
        else{

            if (X % 100 != 0) {
                System.out.println("Leap year");
            }
            else{
                if (X % 400 == 0) {
                    System.out.println("Leap year");

                }
                else{
                    System.out.println("Not a Leap year");
  
                }
            }
        }
    }
    
}
