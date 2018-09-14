 class Palindrome {


    public static String reverse(String string){

        String result="";
        int i;
        for(i=string.length()-1;i>=0;i--){
            result=result+string.charAt(i);
        }
        return result;
    }
    public static String check_palindrome(String string){
        String result=reverse(string);
        String answer="";
        boolean b = string.equals(result);
        if(b==true)
        {
            answer="true";
        }
        else
        {
            answer="false";
        }

        return answer;

    }
}
