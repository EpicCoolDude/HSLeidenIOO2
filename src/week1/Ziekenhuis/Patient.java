package week1.Ziekenhuis;

import java.util.ArrayList;

public class Patient extends Persoon {

    public static String PAT_AFKORTING;
    private int patientnummer;
    private Chirurg[] chirurg;
    private Bed bed;

    public Patient(String naam) {
        super(naam);
    }

//    public Patient(String naam, String PAT_AFKORTING, int patientnummer, Array[] chirurg, Bed bed) {
//        super(naam);
//        this.PAT_AFKORTING = PAT_AFKORTING;
//        this.patientnummer = patientnummer;
//        //this.chirurg = chirurg;
//        this.bed = bed;
//    }
}
