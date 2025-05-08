import java.util.Scanner;

public class Print1ton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to which you want to print");
        int i = 1;
        int n = sc.nextInt();
        while (i<=n) {
            System.out.println(i);
            i++;
            
        }
    }
    
}
