public class prime {

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
    
    public static void main(String[] args) {
        System.out.println(isprime(11));
    }
}
