package firstcrud.control;

import firstcrud.model.Book;
import firstcrud.model.BookDao;

public class Controller {
	
	public void onCreate(long id, String title, int author ){
		Book book = new Book(id, title, author);
		BookDao.create(book);
	}

}
