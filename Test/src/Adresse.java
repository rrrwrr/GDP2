public class Adresse {
    private String strasse;
    private String hausnummer;
    private String ort;

    public Adresse(String strasse, String hausnummer, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public String getOrt() {
        return ort;
    }
    
    public void vergleich(String s, String h, String o){
        if(this.strasse.equals(s) && this.hausnummer.equals(h) && this.ort.equals(o)){
            System.out.println("Gleiche Adresse");
        } else {
            System.out.println("Nicht die gleiche Adresse");
        }
    }

    public static void main(String[] args){
        Adresse a1 = new Adresse("Ingolstädterstr.", "67", "Musterstadt");
        a1.vergleich("Hauptstr.", "1", "Hamburg");
        a1.vergleich("Ingolstädterstr.", "67", "Musterstadt");

    }
}