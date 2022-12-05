import java.util.Date;

public class productionrisk extends production implements risque{
    public productionrisk(String nom, String prenom, int age ,Date date_entrée, int nbr_produit){
        super(nom,prenom,age,date_entrée,nbr_produit);
    }

    @Override
    public double CalculSalaire() {
        return super.CalculSalaire() + risk;
    }
}
