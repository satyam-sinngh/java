import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; true;i++){
            System.out.println("Enter your number");
            i = sc.nextInt();

            if (i%10 == 0) {
                break;
                
            }

            System.out.println(i);

        }
        
    }
    
}
