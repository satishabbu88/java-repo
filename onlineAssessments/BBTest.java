package blckbd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BBTest {
    public static void main(String[] args) {
        //1.length of highest substring,
        // input: 1010010, then flip each digit i.e, 0 to 1 and viceversa, find the length of highest flipped value
        //which has more ones.

        //2. remove hiphen and preceding letter,
        // input: abc-de-fg-h, output: abdfh

        String str = "abc-de-fg-h";
        //2.a
        String[] strArr = str.split("");
        for(int i=0; i<strArr.length;i++){
            if(strArr[i].equals("-") && i!=0){
                strArr[i]="";
                strArr[i-1]="";
            }
        }
        String res = String.join("", strArr);
       // System.out.println(res);

        //2.b
        String result = "abc-de-fg-h".replaceAll(".-", "");
        //System.out.println(result);

        //2.c using stringbuilder
        StringBuilder sb =new StringBuilder();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch =='-'){
               if(sb.length()>0){
                   sb.deleteCharAt(i-1);
               }
            } else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);


        //sum of alphabets in string vowel=2, consenant=1, if abcdef sum is 8

        // given list of leader names, need to elect leader
        // list of strings/names, if leader name starts with consonent push into a stack, if vowel pop the string
        // if no strings to pop, return -1
        // result should be a string
    }
}
