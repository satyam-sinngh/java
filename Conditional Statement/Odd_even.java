import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Number");
        int X = sc.nextInt();

        if(X % 2 == 0){
           System.out.println("Given Number is Even");
        }
        else{
            System.out.println("Given number is Odd");
        }
    }
    
}
