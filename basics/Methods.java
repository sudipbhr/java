public class Methods {
    static void stringMethod(String fname, String lname){
        System.out.println("My full name is " + fname + " "+ lname);
    }
    static void intMethod(int age, double height){
        System.out.println("My age is "+ age + " and my height is " + height +" feet");
    }
    public static void main(String[] args){
        stringMethod("Sudip", "Bhandari");
        intMethod(21, 5);
    }
}
