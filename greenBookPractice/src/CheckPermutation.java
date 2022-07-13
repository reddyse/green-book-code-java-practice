import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    //Check if two strings are permutation of each other

    public static void main(String[] args){
        final String input1 = "123";
        final String input2 = "323";

        checkIfPermutation(input1,input2);
    }

    public static void checkIfPermutation(String inp1, String inp2){

        boolean result = true;
        if(inp1.length() != inp2.length())
            System.out.println("Not a Permutation");

        char[] charArr1 = inp1.toCharArray();
        char[] charArr2 = inp2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i=0;i<inp1.length();i++){
           if(charArr1[i]!=charArr2[i]) {
               result = false;
               break;
           }
        }
        System.out.println("Strings are permutation--->"+result);
    }
}
