package selenium;


import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.HashMap;

public class LambdaTestWebDriverFactory extends RemoteWebDriverFactory {
    private final String username;
    private final String accessToken;
    private final String platform;
    private final String version;
    private final String browserName;
    private final String browserVersion;

    public LambdaTestWebDriverFactory(String url, HashMap<String, String> config) {
        super(url);
        username = config.get("LAMBDATEST_USERNAME");
        accessToken = config.get("LAMBDATEST_ACCESS_TOKEN");
        platform = config.get("LAMBDATEST_PLATFORM");
        version = config.get("LAMBDATEST_VERSION");
        browserName = config.get("LAMBDATEST_BROWSER_NAME");
        browserVersion = config.get("LAMBDATEST_BROWSER_VERSION");
    }


    private HashMap<String, Object> getLtOptions() {
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", username);
        ltOptions.put("accessKey", accessToken);
        ltOptions.put("selenium_version", version);
        ltOptions.put("platformName", platform);
        ltOptions.put("browserName", browserName);
        ltOptions.put("browserVersion", browserVersion);
        ltOptions.put("w3c", true);
        return ltOptions;
    }

    private HashMap<String, Object> getLtOptions(TestContext context) {
        HashMap<String, Object> ltOptions = getLtOptions();
        ltOptions.put("build", context.getBuildName());
        ltOptions.put("project", context.getProjectName());
        ltOptions.put("name", context.getTestName());
        return ltOptions;
    }

    protected DesiredCapabilities getRemoteDriverOptions() {
        DesiredCapabilities options =  super.getRemoteDriverOptions();
        options.setCapability("LT:Options", getLtOptions());
        return options;
    }

    protected DesiredCapabilities getRemoteDriverOptions(TestContext context){
        return getRemoteDriverOptions(context);
    }
}

