public class CPracownik extends CUzytkownikBiblioteki
{
	//private String status;
	private String ID; //4
	
	public CPracownik()
	{
		super();
		//this.status = "";
		this.ID = ""; 
	}
	
	public CPracownik(String imie, String nazwisko, int wiek, String NrKarty, String status, String ID)
	{
		super(imie, nazwisko, wiek, NrKarty, status, ID);
		//this.status = new String(status);
		this.ID = new String(ID);
	}
	
	CPracownik(CPracownik pelement) {
		super(pelement.pobierzImie(), pelement.pobierzNazwisko(), pelement.pobierzWiek(), pelement.pobierzNrKarty(), pelement.pobierzStatus(), pelement.pobierzID());
		//this.status = new String(pelement.status);
		this.ID = new String(pelement.ID);
	}
	
	//public String pobierzStatus() { return this.status; }
	public String pobierzID() { return this.ID; }
	
	//public void ustawStatus(String status) { this.status = status; }
	public void ustawID(String ID) { this.ID = ID; }
	
	public String toString()
	{
		return super.toString() + ", ID pracownika: " + this.ID;
	}
}