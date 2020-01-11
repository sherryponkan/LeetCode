public class SolutionFor7 {
    public int reverse(int x) {
        int y=Math.abs(x);
        String num = Integer.toString(y);
        StringBuilder sb = new StringBuilder();
        for(int i=num.length()-1;i>=0;i--){
            sb.append(num.charAt(i));
        }

        try{
            int res = Integer.parseInt(sb.toString());
            if(x<0){
                return 0-res;
            }

            return res;
        }catch(Exception e){
            return 0;
        }

    }
}
