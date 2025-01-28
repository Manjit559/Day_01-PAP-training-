import java.util.*;
class Main {
    public static void main(String[] args) {
        //unsorted array
        int[] arr = {1,2,6,2,4,1};
        Arrays.sort(arr);
        // Scanner sc = new Scanner(System.in);
        int k = 3;
        int n = arr.length;
        
        int max_sum = Integer.MIN_VALUE;
        
        for(int i=0;i<=n-k;i++){
            int current_sum = 0;
            for(int j=0;j<k;j++){
                current_sum += arr[i+j] ;
            }
            
            
max_sum = Math.max(current_sum,max_sum);
        }
        System.out.print(max_sum);
    }
}
