import java.util.Date;

public abstract class commercial extends employe{
    private float chiffre_affaire;
    public commercial(String nom, String prenom, int age , Date date_entrée, float chiffre_affaire){
        super(nom,prenom,age,date_entrée);
        this.chiffre_affaire=chiffre_affaire;
    }

    public float getChiffre_affaire() {
        return chiffre_affaire;
    }

    public abstract double CalculSalaire();

}
