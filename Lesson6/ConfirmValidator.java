package Lesson6;

public class ConfirmValidator {
    /*
    Checking whether password matches confirmPassword
     */
    public void isPasswordMatch(String password, String confirmPassword)throws WrongPasswordException{
        boolean isValid= password.equals(confirmPassword);
        if(!isValid) throw new WrongPasswordException("пароли не совпадают");

    }
}
