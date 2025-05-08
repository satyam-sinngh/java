import java.util.Scanner;

public class Continue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; true; i++){
            System.out.print("Enter your number : ");
            i = sc.nextInt();

            if (i%10 == 0){
                continue;
            }
            System.out.println( "Number was: "+i);
        }
    }
    
}
