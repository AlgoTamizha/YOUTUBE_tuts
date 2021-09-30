class Solution {
    public String countAndSay(int n) {        
        String curr = "1";
        for(int k = 1;k<n;k++)
        {            
            String next = "";
            int i =0;
            while(i < curr.length())
            {
                int currentcharcount = 1;
                while(i < curr.length()- 1 && (curr.charAt(i) == curr.charAt(i + 1)))
                {
                    currentcharcount +=1;
                    i = i+1;
                }
                next += Integer.toString(currentcharcount) + curr.charAt(i);
                i = i + 1;                               
            }
            curr = next;

        }
        return curr;
        
    }
}

//time O(n * m)
//space O(1)
