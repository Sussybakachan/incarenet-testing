package createPatient;

import static createPatient.CreatePatient.createPatient;
import static createPatient.SetPatientData.randomNameAndIdGenerator;



public class PatientController {

    public static void main (String[] args) throws Exception {
        String [] namesAndId = randomNameAndIdGenerator();

        String firstName = namesAndId[0];
        String lastName = namesAndId[1];
        String patientId = namesAndId[2];

        SetPatientData setPatientData = new SetPatientData(firstName, lastName,patientId);

        SetPatientData.setPatientData();

        createPatient();

        UpdatingHL7 updatingHL7 = new UpdatingHL7(patientId);

        UpdatingHL7.updatingHL7();
    }

}
