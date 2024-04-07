public class Solution {
    public int[] solve(int[] A) {
        int positive = 0;
        int negative =0;
        for(int i=0; i<A.length; i++){
            if(A[i]>0){
                positive++;
            }
            else if(A[i]<0){
                negative++;
            }
        }
        int[] output = {positive, negative};
        return output;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0; i<n; i++){
             arr[i]=sc.nextInt();
         }
         
         int[] result = obj.solve(arr);
         System.out.print(result);
    }
}
