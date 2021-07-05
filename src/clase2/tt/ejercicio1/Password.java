package clase2.tt.ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {

    private String body;

    public Password(String body) {
        if(isValid(body)){
            setBody(body);
        }
        else throw new RuntimeException("PASSWORD IS NOT SAFE");
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public  abstract boolean isValid( String password);
}
