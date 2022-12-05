import java.util.Date;

public class manutation extends employe{
    private float nbr_heurs;

    public manutation(String nom, String prenom, int age , Date date_entrée, float nbr_heurs){
        super(nom,prenom,age,date_entrée);
        this.nbr_heurs=nbr_heurs;
    }

    public float getNbr_heurs() {
        return nbr_heurs;
    }

    @Override
    public double CalculSalaire() {
      return  getNbr_heurs()*150;
    }
}

