public class Mensch{
    String vorname;
    String nachname;
    int alter;

    public Mensch(String vorname, String nachname, int alter){
        setAlter(alter);
        setNachname(nachname);
        setVorname(vorname);
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setAlter(int alter) {
        this.alter = alter;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
}