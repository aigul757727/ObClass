import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Turgenev = new Author("Иван", "Тургенев");
        Author Turgenev2 = new Author("Иван", "Тургенев");

        System.out.println(Turgenev.equals(Turgenev2));

        System.out.println(Turgenev);

        Book Dubrovski = new Book("Дубровский", 1841, Pushkin);
        Book Asya = new Book("Ася", 1858, Turgenev);

        System.out.println(Dubrovski);
        System.out.println(Asya);

        Asya.setPublishingYear(1866);
        System.out.println(Asya);
        System.out.println(Asya);

        System.out.println(Dubrovski.hashCode());
        System.out.println(Asya.hashCode());

        System.out.println(Turgenev.hashCode());
        System.out.println(Turgenev2.hashCode());

    }

}