package Project;

import java.time.LocalDate;

public class Operation {
    enum Type_e {
        Deposer,    
        Retirer,    
    }

    private static int ID_op_static = 0;
    private int ID_op;
    private Type_e Type;
    private String Date;
    private double Montant;
    LocalDate aujourdhui = LocalDate.now();

    
    public Operation(Type_e t, double m) {
        ID_op_static += 1; 
        this.ID_op = ID_op_static;
        this.Type = t;
        this.Montant = m;
        this.Date = aujourdhui.toString();
    }

    public Type_e getType() {
        return Type;
    }

    public void setType(Type_e type) {
        this.Type = type;
    }

  
    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

 
    public double getMontant() {
        return Montant;
    }

    public void setMontant(double montant) {
        this.Montant = montant;
    }

  
    public int getID_op() {
        return ID_op;
    }

   
    public void Afficher_op_Details() {
        System.out.println("ID: " + ID_op + " Type: " + Type + " Date: " + Date + " Montant: " + Montant);
    }
}
