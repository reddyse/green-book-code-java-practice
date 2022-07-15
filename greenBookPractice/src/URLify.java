public class URLify {

    public static void main(String[] args){
        String result = strURLify("Mr John Smith  ");
        System.out.println("URLified string--->"+result);
    }

    public static String strURLify(String str){
        str = str.trim();
        char[] charArr = str.toCharArray();
        for(char ch : charArr){
            if(String.valueOf(ch).equals(" "))
                str = str.replace(" ","%20");
        }
        return str;
    }

}
