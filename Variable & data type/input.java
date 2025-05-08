import java.util.*;

public class input {
    public static void main(String[] args) {
        // taking input from user
        System.out.println("ente the value of a & b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        sc.close();
    }
}
