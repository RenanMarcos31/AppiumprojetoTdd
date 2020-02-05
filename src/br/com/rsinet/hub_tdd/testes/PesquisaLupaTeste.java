package br.com.rsinet.hub_tdd.testes;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.pages.PaginaInicial;
import br.com.rsinet.hub_tdd.pages.PesquisaProduto;
import io.appium.java_client.android.AndroidDriver;
import net.sf.cglib.beans.BeanCopier.Generator;

public class PesquisaLupaTeste {

	public static WebDriver driver;
	public static WebDriverWait wait;

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
	public void pesquisaLupa1() throws Exception {

		PaginaInicial.btnBarra(driver).click();
		PaginaInicial.btnBarra(driver).sendKeys("TABLET");
		PaginaInicial.btnLupa(driver).click();
		PesquisaProduto.btnProduto(driver).click();
	}
	
	@Test
	public void pesquisaLupa2() {
		
		PaginaInicial.btnBarra(driver).click();
		PaginaInicial.btnBarra(driver).sendKeys("Microfone");
		PaginaInicial.btnLupa(driver).click();
		
	}
	
	@After
	public void fecharAbas() {
		driver.quit();
	}
}
