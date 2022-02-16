package week2.Figuur;

public class TestFiguur {

    public static void main(String[] args) {

        // dit kan niet: Figuur figuur = new Figuur();

        Figuur figuur_1 = new Cirkel("BLAUW", 50, 60, 60);

        System.out.println(figuur_1.getKleur());
        System.out.println(figuur_1.getVorm());

        Figuur figuur_2 = new Vierkant("GROEN", 40,60,40);

        System.out.println(figuur_2.getKleur());
        System.out.println(figuur_2.getVorm());

        figuur_1.teken();
    }
}
