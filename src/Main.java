public class Main {



    public static void main(String[] args) {
        Author author = new Author("Pither","Hamilton");

        Book book = new Book("Temporal Void", 2016);
        System.out.println(author.getLastName());
        System.out.println(book.getTitelOfBook());
        book.setTitelOfBook("Disfunkcia realnosti");
        System.out.println("book.getTitelOfBook() = " + book.getTitelOfBook());

    }

}