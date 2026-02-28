package LeetCodeSolutions;

public class mostWater {
    public static void main(String[] args) {
        int []arr = {1,3,2,5,25,24,5};
        System.out.println(maxArea(arr));

    }
    static int maxArea(int[] height) {
        int ans = 0, length, width, area;
       int left = 0;
       int right = height.length-1;

       while (left<right){
           if (height[left]<height[right]){
               length = height[left];
           }else {
               length = height[right];
           }
           width = right-left;

           area = length*width;

           if (area>ans){
               ans = area;
           }

           if (height[left]<height[right]){
               left++;
           }
           else {
               right--;
           }
       }
       return ans;
    }
}
