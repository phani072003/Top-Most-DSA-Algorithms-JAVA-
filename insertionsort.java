public class insertionsort {
    public static void insertion(int arr[]){
        int n = arr.length;
        for(int j=1; j<n; j++){
            int key = arr[j];
            int i = j-1;
            while(i>-1 && (arr[i] > key)){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }

    }
    public static void main(String args[]){
        int arr[] = {3, 5, 2, 9, 6, 5};
        int n = arr.length;
        System.out.println("Before sorting");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("After sorting");
        insertion(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
