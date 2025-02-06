package paulapallas;

public class PersonTest {
    


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


