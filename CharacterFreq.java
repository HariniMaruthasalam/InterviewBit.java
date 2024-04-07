public class Solution {
    public ArrayList<Integer> solve(String A) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Character> set = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            if(!map.containsKey(c)) map.put(c,1);
            else map.put(c,map.get(c) + 1);
        }
        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            if(!set.contains(c)){
                ans.add(map.get(c));
                set.add(c);
            }
    }
    return ans;
}
}
