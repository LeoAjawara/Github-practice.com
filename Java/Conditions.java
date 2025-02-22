public class Conditions {
  public static void main(String[] args) {
    int x = 10;
    int y = 50;
    if(x > y) {
      System.out.println("Good wishes CIT 302 class");
    }
    else {
      System.out.println("Good luck in CIT 302 class");
    }  

    String result = (x > y)? "Good wishes CIT 302 class" : "Good luck in CIT 302 class";
    System.out.println(result);
  }
}
