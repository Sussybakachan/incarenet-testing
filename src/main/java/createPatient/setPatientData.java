package createPatient;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import com.github.javafaker.Faker;
import com.google.gson.Gson;
import com.google.gson.JsonObject;



public class setPatientData {

    public static void main (String[] args) throws IOException {
        setPatientData();

    }

    public static void setPatientData() throws IOException {

        String [] namesAndId = randomNameAndIdGenerator();

        String firstName = namesAndId[0];
        String lastName = namesAndId[1];
        String patientId = namesAndId[2];

        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(new FileReader("/home/fernand/IdeaProjects/sdx-testing-projects/src/main/java/createPatient/patientDummy.json"), JsonObject.class);



        // Update fields in the JSON file
        jsonObject.addProperty("firstname", firstName);

        jsonObject.addProperty("lastname", lastName);

        jsonObject.addProperty("dob", "2000-01-01T00:00:00.000Z");

        jsonObject.addProperty("gender", "FEMALE");

        jsonObject.getAsJsonArray("addresses")
                .get(0)
                .getAsJsonObject()
                .addProperty("zip", "12022");

        jsonObject.getAsJsonArray("addresses")
                .get(0)
                .getAsJsonObject()
                .addProperty("city", "Berlin");

        jsonObject.getAsJsonArray("partnerIds")
                .get(0)
                .getAsJsonObject()
                .addProperty("patientId", patientId);

/*
if (testcase == Abbott) {
            jsonObject.getAsJsonArray("partnerIds")
                    .get(0)
                    .getAsJsonObject()
                    .addProperty("selectedType", "Abbott");
        } else if (testcase == Boston) {
            jsonObject.getAsJsonArray("partnerIds")
                    .get(0)
                    .getAsJsonObject()
                    .addProperty("selectedType", "Boston");
        } else if (testcase == Microport) {
            jsonObject.getAsJsonArray("partnerIds")
                    .get(0)
                    .getAsJsonObject()
                    .addProperty("selectedType", "Microport");
        } else if (testcase == Medtronic) {
            jsonObject.getAsJsonArray("partnerIds")
                    .get(0)
                    .getAsJsonObject()
                    .addProperty("selectedType", "Medtronic");
        } else if (testcase == Biotronic) {
            jsonObject.getAsJsonArray("partnerIds")
                    .get(0)
                    .getAsJsonObject()
                    .addProperty("selectedType", "Biotronic");
        }

*/


        FileWriter fileWriter = new FileWriter("patientDummy.json");
        gson.toJson(jsonObject, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }

        public static String[] randomNameAndIdGenerator() {
            Faker faker = new Faker();
            String firstname = faker.name().firstName();
            String lastname = faker.name().lastName();
            int numDigits = 7;
            String randomId = faker.number().digits(numDigits);
            String[] result = {firstname, lastname, randomId};
            return result;
        }



}

