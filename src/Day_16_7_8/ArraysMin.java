package Day_16_7_8;

public class ArraysMin {
    public static void main(String[] args) {
        int [] numbers={1,2,3,45,565,65,-6};
        System.out.println(findMin(numbers));
    }


    public static int findMin(int[] arr){
        int min=arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
