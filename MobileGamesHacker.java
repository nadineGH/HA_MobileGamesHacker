
public class MobileGamesHacker {

	private String name;
	private char email;
	private String status;
	private float nummer;
	private String workshopbezeichnung;
	private float workshopdatum;
	private String referentname;
	private char referentemail;
	private String firma;
	private String bezeichnung;
	private float datum;
	private float zeit;
	private String ort;
	
	public  MobileGamesHacker() {
	}
	public void Teilnehmer (String name, char email){
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getEmail() {
		return email;
	}
	public String getStatus() {
		return status;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(char email) {
		this.email = email;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public void Workshop(float nummer, String workshopbezeichnung, float workshopdatum){
		this.nummer = nummer;
		this.workshopbezeichnung = workshopbezeichnung;
		this.workshopdatum = workshopdatum;
	}
	public float getNummer() {
		return nummer;
	}
	public String getWorkshopbezeichnung() {
		return workshopbezeichnung;
	}
	public float getWorkshopdatum() {
		return workshopdatum;
	}
	public void setNummer(float nummer) {
		this.nummer = nummer;
	}
	public void setWorkshopbezeichnung(String workshopbezeichnung) {
		this.workshopbezeichnung = workshopbezeichnung;
	}
	public void setWorkshopdatum(float workshopdatum) {
		this.workshopdatum = workshopdatum;
	}
	
	public void referent(String referentname, char referentemail, String firma){
		this.referentname = referentname;
		this.referentemail = referentemail;
		this.firma = firma;
	}
	public String getReferentname() {
		return referentname;
	}
	public char getReferentemail() {
		return referentemail;
	}
	public String getFirma() {
		return firma;
	}
	
	
	public void setReferentname(String referentname) {
		this.referentname = referentname;
	}
	public void setReferentemail(char referentemail) {
		this.referentemail = referentemail;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	
	public void rahmenprogramm (String bezeichnung, float datum, float zeit){
		this.bezeichnung = bezeichnung;
		this.datum = datum;
		this.zeit = zeit;
		this.ort = ort;
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
	public float getDatum() {
		return datum;
	}
	public float getZeit() {
		return zeit;
	}
	public String getOrt() {
		return ort;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public void setDatum(float datum) {
		this.datum = datum;
	}
	public void setZeit(float zeit) {
		this.zeit = zeit;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	
	public static void main(String[] args){
		
	}
 
	
	
}