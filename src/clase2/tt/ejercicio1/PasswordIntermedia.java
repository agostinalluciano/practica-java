package clase2.tt.ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordIntermedia extends Password{

    private static  String PASSWORD_PATTERN=  "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}$";

    public PasswordIntermedia(String body) {
        super(body);
    }

    @Override
    public boolean isValid(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
            }
}
