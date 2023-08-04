public class MinimumElement {

    public int minimumEle(int[] arr){

        //edge case
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }

        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        
        int[] num = {4,9,7,2,5};
        MinimumElement mn = new MinimumElement();
        System.out.println(mn.minimumEle(num));
    }
}
