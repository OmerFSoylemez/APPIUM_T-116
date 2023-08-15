import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HesapMakinesi {

    @Test
    public void hesapMakinesi() {
        AndroidDriver<AndroidElement> driver;
        // Android işletim sistemine sahip olan cihazlarda daha doğru sonucu vererek
        // veya yaptığımız işlemlere doğru komutların verilmesini sağlar
        // ve sadece android cihazlarda kullanlır.


        AppiumDriver<MobileElement> driver2;
        // Hem Android hem Ios işletim sistemine sahip olan cihazlar için kullanılır.
        // Android driver için  atri bir driver olduğundan dolayı, Appium driver Ios ve türevleri için kullanılmalıdır.

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");


    }
}
