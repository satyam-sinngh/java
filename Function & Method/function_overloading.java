public class function_overloading {

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b, int c){
        return a+b+c;
    }

    public static float sum(float a,float b, float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5, 7));
        System.out.println(sum(2, 8, 5));
        System.out.println(sum(8.9f, 7.1f, 5.5f));
    }
    
}
