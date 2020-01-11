public class SolutionFor9 {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        for(int i=0;i<=num.length()/2;i++){
            int tail =num.length()-i-1;
            if(num.charAt(tail)!=num.charAt(i)){
                return false;
            }
        }

        return true;

    }
}
