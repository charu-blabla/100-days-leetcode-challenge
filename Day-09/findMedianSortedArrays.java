class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] ans2 = merge(nums1,nums2);
        int len = ans2.length;
        
        if (len%2 != 0){
            return ans2[len/2];
        }
        else{
            return (ans2[len/2]+ans2[len/2 -1])/2.0;
        }

    }


    public int[] merge(int[] arr1,int[] arr2){

        int[] ans = new int[arr1.length + arr2.length];
        int p1=0,p2=0,p3=0;

        while(p1<arr1.length || p2<arr2.length){

            int val1 = p1<arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2<arr2.length ? arr2[p2] : Integer.MAX_VALUE;

            if(val1<val2){
                ans[p3] = val1;
                p1++;
            } else{
                ans[p3] = val2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
} 
