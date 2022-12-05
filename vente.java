import java.util.Date;

public class vente extends commercial{
    public vente (String nom, String prenom, int age , Date date_entrée, float chiffre_affaire){
        super(nom,prenom,age,date_entrée,chiffre_affaire);
    }


    @Override
    public double CalculSalaire() {

        return getChiffre_affaire()*0.2+4000;
    }
}
