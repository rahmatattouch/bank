package Project;

import java.util.ArrayList;
import java.util.Scanner;

import Project.Admin.Activite;
import Project.Operation.Type_e;

public class System_Bancaire {
	private ArrayList<Utilisateur> Liste_Utilisateur;
	private ArrayList<Compte> Liste_Compte;
	private ArrayList<Admin> Liste_Admin;
	Scanner scanner = new Scanner(System.in);
	
	
	
	public void Connecter(int id) {
		boolean passcorrect = false;
		for(Admin a : Liste_Admin) {
			if (id == a.getID()) {
				while(passcorrect) {
					System.out.println("Admin:"+ a.getID() +"Mot de pass: ");
					String passin = scanner.nextLine();
					if(passin!= a.getPassword()) {
						System.out.println("Bienvenue, Admin " + a.getUser());
						passcorrect = true;
						a.setActiv(Activite.Active);
					}else {
						System.out.println("Mot de pass incorrect.");
					}
				}
			}
		}
	}

	public void Deconnecter(Admin a) {
		if (a.getActiv() == Activite.Active) {
			a.setActiv(Activite.Inactive);
			System.out.println("Deconnexion...");
		}else {
			System.out.println("Erreur. Deja deconnecter.");
		}
	}
	
	
	public void Ajouter_Compte(int Id, int pass, double sold) {
		Liste_Compte.add(new Compte(Id,pass,sold));
	}
	
	public void Supprimer_Compte(int cId) {
		for(Compte c : Liste_Compte) {
			if(c.getID_compte() == cId) {
				Liste_Compte.remove(c);
			}
		}
		System.out.println("Compte d'ID "+cId+"est supprime.");
	}
	
	
	public void Supprimer_Operation(int cId,int opid) {
		for(Compte c : Liste_Compte) {
			if(c.getID_compte() == cId) {
				for(Operation o: c.getListe_operation()) {
					if(o.getID_op() == opid) {
						c.getListe_operation().remove(o);						
					}
				}
			}
		}
		System.out.println("Compte d'ID "+cId+"est supprime.");
	}
	
	public void Ajouter_Operation(int cId,Type_e t, double m) {
		for(Compte c : Liste_Compte) {
			if(c.getID_compte() == cId) {
				Operation ope = new Operation(t,m);
				c.getListe_operation().add(ope);
			}
		}
		System.out.println("Compte d'ID "+cId+"est supprime.");
	}
	
	
	public static void main(String[] args) {
		System_Bancaire system = new System_Bancaire();
		Utilisateur us1 = new Utilisateur("adam","adam","address1","haja@gmail.com",23380443,0.0,21515);
		Admin ad1 = new Admin("Testusername1","TestPass1");
		us1.getCompte().Voir_Solde();
		us1.getCompte().Executer_Operation(Type_e.Deposer, 100);
		us1.getCompte().Executer_Operation(Type_e.Retirer, 20);
		us1.getCompte().Operation_Precedant();
		us1.getCompte().Voir_Solde();
	}
}