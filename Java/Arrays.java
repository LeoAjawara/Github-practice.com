public class Arrays {
  public static void main(String[] args) {
    String[][] cars = { {"Volvo", "Ford", "Mazda"}, {"Mercedes", "Ferrari", "Posh"} };
    for(int i = 0; i < cars.length; i++) {
      for(int j = 0; j < cars[i].length; i++) {
        System.out.print(cars[i][j]);
      }
    }
  }
  
}
