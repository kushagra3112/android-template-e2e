package presentation;

import org.testng.annotations.AfterSuite
import org.testng.annotations.BeforeSuite
import java.net.URL
import io.appium.java_client.service.local.AppiumDriverLocalService
import io.appium.java_client.service.local.AppiumServiceBuilder

abstract class BaseTest {

    private var service: AppiumDriverLocalService? = null
    private val TAG = "BaseTest"

    @BeforeSuite
    fun globalSetup() {
        service = AppiumServiceBuilder().build() // started with env variables
        service!!.start()
    }

    @AfterSuite(alwaysRun = true) // run for failure cases as well
    fun globalTearDown() {
        if (service != null) {
            service!!.stop()
        }
    }

    fun getServiceUrl(): URL {
        return service!!.url;
    }
}
