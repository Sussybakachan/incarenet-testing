package createPatient;

import dsutilities.LoggerLoader;
import selenium.InsuiteServerConfig;
import selenium.ReadingConfig;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse.BodyHandlers;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Base64;

import static selenium.ChromeWebDriver.driver;

public class PatientController {

    public static void main(String[] args) throws Exception{

        //createPatient();
    }

    public static void createPatient() throws Exception {

        String Url_Post = insuiteServer() + "/2/patient";



        String Patient_JSON = "patientDummy.json";
        BufferedReader reader = new BufferedReader(new FileReader(Patient_JSON));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();
        String fv = sb.toString();


        String basicAuth = " Basic " + new String( Base64.getEncoder().encode(loginData().getBytes()));



        HttpRequest post = HttpRequest.newBuilder()
                .uri(URI.create(Url_Post))
                .header("Authorization", basicAuth)
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .timeout(Duration.ofSeconds(10))
                .POST(HttpRequest.BodyPublishers.ofString(fv))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(post, BodyHandlers.ofString());

        System.out.println(postResponse.body());


    }

    public static String insuiteServer() throws IOException {
            ReadingConfig rc = new ReadingConfig();
            String server = rc.loadProperty().getProperty("SERVER_URL");
            LoggerLoader.info("Using config.properties InSuite URL");

        return server;
    }

    public static String loginData() throws IOException {
        ReadingConfig rc = new ReadingConfig();
        String username = rc.loadProperty().getProperty("USERNAME");
        String password = rc.loadProperty().getProperty("PASSWORD");

        String auth = username + ":" + password;

        LoggerLoader.info("Using config.properties InSuite URL");

        return auth;
    }




}
