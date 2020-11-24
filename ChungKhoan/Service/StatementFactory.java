package ChungKhoan.Service;

import ChungKhoan.Model.Pattern;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StatementFactory {
    public static void createStatement(Pattern pattern, String[] arr){
        String output="";
        String pat=pattern.getPattern();
        String[] arr2=pat.split("' '");
        for(int i=0;i<arr2.length-1;i++){
            output+=arr2[i]+arr[i];
        }
        output+=arr2[arr2.length-1];
        System.out.println(output);
    }
    public static void getStatement(String input){
        String[] arr=input.split(",");
        int[]  arrDigit= TransferStringToInt.transferStringToInt(arr);
        List<Pattern> patterns=  Arrays.asList(Pattern.values()).stream().filter(i->Arrays.equals(i.getArr(),arrDigit)).collect(Collectors.toList());
        for (Pattern pattern:patterns) {
            createStatement(pattern,arr);
        }
    }
}
