import java.util.Arrays;

public class HashTableImpl {
    /*Determine if string has all unique characters without using any additional data structure
        1. Create an array with size 26
        2. Create a hash function to calculate the position to insert
        3. While inserting check if string is unique
        4. Insert, if already inserted, return not unique else return unique*/

    final String[] theArray;
    final int arraySize;

    //Entry point of the program
    public static void main(String[] args){
        System.out.println("Program Start");
        HashTableImpl arr = new HashTableImpl(26);
        arr.checkIfUniqueHashFunc("aaz",arr.theArray);
        arr.displayTheStack();
    }

    //Hash function that determines the location of the insert and also checks if the character is already inserted
    public void checkIfUniqueHashFunc(String input, String[] arr){
        char[] charArr= input.toCharArray();
        for (char ch : charArr){
            int index = (int) ch -97;
            if(arr[index].equals("-1"))
                arr[index] = "0";
            else
                System.out.println("The String is not unique");
        }

    }

    //Constructor to initialize the Hash Table Array
    HashTableImpl(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }

    //Function to display the array
    public void displayTheStack(){
        for(int i =0; i<arraySize;i++)
            System.out.print(theArray[i]);
    }
}
