public class Solution {
    public int solve(ArrayList<Integer> A) {
        int count =1;
        int max = A.get(0);
        for(int i=0; i<A.size(); i++){
            if(max<A.get(i)){
                max = A.get(i);
                count++;
            }
        }
        
        return count;
    }
    public static void main(String[] args){
        Solution obj = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        for(int i =0; i<n; i++){
            input.add(sc.nextInt());
        }
        
        int result = obj.solve(input);
        System.out.print(result);
        
    }
}
