
package paulapallas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    // Método que valida si un email tiene el formato correcto
    public boolean isValid(String email) {
        // Expresión regular para validar el formato del correo
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        // Crear un patrón basado en la expresión regular
        Pattern pattern = Pattern.compile(emailRegex);
        
        // Crear un matcher para comparar el email con el patrón
        Matcher matcher = pattern.matcher(email);
        
        // Devolver true si el email coincide con el patrón
        return matcher.matches();
    }
}
