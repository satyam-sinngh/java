import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int i = sc.nextInt();
        System.out.println("Enter last number");
        int n = sc.nextInt();

        int evensum = 0;
        int oddsum = 0;

        for(i =i;i<=n;i++){
            if(i%2==0){
                evensum= evensum+i;
            }
           else{
            oddsum = oddsum+i;
            }
        }
        System.out.println("evensum = "+ evensum);
        System.out.println("oddsum = "+ oddsum);

    }
    
}
