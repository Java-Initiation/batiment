import models.Batiment;
import models.Maison;

public class Main {

    public static void main(String[] args) {

        Maison maison1 = new Maison();
        Maison maison2 = new Maison("3 rue Dupond", 4);

        Batiment batiment1 = new Batiment();
        Batiment batiment2 = new Batiment("4 rue Legrand");

        System.out.println(maison1);
        System.out.println(maison2);
        System.out.println(batiment1);
        System.out.println(batiment2);

    }

}
