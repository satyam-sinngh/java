import java.util.Scanner;

public class Calcalutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A & B");
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Enter which operation do you want to perform");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+':
            System.out.println(A+B);
            break;

            case '-':
            System.out.println(A-B);
            break;

            case '*':
            System.out.println(A*B);
            break;

            case '/':
            System.out.println(A/B);
            break;

            case '%':
            System.out.println(A%B);
            break;

            default:
            System.out.println("Enter the correct operation");
             break;
            

        }

    }
    
}
