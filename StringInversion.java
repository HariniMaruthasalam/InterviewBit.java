public class Solution {
    public String solve(String A) {
        char[] arr = A.toCharArray();
        for(int i=0; i<arr.length; i++){
            arr[i]=(char)(arr[i]^32);
        }
        return new String(arr);
    }
}
