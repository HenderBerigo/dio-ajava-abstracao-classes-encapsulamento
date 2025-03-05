public class Person {
    private final String name;
    private int age;

    public Person(String name) { // Constructor com parâmetros...
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // public void setName(String newName) {
    // name = newName;
    // }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

}
