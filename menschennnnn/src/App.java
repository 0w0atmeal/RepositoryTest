public class App {
    public static void main(String[] args) throws Exception {
        
        Schueler s1 = new Schueler("Lina", "El Bergui", 15, 11);  
        System.out.println(s1.getKlasse());  //Punktnotation bei Oberklassen?

        Lehrer l1 = new Lehrer(4500, "Demodaten", "Halt", 42);
        System.out.println(l1.getGehalt());

        GBS g1 = new GBS(2200, "KeineAhnungMann", "WerArbeitetDa", 31);
        System.out.println(g1.getGehalt());

        Hausmeister h1 = new Hausmeister(3100, "Karl-Heinz-Willhelm-Dieter", "Müller-Schmidt", 37);
        System.out.println(h1.getGehalt());

        Hausmeisterassistenz ha1 = new Hausmeisterassistenz(100000, "Kreativer", "Name", 4366245);
        System.out.println(ha1.getGehalt());

        
    
    }
}
