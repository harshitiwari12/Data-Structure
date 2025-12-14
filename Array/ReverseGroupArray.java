import java.util.Scanner;
public class ReverseGroupArray {

    public static void reverse(int arr[],int key){
        for(int i=0;i<arr.length;i+=key){ 
            int start = i;
            int end = Math.min(i+key-1,arr.length-1);

            while(end>start){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        int key = sc.nextInt();
        reverse(arr, key);

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}


