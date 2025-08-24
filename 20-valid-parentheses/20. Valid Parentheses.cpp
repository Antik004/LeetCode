class Solution {
public:
    bool isValid(string s) {
        stack<char> mystack;

        for(char c : s)
        {
            if(c=='('|| c== '{' || c=='[')
            {
                mystack.push(c);
            }
            else 
            {
                if(mystack.empty())
                {
                    return false;
                }
                char top=mystack.top();
                mystack.pop();
                if(c==')'&& top!='('
                   || c=='}'&& top!='{'
                   || c==']'&& top!='[')
                   {
                    return false;
                   }
            }
        }
        return  mystack.empty();
    }
};