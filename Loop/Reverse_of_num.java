public class Reverse_of_num {
    public static void main(String[] args) {
        for(int n = 10899; n>0;n=n/10){
            int last_digit = n%10;
          
            System.out.print(last_digit);
          
        }
        System.out.println();
    }
    
}
