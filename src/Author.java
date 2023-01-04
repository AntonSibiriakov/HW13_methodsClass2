import java.util.Objects;
public class Author {
    static String name;
    static String lastName;

    Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public String getAuthor() {

        String fullName = name + lastName;
        return fullName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && lastName.equals(author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
