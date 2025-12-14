public class Maxthreeproducts {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(max1<arr[i])
                max1 = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max1 && max2<arr[i])
                max2 = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max1 && arr[i]!=max2 && max3<arr[i])
                max3 = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            if(min1>arr[i])
                min1=arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=min1 && min2>arr[i])
                min2=arr[i];
        }
        
        int result = Math.max(max1*max2*max3, min1*min2*max1);
        System.out.println(result);
    }
}
