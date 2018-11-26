package sorting;

import static java.sql.DriverManager.println;
import java.util.Arrays;

/**
 *
 * @author Stanley Kwok 187100835
 */
public class BubbleSort {
    public static void main(String [] args){
      int [] array = {30,13,22,90};
      
      //Sorting array using bubbleSort
      bubbleSort(array);
      
      System.out.println("Bubble Sort");
      
      for(int i=0; i<array.length; i++)
        System.out.println(array[i] + " ");
    }
    
    public static void bubbleSort(int[] arr) {  
        int arrayLength = arr.length;  
        int temp = 0;  
         for(int i=0; i < arrayLength; i++){  
                 for(int j=1; j < (arrayLength-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
}