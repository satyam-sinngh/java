public class Primeinrange {
    public static boolean isprime(int a ){
        boolean isprime= true;

        if(a == 2){
            return true;
        }else{
            for(int i = 2;i<=Math.sqrt(a);i++){
                if(a%i == 0){
                    return false;
                }
            }
        }
        return true;
    }


    // to print perime in range  by using above prime or not function
    public static void primeINRange(int a){
        for(int i = 2; i<=a;i++){
            if (isprime(i)) {                 //calling prime function
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        primeINRange(10);
    }
}


