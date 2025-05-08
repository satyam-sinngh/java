import java.util.Scanner;

public class second {
    
    public static void main(String[] args) {
        System.out.println("Enter the side of SQUARE");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int area = s*s;
        System.out.println("Area of SQUARE = "+ area);
    }
}
