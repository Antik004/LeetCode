class Solution {
public:
    long long addDigits(int num) {
        if(num<10)
        {
            return num;
        }
        long long s=0;
        while(num!=0)
        {
            s=s+(num%10);
            num=num/10;
        }
        return addDigits(s);
    }
};