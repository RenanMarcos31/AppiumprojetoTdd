package br.com.rsinet.hun_tdd.testes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_tdd.pages.PaginaInicial;
import br.com.rsinet.hub_tdd.utiuls.ExcelUtiuls;
import br.com.rsinet.hun_tdd.DadosDeCadastro;
import io.appium.java_client.android.AndroidDriver;

public class CadastroTeste {
	
	 private static WebDriver  driver;
	 
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
	public void Cadastro() throws Exception {
		 PaginaInicial.btnMenu(driver).click();
		 PaginaInicial.btnLogin(driver).click();
		 PaginaInicial.btnCriarConta(driver).click();
		 
		 DadosDeCadastro.txtUsuario(driver).sendKeys(ExcelUtiuls.getCellData(1, 0));
		 DadosDeCadastro.txtemail(driver).sendKeys(ExcelUtiuls.getCellData(1, 1));
		 DadosDeCadastro.txtSenha(driver).sendKeys(ExcelUtiuls.getCellData(1, 2));
		 DadosDeCadastro.txtConfirmaSenha(driver).sendKeys(ExcelUtiuls.getCellData(1, 3));
		 DadosDeCadastro.txtPrimeiroNome(driver).sendKeys(ExcelUtiuls.getCellData(1, 4));
		 DadosDeCadastro.txtSobrenome(driver).sendKeys(ExcelUtiuls.getCellData(1, 5));
		 DadosDeCadastro.txtTelefone(driver).sendKeys(ExcelUtiuls.getCellData(1, 6));
		 DadosDeCadastro.cbxPais(driver);
		 DadosDeCadastro.txtEstado(driver).sendKeys(ExcelUtiuls.getCellData(1, 7));
		 DadosDeCadastro.txtEndereco(driver).sendKeys(ExcelUtiuls.getCellData(1, 8));
		 DadosDeCadastro.txtCidade(driver).sendKeys(ExcelUtiuls.getCellData(1, 9));
		 DadosDeCadastro.txtCep(driver).sendKeys(ExcelUtiuls.getCellData(1, 10));
		 DadosDeCadastro.btnRegistrar(driver).click();;
	}
		 
		 @After
		 public void Finalizando() {
//			 driver.quit();
		}
}
