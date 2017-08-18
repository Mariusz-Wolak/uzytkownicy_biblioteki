import java.io.*;
import java.util.*;

public class CzytajPlik
{
	public static void main(String[] args) throws IOException
	 {
		 BufferedReader in;
		 int wiek;
		 try 
		{
			 in = new BufferedReader(new FileReader("dane.txt"));
		} 
		 catch (IOException e)
		{
			System.out.println("Plik nie istnieje.");
			return;
		}
		
		CStudent tablicaS[] = new CStudent[10];
		CPracownik tablicaP[] = new CPracownik[10];
		CUzytkownikZewnetrzny tablicaZ[] = new CUzytkownikZewnetrzny[10];
				
		int i = 0;
	    String s = new String();
		while((s = in.readLine())!= null)
		{
			String tab[] = s.split(",");
			if(tab.length == 6) {
				wiek = Integer.parseInt(tab[2]);
				//System.out.println(tab[0] + "-" + tab[1] + "-" + wiek + "-" + tab[3] + "-" + tab[4] + "-" + tab[5]); 
				tablicaS[i] = new CStudent(tab[0], tab[1], wiek, tab[3], tab[4], tab[5]);
				tablicaP[i] = new CPracownik(tab[0], tab[1], wiek, tab[3], tab[4], tab[5]);
				tablicaZ[i] = new CUzytkownikZewnetrzny(tab[0], tab[1], wiek, tab[3], tab[4], tab[5]);
				}
		i++;		
		}
		
		i = 0;
		while(i<3)
		{
			System.out.println(tablicaS[i]); 
			i++;		
		}	
		
		
		while(i<7)
		{
			System.out.println(tablicaP[i]); 
			i++;		
		}
		
		in.close();
		
		while(i<10)
		{
			System.out.println(tablicaZ[i]); 
			i++;		
		}
		
		in.close();
	}
}