public class Schueler extends Mensch{
    
    int klasse;

    public Schueler(String vorname, String nachname, int alter, int klasse){
        super(vorname, nachname, alter);
        setKlasse(klasse);
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }
    public int getKlasse() {
        return klasse;
    }
}
