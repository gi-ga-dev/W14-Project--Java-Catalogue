package it.projects.catalogue;

public abstract class AbstractCatalogue {
	// Attributi da condiv. tra sottoclassi
	private String isbn;
	private String title;
	private int year;
	private int pages;
	
	// Generate constructor using fields
	public AbstractCatalogue(String isbn, String title, int year, int pages) {
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.pages = pages;
	}
	
	// === Getters ===
	public String getIsbn() { return isbn; }
	public String getTitle() { return title; }	
	public int getYear() { return year; }	
	public int getPages() { return pages; }
	
	// === Setters ===
	public void setIsbn(String isbn) { this.isbn = isbn; }
	public void setTitle(String title) { this.title = title; }
	public void setYear(int year) { this.year = year; }
	public void setPages(int pages) { this.pages = pages; }

	// Auto generare toString. Source --> Generate toString()
	@Override
	public String toString() {
		return "ISBN: " + isbn + ", title: " + title + ", year: " + year + ", pages: " + pages;
	}
	
	
}
