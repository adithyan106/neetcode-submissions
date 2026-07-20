class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>h1=new HashMap<>();
        HashMap<Character,Integer>h2=new HashMap<>();
        for(int i =0;i<s.length();i++){
            char st=s.charAt(i);
            if(h1.containsKey(st)){
                h1.put(st,h1.get(st)+1);
            }
            else{
                h1.put(st,1);
            }
        }
        for(int i =0;i<t.length();i++){
            char ch=t.charAt(i);
            if(h2.containsKey(ch)){
                h2.put(ch,h2.get(ch)+1);
            }
            else{
                h2.put(ch,1);
            }
        }
        if(h1.equals(h2)){
            return true;
        }

    return false;
    }
}
