package records;

public class Main {
    public static void main(String[] args) {
        var person = new Person("Hender Berigo", 49);
        System.out.println(person.getInfos());
        System.out.println("Nome: " + person.name());
        System.out.println("Idade: " + person.age());
        System.out.println(person.toString());
        System.out.println();

        var person2 = new Person("Afonso Pereira", 53);
        System.out.println(person2.getInfos());
        System.out.println("Nome: " + person2.name());
        System.out.println("Idade: " + person2.age());
        System.out.println(person2.toString());

    }
}
