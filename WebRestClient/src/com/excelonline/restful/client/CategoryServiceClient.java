package com.excelonline.restful.client;

import java.util.Iterator;

import org.apache.cxf.jaxrs.client.WebClient;

import com.excelonline.restful.standalone.Book;
import com.excelonline.restful.standalone.Category;

public class CategoryServiceClient {
	final static String CATEGORY_URL = "http://localhost:9000";
	private static final String TYPE_XML = "application/xml";
	private static final String TYPE_JSON = "application/json";

	public static void main(String[] args) {
		
		// Service instance
		WebClient client = WebClient.create(CATEGORY_URL);
		Category category = client.path("categoryservice/category/001").accept(TYPE_JSON).get(Category.class);
		System.out.println("Category details from REST service.");
		System.out.println("Category Name " + category.getCategoryName());
		System.out.println("Category Id " + category.getCategoryId());
		System.out.println("Book details for Category "
				+ category.getCategoryId() + " from REST service");

		/*WebClient clientBook = WebClient.create(CATEGORY_URL);
		Category categoryBooks = clientBook.path(
				"categoryservice/category/001/books").accept("application/xml")
				.get(Category.class);

		Iterator<Book> iterator = categoryBooks.getBooks().iterator();
		while (iterator.hasNext()) {
			Book book = iterator.next();
			System.out.println("Book Name " + book.getBookName());
			System.out.println("Book ISBN " + book.getBookISBNnumber());
			System.out.println("Book ID " + book.getBookId());
			System.out.println("Book Author " + book.getAuthor());

		}
*/
	}

}
