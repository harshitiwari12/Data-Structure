public class MoveZeros {
    public static void main(String[] args) {
        int arr[]={4,1,9,3,0};
        int count=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=0;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        
    }
}
