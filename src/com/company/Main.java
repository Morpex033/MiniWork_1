package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt(), N = scan.nextInt();
        int size = 200;
	    int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(200) + 1;
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int[] NewArray = ShuffleArray(array, K, N, size);
        System.out.println(Arrays.toString(NewArray));
    }

    public static int[] ShuffleArray(int[] array, int K, int N, int size){
        int size1 = 0;
        for (int i = 0; i < array.length / K; i++){
            for (int j = 0; j < N; j++){
                int a;
                if (size1< array.length - 1) {
                    a = array[size1 + 1];
                    array[size1 + 1] = array[size1];
                    array[size1] = a;
                }else{
                    a = array[array.length-2];
                    array[array.length-2] = array[array.length - 1];
                    array[array.length - 1] = a;
                }
                size1++;
            }
            if(size1 == size){
                break;
            }
        }
        return array;
    }
}
