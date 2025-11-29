package Project;

public class Utilisateur {
	private static int ID_static = 10000;
	private int ID;
	private Compte compte;
    private String Nom;
    private String Prenom;
    private String Addr;
    private String Email;
    private int Tele;

    //Constructeur
    public Utilisateur(String n, String p, String a, String e, int t, double solde,int pin) {
    	this.ID = ID_static++;
    	this.Nom = n;
    	this.Prenom = p;
    	this.Addr = a;
    	this.Email = e;
    	this.Tele = t;
    	System.out.println("Utilisateur: "+ this.ID + "    Nom: " + this.Nom + "   Prenom: " + this.Prenom + "   Address: " + this.Addr + "   Email: " + this.Email + "   Num Telephone: " + this.Tele);
    	this.compte = new Compte(ID,pin,solde);
    }
    
    
    // Getters et Setters
    public int getID() {
        return ID;
    }

    public Compte getCompte() {
		return compte;
	}


	public void setCompte(Compte compte) {
		this.compte = compte;
	}


	public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        this.Prenom = prenom;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String addr) {
        this.Addr = addr;
    }

    public int getTele() {
        return Tele;
    }

    public void setTele(int tele) {
        this.Tele = tele;
    }

    public String getEmail() {
    	return Email;
    }
    
    public void setEmail(String email) {
    	Email = email;
    }

    
   // Methodes 
    public void Details_Personnel() {
        System.out.println("\n Compte ID: " + ID +
        					"\n Nom: " + Nom +
        					"\n Prenom: " + Prenom +
        					"\n Address: " + Addr +
        					"\n Email: " +  Email +
        					"\n Numero Telephone: " + Tele);
    }

    public void Modifier_Details(String nom, String prenom, String addr,String email, int tele) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.Addr = addr;
        this.Email = email;
        this.Tele = tele;
        System.out.println("Details changer!");
    }
}