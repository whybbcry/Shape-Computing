package sorting;

import java.util.Arrays;

/**
 *
 * @author Stanley Kwok 187100835
 */

public class QuickSort { 
    
    public static void main(String args[]) { 
        int array[] = {30, 13, 22, 90}; 
        int arrayLength = array.length; 
  
        QuickSort ob = new QuickSort(); 
        ob.sort(array, 0, arrayLength-1); 
  
        System.out.println("Quick Sort");
        printArray(array); 
    }
    
    int partition(int arr[], int low, int high) { 
        int pivot = arr[high];
        //Smaller element
        int i = (low-1); 
        for (int j=low; j<high; j++) 
        { 
            if (arr[j] <= pivot){ 
                i++; 
                // swap
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
    void sort(int arr[], int low, int high) { 
        if (low < high) 
        { 
            int pi = partition(arr, low, high); 
  
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
    static void printArray(int arr[]){ 
        int arrayLength = arr.length; 
        for (int i=0; i<arrayLength; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
} 
