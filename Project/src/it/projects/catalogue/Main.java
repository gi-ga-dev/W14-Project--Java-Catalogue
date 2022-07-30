package it.projects.catalogue;

import it.projects.catalogue.book.BookImp;
import it.projects.catalogue.magazine.MagazineImp;

public class Main {

	public static void main(String[] args) {
		// qui istanzio oggetti e faccio test console
		BookImp book1 = new BookImp("8804512156", "Poeta al comando", 2003, 256, "Alessandro Barbero", "Storico-Medievale");
		BookImp book2 = new BookImp("0747532699", "Harry Potter and the Philosopher's Stone", 1997, 223, "J. K. Rowling", "Fantasy");
		MagazineImp mag1 = new MagazineImp("9780847833580", "Time", 2010, 150, Periodicity.WEEKLY);
		
		// referenza catalogo per accedere ai metodi
		CatalogueDatabase database = new CatalogueDatabase();
		
		database.addElement(book1.getIsbn(), book1);
		database.addElement(book2.getIsbn(), book2);
		database.addElement(mag1.getIsbn(), mag1);
		database.size();
				
		database.searchByIsbn("8804512156");
		database.searchByTitle("Harry Potter and the Philosopher's Stone");
		database.searchByYear(2003);
		database.searchByAuthor("J. K. Rowling");
		database.searchByGenre("Storico-Medievale");
		
		database.saveOnDisk();
		database.loadFromDisk();
		
		// ===============================================
		
		database.removeByIsbn("8804512156");
		database.size();		
	}

}
