class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> frequency=new HashMap<>();
    for(char ch:s.toCharArray())
    {
        frequency.put(ch,frequency.getOrDefault(ch,0)+1);
    }
    List<Map.Entry<Character,Integer>> list=new ArrayList<>     (frequency.entrySet());

    Collections.sort(list,(e1,e2)->e2.getValue().compareTo(e1.getValue()));

    StringBuilder res=new StringBuilder();

    for(Map.Entry<Character,Integer>e:list)
    {
        char c=e.getKey();
        int count=e.getValue();

        while(count-- >0)
        {
            res.append(c);
        }
    }
    return res.toString();
    }
}