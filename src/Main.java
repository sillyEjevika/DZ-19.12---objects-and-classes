public class Main {
        public static void main(String[] args) {
            Author Pyshkin = new Author("Александр", "Пушкин");
            Author Tolstoy = new Author("Лев", "Толстой");
            Book Pushkin = new Book("Пророк", "Пушкин", 1828);
            Book Tolstoi = new Book("Война и Мир", "Толстой", 1869);

            System.out.println("Название книги - "+ Pushkin.getName());
            System.out.println("Автор - " + Pyshkin.getAuthorName()+ " " + Pyshkin.getAuthorSurname());
            System.out.println("Дата публикации - " + Pushkin.getYear());
            System.out.println("Название книги - "+ Tolstoi.getName());
            System.out.println("Автор - " + Tolstoy.getAuthorName()+ " " + Tolstoy.getAuthorSurname());
            System.out.println("Дата публикации - " + Tolstoi.getYear());
            Pushkin.setYear(1830);
            Tolstoi.setYear(1880);
            System.out.println("Возможная дата публикации книги " + Pushkin.getName() + " - " + Pushkin.getYear());
            System.out.println("Возможная дата публикации книги " + Tolstoi.getName() + " - " + Tolstoi.getYear());
    }
}