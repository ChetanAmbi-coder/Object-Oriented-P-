public class insertionsort {
    static void insertion_sort( int arr[], int n){
        for(int i=0; i<=n-1; i++){
            int j=i;
            while( j>0&&  arr[j-1]>arr[j]){
                int temp  = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                  j--;
                  System.out.println("loop");
               
            }
           

        }

        
    }
    public static void main(String[] args) {
        int a[] = {3,6,9,4,2,1};
        int n  = a.length;
        insertion_sort(a, n);
        for(int i=0; i<n; i++){

        
        System.out.println(a[i]);
        }

        
    }

    
}
