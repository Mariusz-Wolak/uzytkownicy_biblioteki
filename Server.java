import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) throws IOException {
		BufferedReader fin = new BufferedReader( new FileReader("dane.txt")); 
		
		String s = new String();
		int rozmiarTablicy = 10;
		int i = 0;
		int typ = 3;
		int liczbaPozycji = i;
		String status;
		
		CUzytkownikBiblioteki tu[] = new CUzytkownikBiblioteki[rozmiarTablicy];
		
		CUzytkownikBiblioteki a = new CUzytkownikBiblioteki();
		
		while((s=fin.readLine()) !=null) {
			String ts[]=s.split(",");		
				
// 			a.ustawImie(ts[0]);
// 			a.ustawNazwisko(ts[1]);
// 			a.ustawWiek(Integer.parseInt(ts[2]));
// 			a.ustawNrKarty(new String(ts[3]));
			a.ustawStatus(new String(ts[4]));
			
// 			tu[liczbaPozycji] = new CUzytkownikBiblioteki(a);
//  			liczbaPozycji++;
 			
    		status = a.pobierzStatus();
 			
    		CStudent stu;
    		CPracownik  prac;
    		CUzytkownikZewnetrzny zew;
			if(status.equals("student")==true)  // if (tekst.equals("END"))
			{
				 
				stu = new CStudent();	
				 			
				stu.ustawImie(ts[0]);
				stu.ustawNazwisko(ts[1]);
				stu.ustawWiek(Integer.parseInt(ts[2]));
				stu.ustawNrKarty(new String(ts[3]));
				stu.ustawStatus(new String(ts[4]));
				stu.ustawID(new String(ts[5]));
				 
				tu[liczbaPozycji] = stu;
				liczbaPozycji++;
			}
 			
			if(status.equals("pracownik")==true)
			{
				prac = new CPracownik();
				 
				prac.ustawImie(ts[0]);
				prac.ustawNazwisko(ts[1]);
				prac.ustawWiek(Integer.parseInt(ts[2]));
				prac.ustawNrKarty(new String(ts[3]));
				prac.ustawStatus(new String(ts[4]));
				prac.ustawID(new String(ts[5]));
				 
				tu[liczbaPozycji] = prac;
				liczbaPozycji++;
			}
			
				if(status.equals("zewnetrzny")==true)
			{
				zew = new CUzytkownikZewnetrzny();
				
				zew.ustawImie(ts[0]);
				zew.ustawNazwisko(ts[1]);
				zew.ustawWiek(Integer.parseInt(ts[2]));
				zew.ustawNrKarty(new String(ts[3]));
				zew.ustawStatus(new String(ts[4]));
				zew.ustawID(new String(ts[5]));
				 
				tu[liczbaPozycji] = zew;
				liczbaPozycji++;
			}
		 }
		 
		for (int j = 0; j < liczbaPozycji; j++) {
			System.out.println("\n" +tu[j]);
		}		
		
		System.out.println();
		
		ServerSocket gniazdoSerwera = new ServerSocket(7);
		System.out.println("Uruchomiono serwer: " + gniazdoSerwera);
		try {
			Socket gniazdo = gniazdoSerwera.accept();
			BufferedReader in = null;
			PrintWriter out = null;
			try {
				in = new BufferedReader(new InputStreamReader(gniazdo.getInputStream()));
				out = new PrintWriter(new BufferedWriter(
						new OutputStreamWriter(gniazdo.getOutputStream())), true);
				while (true) {
					String tekst = in.readLine();
					if (tekst.equals("END")) break;
					System.out.println(">>: " + tekst);
					System.out.println("Wszystkich uzytkownikow w systemie bibliotecznym: " + liczbaPozycji);
					String w="";
					for (int k = 0; k < liczbaPozycji; k++) {
						String s1 = tu[k].pobierzNazwisko();
						if ( s1.equals (tekst)) {
							w+=tu[k];
						}
					}
					out.println(w); out.flush();
					System.out.println(w);
					//out.println();
				}
			} finally {
				try {
					if (in != null) in.close();
					if (out != null) out.close();
				} catch (Exception e) {}
					gniazdo.close();
			  }
		  }
		  finally { gniazdoSerwera.close(); }
	  }
  }