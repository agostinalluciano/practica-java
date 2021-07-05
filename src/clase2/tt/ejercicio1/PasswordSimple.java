package clase2.tt.ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSimple extends Password{

    private static  String PASSWORD_PATTERN= ".{8,20}$";


    public PasswordSimple(String body) {
        super(body);
    }

    public  boolean isValid(final String password){

        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
