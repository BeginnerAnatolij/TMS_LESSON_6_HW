package Lesson6;

public class TryAndCatch {
    public static boolean checkingParametors(String login, String password, String confirmPassword) {
        /*
        Checking login.password and confirmPassword using try and catch
         */
        boolean isValid = true;
        LoginValidator str = new LoginValidator();
        PasswordValidator str1 = new PasswordValidator();
        ConfirmValidator str2 = new ConfirmValidator();
        try {
            str.isLoginValid(login);

        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
            isValid = false;
        }
        try {
            str1.isPassValid(password);
            str2.isPasswordMatch(password, confirmPassword);
        } catch (WrongPasswordException e1) {
            System.out.println(e1.getMessage());
            isValid = false;
        }
        return isValid;

    }

}

