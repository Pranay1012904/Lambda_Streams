package EVD_1.StringOps;

public class CircularSentence {

    public static void main(String[] args) {
        String s = "leetcode exercises sound delightful";
        System.out.println(checkCircular(s));
    }

    public static boolean checkCircular(String s) {
        String[] sA = s.split(" ");
        if (sA.length == 1) {
            if (sA[0].charAt(0) == (sA[0].charAt(sA[0].length() - 1)))
                return true;
        }
        boolean flag=true;
        if(sA[0].charAt(0) != (sA[sA.length-1].charAt(sA[sA.length-1].length() - 1))){
            return false;
        }
        else {
            for (int i = 0; i < sA.length - 1; i++) {

                if (sA[i].charAt(sA[i].length() - 1) == sA[i+1].charAt(0)){
                    flag=true;
                }else{
                    return false;
                }
            }
        }
        return flag;
    }
}
