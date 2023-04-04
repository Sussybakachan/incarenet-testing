package patientHistoryTest;

import dsutilities.LoggerLoader;

import static patientHistoryTest.ReadHistoryTable.filteredData;
import static patientHistoryTest.ReadTable.taskTableData;

public class compareTaskHistory {
    public static void compareTaskHistory() {

        if (taskTableData.equals(filteredData)){
            LoggerLoader.info("The Actions sent to Patient history are the same as the ones from the Task Tab ");
        }
        LoggerLoader.info("The Actions are not identical as the one from the Task Tab");
    }
}
