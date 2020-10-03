class Solution {
    public int longestPalindrome(String s) {
        
          HashSet<Character> map = new HashSet<>();

        int count=0;
        //map.put(0,-1);
        
        for(char ch : s.toCharArray()){
            
            if(map.contains(ch)){
                map.remove(ch);
                count++;
            }
            else{
                map.add(ch);
            }
            
            
        } 
        if(map.isEmpty()) 
        {
            return 2*count;
        }
        else return 2*count + 1;
          
         
        }
      
    }
