package Project;

import java.util.ArrayList;

import Project.Operation.Type_e;

public class Compte {
	
	enum Statut_e{
		Fermer,
		Suspendu,
		Actif
	}
	
	private int ID_compte;
	private int PIN;
	private Statut_e Statut;
	private double Solde;
	private ArrayList<Operation> Liste_operation;

	
	public int getID_compte() {
		return ID_compte;
	}

	public void setID_compte(int iD_compte) {
		ID_compte = iD_compte;
	}

	public int getPIN() {
		return PIN;
	}

	public void setPIN(int password) {
		PIN = password;
	}

	public Statut_e getStatut() {
		return Statut;
	}

	public void setStatut(Statut_e statut) {
		Statut = statut;
	}

	public double getSolde() {
		return Solde;
	}

	public void setSolde(double solde) {
		Solde = solde;
	}

	public ArrayList<Operation> getListe_operation() {
		return Liste_operation;
	}

	public void setListe_operation(ArrayList<Operation> liste_operation) {
		Liste_operation = liste_operation;
	}

	Compte(int Id, int pass, double sold) {
		this.ID_compte = Id;
		this.Statut = Statut_e.Actif;
		this.PIN = pass;
		this.Solde = sold;
		this.Liste_operation = new ArrayList<>();
		System.out.println("Compte cree    ID: "+ this.ID_compte + "    PIN: "+ this.PIN + "    Solde: "+ this.Solde );
	}
	
	public void Voir_Solde() {
		System.out.println("Votre solde est: " + Solde + ".");
	}
	
	public void Operation_Precedant() {
		for(Operation o : Liste_operation) {
			o.Afficher_op_Details();
		}
	}
	
	   public void Executer_Operation(Type_e t, double m) {
	        Operation o = new Operation(t, m);

	        if (Statut == Statut_e.Actif) {

	            if (t == Type_e.Deposer) {
	                this.Solde += m; 
	                System.out.println("Déposé " + m);
	            } else if (t == Type_e.Retirer) {  
	                if (m > this.Solde) {
	                    System.out.println("Solde insuffisant.");
	                } else {
	                    this.Solde -= m;  
	                    System.out.println("Retiré " + m);
	                }
	            }

	            // Add the operation to the list of operations
	            Liste_operation.add(o);
	        } else {
	            System.out.println("Compte fermé ou suspendu.");
	        }
	    }
	}