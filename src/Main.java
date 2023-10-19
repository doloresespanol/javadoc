public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Notatki notatka = new Notatki("przygotowania do egzaminu","w toku...");
        Notatki notatka1 = new Notatki("relax","spracer z psem");
        System.out.println("testowanie metody wpisującej tytuł i treść");
        notatka.wyswietlTytulTresc();
        notatka1.wyswietlTytulTresc();
        System.out.println("testowanie metody diagnostycznej");
        notatka.diagnostyka();
        notatka1.diagnostyka();
    }
}