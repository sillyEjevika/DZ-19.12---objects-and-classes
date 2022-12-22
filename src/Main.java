public class Main {
        public static void main(String[] args) {
            Author pyshkin = new Author("Александр", "Пушкин");
            Author tolstoy = new Author("Лев", "Толстой");
            Book pushkin = new Book("Пророк", pyshkin, 1828);
            Book tolstoi = new Book("Война и Мир", tolstoy, 1869);

            System.out.println("Название книги - "+ pushkin.getName());
            System.out.println("Автор - " + pyshkin.getAuthorName()+ " " + pyshkin.getAuthorSurname());
            System.out.println("Дата публикации - " + pushkin.getYear());
            System.out.println("Название книги - "+ tolstoi.getName());
            System.out.println("Автор - " + tolstoy.getAuthorName()+ " " + tolstoy.getAuthorSurname());
            System.out.println("Дата публикации - " + tolstoi.getYear());
            pushkin.setYear(1830);
            tolstoi.setYear(1880);
            System.out.println("Возможная дата публикации книги " + pushkin.getName() + " - " + pushkin.getYear());
            System.out.println("Возможная дата публикации книги " + tolstoi.getName() + " - " + tolstoi.getYear());
    }
}