package week2.Figuur;

public class Vierkant extends Figuur {

    private int linksBoven_x;
    private int linksBoven_y;
    private int zijde;

    public int getLinksBoven_x() {
        return linksBoven_x;
    }

    public int getLinksBoven_y() {
        return linksBoven_y;
    }

    public int getZijde() {
        return zijde;
    }

    public Vierkant(String kleur, int linksBoven_x, int linksBoven_y, int zijde) {
        super(kleur);
        this.linksBoven_x = linksBoven_x;
        this.linksBoven_y = linksBoven_y;
        this.zijde = zijde;
    }

    public String getVorm() {
        return "Vierkant";
    }

    public void teken() {
        System.out.println("Ik ben een: "+getVorm()+" met links boven punt: ("+getLinksBoven_x()+","+getLinksBoven_y()+" en zijde: "+getZijde() );

    }
}
