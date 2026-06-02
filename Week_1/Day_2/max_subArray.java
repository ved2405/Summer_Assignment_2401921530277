// OPTIMAL SOLUTION
class Solution {
    public int maxSubArray(int[] nums) {

        int c = nums[0];
        int m = nums[0];

        for(int i = 1; i < nums.length; i++) {

            c = Math.max(nums[i],c + nums[i]);

            m = Math.max(m,c);
              
        }

        return m;
    }
}
// MY BRUTE FORCE APPROACH
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;int t=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(t<sum)
                t=sum;
            }
        }
        return t;
    }
}
