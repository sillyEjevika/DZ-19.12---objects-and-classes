public class Main {
    public  static Book creatBook (String name, String author, int year) {
        Book book = new Book();
        book.name = name;
        book.author = author;
        book.year = year;
        return book;
    }
    public static Author creatAuthor (String authorName, String authorSurname) {
        Author author = new Author();
        author.authorName = authorName;
        author.authorSurname = authorSurname;
        return author;
    }
    public static void main(String[] args) {
        Book Pyshkin = creatBook("Пророк", "Пушкин", 1828);

    }
}