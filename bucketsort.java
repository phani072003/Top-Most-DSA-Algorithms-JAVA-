public class bucketsort {
    int getMax(int a[]){
        int n = a.length;
        int max = a[0];
        for(int i=0; i<n; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
    void bucket(int a[]){
        int n = a.length;
        int max = getMax(a);
        int bucket[] = new int[max+1];
        for(int i=0; i<=max; i++){
            bucket[i]=0;
        }
        for(int i=0; i<n; i++){
            bucket[a[i]]++;
        }
        int j = 0;
        for(int i=0; i<=max; i++){
            while(bucket[i]>0){
                a[j++] = i;
                bucket[i]--;
            }
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
        int a[] = {3, 6, 2, 8, 9, 1, 7, 3, 1};
        System.out.println("Before sorting : ");
        bucketsort b = new bucketsort();
        b.printArr(a);
        b.bucket(a);
        System.out.println("After sorting : ");
        b.printArr(a);
    }
}
