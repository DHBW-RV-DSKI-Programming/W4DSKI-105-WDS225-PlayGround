package main.java;

import java.util.ArrayList;

public class AppGeneric {

    public static void main(String[] args) {
        ArrayList<Patient>  patients = new ArrayList<>();
        patients.add(new Patient("Test", 0));
        EntranceManagerWildcard entranceManagerWildcard = new EntranceManagerWildcard();
        entranceManagerWildcard.handleIncomingPatients(patients);
    }

}
