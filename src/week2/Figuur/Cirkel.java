package week2.Figuur;

public class Cirkel extends Figuur {

    private int straal;
    private int x_middelpunt;
    private int y_middelpunt;

    public Cirkel(String kleur, int straal, int x_middelpunt, int y_middelpunt) {
        super(kleur);
        this.straal = straal;
        this.x_middelpunt = x_middelpunt;
        this.y_middelpunt = y_middelpunt;
    }

    public String getVorm() {
        return "Cirkel";
    }

    public void teken() {
        System.out.println("Ik teken een mooie " + getVorm()+" met middelpunt"+
                getX_middelpunt()+","+getY_middelpunt()+
                " en straal: "+getStraal());
    }

    public int getStraal() {
        return straal;
    }


    public int getX_middelpunt() {
        return x_middelpunt;
    }


    public int getY_middelpunt() {
        return y_middelpunt;
    }

}
