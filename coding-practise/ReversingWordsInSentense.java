import java.util.*;
import java.util.stream.Collectors;

public class ReversingWordsInSentense {
    static void main(String[] args ) {
       String s="satish is a software engineer";//-> engineer software a is satish

        List<String> list = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if(c==' '){
                list.add(s.substring(0,s.indexOf(' ')));
                s=s.substring(s.indexOf(' ')+1).trim();
            }
            if(!s.contains(" ")){
            list.add(s);
            s="";
            }
        }

        String result = "";
        for(int i = list.size()-1;i>=0;i--){
            result += list.get(i)+" ";
        }
        System.out.println(result);
    }

}
