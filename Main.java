
public class Main {

	public static void main(String[] args) {
		Teilnehmer user = new Teilnehmer("Mark Müller","Mark123@web.de","Student");
		
		Workshop hacking = new Workshop(343,"hacking Einführung");
		hacking.setDate(2013,05,14);
		
		Referent ref = new Referent("Klaus Kleiber","Kleiber@web.de","InnoGames");
		
		Rahmenprogramm musical = new Rahmenprogramm("Musical Phantom der Oper");
		musical.setDatum(2013-05-14);
		musical.setZeit("20:30");
		musical.setOrt("Hamburg,neue Flora");

	}

}
