import java.sql.Date;


public class Rahmenprogramm {
	private String bezeichnung;
	private Date datum;
	private String zeit;
	private String ort;
	
	public Rahmenprogramm (String bezeichnung){
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}
	public Date getDatum() {
		return datum;
	}
	public String getZeit() {
		return zeit;
	}
	public String getOrt() {
		return ort;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public void setZeit(String zeit) {
		this.zeit = zeit;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}

}
