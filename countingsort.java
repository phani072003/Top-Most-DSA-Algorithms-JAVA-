public class countingsort {
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
    void countsort(int a[]){
        int n = a.length;
        int max = getMax(a);
        int b[] = new int[n+1];
        int count[] = new int[max+1];
        for(int i=0; i<=max; i++){
            count[i]=0;
        }
        for(int i=0; i<n; i++){
            count[a[i]]++;
        }
        for(int i=1; i<=max; i++){
            count[i] += count[i-1];
        }
        for(int i=n-1; i>=0; i--){
            b[count[a[i]] - 1] = a[i];
            count[a[i]]--;
        }
        for(int i=0; i<n; i++){
            a[i] = b[i];
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
        int a[] = {4, 6, 3, 1, 8, 1, 9, 0, 7, 4, 12};
        countingsort c = new countingsort();
        System.out.println("Before sorting : ");
        c.printArr(a);
        c.countsort(a);
        System.out.println("After sorting : ");
        c.printArr(a);
    }
}
