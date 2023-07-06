package com.week2.src;

public class Reverseanarray {

        public static int[] reverseArray(int[] array) {

            int j = array.length-1;

            for(int i=0; i<=j; i++)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j--;
            }

            return array;
        }

        public static void main(String []args){

            int[] data = {1,2,3,4,5,6,7,8,9};
            int[] a = reverseArray(data);
            for(int i =0 ; i<a.length;i++)
                System.out.print(a[i]+" ");

        }
    }