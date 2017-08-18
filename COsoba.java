public class COsoba implements IOsoba
{
	private String imie;
	private String nazwisko;
	int wiek;
	
	public COsoba()
	{
		this.imie = "";
		this.nazwisko = "";
		this.wiek = 0;
	}

	public COsoba(String imie, String nazwisko, int wiek)
	{
		this.imie = new String(imie);
		this.nazwisko = new String(nazwisko);
		this.wiek = wiek;
	}


	public String toString()
	{
		return this.nazwisko + " " + this.imie + ", wiek: " + this.wiek;
	}

	public String pobierzImie() { return this.imie; }
	public String pobierzNazwisko() {return this.nazwisko; }
	public int pobierzWiek() {return this.wiek; }

	public void ustawImie(String imie) { this.imie = imie; }
	public void ustawNazwisko(String nazwisko) { this.nazwisko = nazwisko; }
	public void ustawWiek(int wiek) { this.wiek = wiek; }
}

	