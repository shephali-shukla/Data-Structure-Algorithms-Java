class PrintingArray{
    public static void main(String[] args) {
        
        int[] num = new int[5];
        
        //Inserting values
        for(int i=0;i<5;i++){
            num[i] = i+1;
        }

        //Printing
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
}