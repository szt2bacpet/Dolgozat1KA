public class Main {
    public static void main(String[] args) {
        Virag sargaVirag = new Virag("Sárga virág", 5);
        Virag kekVirag = new Virag("Kék virág", 5);
        Fa loncfa = new Fa("Lönc fa", 10);
        Fa narancsfa = new Fa("Narancsfa", 10);
        Noveny[] novenyek = {sargaVirag, kekVirag, loncfa, narancsfa};
        Kert kert = new Kert(novenyek);

        kert.kertStatusz();
        kert.ontozes(40);
        System.out.println();
        kert.kertStatusz();
        kert.ontozes(70);

    }
}