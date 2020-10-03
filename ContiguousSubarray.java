class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int maxL=0;
        int sum=0;
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++){
            
            sum = sum + (nums[i]>0?1:-1);


            if(map.containsKey(sum)){
                maxL= Math.max(maxL,i-map.get(sum))
            }
            else{
                map.put(sum,i);
            }

            
          
         
        }
        return maxL;
    }
}