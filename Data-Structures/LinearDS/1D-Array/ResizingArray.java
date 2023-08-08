import java.util.Arrays;

public class ResizingArray {
    public static void main(String[] args) {
        ResizingArray nw = new ResizingArray();
        int[] num = {5,9,7,2,7};
        System.out.println(Arrays.toString(nw.resize(num, 10)));
    }

    public int[] resize(int[] arr, int capacity){

        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        return temp;
    }
}
