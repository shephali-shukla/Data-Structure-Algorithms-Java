public class PalindromeString {
    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString();
        System.out.println(ps.isPalindrome("Madam"));    //will return false for"Madam".
    }

    public boolean isPalindrome(String str){

        char[] charAr = str.toCharArray(); //converts String to character array.
        int start = 0;
        int end = str.length() - 1;
        if(start < end){
            if(charAr[start] != charAr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
