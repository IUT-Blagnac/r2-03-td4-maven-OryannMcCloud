
public class Pile {
	
	int[] elts;
	int indiceSommet;
	
	Pile() {
		this.elts = new int[100];
		this.indiceSommet = -1;
	}
	
	
    /** cree la pile et la retourne
    *@return Pile pfP
    */
	public static Pile CreerPile() {
		Pile pfP = new Pile();
		return pfP;
	}

    /**indique si la pile est vide
     * 
     * @param p
     * @return boolean vide
     */
    public static boolean estVide(Pile p){
        boolean vide = true;

        if (p.indiceSommet >=0) {
            vide = false;
        }
        return vide;
    }

    /**empile une pile donnee
     * 
     * @param p
     * @param elts
     */
    public static void empiler(Pile p, int elts) {
        p.elts[p.indiceSommet+1] = elts;
        p.indiceSommet +=1;

    }

    public static void depiler(Pile p)throws Exception{

        if (estVide(p)==true) {
            throw new Exception("tableau non plein impossible de d�piler");
        }

        p.indiceSommet = p.indiceSommet-1; //on dit qu'il est effa�able 
        // car en informatique on efface jamais
    }

    public static int sommet(Pile p)throws Exception{
        if (estVide(p)==true) {
            throw new Exception("tableau non plein impossible de retourner le dernier element");
        }
        return p.indiceSommet;
    }

    public static boolean pilePleine(Pile p){
        boolean estPlein = false;

        if (p.indiceSommet == 100) {
            estPlein = true;
        }
        return estPlein;
    }

    public static String toString(Pile pfPile){
        String pile = "";
        for (int i=pfPile.indiceSommet; i>=0; i--) {
            pile = pile+"|"+pfPile.elts[i] ;
        }
        String affpile=pile + "|" +"vide";
        return affpile;
    }
    
    public static int nbElements(Pile pfPile){
        return pfPile.indiceSommet+1;
    }

    public static void main(String[] args) {
        System.out.println("ça marche");
    }
}
