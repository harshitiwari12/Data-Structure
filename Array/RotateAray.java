import java.util.Scanner;
public class RotateAray 
{
    public static void reverseArray(int arr[],int key, int start, int end){
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
        System.out.print("Size: ");
        int size = sc.nextInt();
        int []arr = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.print("\nEnter Key: ");
        int key = sc.nextInt();
        System.out.println();
        key = key%arr.length;
        reverseArray(arr, key, 0, arr.length-1);
        reverseArray(arr, key, 0, key-1);
        reverseArray(arr, key, key, arr.length-1);

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
