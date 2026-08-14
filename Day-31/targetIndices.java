// Method I 
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>(); 
        for(int i = 0;i<n;i++){
            if(nums[i]==target) arr.add(i);
        }
        return arr;
    }
}

// Method II 
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        int smaller = 0;
        int count = 0;
        
        ArrayList<Integer> arr = new ArrayList<>(); 
        
        for(int num : nums){
            if(target>num) smaller++;
            else if(target == num) count++;
        }
        for(int i = 0;i<count;i++) 
            arr.add(smaller+i);
        
        return arr;
    }
}
