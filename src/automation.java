import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;


import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

public class automation {

    public static void main(String args[]) throws MalformedURLException {

        //Ten komputer -> D:\......\Automation_Testing_Traveleo\src
        //Utwórz folder "lib"
        //Download:
        // 1) appium.io -> Downloads -> Java (jar)
        // 2) seleniumhq.org ( selenium.dev/downloads ) -> Selenium Server i Selenium Client -> Java
        // 3) google - lang3 -> Download -> Binaries - .zip
        // To wszystko daj do jednego folderu (mój: D:\Programowanie\Automation TESTING (softwares) )
        // Selenium -> libs - wytnij wszsytko i wklej do folderu Automation TESTING (softwares)
        // Commons -> wytnij 5 plików java (Executable Jar File) i wklej do folderu Automation TESTING (softwares)
        // Usuń foldery sel i comm
        // Copy all files, go to IDE (IntelliJ)-> paste to lib folder
        // Zaznacz wszystkie pliki -> PPM  na wszystkie (CTRL + klikać na każdy plik) -> Create as library -> Zmienić na Global
        // ALT + ENTER na MobileElement

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.example.traveleoo" );
        dc.setCapability("appActivity", "Timerr");


                                                                            //URL -> Class to import -> add to exception

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc );

        //driver zamieniony na ad

        MobileElement el5 = (MobileElement) ad.findElementById("com.example.traveleoo:id/edit_text_input");
        el5.sendKeys("1000");
        MobileElement el6 = (MobileElement) ad.findElementById("com.example.traveleoo:id/button_set");
        el6.click();
        MobileElement el7 = (MobileElement) ad.findElementById("com.example.traveleoo:id/edit_text_input");
        el7.sendKeys("0");
        el7.click();
        MobileElement el8 = (MobileElement) ad.findElementById("com.example.traveleoo:id/edit_text_input");
        el8.sendKeys("9999999999.");
        MobileElement el9 = (MobileElement) ad.findElementById("com.example.traveleoo:id/button_set");
        el9.click();
        MobileElement el10 = (MobileElement) ad.findElementById("com.example.traveleoo:id/edit_text_input");

        //Nie wiem czemu dało się wpisać w Appium kropkę, normalnie w emulatorze jest to zablokowane
//        el10.sendKeys("1.5");
//        MobileElement el11 = (MobileElement) ad.findElementById("com.example.traveleoo:id/button_set");
//        el11.click();

        //Skopiować id wyniku z Appium
        //Assert (na czerwono) -> Lupa (u góry po prawej) -> Project structure -> + -> From Maven -> org.testNG (lupa i czekać długo) -> org.testng:testng:
        //Import class
        // expected: WYNIK
        //Zamknij w Appium: Session i Inspector window
        //Run
        Assert.assertEquals(ad.findElementById("com.example.traveleoo:id/text_view_countdown").getText(), "166:39:00");


    }
}
