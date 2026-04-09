public class Exercise2 {
  public static void arrayShift(int[] numbers, int shift) {
    int length = numbers.length;
    int temp[] = new int[length * 2];

    for(int i = 0; i < numbers.length * 2; i++) temp[i] = numbers[i % length];
    for(int j = 0; j < length; j++) numbers[j] = temp[(j - shift + length) % length];
  }

  public static void main(String[] args) {
    int array[] = { 2, 5, 7, 10, 15, 22, 28, 32 };

    arrayShift(array, 2);
    for(int i = 0; i < array.length; i++) System.out.println(array[i]);
  }
}
