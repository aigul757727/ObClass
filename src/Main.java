public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Turgenev = new Author("Иван", "Тургенев");

        Book Dubrovski = new Book("Дубровский", 1841, Pushkin);
        Book Asya = new Book("Ася", 1858, Turgenev);

        print (Dubrovski);
        print (Asya);

    }
    private static void print (Book book) {
        System.out.println("Название книги -" + book.getTitle() + ",год издания -" + book.getPublishingYear() + ", автор -"
                + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
    }
}