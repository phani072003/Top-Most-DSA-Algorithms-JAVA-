public class selectionsort {
    public static void selection(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
public static void main(String [] args){
    int arr[] = {3, 7, 2, 9, 1, 8};
    System.out.print("before sorting : ");
    for(int i : arr){
        System.out.print(i + " ");
    }
    selection(arr);
    System.out.println();
    System.out.print("After sorting : ");
    for(int i : arr){
        System.out.print(i + " ");
    }

}
}
