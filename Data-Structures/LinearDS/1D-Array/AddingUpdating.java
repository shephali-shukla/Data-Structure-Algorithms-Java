class AddingUpdating{
    public static void main(String[] args) {
        
        AddingUpdating ad = new AddingUpdating();
        ad.demo();
    }

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void demo(){
        int[] array = new int[5];

        array[0] = 3;
        array[1] = 9;
        array[2] = 2;
        array[3] = 8;
        array[4] = 6;

        array[3] = 65;

        printArray(array);
    }
}