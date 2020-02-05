package br.com.rsinet.hub_tdd.testes;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_tdd.pages.PaginaInicial;
import br.com.rsinet.hub_tdd.pages.PesquisaProduto;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class PesquisaHomeTeste {

	public static AndroidDriver<MobileElement> driver;
	@Before
	public void InicioPesquisa() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Renan");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android ");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");
		capabilities.setCapability("unicodeKeyboard", true);
		capabilities.setCapability("resetKeyboard", true);

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}
	
	@Test
	public  void pesquisaHome1() {
		
		PaginaInicial.btnLaptops(driver).click();
		PesquisaProduto.btnNoteBook(driver).click();
	}
	
	@Test
	public  void pesquisaHome2()  {
		
		PaginaInicial.btnLaptops(driver).click();
		PesquisaProduto.btnNoteBook(driver).click();
		PesquisaProduto.btnAddCarrinho(driver).click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		PesquisaProduto.btnUserName(driver).sendKeys("RenanMarcos1");
		PesquisaProduto.btnPassword(driver).click();
		PesquisaProduto.btnPassword(driver).sendKeys("@Test123");
		PesquisaProduto.btnRegistro(driver).click();
	}
	
	@After
	public void fechar() {
		driver.quit();
	}
}
