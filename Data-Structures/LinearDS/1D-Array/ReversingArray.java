public class ReversingArray {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        print(arr);
        reverseArray(arr, 0, arr.length-1);
        System.out.println();
        print(arr);
    }

    public static void print(int[] num){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }

    public static void reverseArray(int[] num, int start, int end){

        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
