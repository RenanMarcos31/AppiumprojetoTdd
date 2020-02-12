package br.com.rsinet.hub_tdd.testes;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_tdd.pages.PaginaInicial;
import br.com.rsinet.hub_tdd.pages.PesquisaProduto;
import br.com.rsinet.hub_tdd.utiuls.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaHomeTeste {

	public static AndroidDriver<MobileElement> driver;
	private  ExtentTest report;
	private  String teste;
	static ExtentReports test;
	
	@BeforeClass
	public static void test() {
		test = Report.setExtent("Pesquisa Pela Tela Inicial");
	}
	
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
	public  void pesquisaHome1() throws IOException {
		report = Report.createTest("PesquisaPelaTelaComSucesso");
		PaginaInicial.btnLaptops(driver).click();
		PesquisaProduto.btnNoteBook(driver).click();
		
		Assert.assertEquals("HP CHROMEBOOK 14 G1(ENERGY STAR)", 
				driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText());
		
		Report.statusReported(report, driver, teste);
		teste = "PesquisaPelaTelaComSucesso";
	}
	
	@Test
	public  void pesquisaHome2() throws Exception  {
		report = Report.createTest("PesquisaPelaTelaComFalha");
		PaginaInicial.btnMenu(driver).click();
		PaginaInicial.btnLogin(driver).click();
		PaginaInicial.btnUserName(driver).click();
		PaginaInicial.btnUserName(driver).sendKeys("RenanMarcos1");
		PaginaInicial.btnPassword(driver).click();
		PaginaInicial.btnPassword(driver).sendKeys("@Test123");
		PaginaInicial.btnLogar(driver).click();
		PaginaInicial.btnLaptops(driver).click();
		
		PesquisaProduto.btnNoteBook(driver).click();
		PesquisaProduto.btnQuantidade(driver).click();
		PesquisaProduto.btnQtd(driver).click();
		PesquisaProduto.btnQtd(driver).sendKeys("8");
		PesquisaProduto.btnAplly(driver).click();
		PesquisaProduto.btnAddToCart(driver).click();
		
		Assert.assertEquals("10", 
				driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartLength")).getText());
		
		Report.statusReported(report, driver, teste);
		teste = "PesquisaPelaTelaComFalha";
	}
	
	@After
	public void fechar() {
		Report.quitExtent(test);
		driver.quit();
	}
}
