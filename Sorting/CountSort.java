package Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class CountSort {
    public static void main(String[] args) {
        int [] arr = {3,4,1,2,3,5,8,9,2,4,7};
        //countSort(arr);
        countThroughHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countSort(int [] arr){
        if(arr.length<=1){
            return;
        }

        //find the largest element
        int max = arr[0];
        for(int num : arr){
            if (num>max){
                max = num;
            }
        }

        //create an array with the size of largest element + 1
        int [] countArr = new int[max+1];

        //Store the frequency of element like how much no. of time it is coming in original array
        //for example if 1 is coming 2 times then add 2 at index no. 1 in countArr
        for (int num : arr){
            countArr[num]++;
        }

        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i]>0) {
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }

    //Count Sort using Hash Map
    static void countThroughHash(int [] arr){
        if(arr.length<=1){
            return;
        }

        //find the largest element
        int max = arr[0];
        for(int num : arr){
            if (num>max){
                max = num;
            }
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        //Store frequencies in HashMap
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            if (map.containsKey(i)){
                int val = map.get(i);
                while (val>0){
                    arr[index] = i;
                    index++;
                    val--;
                }
            }
        }
    }

}
