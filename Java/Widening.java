public class Widening {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt;

    System.out.println(myInt);
    System.out.println(myDouble);
  }
}

public class Narrowing {
public static void main(String[] args) {
  double myDouble = 9.78d;
  int myInt = (int)myDouble;

  System.out.println(myInt);
  System.out.println(myDouble);
}
}

public class Operators {
public static void main(String[] args) {
  int sum1 = 100 + 50;
  int sum2 = sum1 + 200;
  int sum3 = sum2 + sum2;
}
}