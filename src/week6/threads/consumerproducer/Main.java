package week6.threads.consumerproducer;

/**
 * Producer/Consumer/Wachtrij applicatie
 * 
 * @author Koen Warner
 * @version	1.0 31-01-2014
 *
 */

public class Main {
    public static void main(String[] args){
        Wachtrij<String> rij = new Wachtrij<String>();
        Producent p1 = new Producent("P1", 300, rij); // tekst, wachttijd, wachtrij
        Producent p2 = new Producent("P2", 200, rij);
        Consument c1 = new Consument("C1", 100, rij); // wachttijd, wachtrij
        Consument c2 = new Consument("C2", 100, rij);

        p1.start();
        p2.start();
        c2.start();
        c1.start();
        try{
            p1.join();
            p2.join();
            c2.join();
            c1.join();
        }
        catch(InterruptedException e) {}
        System.out.println(rij.lengte());
    }
}
