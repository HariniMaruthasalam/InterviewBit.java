public class Solution {
    public int solve(String A) {
        String[] arr = A.split(" ");
        int count = 0;
        for(String x: arr){
            count += isPalimdrome(x);
        }
        return count;
    }
    public static int isPalimdrome(String str){
        for(int i=str.length()-1, j=0; j<i; i--, j++){
            if(str.charAt(i) != str.charAt(j)){
                return 0;
            }
        }
        return 1;
    }
}
