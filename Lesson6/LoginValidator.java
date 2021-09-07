package Lesson6;

public class LoginValidator {
    /*
    Checking login using string validator methods
     */
    public void isLoginValid(String login) throws WrongLoginException {
        boolean isValid = true;
        String msg = null;
        if (!StringValidator.isStringLessThenParam(login, 20)) {
            msg = "Логин более 19 символов!";
            isValid = false;
        } else {
            if (StringValidator.isStringcontainSpace(login)) {
                msg = "Логин содержит пробел!";
                isValid = false;
            }
        }
        if (!isValid) throw new WrongLoginException(msg);
    }

}
