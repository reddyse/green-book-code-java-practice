import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    //Check if two strings are permutation of each other
    static int NO_OF_CHARS = 256;
    public static void main(String[] args){
        final String input1 = "123";
        final String input2 = "323";

        //checkIfPermutation(input1,input2);
        arePermutationMethod2(input1,input2);
    }

    public static void checkIfPermutationMethod1(String inp1, String inp2){

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

    static boolean arePermutationMethod2(String inp1, String inp2)
    {
        char str1[] = inp1.toCharArray();
        char str2[] = inp2.toCharArray();

        // Create 2 count arrays and initialize
        // all values as 0
        int count1[] = new int [NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int [NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i <str1.length && i < str2.length ;
             i++)
        {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        // If both strings are of different length.
        // Removing this condition will make the program
        // fail for strings like "aaca" and "aca"
        if (str1.length != str2.length)
            return false;

        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++)
            if (count1[i] != count2[i])
                return false;

        return true;
    }
}
