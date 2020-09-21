package com.company;

public class Main {

    public static void main(String[] args) {

        int [] intArray = {20,35,-15,7,55,1,-22};

        for(int last = intArray.length -1; last > 0; last--){

            int largest = 0;
            for(int i = 1; i <= last; i++){
                if(intArray[largest] < intArray[i]){
                    largest = i;
                }


            }
            swap(intArray,largest,last);
        }



        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array,int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
