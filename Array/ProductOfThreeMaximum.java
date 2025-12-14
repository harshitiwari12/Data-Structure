import java.util.Scanner;

public class ProductOfThreeMaximum {
    public static int maximumProduct(int arr[]) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        if(arr.length<3){
            return 0;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min1){
                min2 = min1;
                min1 = arr[i];
            }
            else if(arr[i]<min2){
                min2 = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max3=max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i]>max2){
                max3 = max2;
                max2 = arr[i];
            }
            else if(arr[i]>max3){
                max3 = arr[i];
            }
        }

        int case1 = min1*min2*max1;
        int case2 = max1*max2*max3;

        int result=Math.max(case1,case2);

        return result;
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
        int result=maximumProduct(arr);
        System.out.println();
        System.out.println(result);
    }
}
