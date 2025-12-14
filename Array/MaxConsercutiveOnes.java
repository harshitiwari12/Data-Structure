class MaxConsercutiveOnes{
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1};
        int count=0, lenght=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                lenght = Math.max(count,lenght);
            }
            else{
                count=0;

            }
        }
        System.out.println(lenght);;
    }
}