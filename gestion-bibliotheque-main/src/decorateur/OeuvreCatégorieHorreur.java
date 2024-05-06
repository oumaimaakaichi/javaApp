package decorateur;

import interfaces.ElementBibliotheque;

public class OeuvreCatégorieHorreur extends DecorateurElementBibliotheque {
    public OeuvreCatégorieHorreur(ElementBibliotheque elementBibliotheque) {
        super(elementBibliotheque);
    }
    @Override
    public double getTVA()
    {
        return super.getTVA()+40;
    }
}