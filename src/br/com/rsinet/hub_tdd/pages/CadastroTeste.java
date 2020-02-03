package br.com.rsinet.hub_tdd.pages;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
		 
		 DadosDeCadastro.txtUsuario(driver).sendKeys(Keys.ENTER);
//		 DadosDeCadastro.txtemail(driver).sendKeys(Keys.ENTER);
	}
		 
		 @After
		 public void Finalizando() {
//			 driver.quit();
		}
}
