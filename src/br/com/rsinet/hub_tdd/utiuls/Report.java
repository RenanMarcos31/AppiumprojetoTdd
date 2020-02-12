package br.com.rsinet.hub_tdd.utiuls;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.appium.java_client.android.AndroidDriver;

public class Report {

	public  WebDriver driver;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

	public static ExtentReports setExtent(String nomeReport) {
		String dateName = new SimpleDateFormat("dd_MM_yyyy HH.mm.ss").format(Calendar.getInstance().getTime());
		htmlReporter = new ExtentHtmlReporter("./target/" + nomeReport + "  " + dateName + ".html");

		htmlReporter.config().setDocumentTitle("Report de Testes");
		htmlReporter.config().setReportName("Report TDD");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();

		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "LocalHost");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Teste", "Renan Marcos");
		extent.setSystemInfo("Browser", "Chrome");
		return extent;
	}

	public static ExtentTest createTest(String testName) {
		test = extent.createTest(testName);
		return test;
	}

	public static void statusReported

	(ExtentTest test, AndroidDriver<?> driver, String testName) throws IOException {

		String caminhoScreen = ScreenShot.gerarScreenShot(driver, testName);

		test.addScreenCaptureFromPath(caminhoScreen);
	}

	public static void quitExtent(ExtentReports extent) {
		extent.flush();
	}
}
