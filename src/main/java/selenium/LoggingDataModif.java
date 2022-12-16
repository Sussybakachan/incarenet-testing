package selenium;

import java.util.ArrayList;
import java.util.List;

import static selenium.CompareTasksInCardio.listOfFailedTasksAndReason;

public class LoggingDataModif {
    public LoggingDataModif(){
        editFailedTaskLogging();
    }
    public String editFailedTaskLogging() {
        List<String> failedTasksString;
        failedTasksString = new ArrayList<>();
        String fails;
        String actualString = null;
        for (FailedTasks i : listOfFailedTasksAndReason) {
            fails = i.getManufacturerTestCase() + ": \n" + i.getReasonForFailure() + "\n";
            //TODO also replaces the "[]" everywhere in the tasks log, probably need to change that
            failedTasksString.add(fails);
            actualString = String.valueOf(failedTasksString);
            actualString =  actualString
                    .replaceAll("\\[", "")
                    .replaceAll("]", "")
                    .replaceAll(", Abbott", "Abbott").replaceAll(", checkBox", "checkBox");
        }
        return actualString;
    }
}
