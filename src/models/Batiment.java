package models;

public class Batiment {

    protected String addresse;

    public Batiment() {
    }

    public Batiment(String addresse) {
        this.addresse = addresse;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    @Override
    public String toString() {
        return "models.Batiment{" +
                "addresse='" + addresse + '\'' +
                '}';
    }

}
