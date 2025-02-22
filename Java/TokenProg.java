import java.util.*;
public class TokenProg {
public static void main(String[] args){
  String greeting = "Hello";
  System.out.println("The length of the string is:" + greeting.length());

  String text = "Welcome to CIT 302 class";
  System.out.println(text.toUpperCase());
  System.out.println(text.toLowerCase());
  System.out.println(text.indexOf("Welcome"));

  Scanner wetaokwu = new Scanner(System.in);
  System.out.println("Enter sentence here ");
  String asusu = wetaokwu.nextLine();

  StringTokenizer tokens = new StringTokenizer(asusu);
    System.out.println("number of words:%d \n the tokens/words are:\n",tokens.countTokens());
      while(tokens.hasMoreTokens())
        System.out.println(tokens.nextToken());

}
}
