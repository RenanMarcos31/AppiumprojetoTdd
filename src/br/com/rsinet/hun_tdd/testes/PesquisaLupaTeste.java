package br.com.rsinet.hun_tdd.testes;

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
import br.com.rsinet.hub_tdd.utiuls.Constant;
import io.appium.java_client.android.AndroidDriver;
import net.sf.cglib.beans.BeanCopier.Generator;

public class PesquisaLupaTeste {

	public static WebDriver driver = null;
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
	public void pesquisa() throws Exception {

		PaginaInicial.btnLupa(driver).click();

		PaginaInicial.txtLupa(driver).sendKeys("TABLET HP " + Keys.ENTER);

//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].click();", PelaBarra.clickProducto(driver));
//
//		Assert.assertTrue(driver.getPageSource().contains(ExcelUtils.getCellData(1, 0).toUpperCase()));
//	}
//
//	@Test
//	public void pesquisaFalhou() throws Exception {
//
//		wait.until(ExpectedConditions.visibilityOf(PelaBarra.botaoLupa(driver)));
//		PelaBarra.botaoLupa(driver).click();
//
//		PelaBarra.barraPesquisa(driver).sendKeys(ExcelUtils.getCellData(1, 1) + Keys.ENTER);
//		try {
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("arguments[0].click();", PelaBarra.clickProducto(driver));
//		} catch (Exception e) {
//			Assert.assertTrue(driver.getPageSource().contains("No results for \"" + ExcelUtils.getCellData(1, 1)+ "\""));
//		}
//	}
//
//	@After
//	public void FechaBrowser() throws Exception {
//		Print.PrintScreenShot(driver, "target/print/" + Generator.dateHourPath() + "print.png");
//		driver.close();
	}
}
