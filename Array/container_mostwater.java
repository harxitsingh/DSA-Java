//leetcode q 11
// approach - two pointer

public class container_mostwater {
    public static int maxArea(int [] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

while(left<right){
    int h = Math.min(height[left],height[right]);
    int width = right - left ;
    int area = h*width;

    maxArea = Math.max(maxArea, area);
    if(height[left] <  height[right]){
        left++;

    }else 
        right--;

}
return maxArea;

    }
 public static void main(String[] args) {
    int[]arr = {2,1,8,6,2,9};

    int result = maxArea(arr);
    System.out.println(result);
 }




    
}
