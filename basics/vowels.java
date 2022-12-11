import java.util.*;

public class vowels {
  public static void main(String[] args) {
    vowels myObj = new vowels();
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter string");
    String str=sc.nextLine();
    System.out.println("You have entered: "+str);
    int c=0;
    for(int i=0; i<str.length(); i++){
      // System.out.println("hello");
      char ch = str.charAt(i);
     if(ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u'){
      c=c+1;
      System.out.print("The vowel letters are "+ch+", ");
     }
    System.out.println();
    }
    System.out.println("No. of vowel letter is "+c);
     }
}
