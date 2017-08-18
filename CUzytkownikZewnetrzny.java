public class CUzytkownikZewnetrzny extends CUzytkownikBiblioteki
{
	//String status;
	private String ID;
	
	public CUzytkownikZewnetrzny()
	{
		super();
		//this.status = "";
		this.ID = "";
	}
	
	public CUzytkownikZewnetrzny(String imie, String nazwisko, int wiek, String NrKarty, String status, String ID)
	{
		super(imie, nazwisko, wiek, NrKarty, status, ID);
		//this.status = new String(status);
		this.ID = new String(ID);
	}
	
	CUzytkownikZewnetrzny(CUzytkownikZewnetrzny zelement) {
		super(zelement.pobierzImie(), zelement.pobierzNazwisko(), zelement.pobierzWiek(), zelement.pobierzNrKarty(), zelement.pobierzStatus(), zelement.pobierzID());
		//this.status = new String(zelement.status);
		this.ID = new String(zelement.ID);
	}
	
	//public String pobierzStatus() { return this.status; }
	public String pobierzID() { return this.ID; }
	
	//public void ustawStatus(String status) { this.status = status; }
	public void ustawID(String ID) { this.ID = ID; }
	
	public String toString()
	{
		return super.toString() + ", dokument: " + this.ID;
	}
}