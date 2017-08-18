public class CUzytkownikBiblioteki extends COsoba
{
	private String NrKarty; //7
	private String status;
	private String ID;
	
	public CUzytkownikBiblioteki()	
	{
		super();
		this.NrKarty = "";
		this.status = "";
		this.ID = "";
	}
	
	public CUzytkownikBiblioteki(String imie, String nazwisko, int wiek, String NrKarty, String status, String ID)
	{
		super(imie, nazwisko, wiek);
		this.NrKarty = new String(NrKarty);
		this.status = new String(status);
		this.ID = new String(ID);
	}
	
	CUzytkownikBiblioteki(CUzytkownikBiblioteki a) {
		super(a.pobierzImie(), a.pobierzNazwisko(), a.pobierzWiek());
		this.NrKarty = new String(a.NrKarty);
		this.status = new String(a.status);
		this.ID = new String(a.ID);
	}
	
	public String pobierzNrKarty() { return this.NrKarty; }
	public String pobierzStatus() { return this.status; }
	public String pobierzID() { return this.ID; }
	
	void ustawNrKarty(String NrKarty) { this.NrKarty = NrKarty; }
	void ustawStatus(String status) { this.status = status; }
	void ustawID(String ID) { this.ID = ID; }
	
	public String toString()
	{
		return super.toString() + ", numer karty: " + this.NrKarty + ", status: " + this.status;
	}
}