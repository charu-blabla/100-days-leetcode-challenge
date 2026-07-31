class Solution {
    public int maxArea(int[] height) {

        int l = height.length;
        
        int left = 0;
        int right = l-1;
        int max = 0;

        while(left<=right){
            int currentMax = (right-left)* Math.min(height[left],height[right]);
                        if(currentMax>max){
                            max = currentMax;}
                        
            if(height[left]<height[right]){
                left ++;
              
                }
               else{ 
                right --;
            
                }
          
        
            
            }
               
            return max;

        }

    }
