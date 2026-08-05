class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
    }

    private int first(int nums[] , int target){

        int high = nums.length-1;
        int low = 0;
        int arr=-1;
        while(high>=low){

            int mid =  low + (high - low)/2;

            if(nums[mid]>target)  high = mid-1;
            else if(nums[mid]<target) low = mid +1;
            if(nums[mid] == target){
                arr = mid;
                high = mid-1;
            }
        }
        return arr;
    }//first


    private int last(int nums[], int target){

        int arr= -1;
        int high = nums.length-1;
        int low = 0;
        while(high>=low){

            int mid =  low + (high - low)/2;

            if(nums[mid]>target)  high = mid-1;
            else if(nums[mid]<target) low = mid +1;
            if(nums[mid] == target){
                arr = mid;
                low = mid+1;
            }

        }
    
        return arr;
    }//last
        
    
}
