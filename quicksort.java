public class quicksort {
    int partition(int a[], int start, int end){
        int pivot = a[start];
        while (start <= end) {
            while (a[start] < pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
             if(start<=end){ 
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }          
        }
        return start;
    }
    void sort(int a[], int start, int end){
        if(start<end){
            int p = partition(a, start, end);
            sort(a, start, p-1);
            sort(a, p, end);
        }
    }
    void printArr(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int a[] = {1, 6, 8, 4, 9,35, 667, 57, 3, 8, 2, 1};
        int n = a.length;
        quicksort q = new quicksort();
        System.out.println("Before sorting :");
        q.printArr(a);
        q.sort(a, 0, n-1);
        System.out.println("After sorting : ");
        q.printArr(a);
    }
}
