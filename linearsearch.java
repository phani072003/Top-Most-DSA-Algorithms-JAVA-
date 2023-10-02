public class linearsearch{
    public static int search(int arr[], int N, int x){
        for(int i=0; i<N; i++){
            if(arr[i]==x) return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {5, 6, 7, 3, 4, 9};
        int result = search(arr, arr.length, 7);
        if(result == -1){
           System.out.println("Elemnt is not found in the array");
        }
        else{
            System.out.println("Elemnt is found in the array at index " +result);
        }
        
    }
}