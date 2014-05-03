/**
 * Created with IntelliJ IDEA.
 * User: loanmyers
 * Date: 27/04/14
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {

    private String id;
    private String name;
    private String author;
    private String location;

    public Book(String id, String name, String author, String location) {
        setId(id);
        setName(name);
        setAuthor(author);
        setLocation(location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
