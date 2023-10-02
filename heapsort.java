public class heapsort{
     static void heapify(int a[], int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;
        if(left<n && a[left]>a[largest]) largest = left;
        if(right<n && a[right]>a[largest]) largest = right;
        if(largest!=i){
            int temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a, n, largest);
        }
     }
     static void sort(int a[]){
        int n = a.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(a, n, i);
        }
        for(int i=n-1; i>=0; i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
     }
     static void printArr(int a[]){
        int n = a.length;
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
     }
     public static void main(String args[]){
        int a[] = {2, 5, 2, 78, 1, 8, 46, 7, -9};
        System.out.println("Before sorting : ");
        printArr(a);
        sort(a);
        System.out.println("After sorting : ");
        printArr(a);
     }
}