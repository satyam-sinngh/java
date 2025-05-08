import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");

        int X = sc.nextInt();


        switch (X) {
            case 1:
                System.out.println("hello good morning");
                break;

            case 2:
                System.out.println("hello good afternoon");
                break; 

            case 3:
                System.out.println("hello good evening");
                break;
            default:
            System.out.println("Please enter between 1 to 3");

                break;
        }
        
    }
    
}
