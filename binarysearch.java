public class binarysearch {
    public static int search(int arr[], int first, int last, int key){
        if(last>=first){
            int mid = first + (last-first)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                return search(arr, first, mid-1, key);
            }
            if(arr[mid]<key){
                return search(arr, mid+1, last, key);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {5, 7, 9, 10, 20};
        int key = 7;
        int last = arr.length -1;
        int result = search(arr, 0, last, key);
        if(result==-1){
            System.out.println("Element is not found in the array");
        }
        else{
            System.out.println("Element ia found in the array at the index " +result);
        }
    }
    
}
