package selenium;

import AbbottTestCasesExpectedTasks.*;
import BiotronikTestCasesExpectedTasks.*;
import BostonTestCasesExpectedTasks.BostonExpectedTasksTestCase1;
import BostonTestCasesExpectedTasks.*;
import MedtronicTestCasesExpectedTasks.*;
import MicroPortTestCasesExpectedTasks.*;

import static AbbottTestCasesExpectedTasks.AbbottExpectedTasksTestCase1.createAbbottGeneralYellowTask;
import static BiotronikTestCasesExpectedTasks.BiotronikExpectedTasksTestCase2.*;
import static MicroPortTestCasesExpectedTasks.MicroPortExpectedTasksTestCase5.createMicroPortWhiteTask;
import static selenium.ExpectedTasks.createAbbottTestExpectedTask;

public class CreationOfAllExpectedTasks {
    public static void createExpectedTasks() {
        createMicroPortWhiteTask();
        createAbbottTestExpectedTask();
    }

    public static void createAllExpectedTasks() {

        //Abbott
        AbbottExpectedTasksTestCase2 abbottExpectedTasksTestCase2 = new AbbottExpectedTasksTestCase2();
        AbbottExpectedTasksTestCase3 abbottExpectedTasksTestCase3 = new AbbottExpectedTasksTestCase3();
        AbbottExpectedTasksTestCase4 abbottExpectedTasksTestCase4 = new AbbottExpectedTasksTestCase4();
        AbbottExpectedTasksTestCase5 abbottExpectedTasksTestCase5 = new AbbottExpectedTasksTestCase5();
        AbbottExpectedTasksTestCase6 abbottExpectedTasksTestCase6 = new AbbottExpectedTasksTestCase6();
        AbbottExpectedTasksTestCase7 abbottExpectedTasksTestCase7 = new AbbottExpectedTasksTestCase7();
        AbbottExpectedTasksTestCase8 abbottExpectedTasksTestCase8 = new AbbottExpectedTasksTestCase8();
        AbbottExpectedTasksTestCase9 abbottExpectedTasksTestCase9 = new AbbottExpectedTasksTestCase9();

        //Biotronik
        createBiotronikERIAlarmTask();
        createBiotronikEOSAlarmTask();
        createBiotronikEOSTask();
        createBiotronikERITask();
        createBiotronik93CrtTask();
        createBiotronik93LvTask();
        createBiotronik93generalTask();
        createAbbottTestExpectedTask();
        createAbbottGeneralYellowTask();
        BiotronikExpectedTasksTestCase3 biotronikExpectedTasksTestCase3 = new BiotronikExpectedTasksTestCase3();
        BiotronikExpectedTasksTestCase4 biotronikExpectedTasksTestCase4 = new BiotronikExpectedTasksTestCase4();
        BiotronikExpectedTasksTestCase5 biotronikExpectedTasksTestCase5 = new BiotronikExpectedTasksTestCase5();
        BiotronikExpectedTasksTestCase6 biotronikExpectedTasksTestCase6 = new BiotronikExpectedTasksTestCase6();
        BiotronikExpectedTasksTestCase7 biotronikExpectedTasksTestCase7 = new BiotronikExpectedTasksTestCase7();
        BiotronikExpectedTasksTestCase8 biotronikExpectedTasksTestCase8 = new BiotronikExpectedTasksTestCase8();

        //Boston
        BostonExpectedTasksTestCase1 bostonExpectedTasksTestCase1 = new BostonExpectedTasksTestCase1();
        BostonExpectedTasksTestCase2 bostonExpectedTasksTestCase2  = new BostonExpectedTasksTestCase2();
        BostonExpectedTasksTestCase3 bostonExpectedTasksTestCase3  = new BostonExpectedTasksTestCase3();
        BostonExpectedTasksTestCase4 bostonExpectedTasksTestCase4 = new BostonExpectedTasksTestCase4();
        BostonExpectedTasksTestCase5 bostonExpectedTasksTestCase5 = new BostonExpectedTasksTestCase5();
        BostonExpectedTasksTestCase6 bostonExpectedTasksTestCase6 = new BostonExpectedTasksTestCase6();
        BostonExpectedTasksTestCase7 bostonExpectedTasksTestCase7 = new BostonExpectedTasksTestCase7();
        BostonExpectedTasksTestCase8 bostonExpectedTasksTestCase8 = new BostonExpectedTasksTestCase8();

        //Medtronic
        MedtronicExpectedTasksTestCase1 medtronicExpectedTasksTestCase1 = new MedtronicExpectedTasksTestCase1();
        MedtronicExpectedTasksTestCase2 medtronicExpectedTasksTestCase2 = new MedtronicExpectedTasksTestCase2();
        MedtronicExpectedTasksTestCase3 medtronicExpectedTasksTestCase3 = new MedtronicExpectedTasksTestCase3();
        MedtronicExpectedTasksTestCase4 medtronicExpectedTasksTestCase4 = new MedtronicExpectedTasksTestCase4();
        MedtronicExpectedTasksTestCase5 medtronicExpectedTasksTestCase5 = new MedtronicExpectedTasksTestCase5();
        MedtronicExpectedTasksTestCase6 medtronicExpectedTasksTestCase6 = new MedtronicExpectedTasksTestCase6();
        MedtronicExpectedTasksTestCase7 medtronicExpectedTasksTestCase7 = new MedtronicExpectedTasksTestCase7();
        MedtronicExpectedTasksTestCase8 medtronicExpectedTasksTestCase8 = new MedtronicExpectedTasksTestCase8();
        MedtronicExpectedTasksTestCase9 medtronicExpectedTasksTestCase9 = new MedtronicExpectedTasksTestCase9();

        //MicroPort
        MicroportExpectedTasksTestCase1 microportExpectedTasksTestCase1 = new MicroportExpectedTasksTestCase1();
        MicroportExpectedTasksTestCase2 microportExpectedTasksTestCase2 = new MicroportExpectedTasksTestCase2();
        MicroportExpectedTasksTestCase3 microportExpectedTasksTestCase3 = new MicroportExpectedTasksTestCase3();
        MicroportExpectedTasksTestCase4 microportExpectedTasksTestCase4 = new MicroportExpectedTasksTestCase4();
        MicroPortExpectedTasksTestCase5 microPortExpectedTasksTestCase5 = new MicroPortExpectedTasksTestCase5();
        MicroportExpectedTasksTestCase6 microportExpectedTasksTestCase6 = new MicroportExpectedTasksTestCase6();
        MicroportExpectedTasksTestCase7 microportExpectedTasksTestCase7 = new MicroportExpectedTasksTestCase7();

    }

}
