import java.util.*;

public class FindCommonCharacters {
    public static List<String> commonChars(String[] A){
        //1、统计每个单词中每个字母的出现次数
       List<Map<Character,Integer>> counts=new ArrayList<>();
       for(String s:A){//遍历每个单词
           Map<Character,Integer> map=new HashMap<>();
           for(char c:s.toCharArray()){//把每个单词切成一个一个的字符
               int n=map.getOrDefault(c,0);
               map.put(c,n+1);
           }
           counts.add(map);
       }
       System.out.println(counts);
       //从counts中找出abel


    }

    public static void main(String[] args) {
        String[] A={"bella","label","roller"};
        commonChars(A);
    }
}
