class Solution {
    public boolean checkString(String s) {
        boolean bflag=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                bflag=true;
            }
            if(bflag && s.charAt(i)=='a')
            {
                return false;
            }
        }
        return true;
    }
}