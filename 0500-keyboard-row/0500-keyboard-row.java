import java.util.*;
class Solution {
    public String[] findWords(String[] words) {
        int l=words.length;
        int f=0;
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            int r1=0,r2=0,r3=0,discard=0;
            for(int j=0;j<words[i].length();j++)
            {
                char k = Character.toLowerCase(words[i].charAt(j));
                if(k=='q' || k=='w'||k=='e' || k=='r' || k=='t'||k=='y'||k=='u'||k=='i'||k=='o'||k=='p')
                {
                    r1++;
                }
                else if(k=='z'||k=='c'||k=='v'||k=='b'||k=='n'||k=='m'||k=='x')
                {
                    r2++;
                }
                else if(k=='a'||k=='s'||k=='d'||k=='f'||k=='g'||k=='h'||k=='j'||k=='k'||k=='l') 
                    r3++;
            }
            if((r2==0 && r3==0)||(r3==0 && r1==0)||(r1==0 && r2==0))
            {
                arr.add(words[i]);
            }
           
        }
        return arr.toArray(new String[0]);
    }
}