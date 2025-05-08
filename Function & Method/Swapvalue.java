public class Swapvalue {

    public static void swap(int a , int b) {
        // Swaping
        int temp = a ;
        a = b;
        b = temp;

        System.out.println("A = "+ a);
        System.out.println("B = "+  b);
    }
    public static void main(String[] args) {
        int a = 39;
        int b = 89;

        swap(a,b);
    }
}
