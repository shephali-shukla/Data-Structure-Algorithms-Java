public class RemoveEvenElements {
    public static void main(String[] args) {
        
        int[] num = removeEven(new int[]{5,4,2,8,9,1});
        
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }

    public static int[] removeEven(int[] arr){
        //counting the frequency of odd numbers
        int oddCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                oddCount++;
            }
        }
        //inserting odd numbers in the new array
        int[] res = new int[oddCount];
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2!= 0){
                res[index] = arr[i];
                index++;
            }
        }
        return res;
    }
}
