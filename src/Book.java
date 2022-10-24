public class Book {
    private String titelOfBook;
    private Author author;
    private int yearOfPublication;
    public   Book(String titleOfBook, int yearOfPublication) {
        this.titelOfBook = titleOfBook;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitelOfBook(){
        return this.titelOfBook;
    }
    public Author getAuthor(){
        return this.author;
    }

    public void setTitelOfBook(String titelOfBook) {
        this.titelOfBook = titelOfBook;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
    public void setYearOfPublication(int yearOfPublication){
        this.yearOfPublication = yearOfPublication;
    }
}
