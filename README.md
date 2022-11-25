Currently only working fot the german version of inCARDIO-Dashboard



**1. Download the Chrome Webdriver for Selenium and paste the file into the "Chrome Webdriver" directory in the project**
- Download the Chrome Webdriver that fitts your Chrome version


**2. configurate the config.properties (src/main/resources/config.properties):**
- The default path to the Chrome Webdriver is for Unix. If you are using Windows you might need to configurate that path 


**3. The sdx-file-forwarder (ff) is necessary for execution.**
- Install the ff and configurate the config
- the target server needs to be the same server as your Selenium target server 
- configurate the input folder path in the config to the input folder in the sdx-test-project


