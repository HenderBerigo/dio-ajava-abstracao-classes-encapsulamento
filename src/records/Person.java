package records;

public record Person(String name, int age) {

    public String getInfos() {
        return "Nome: " + name + ", idade: " + age + " anos.";
    }
}
