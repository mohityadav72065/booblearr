public class booble {
    static void boole(int []arr){
        int n=arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public  static  void main(String[] args){
        int []arr={1,3,4,5,2};
        boole(arr);
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
