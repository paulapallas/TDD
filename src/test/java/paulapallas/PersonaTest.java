package paulapallas;

public class PersonaTest {
    


    @Test
    public void testGetName() {
        Person person = new Person("John", 30, "male");
        assertEquals("John", person.getName());
    }

    @Test
    public void testGetAge() {
        Person person = new Person("John", 30, "male");
        assertEquals(30, person.getAge());
    }

    @Test
    public void testGetGender() {
        Person person = new Person("John", 30, "male");
        assertEquals("male", person.getGender());
    }

    @Test
    public void testSetName() {
        Person person = new Person("John", 30, "male");
        person.setName("Jane");
        assertEquals("Jane", person.getName());
    }

    @Test
    public void testSetAge() {
        Person person = new Person("John", 30, "male");
        person.setAge(35);
        assertEquals(35, person.getAge());
    }

    @Test
    public void testSetGender() {
        Person person = new Person("John", 30, "male");
        person.setGender("female");
        assertEquals("female", person.getGender());
    }
}


public class EmailValidatorTest {

    @Test
    public void testValidEmails() {
        EmailValidator validator = new EmailValidator();
        assertTrue(validator.isValid("user@example.com"));
        assertTrue(validator.isValid("user123@example.co.uk"));
        assertTrue(validator.isValid("user.name@example-domain.com"));
    }

    @Test
    public void testInvalidEmails() {
        EmailValidator validator = new EmailValidator();
        assertFalse(validator.isValid("user@.com"));
        assertFalse(validator.isValid("user@example"));
        assertFalse(validator.isValid("user@example."));
        assertFalse(validator.isValid("@example.com"));
        assertFalse(validator.isValid("user.example.com"));
    }


}