package selenium;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CreatePatient {
    public static final String Patient_JSON = "/home/fernand/IdeaProjects/sdx-testing-projects/src/main/java/selenium/PatientJSON.json";


    public static void main(String[] args) throws Exception {

        PatientData patientData = new PatientData();
        patientData.setPatiendID("6411774ff033b78f153f01cc");

        String isoStringDate = createIsoConformedDateFormat();


        String basicAuth = " Basic " + new String( Base64.getEncoder().encode(Constants.URL_Auth.getBytes()));
        String bearerAuth = " Bearer " + CreateToken.buildJWT(isoStringDate);



        HttpRequest post = HttpRequest.newBuilder()
                .uri(URI.create(Constants.URL_POST))
                .header("Authorization", bearerAuth)
                .timeout(Duration.ofSeconds(10))
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(Patient_JSON)))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> postResponse = httpClient.send(post, HttpResponse.BodyHandlers.ofString());

        System.out.println(postResponse.body());


    }

    private static String createIsoConformedDateFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.GERMANY);
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date now = new Date();
        return dateFormat.format(now);
    }

}
