package it.projects.catalogue.magazine;

import it.projects.catalogue.AbstractCatalogue;
import it.projects.catalogue.Periodicity;

public class MagazineImp extends AbstractCatalogue {
	
	private Periodicity periodicity;

	public MagazineImp(String isbn, String title, int year, int pages, Periodicity periodicity) {
		super(isbn, title, year, pages);
		this.periodicity = periodicity;
	}

	public Periodicity getPeriodicity() { return periodicity; }
	public void setPeriodicity(Periodicity periodicity) { this.periodicity = periodicity; }

	@Override
	public String toString() {
		// dati da riportare nel logger tramite il main
		return periodicity + " Magazine, " + super.toString() + ". ";
	}

	
	
}
