import java.util.Objects;
public class Book {
    static String name;
    static Author author;
    static int year;

    Book(String name, Author author, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthorBook() {
        String authorStr = author.getAuthor();
        return authorStr;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    @Override
    public String toString() {
        return name + "\n " + author.toString() + "\n" + year;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
