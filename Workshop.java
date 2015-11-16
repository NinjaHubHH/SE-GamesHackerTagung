import java.util.Date;


public class Workshop {
	private int nummer;
	private String bezeichnung;
	private Date datum;
	private int year;
	private int month;
	private int date;
	

	public Workshop(int nummer, String bezeichnung){
		this.nummer= nummer;
		this.bezeichnung = bezeichnung;
	}
	public void Date(int year, int month, int date){
		
	}

	public int getNummer() {
		return nummer;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	
}
