package firstcrud.model;

import java.sql.*;

public class BookDao {

	private static Connection privConn;
	static{
		try {
			privConn = ConnectionFactory.getConnection();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void create(Book book) {
		
		try {
			PreparedStatement statement = privConn.prepareStatement("INSERT INTO books (id, title, author) VALUES(?, ?, ?)");
			statement.setLong(1, book.getId());
			statement.setString(2, book.getTitle());
			statement.setInt(3, book.getAuthor());
			if(statement.executeUpdate()>0)
				System.out.println("A new book was inserted successfully!");

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
