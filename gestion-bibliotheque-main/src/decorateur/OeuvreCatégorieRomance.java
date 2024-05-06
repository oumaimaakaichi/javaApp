package decorateur;

import interfaces.ElementBibliotheque;

public class OeuvreCatégorieRomance extends DecorateurElementBibliotheque {
    public OeuvreCatégorieRomance(ElementBibliotheque elementBibliotheque) {
        super(elementBibliotheque);
    }
    @Override
    public double getTVA()
    {
        return super.getTVA()+10;
    }
}
