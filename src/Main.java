public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        Cat cat2 = new Cat("Felix", "Brytyjski");

        System.out.println(cat2.name);
        System.out.println(cat2.race);

        Client c = new Client();

        Pet p = new Cat();

        Pet[] tablicaZwierzat = new Pet[10];

        tablicaZwierzat[0] = new Cat();
        tablicaZwierzat[1] = new Dog();

        Object[] tab = new Object[10];
        tab[0] = new Cat();
        tab[1] = new Dog();
        tab[2] = new Integer(5);
        tab[3] = "Abc";
    }
}
