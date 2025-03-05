public class Main {
    public static void main(String[] args) {

        var male = new Person("Hender BErigo");
        // male.setName("Hender Berigo");
        male.setAge(49);

        var female = new Person("Laila Cainelli");
        // female.setName("Laila Cainelli");
        female.setAge(42);

        System.out.println("------");
        System.out.println("Male");
        System.out.println(male.getName());
        System.out.println(male.getAge());
        System.out.println("------");
        System.out.println("Female");
        System.out.println(female.getName());
        System.out.println(female.getAge());
    }
}
