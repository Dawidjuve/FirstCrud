package firstcrud.model;

public class Book {
	private long id;
	private String title;
	private int author;
	
	
	 public Book(String title, int author) {
	        
	        this.title = title;
	        this.author = author;
	    }
	 
	    public Book(long id, String title, int author) {
	        
	        this.id = id;
	        this.title = title;
	        this.author = author;
	    }
	 
	    public Book() {
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getAuthor() {
			return author;
		}

		public void setAuthor(int author) {
			this.author = author;
		}
	 
	   


}
