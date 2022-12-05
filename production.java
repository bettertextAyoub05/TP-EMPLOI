import java.util.Date;

public class production extends employe{
    private int nbr_produit;

    public production (String nom, String prenom, int age , Date date_entrée,int nbr_produit){
        super(nom, prenom, age, date_entrée);
        this.nbr_produit=nbr_produit;
    }

    public int getNbr_produit() {
        return nbr_produit;
    }

    @Override
    public double CalculSalaire() {
            return getNbr_produit()*50;
    }
}
