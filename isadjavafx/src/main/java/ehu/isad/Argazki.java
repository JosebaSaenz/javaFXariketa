package ehu.isad;

public class Argazki {
    private String izena;
    private String fitxategia;

    public Argazki(String izena, String fitx){
        this.izena=izena;
        this.fitxategia=fitx;
    }

    public String getIzena() {
        return izena;
    }

    public String getFitx() {
        return fitxategia;
    }

    public String toString() {
        return izena;
    }
}
