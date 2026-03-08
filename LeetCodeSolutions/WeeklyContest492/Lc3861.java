package LeetCodeSolutions.WeeklyContest492;

//3861. Minimum Capacity Box
/*
You are given an integer array capacity, where capacity[i] represents the capacity of the ith box, and an integer itemSize representing the size of an item.
The ith box can store the item if capacity[i] >= itemSize.
Return an integer denoting the index of the box with the minimum capacity that can store the item. If multiple such boxes exist, return the smallest index.
If no box can store the item, return -1.
*/

public class Lc3861 {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0; i<capacity.length; i++){
            if(capacity[i] >= itemSize && capacity[i] < min){
                min = capacity[i];
                index = i;
            }
        }

        if(min == Integer.MAX_VALUE) return -1;
        return index;
    }
}
