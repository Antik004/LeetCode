class Solution {
    public boolean isValid(String s) {
        Stack <Character> mystack =new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='[')
            {
                mystack.push(c);
            }
            else{
                if(mystack.isEmpty())
                {
                    return false;
                }
                char top=mystack.pop();
                if(c==')'&& top!='('
                    || c=='}'&& top!='{'
                    || c==']'&& top!='[')
                    {
                        return false;
                    }
            }
        }
        return mystack.isEmpty();
    }
}