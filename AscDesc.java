import java.util.Scanner;

class Sort{
    void asc(int a[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    
    void desc(int a[],int mid,int n){
        for(int j=mid;j<n;j++){
            for(int i=mid;i<n-1;i++){
                if(a[i]<a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }
};

class AscDesc{
    public static void main(String[] args) {
        // int a[] = {7,4,5,2,3,1};
        Sort s = new Sort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int mid = (a.length+1)/2;
        s.asc(a,a.length);
        s.desc(a,mid,a.length);

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}