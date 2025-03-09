package paulapallas;



import java.util.regex.Pattern;

public class ValidadorContraseña {
    private String contraseña;

    public ValidadorContraseña(String contraseña){
        this.contraseña=contraseña;

    }

    public boolean esValida(String contraseña) {
        // Verifica que la contraseña tenga al menos 8 caracteres
        if (contraseña.length() < 8) {
            return false;
        }

        // Verifica que contenga al menos una letra mayúscula
        if (!Pattern.compile("[A-Z]").matcher(contraseña).find()) {
            return false;
        }

        // Verifica que contenga al menos una letra minúscula
        if (!Pattern.compile("[a-z]").matcher(contraseña).find()) {
            return false;
        }

        // Verifica que contenga al menos un número
        if (!Pattern.compile("[0-9]").matcher(contraseña).find()) {
            return false;
        }

        // Verifica que contenga al menos un carácter especial
        if (!Pattern.compile("[!@#$%^&*]").matcher(contraseña).find()) {
            return false;
        }

        return true; // Si pasa todas las verificaciones, la contraseña es válida
    }
}

