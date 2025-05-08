public class Unary {
    public static void main(String[] args) {
        int A = 10;
        int B = ++A;
        int C = A++;
        int D = --A;
        int E = A--;

        System.out.println("Original Number = "+ A);
        System.out.println("Pre Increment = "+ B);
        System.out.println("Post Increment = "+ C);
        System.out.println("Pre Decrement = "+ D);
        System.out.println("Post Decrement = "+ E);


    }
    
}
