import java.util.*;
public class Sorts{
  
    /* ----------Selection Sort---------- */
  
  public static void selectionSort(int[] array){
    for(int i = 0; i < array.length - 1; i++){
      int minIndex = i;
      for(int j = i + 1; j < array.length; j++){
        if(array[j] < array[minIndex]){
          minIndex = j;
        }
      }
      int temp = array[i];
      array[i] = array[minIndex];
      array[minIndex] = temp;
    }
  }
  
  public static void selectionSort(String[] array){
    /// copy/paste selectionSort(int[] array) and adjust it for a String[] array
    for(int i = 0; i < array.length - 1; i++){
        int minIndex = i;
        for(int j = i + 1; j < array.length; j++){
          if(array[j].compareTo(array[minIndex]) < 0){
            minIndex = j;
          }
        }
        String temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
  }
  
    /* ----------Insertion Sort---------- */
  
  public static void insertionSort(int[] array){
    for(int i = 1; i < array.length; i++){
      int temp = array[i];
      int possibleIndex = i;
      while(possibleIndex > 0 && temp < array[possibleIndex - 1]){
        array[possibleIndex] = array[possibleIndex - 1];
        possibleIndex--;
      }
      array[possibleIndex] = temp;
    }
  }
  
  public static void insertionSort(String[] array){
    /// copy/paste insertionSort(int[] array) and adjust it for a String[] array
    for(int i = 1; i < array.length; i++){
        String temp = array[i];
        int possibleIndex = i;
        while(possibleIndex > 0 && temp.compareTo(array[possibleIndex - 1]) < 0){//temp < array[possibleIndex - 1]){
          array[possibleIndex] = array[possibleIndex - 1];
          possibleIndex--;
        }
        array[possibleIndex] = temp;
      }
  }
  
  
    /* ----------Merge Sort for int[]---------- */
  
  
  public static void mergeSort(int[] array){
    int n = array.length;
    int[] temp = new int[n];
    mergeSortHelper(array, 0, n-1, temp);
  }
  
  private static void mergeSortHelper(int[] array, int from, int to, int[] temp){
    if (from < to){
      int mid = (from + to) / 2;
      mergeSortHelper(array, from, mid, temp);
      mergeSortHelper(array, mid+1, to, temp);
      merge(array, from, mid, to, temp);
    }
  }
  
  private static void merge(int[] array, int from, int mid, int to, int[] temp){
    int i = from;
    int j = mid + 1;
    int k = from;
    while (i <= mid && j <= to){
      if (array[i] < array[j]){
        temp[k] = array[i];
        i++;
      }
      else{
        temp[k] = array[j];
        j++;
      }
      k++;
    }
    while (i <= mid){
      temp[k] = array[i];
      i++;
      k++;
    }
    while (j <= to){
      temp[k] = array[j];
      j++;
      k++;
    }
    for (k = from; k <= to; k++){
      array[k] = temp[k];
    }
  }
  
  
      /* ----------Merge Sort for String[]---------- */
  
  
  public static void mergeSort(String[] elements){
    /// copy/paste and adjust for String[]
    int n = elements.length;
    String[] temp = new String[n];
    mergeSortHelper(elements, 0, n-1, temp);
  }
  
  private static void mergeSortHelper(String[] elements, int from, int to, String[] temp){
    /// copy/paste and adjust for String[]
    if (from < to){
      int mid = (from + to) / 2;
      mergeSortHelper(elements, from, mid, temp);
      mergeSortHelper(elements, mid+1, to, temp);
      merge(elements, from, mid, to, temp);
    }
  }
  
  private static void merge(String[] elements, int from, int mid, int to, String[] temp){
    /// copy/paste and adjust for String[]
    int i = from;
    int j = mid + 1;
    int k = from;
    while (i <= mid && j <= to){
      if (elements[i].compareTo(elements[j]) < 0){
        temp[k] = elements[i];
        i++;
      }
      else{
        temp[k] = elements[j];
        j++;
      }
      k++;
    }
    while (i <= mid){
      temp[k] = elements[i];
      i++;
      k++;
    }
    while (j <= to){
      temp[k] = elements[j];
      j++;
      k++;
    }
    for (k = from; k <= to; k++){
      elements[k] = temp[k];
    }
  }
}