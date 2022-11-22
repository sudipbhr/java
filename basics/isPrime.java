public class isPrime {
    public static void main(String[] args){
        System.out.println(isPrime(19));
    }
    public static int isPrime(int n){
       int c=0;
        for(int i=1; i<=n; i++){
            if (n % i == 0){
                c=c+1;
            }
        }
        if (c==2){
                return 1;
            }
            return 0;
    }
}
