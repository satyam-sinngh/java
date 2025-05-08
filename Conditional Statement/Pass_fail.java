import java.util.Scanner;

public class Pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");

        int marks = sc.nextInt();

        String Status = (marks >= 33)?"Pass":"Fail";

        System.out.println(Status);
   }
}
