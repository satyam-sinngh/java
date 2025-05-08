import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Table ");
        for(int i = 1; i<= 10; i++){
            int num = n*i;
            
            System.out.println(n+" x "+i+" = "+ num);
        }
    }
    
}
