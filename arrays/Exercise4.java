public class Exercise4 {
  public static void uniqueEntries(int[] list) {
    int new_length = list.length * 5;
    int number = -1;
    for (int i = 0; i < list.length; i++) {
      boolean repeats = false;
      do {
        repeats = false;
        number = (int) (Math.random() * new_length); 
        for (int j = 0; j < i && !repeats; j++) {
          repeats = (number == list[j]);
        }
      } while (repeats);
      
      list[i] = number;
    }
  }

  public static void main(String[] args) {
      
  }
}
