import java.util.Objects;

public class Book {
	 private Integer isbn;
	 private String title;
	 
	 public void initialize()
	    {
	    	System.out.println("Bean calling ");
	    }
	    public void deleting()
	    {
	    	System.out.println("Bean deleting  ");
	    }
	public Book(Integer isbn, String title) {
		super();
		this.isbn = isbn;
		this.title = title;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(isbn, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn) && Objects.equals(title, other.title);
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
