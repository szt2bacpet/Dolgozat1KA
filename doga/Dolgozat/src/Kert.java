public class Kert {
    Noveny[] novenyek;
    public Kert(Noveny[] novenyek){
        this.novenyek = novenyek;
    }
    void kertStatusz(){
        for (Noveny noveny:novenyek){
            System.out.println("A "+noveny.nev+"-t meg kell locsolni");
        }
    }
    void ontozes(int menny){
        System.out.println("Öntozés" + menny);
        for (Noveny noveny : novenyek){
            if(noveny.vizkellE()){
                noveny.ontoz(menny);
                System.out.println("A "+noveny.nev+"-t nem kell öntözni");
            }
        }
    }
}
