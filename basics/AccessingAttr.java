public class AccessingAttr {
    int x=5;
    int y=6;
    public static void main(String[] args){
        AccessingAttr a = new AccessingAttr();
        AccessingAttr b = new AccessingAttr();
        b.x=10;
        System.out.println(a.x);
        System.out.println(b.x);
    }
    
}
