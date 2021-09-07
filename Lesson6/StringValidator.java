package Lesson6;

public class StringValidator {
    /*
    Generals methods for checking whether a string consists of more than 20 symbols, contains space, one digit
     */
    public static boolean isStringLessThenParam(String str, int parametr){
       return str.length() < parametr;
    }
    public static boolean isStringcontainSpace(String str){
        return str.contains(" ");
    }
    public static boolean isStringContainDigit(String str){
        String digits = "0123456789";
        boolean isContains = false;
        for(int i = 0; i < str.length(); i++){
            String c = String.valueOf(str.charAt(i));
            if(digits.contains(c)){
                isContains=true;
                break;
            }
        }
        return isContains;
    }
}
