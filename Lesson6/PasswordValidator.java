package Lesson6;

public class PasswordValidator {
    /*
    Checking password using String validator methods
     */
    public void isPassValid(String password) throws WrongPasswordException {
        boolean isValid = true;
        String msg = null;
        if (!StringValidator.isStringLessThenParam(password, 20)) {
            msg = "Пароль более 19 символов!";
            isValid = false;
        } else if(StringValidator.isStringcontainSpace(password)){
                msg = "Пароль содержит пробел!";
                isValid = false;
            }
        else if(!StringValidator.isStringContainDigit(password)){
            msg = "пароль не содержить цифры!";
            isValid = false;
        }
        if (!isValid) throw new WrongPasswordException(msg);
    }
}

