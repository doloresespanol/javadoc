/**
 * klasa: Notatki
 * opis: klasa reprezentuje notatkę
 * pola: numerNotatki - pole statyczne przechowujące pole statyczne instancji tej klasy
 *       tytuł - przechowuje tytuł notatki
 *       tresc - przechowuje tresc notatki
 *       id - przechowuje identyfikator notatki
 * autor: 000000000000000000000
 */
public class Notatki {
    private static int numerNotatki;
    private int id;
    protected String tytul;
    protected String tresc;

    public Notatki(String tytul, String tresc) {
        numerNotatki++;
        this.id = numerNotatki;
        this.tytul = tytul;
        this.tresc = tresc;
    }

    public void wyswietlTytulTresc(){
        System.out.println("Tytuł - "+tytul+", Tresc - "+tresc);
    }

    public void diagnostyka(){
        System.out.println(tytul+"; "+tresc+"; "+numerNotatki+"; "+id);
    }
}
