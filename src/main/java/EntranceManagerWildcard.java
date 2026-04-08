package main.java;

import java.util.ArrayList;

class EntranceManagerWildcard {

    void handleIncomingPatients(ArrayList<? extends Patient> incomingPatients) {
        for (Patient patient : incomingPatients) {
            System.out.println("Handling patient: " + patient.getName());
        }
    }

}
