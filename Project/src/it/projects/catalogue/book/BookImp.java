package it.projects.catalogue.book;

import it.projects.catalogue.AbstractCatalogue;

public class BookImp extends AbstractCatalogue {
	// classi concrete con cui andro' ad istanziare oggetti
	 
	// attributi esclusivi classe BookImp
	private String author;
	private String genre;

	// attributi ereditati
	public BookImp(String isbn, String title, int year, int pages, String author, String genre) {
		super(isbn, title, year, pages);
		this.author = author;
		this.genre = genre;
	}
	
	// === Getters ===
	public String getAuthor() {	return author; }
	public String getGenre() { return genre; }
	
	// === Setters ===
	public void setAuthor(String author) { this.author = author; }
	public void setGenre(String genre) { this.genre = genre; }

	@Override
	public String toString() {
		// dati da riportare nel logger tramite il main
		return "Book " + super.toString() + ", author: " + author + ", genre: " + genre + ". ";
	}

	
	
}
