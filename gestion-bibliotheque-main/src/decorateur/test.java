package decorateur;
import Modele.Oeuvre;
import interfaces.ElementBibliotheque;

public class test {
    public static void main(String[] args){

        ElementBibliotheque elementt = new  Oeuvre();
        System.out.println("TVA de base  "+elementt.getTVA());
        ElementBibliotheque element = new OeuvreCatégorieRomance(new Oeuvre());
        System.out.println("TVA  Pour les livres de catégorie romance "+element.getTVA());

        ElementBibliotheque element2 = new OeuvreCatégorieHorreur(new Oeuvre());
        System.out.println("TVA Pour les livres de catégorie horreur "+element2.getTVA());
    }
}



