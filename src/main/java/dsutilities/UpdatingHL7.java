package dsutilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdatingHL7{

    public static void updatingHL7() throws IOException {

        String patientId= "0202022";
        String rootDir= System.getProperty("user.dir");
        String fileDirectory = rootDir + "/resources/Selenium-IDCO-Files/Abbott/";
        String modifiedFileDirectory = rootDir + "/resources/Modified Selenium-IDCO-Files/Abbott/";
        String fileName = "Abbott Implant CRT 84%";

        BufferedReader fileReader = new BufferedReader(new FileReader(fileDirectory + fileName + ".hl7"));

        try {

            StringBuilder sb = new StringBuilder();
            String line = fileReader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = fileReader.readLine();
            }

            String hl7Contents = sb.toString();

            String[] segments = hl7Contents.split("\\r?\\n");

            // Loop through the segments to find the PID segment
            for (int i = 0; i < segments.length; i++) {
                String segment = segments[i];
                if (segment.startsWith("PID")) {
                    // Split the PID segment into fields
                    String[] fields = segment.split("/");

                    // Find the field that contains the serial number
                    for (int j = 0; j < fields.length; j++) {
                        String field = fields[j];
                        if (field.startsWith("serial:")) {
                            // Replace the old serial number with the new one
                            String newField = field.replaceAll("8383831", "212121");
                            fields[j] = newField;
                            break;
                        }
                    }

                    // Rebuild the PID segment with the updated field
                    String newSegment = String.join("/", fields);
                    segments[i] = newSegment;
                    break;
                }
            }
            String newHl7Message = String.join("\n", segments);


            FileWriter fileWriter = new FileWriter(modifiedFileDirectory + fileName +".hl7");
            fileWriter.write(newHl7Message);
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
