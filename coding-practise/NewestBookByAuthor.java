import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewestBookByAuthor {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new NewestBookByAuthor.Book("Mark Richard", "Fundamentals of Software Architecture", 2023),
                new NewestBookByAuthor.Book("Neal Ford", "Functional Thinking: Paradigm Over Syntax", 2022),
                new NewestBookByAuthor.Book("Mark Richard", "Java Transaction Design Strategies", 2018),
                new NewestBookByAuthor.Book("Pramod Sadalage", "NoSQL Distilled", 2021),
                new NewestBookByAuthor.Book("Neal Ford", "Software Architecture: the Hard Parts", 2019),
                new NewestBookByAuthor.Book("Pramod Sadalage", "Building Evolutionary Architectures", 2023),
                new NewestBookByAuthor.Book("Mark Richard", "Core Memory", 2022),
                new NewestBookByAuthor.Book("Pramod Sadalage", "Agile Practices for Oracle Database Development", 2022),
                new NewestBookByAuthor.Book("Neal Ford", "Software Architecture Metrics", 2022)
        );
        /*
           write a Java 8 stream pipeline to
                1) find the latest published book for each Author
                2) Sort all the books in Chronological order for each Author
        */



    }

    class Book {
        private String author;
        private String title;
        private int publicationYear;

        public Book(String author, String title, int publicationYear) {
            this.author = author;
            this.title = title;
            this.publicationYear = publicationYear;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        public int getPublicationYear() {
            return publicationYear;
        }
    }
}
