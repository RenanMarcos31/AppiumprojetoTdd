package br.com.rsinet.hub_tdd.testes;

import java.net.MalformedURLException;
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

import br.com.rsinet.hub_tdd.pages.DadosDeCadastro;
import br.com.rsinet.hub_tdd.pages.PaginaInicial;
import br.com.rsinet.hub_tdd.scroll.Scroll;
import br.com.rsinet.hub_tdd.utiuls.Report;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CadastroTeste {

	private AndroidDriver<MobileElement> driver;
	private TouchAction action;
	private ExtentTest report;
	private String teste;
	static ExtentReports test;

	@BeforeClass
	public static void test() {
		test = Report.setExtent("Cadastro Novo Usuario");
	}
	@Before
	public void Inicio() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Renan");
		capabilities.setCapability("udid", "emulator-5554");
		capabilities.setCapability("platformName", "Android ");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "com.Advantage.aShopping");
		capabilities.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, capabilities);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}

	@Test
	public void Cadastro1() throws Exception {
		report = Report.createTest("CadastroComSucesso");
		PaginaInicial.btnMenu(driver).click();
		PaginaInicial.btnLogin(driver).click();
		PaginaInicial.btnCriarConta(driver).click();

		DadosDeCadastro.txtUsuario(driver).click();
		DadosDeCadastro.txtUsuario(driver).sendKeys("RenaOtario94");

		DadosDeCadastro.txtemail(driver).click();
		DadosDeCadastro.txtemail(driver).sendKeys("renan@silva.com.br");
		DadosDeCadastro.txtSenha(driver).click();
		DadosDeCadastro.txtSenha(driver).sendKeys("@Test123");
		DadosDeCadastro.txtConfirmaSenha(driver).click();
		DadosDeCadastro.txtConfirmaSenha(driver).sendKeys("@Test123");
		DadosDeCadastro.txtPrimeiroNome(driver).click();
		DadosDeCadastro.txtPrimeiroNome(driver).sendKeys("Renan");
		DadosDeCadastro.txtSobrenome(driver).click();
		DadosDeCadastro.txtSobrenome(driver).sendKeys("Silva");
		DadosDeCadastro.txtTelefone(driver).click();
		DadosDeCadastro.txtTelefone(driver).sendKeys("(11) 991929394");
		Scroll.scrollAndClick(driver, "United States");
		DadosDeCadastro.listboxPaís(driver).click();
		Scroll.scrollAndClick(driver, "Brazil");
		DadosDeCadastro.txtEstado(driver).click();
		DadosDeCadastro.txtEstado(driver).sendKeys("SP");
		DadosDeCadastro.txtCidade(driver).click();
		DadosDeCadastro.txtCidade(driver).sendKeys("São Paulo");
		DadosDeCadastro.txtEndereco(driver).click();
		DadosDeCadastro.txtEndereco(driver).sendKeys("R. Litoral, 215");
		DadosDeCadastro.txtCep(driver).click();
		DadosDeCadastro.txtCep(driver).sendKeys("03582-190");
		DadosDeCadastro.btnRegistrar(driver).click();
		
		Scroll.scrollUp(driver);
		PaginaInicial.btnMenu(driver).click();
		
		Assert.assertNotEquals("LOGIN", driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).getText());

		Report.statusReported(report, driver, teste);
		teste = "TesteCadastroComSucesso";
		
	}

	@Test
	public void Cadastro2() throws Exception {
		report = Report.createTest("CadastroComFalha");
		PaginaInicial.btnMenu(driver).click();
		PaginaInicial.btnLogin(driver).click();
		PaginaInicial.btnCriarConta(driver).click();

		DadosDeCadastro.txtUsuario(driver).click();
		DadosDeCadastro.txtUsuario(driver).sendKeys("RenanMarcos2");

		DadosDeCadastro.txtemail(driver).click();
		DadosDeCadastro.txtemail(driver).sendKeys("renan12");
		DadosDeCadastro.txtSenha(driver).click();
		DadosDeCadastro.txtSenha(driver).sendKeys("@Test123");
		DadosDeCadastro.txtConfirmaSenha(driver).click();
		DadosDeCadastro.txtConfirmaSenha(driver).sendKeys("@Test123");
		DadosDeCadastro.txtPrimeiroNome(driver).click();
		DadosDeCadastro.txtPrimeiroNome(driver).sendKeys("Renan");
		DadosDeCadastro.txtSobrenome(driver).click();
		DadosDeCadastro.txtSobrenome(driver).sendKeys("Silva");
		
		Assert.assertEquals("Your email isn’t formatted correctly", driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView")).getText());
		Report.statusReported(report, driver, teste);
		teste = "TesteCadastroComFalha";
	}

	@After
	public void Finalizando() {
		Report.quitExtent(test);
		driver.quit();
	}
}
