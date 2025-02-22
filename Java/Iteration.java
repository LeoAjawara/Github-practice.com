public class Iteration {
  public static void main(String[] args) {
    int i = 0;
    while(i < 10) {
      System.out.println( i);
      i++;
    }
    

    for(int j = 0; j <= 10; j++ ) {
      System.out.print( j);
    }

    int k = 0;
    while(k < 10) {
      if(k == 4) {
        k++;
        break;
      }
      System.out.print(k);
      k++;
    }

    for(int z = 0; z < 10; z++) {
      if(z == 3) {
        z++;
        continue;
      }
      System.out.print(z);
      z++;
    }
  }
}
