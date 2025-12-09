import java.util.Scanner;
public class ReverseArray {
    public static void arrayReverse(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        arrayReverse(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
