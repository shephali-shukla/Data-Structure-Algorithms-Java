public class FindMissingNumber {
    public static void main(String[] args) {
        
        int[] num = {1,3,5,2,6};
        int n = num.length + 1;
        int sum = (n * (n + 1))/2;

        for(int index : num){
            sum -= index;
        }
        System.out.println(sum);
    }
}
