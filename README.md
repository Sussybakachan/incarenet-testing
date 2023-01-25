Currently only working fot the german version of inCARDIO-Dashboard
The testcases are created according to the Getemed Test Procedures (Not yet reviewed and approved by Getemend)



**1. Download the Chrome Webdriver for Selenium and paste the file into the "Chrome Webdriver" directory in the project**
- Download the Chrome Webdriver that fits your Chrome version


**2. configure the config.properties (src/main/resources/config.properties):**
- The default path to the Chrome Webdriver is for Unix. If you are using Windows you might need to configure that path 


**3. The sdx-file-forwarder (ff) is necessary for execution.**
- Install the ff and configure the config
- the target server needs to be the same server as your Selenium target server 
- configure the input folder path in the config to the input folder in the sdx-test-project

**4. deactivate the automatic logout**
- Your test might take some time, by default your inSuite Account will be logged out after 30 min
- go to Verwaltung(Administration)>inSuite>Settings
- uncheck the Auto Logout checkbox
- press the save button
- deactivate this after the test if desired

**5. Set up the test-patients if not already present (will be automated in the future)**
- create Patients for the Test 
- name the patients "Selenium-Manufacturer" (Selenium-Abbott, Selenium-Boston, Selenium-Biotronik, Selenium-MicroPort, Selenium-Medtronic)
- go to patients>choose your patient>data
- give the patient some random birthday etc.
- give the patients a Betriebsstätte(location)
- Adjust the Agreement: 
  - check the "PVS data transmission approved" Checkbock
  - check the "confirmed view from other locations" checkbox
  - below choose a PBA and a Betriebsstätte(location)
  - go to "Versorgung" ("Special Care") and check the "Patient with Event recorder, Pacemaker or Defibrillator" checkbox
  - give the patient the corresponding implant-manufacturer and paste the serial number 
  - Biotronik: 11228833
  - Boston: 657771
  - Medtronic: GGF000063L
  - Abbott: 8383831
  - MicroPort: 775BB42Z

**6. Setup roles and locations**
- To create the proper task the Patient needs a PBA
- You can add a PBA in Patients>look up the patient




