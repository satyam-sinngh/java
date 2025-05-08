import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        float p = sc.nextFloat();
        System.out.println("Enter the price of pen");
        float s = sc.nextFloat();
        System.out.println("Enter the price of eraser");
        float e = sc.nextFloat();
        float sum = p+s+e;
        System.out.println("your price without GST = "+ sum);
        float GST = (sum*18)/100;
        System.out.println("your GST = "+ GST);
        float Bill = sum+GST;
        System.out.println("your price with GST = "+ Bill);

    }
    
}
