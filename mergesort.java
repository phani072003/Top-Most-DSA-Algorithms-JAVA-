public class mergesort {
    void merge(int a[], int beg, int mid, int end){
        int n1 = mid-beg+1;
        int n2 = end-mid;
        int Leftarray[] = new int[n1];
        int Rightarray[] = new int[n2];
        for(int i=0; i<n1; i++){
            Leftarray[i]=a[beg+i];
        }
        for(int j=0; j<n2; j++){
            Rightarray[j]=a[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=beg;
        while(i<n1 && j<n2){
            if(Leftarray[i]<=Rightarray[j]){
                a[k]=Leftarray[i];
                i++;
            }
            else{
                a[k]=Rightarray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=Leftarray[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=Rightarray[j];
            j++;
            k++;
        }
    }
    void mergsort(int a[], int beg, int end){
         if(beg<end){
            int mid = (beg+end)/2;
            mergsort(a, beg, mid);
            mergsort(a, mid+1, end);
            merge(a, beg, mid, end);
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
        int a[] = {4, 6, 4, 20, 7, 2, 45, 6, 100, 20};
        mergesort m = new mergesort();
        System.out.println("Before sorting : ");
        m.printArr(a);
        int n = a.length;
        m.mergsort(a, 0, n-1);
        System.out.println("After sorting : ");
        m.printArr(a);
    }
}
