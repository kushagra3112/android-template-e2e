package presentation;

import io.appium.java_client.android.Activity
import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.options.UiAutomator2Options
import io.appium.java_client.pagefactory.AndroidFindBy
import org.openqa.selenium.By
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.WebElement
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test
import java.io.File

class ExampleInstrumentedTest : BaseTest() {
    private lateinit var driver: AndroidDriver
    private val SEARCH_ACTIVITY = "com.wednesday.template.presentation.MainActivity"
    private val ALERT_DIALOG_ACTIVITY = ".app.AlertDialogSamples"
    private val PACKAGE = "com.wednesday.template.dev"

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"myButtonId\")")
    private lateinit var searchButton: WebElement

    @BeforeClass
    fun setUp() {
        val options = UiAutomator2Options()
            .setDeviceName("Android Emulator")
            .setApp(System.getProperty("user.dir") + "/apps/androidTemplate.apk")
            .setAllowTestPackages(true)
            .setAutoGrantPermissions(true)
            .eventTimings()
        driver = AndroidDriver(getServiceUrl(), options);
    }

    @AfterClass
    fun tearDown() {
        driver.quit()
    }

    @Test
    fun testSendKeys(){
        driver.startActivity(Activity(PACKAGE, SEARCH_ACTIVITY));
        val searchButton = driver.findElement(By.id("buttonSearch"));
        searchButton.click();
    }

    @Test
    fun testFindElement() {
        driver.startActivity(Activity(PACKAGE, SEARCH_ACTIVITY));
        val searchButton = driver.findElement(By.id("buttonSearch"));
        searchButton.click()

        //https://github.com/appium/appium/issues/15138#issuecomment-1127658653
        //To test element in compose

        //By text

        val screenShot = (driver as (TakesScreenshot)).getScreenshotAs(OutputType.FILE)
        val imgPartSs = File(System.getProperty("user.dir") + "/apps/searchtemplate.png")
        val imageObject = driver.findImageOccurrence(screenShot, imgPartSs)
       // driver.findElement(By.className(""))

//
//        //https://appium.io/docs/en/advanced-concepts/image-elements/index.html
//        driver.findImageOccurrence("SomeClassName");
//
//        //https://appium.io/docs/en/advanced-concepts/element-finding-plugins/index.html
//        driver.findElement(AppiumBy.custom( "ai:cart"))
//
//        //Using Appium Desktop To Locate Elements
//
//        driver.findElement(By.linkText(""))
//        driver.findElements()
//
//        /*
//        Usage of this gesture is recommended as a possible workaround for cases where the "native" tap call fails, even though tap coordinates seem correct.
//        This issue is related to the fact these calls use the legacy UIAutomator-based calls while this extension is based on the same foundation as W3C does.
//        */
////        driver.executeScript(
////            "mobile: clickGesture", ImmutableMap.of(
////                "elementId", ((RemoteWebElement) element).getId()
////            )
////        )
//
//        WebElement searchBoxEl = driver . findElement (By.id("searchEditText"));
//        searchBoxEl.sendKeys("delhi");
    }

    @Test()
    fun findElementSendKeysAndCheck () {
        driver.startActivity(Activity(PACKAGE, SEARCH_ACTIVITY));
        val searchButton = driver.findElement(By.id("buttonSearch"));
        searchButton.click();

//        driver.findElement(By.className(""))
//
//
//        //https://appium.io/docs/en/advanced-concepts/image-elements/index.html
//        driver.findImageOccurrence("SomeClassName");
//
//        //https://appium.io/docs/en/advanced-concepts/element-finding-plugins/index.html
//        driver.findElement(AppiumBy.custom( "ai:cart"))
//
//        //Using Appium Desktop To Locate Elements
//
//        driver.findElement(By.linkText(""))
//        driver.findImageOccurrence()
//
//        /*
//        Usage of this gesture is recommended as a possible workaround for cases where the "native" tap call fails, even though tap coordinates seem correct.
//        This issue is related to the fact these calls use the legacy UIAutomator-based calls while this extension is based on the same foundation as W3C does.
//        */
//        driver.executeScript(
//            "mobile: clickGesture", ImmutableMap.of(
//                "elementId", ((RemoteWebElement) element).getId()
//            )
//        )
//
//        WebElement searchBoxEl = driver . findElement (By.id("searchEditText"));
//        searchBoxEl.sendKeys("delhi");
    }
}