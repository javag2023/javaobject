public class Book {
    private int id;
    private String name;

    public Book(int id,
                String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return this.id == book.getId() &&
                this.name.equals(book.getName());
    }

    @Override
    public int hashCode() {
        return this.id * 11;
    }
}
