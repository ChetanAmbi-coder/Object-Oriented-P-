//TIME COMPLEXITY OF AN ALGORITHM IS O(N)//

public class bubblesort {
    static void bubblesort(int arr[], int n){
        n = arr.length;
        for(int i=n-1; i>=0; i--){
            int alereadysorted = 0;
           
            for(int j=0; j<=n-2; j++){
                
                if(arr[j]>arr[j+1]){
                    int temp  = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]  =  temp;
                    alereadysorted = 1;
                }
            }
            
            if(alereadysorted==0){
                break;
            }
             System.out.println("sort");
        }
    }
    public static void main(String[] args) {
        int arr[]  = {2,9,5,6,1,0,2};
        int n   = arr.length;
         for (int i=0; i<n; i++){
            
             
             System.out.print(arr[i]  );
              

        }
        System.out.println("\n");


         System.out.println("====Sorted array====");
        
       
        for (int i=0; i<n; i++){
             bubblesort(arr, n);
             System.out.print(arr[i]);

        }
      

        
    }

    
}
