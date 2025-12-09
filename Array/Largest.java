import java.util.Scanner;
class Largest{

    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        return largest;
    }

    public static int secondLargest(int arr[], int largest){
        int secondhighest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=largest && arr[i]>secondhighest){
                secondhighest=arr[i];
            }
        }

        return secondhighest;
    }

    public static int thirdLargest(int arr[], int largest, int secondLargest){
        int thirdhighest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=largest && arr[i]!=secondLargest && arr[i]>thirdhighest){
                thirdhighest = arr[i];
            }
        }
        return thirdhighest;
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
        int highest = largest(arr);
        System.out.println("Largest: "+highest);
        
        int secondhighest = secondLargest(arr,highest);
        System.out.println("Second Largest: "+secondhighest);

        int thirdhighest = thirdLargest(arr, highest, secondhighest);
        System.out.println("Third Largest: "+ thirdhighest);
    }
}