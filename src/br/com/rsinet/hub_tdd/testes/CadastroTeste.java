package br.com.rsinet.hub_tdd.testes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_tdd.pages.DadosDeCadastro;
import br.com.rsinet.hub_tdd.pages.PaginaInicial;
import br.com.rsinet.hub_tdd.scroll.Scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CadastroTeste {
	
	 private  AndroidDriver<MobileElement> driver;
	 private TouchAction action;
	 
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
//		action = new TouchAction(driver);
		
		 PaginaInicial.btnMenu(driver).click();
		 PaginaInicial.btnLogin(driver).click();
		 PaginaInicial.btnCriarConta(driver).click();
		 
		 DadosDeCadastro.txtUsuario(driver).click();
		 DadosDeCadastro.txtUsuario(driver).sendKeys("RenanMarcos3");
		 
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
		 PaginaInicial.btnMenu(driver).click();
	}
	
	@Test
	public void Cadastro2() throws Exception {
//		action = new TouchAction(driver);
		
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
	}
		 
		 @After
		 public void Finalizando() {
			 driver.quit();
		}
}
