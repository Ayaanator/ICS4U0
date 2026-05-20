import java.util.Scanner;

public class SearchAndSort {
  public static String[][] studentsAndCourses =
  { {"733822811", "CSC148,MAT223,PHY150,CHM292"},
    {"432011922", "MUS305,HIS378,ENG140"},
    {"531118220", "CSC148,PHY150"},
    {"732392194", "ENG140,PSY100,CHM108"}
  };

  public static String[][] courses =
  { {"CSC148", "Computer Science"},
    {"MAT223", "Linear Algebra"},
    {"PHY150", "Theoretical Physics"},
    {"MUS305", "Music Performance III"},
    {"ENG140", "English Literature I"},
    {"HIS378", "19th Century History"},
    {"PSY100", "Introduction to Psychology"}
  };

  public static String[][] studentNames = 
  {
    {"733822811", "Donald", "Philip", "Science"},
    {"432011922", "Johnston", "Donna", "Humanities"},
    {"732392194", "Peters", "Susan", "Science"},
    {"531118220", "Cook", "Ann", "Life Sciences"}
  };

  public static void printCourseInfo(String studentNumber) {
    String[][] students = findAll(studentNumber);

    if(students.length > 0) {
      for(int i = 0; i < students.length; i++) {
        String courseString = students[i][1];
        String[] coursesList = courseString.split(",");

        System.out.println();
        System.out.println(findStudentName(students[i][0]));
        for(int j = 0; j < coursesList.length; j++) {
          System.out.println(String.format("\t%s %s", coursesList[j], findCourseName(coursesList[j])));
        }
      }
    } else {
      System.out.println();
      System.out.println("Student(s) not found!");
    }

  }

  public static String findCourseName(String key) {
    String result = "N/A";
    
    for(int i = 0; i < courses.length; i++) {
      if(courses[i][0].equals(key)) {
        result = courses[i][1];
      }
    }

    return result;
  }

  public static void initializeArray(int[] list) {
    for (int index = 0; index < list.length; index++) {
      list[index] = (int) (Math.random() * 1000);
    }
  }

  public static void printArray(int[] list) {
    for (int index = 0; index < list.length; index++) {
      System.out.println("Idx " + index + ": " + list[index]);
    }
  }

  public static String[][] findAll(String key) {
    int arrSize = 0;

    for(int i = 0; i < studentsAndCourses.length; i++) {
      if(studentsAndCourses[i][0].startsWith(key)) {
        arrSize++;
      }
    }

    String[][] result = new String[arrSize][2];
    int counter = 0;

    for(int i = 0; i < studentsAndCourses.length; i++) {
      if(studentsAndCourses[i][0].startsWith(key)) {
        result[counter][0] = studentsAndCourses[i][0];
        result[counter][1] = studentsAndCourses[i][1];
        counter++;
      }
    }

    return result;
  }

  public static String findStudentName(String key) {
    String result = "N/A";

    for(int i = 0; i < studentNames.length; i++) {
      if(studentNames[i][0].equals(key)) {
        result = studentNames[i][0] + " " + studentNames[i][1] + ", "
        + studentNames[i][2] + ". Program: " + studentNames[i][3];
      }
    }

    return result;
  }

  public static int findItem(int n, int[] list) {
    int index = 0;
    for (; index < list.length && list[index] != n; index++);

    return index == list.length ? -1 : index;
  }

  public static int[] mergeLists(int[] list1, int[] list2) {
    int[] result = new int[list1.length + list2.length];

    int p = 0;
    int q = 0;
    int r = 0;

    while(p < list1.length && q < list1.length) {
      if(p == list1.length) {
        result[r] = list2[q];
        q++;
      } else if (q == list2.length) {
        result[r] = list1[p];
        p++;
      } else if(list1[p] <= list2[q]) {
        result[r] = list1[p];
        p++;
      } else {
        result[r] = list2[q];
        q++;
      }
      
      r++;
    }

    return result;
  }

  public static void populateWithRandomNumbers(int[] list) {
    for (int index = 0; index < list.length; index++) {
      list[index] = (int) (Math.random() * 100);
    }
  }

  public static void swap(int[] list, int i, int j) {
    int temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }

  public static void rotateList(int[] list, int m, int n) {
    int temp = list[n];

    for(int i = n - 1; i >= m; i--) {
      list[i + 1] = list[i];
    }   

    list[m] = temp;
  }

  public static int findLargestItem(int[] list, int end) {
    int maxIndex = 0;

    for (int index = 1; index <= end; index++) {
      if (list[index] > list[maxIndex]) {
        maxIndex = index;
      }
    }

    return maxIndex;
  }

  public static void selectionSort(int[] list) {
    for(int i = list.length - 1; i >= 1; i--) {
      int k = findLargestItem(list, i);
      swap(list, k, i);
    }
  }

  public static void bubbleSort(int[] list) {
    for(int limit = list.length - 1; limit >= 1; limit--) {
      for(int i = 0; i < limit; i++) {
        if(list[i] > list[i + 1]) swap(list, i, i + 1);
      }
    }
  }

  public static int findFirst(int[] items, int key) {
    int index = binarySearch(items, key);

    if(index != -1) {
      index--;
      for(; index > 0 && items[index] == key; index--);
      index++;
    }

    return index;
  }

  public static void insertionSort(int[] list) {
    for(int i = 1; i <= list.length -1; i++) {
      int j = 0;
      for(; j <= i - 1 && list[j] < list[i]; j++);
      if(list[j] > list[i]) {
        rotateList(list, j, i);
      }
    }
  }

  public static int binarySearch(int[] list, int key) {
    int start = 0;
    int end = list.length - 1;
    int idx = (start + end) / 2;

    while(start < idx && list[idx] != key) {
      if(key > list[idx]) {
        start = idx + 1;
      } else {
        end = idx - 1;
      }

      idx = (start + end) / 2;
    }
    if(start > end) {
      return -1;
    } else {
      return idx;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter student number: ");
    String studentNumber = scanner.nextLine();

    studentNumber = studentNumber.equals("*") ? "" : studentNumber;
    printCourseInfo(studentNumber);

    scanner.close();
  }
}
