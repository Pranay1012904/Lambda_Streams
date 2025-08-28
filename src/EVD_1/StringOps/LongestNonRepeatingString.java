package EVD_1.StringOps;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestNonRepeatingString {

    private static StringBuffer sb;

    public static void main(String[] args) {
        String s = "au";
        String[] sArr = s.split("");
        List<String> sList = Arrays.asList(sArr);
        int size=0;int max=0;
        for(int i=0;i<sList.size()-1;i++){
            for(int j=i+1;j<=sList.size();j++) {
                size = nonRepeating(sList.subList(i, j)).length();
                max = Math.max(max, size);
            }
        }
        System.out.println(max);
    }

    public static StringBuffer nonRepeating(List<String> s) {
        sb=new StringBuffer();
       for(String v: s){
           if(Collections.frequency(s,v)==1){
               sb.append(v);

           }else{
               break;
           }
        }
        return sb;
    }
}
