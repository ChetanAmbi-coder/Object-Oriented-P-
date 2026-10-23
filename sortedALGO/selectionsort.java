

public class selectionsort {
    static  void selectionsort( int a[],  int n){
        n = a.length;
        for(int i =0; i<=n-2; i++){
            int min = i;
            for(int j=i; j<=n-1; j++){
                if(a[j] < a[min]){
                    min = j;
                }
                
            }
            int temp = a[min];
                a[min] = a[i];
                a[i] = temp;

        }


    }
    public static void main(String[] args) {
         
        int arr[]  = {4,5,9,1,3,6,8,2,7};
        int n   = arr.length;
       
          for (int i=0; i<n; i++){
             
             System.out.println(arr[i]  );

        }
        System.out.println("====Sorted array====");
        
       
        for (int i=0; i<n; i++){
             selectionsort(arr,n);
             System.out.print(arr[i]);

        }
      


        

       
        
    }
    
}
