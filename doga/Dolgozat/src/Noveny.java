class Noveny {


    String nev;
    int vizkell;
    int vizmenny = 0;

    public Noveny(String nev, int vizkell, int vizmenny) {
        this.nev = nev;
        this.vizkell = vizkell;
        this.vizmenny = vizmenny;
    }

    public Noveny(String nev, int vizkell) {
    }

    boolean vizkellE(){
        return vizmenny < vizkell;
    }
    void ontoz(int menny){
        vizmenny += (this instanceof Virag)? menny * 0.75 : menny * 0.4;
    }
}
