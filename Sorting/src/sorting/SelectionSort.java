package sorting;

import java.util.Arrays;

/**
 *
 * @author Stanley Kwok 187100835
 */
public class SelectionSort {
    public static void main(String [] args){
      int [] array = {30,13,22,90};
      
      //Sorting array using SelectionSort
      selectionSort(array);
      
      System.out.println("Selection Sort");
      
      for(int i=0; i<array.length; i++)
        System.out.println(array[i] + " ");
    }
    
    //SelectionSort
    public static void selectionSort(int[] array) {  
       int arrayLength = array.length; 
  
        for (int i = 0; i < arrayLength-1; i++) { 
            int min = i; 
            for (int j = i+1; j < arrayLength; j++) 
                if (array[j] < array[min]) 
                    min = j; 
            int temp = array[min]; 
            array[min] = array[i]; 
            array[i] = temp; 
        }   
    }
}