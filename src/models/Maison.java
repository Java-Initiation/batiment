package models;

public class Maison extends Batiment {

    private int nbPieces;

    public Maison() {
    }

    public Maison(String addresse, int nbPieces) {
        // super = référence à l'objet de la classe supérieur
        // this = référence à l'objet
        super(addresse);
        this.nbPieces = nbPieces;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return "models.Maison{" +
                "nbPieces=" + nbPieces +
                ", addresse='" + addresse + '\'' +
                '}';
    }

}
