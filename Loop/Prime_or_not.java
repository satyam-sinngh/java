import java.util.Scanner;

public class Prime_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int check=0;
        for(int i=2; i<n/2; i++){
            if (n%i == 0) {
                check++; // to increase value of check to consider below.
                break;}
        }
    if(check==0){
System.out.print("prime");
    }
    else{
System.out.print("not prime"); // here we consider check++. 
    }
    
}
    }