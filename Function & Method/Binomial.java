public class Binomial {
    public static int factorial(int n){
        int f=1;

        for(int i=2; i<= n; i++){
           f = f*i;
        }
        return f;

   }

   public static int binomial(int n, int r){
       int fact_n = factorial(n);
       int fact_r = factorial(r);
       int fact_nmr = factorial(n-r);

       int bino_coffe = fact_n/(fact_r*fact_nmr);
       return bino_coffe;
   }
   public static void main(String[] args) {
       System.out.println("Binomial factorial = "+ binomial(5, 3));
   }
    
}
