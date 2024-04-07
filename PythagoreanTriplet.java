public class Solution {
    public int solve(int A) {
        int count =0;
        for(int i=1; i<=A; i++){
            for(int j=i; j<=A; j++){
                int Square = i*i + j*j;
                int k = (int)Math.sqrt(Square);
                
                if(Square==k*k && k<=A){
                   count ++;
            }
            }
        }
        
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        System.out.print(obj.solve(n));
    }
}
