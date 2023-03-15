public class Overloading {
    static int add(int p, int q){
        return p+q;
    }
    static double add(double p, double q){
        return p+q;
    }
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(1.2,2.3));
    }
}
