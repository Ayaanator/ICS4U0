public class Exercise1 {
  public static void arrayCopy(int[] source, int[] destination) {
    for(int i = 0; i < source.length; i++) destination[i] = source[i];
  }
  public static void main(String[] args) {
    int array[] = { 1, 2, 3, 6, 7};
    int new_array[] = { -1, -1, -1, -1, -1 };

    arrayCopy(array, new_array);
    for(int i = 0; i < new_array.length; i++) System.out.println(new_array[i]);
  }
}
