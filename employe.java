import java.util.Date;

public abstract class employe {
        private String nom;
        private  String prenom;
        private int age ;
        private Date date_entrée;

        public abstract double CalculSalaire();

        public String getNom(){
            return "l'employé"+this.nom+""+this.prenom;
        }
        public employe(String nom,String prenom, int age,Date date_entrée){
                this.nom=nom;
                this.prenom=prenom;
                this.age=age;
                this.date_entrée=date_entrée;
        }

}
