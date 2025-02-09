package paulapallas;


public class EmailValidator {

    public boolean isValid(String email) {
        if (email == null || !email.contains("@")) {
            return false;
        }

        String[] parts = email.split("@");
        if (parts.length != 2) {
            return false;
        }

        String domainPart = parts[1];
        return domainPart.contains(".");
    }
}
