package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] intArray  ={20,35,-15,7,55,1,-22};

        mergeSort(intArray,0,intArray.length-1);


        for(int i = 0; i < intArray.length; i++ ){
            System.out.println(intArray[i]);
        }
    }
    public static void mergeSort(int[] input, int start, int end){
        if(start < end ) {


            int mid = (start + end) / 2;
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
            merge(input, start, mid, end);
        }
    }
    public static void merge(int [] input, int start, int mid, int end){
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1 ; ++i)
            L[i] = input[start + i];
        for (int j = 0; j < n2; ++j)
            R[j] = input[mid + 1 + j];

        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                input[k] = L[i];
                i++;
            }
            else{
                input[k] = R[j];
                j++;
            }
            k++;

        }
        while (i < n1){
            input[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            input[k] = R[j];
            j++;
            k++;
        }
    }
}
