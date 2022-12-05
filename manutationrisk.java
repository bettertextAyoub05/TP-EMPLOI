import java.util.Date;

public class manutationrisk extends manutation implements risque{
    public manutationrisk(String nom, String prenom, int age , Date date_entrée, float nbr_heurs){
        super(nom,prenom,age,date_entrée,nbr_heurs);
    }

    @Override
    public double CalculSalaire() {
        return super.CalculSalaire() + risk;
    }
}
