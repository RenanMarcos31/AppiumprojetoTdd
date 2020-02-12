package br.com.rsinet.hub_tdd.testes;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_tdd.pages.PaginaInicial;
import br.com.rsinet.hub_tdd.pages.PesquisaProduto;
import br.com.rsinet.hub_tdd.utiuls.Constant;
import br.com.rsinet.hub_tdd.utiuls.ExcelUtils;
import br.com.rsinet.hub_tdd.utiuls.Report;
import io.appium.java_client.android.AndroidDriver;

public class PesquisaLupaTeste {

	public static AndroidDriver<?> driver;
	public static WebDriverWait wait;
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
	public void pesquisaLupa1() throws Exception {
		report = Report.createTest("PesquisaPelaLupaSucesso");
		PaginaInicial.btnBarra(driver).click();
		
		ExcelUtils.setExcelFile(Constant.File_TestData, "Planilha1");
		PaginaInicial.btnBarra(driver).sendKeys(ExcelUtils.getCellData(1, 0));
		PaginaInicial.btnLupa(driver).click();
		PesquisaProduto.btnProduto(driver).click();
		
		Assert.assertEquals("HP ELITEPAD 1000 G2 TABLET", driver.findElement(By.id(
				"com.Advantage.aShopping:id/textViewProductName")).getText());
		
		Report.statusReported(report, driver, teste);
		teste = "PesquisaPelaLupaSucesso";
	}
	
	@Test
	public void pesquisaLupa2() throws Exception {
		report = Report.createTest("PesquisaPelaLupaFalha");
		PaginaInicial.btnBarra(driver).click();
		PaginaInicial.btnBarra(driver).sendKeys(ExcelUtils.getCellData(1, 1));
		PaginaInicial.btnLupa(driver).click();
		
		Assert.assertEquals("- No results for \"Microfone\" -", driver.findElement(By.id(
				"com.Advantage.aShopping:id/textViewNoProductsToShow")).getText());
		
		Report.statusReported(report, driver, teste);
		teste = "PesquisaPelaLupaFalha";
	}
	
	@After
	public void fecharAbas() {
		Report.quitExtent(test);
		driver.quit();
	}
}
