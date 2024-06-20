package Board;

public class Post {
    private final long id;
    private final String title;
    private final String contents;
    private final Author author;

    public Post(long id, String title, String contents, Author author) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }
}
