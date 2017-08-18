public class CStudent extends CUzytkownikBiblioteki
{
	//private String status;
	private String ID; //6
	
	public CStudent()
	{
		super();
		//this.status = "";
		this.ID = ""; 
	}
	
	public CStudent(String imie, String nazwisko, int wiek, String NrKarty, String status, String ID)
	{
		super(imie, nazwisko, wiek, NrKarty, status, ID);
		//this.status = new String(status);
		this.ID = new String(ID);
	}
	
	CStudent(CStudent selement) {
		super(selement.pobierzImie(), selement.pobierzNazwisko(), selement.pobierzWiek(), selement.pobierzNrKarty(), selement.pobierzStatus(), selement.pobierzID());
		//this.status = new String(selement.status);
		this.ID = new String(selement.ID);
	}
	
	//public String pobierzStatus() { return this.status; }
	public String pobierzID() { return this.ID; }
	
	//public void ustawStatus(String status) {this.status = status; }
	public void ustawID(String ID) { this.ID = ID; }
	
	public String toString()
	{
		return super.toString() + ", nr indeksu: " + this.ID;
	}
}