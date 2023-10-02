public class radixsort {
    int getMax(int a[]){
        int n = a.length;
        int max = a[0];
        for(int i=1; i<n; i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        return max;
    }
    void countsort(int a[], int place){
        int n = a.length;
        int b[] = new int[n+1];
        int count[] = new int[10];
        for(int i=0; i<10; i++){
            count[i]=0;
        }
        for(int i=0; i<n; i++){
            count[(a[i]/place) % 10]++;
        }
        for(int i=1; i<10; i++){
            count[i] += count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            b[count[(a[i]/place)%10]-1] = a[i];
            count[(a[i] / place) % 10]--;
        }
        for(int i=0; i<n; i++){
            a[i] = b[i];
        }
    }
    void radix(int a[]){
        int max = getMax(a);
        for(int place=1; max/place>0; place *= 10){
             countsort(a, place);
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
        int a[] = {234, 4667, 645, 578, 23, 589, 2, 278};
        radixsort r = new radixsort();
        System.out.println("Before sorting  : ");
        r.printArr(a);
        r.radix(a);
        System.out.println("After sorting : ");
        r.printArr(a);
    }

}
