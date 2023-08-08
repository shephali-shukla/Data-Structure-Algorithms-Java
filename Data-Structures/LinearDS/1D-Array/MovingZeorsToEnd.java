import java.util.Arrays;

public class MovingZeorsToEnd {
    public static void main(String[] args) {

        MovingZeorsToEnd mv = new MovingZeorsToEnd();
        
        int[] num = {7,0,8,4,0,1,0};
        mv.zerosToEnd(num);
    }

    public void zerosToEnd(int[] arr){

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
