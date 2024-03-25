package com.witmermdsalgorithm;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario05 {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.firefoxdriver().setup();
				
		//WebDriverManager.edgedriver().setup();

		WebDriver driver = new ChromeDriver();

		//WebDriver driver = new FirefoxDriver();

		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://app.mindn.ai/#/login");

		driver.manage().window().maximize();

		// Clear cookies

		driver.manage().deleteAllCookies();

		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Duration timeout = Duration.ofSeconds(10);
        
        WebDriverWait wait = new WebDriverWait(driver, timeout);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arunachalam@energetics.ai");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Mail@123");

		driver.findElement(By.id("loginButton")).click();

		WebElement mdselement = driver.findElement(By.xpath("//a[contains(text(),'MMWA')]"));
        
		Actions actions = new Actions(driver);
		        
		actions.moveToElement(mdselement).perform();
		        
		mdselement.click();

		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		LocalDateTime now = LocalDateTime.now();
        
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");
		        
		String formattedDateTime = now.format(formatter);
		        
		System.out.println("Taken at: " + formattedDateTime);

		List<WebElement> elements = driver.findElements(By.xpath("(//button[contains(text(),'CONTINUE')])[2]"));

		if (!elements.isEmpty()) {

			driver.findElement(By.xpath("(//button[contains(text(),'CONTINUE')])[2]")).click();

		}
		for (int i = 1; i <= 22; i++) {

			String question01 = MDS_Question_Option.question01; String question02 = MDS_Question_Option.question02;
			String question03 = MDS_Question_Option.question03; String question04 = MDS_Question_Option.question04;
			String question05 = MDS_Question_Option.question05; String question06 = MDS_Question_Option.question06;
			String question07 = MDS_Question_Option.question07; String question08 = MDS_Question_Option.question08;
			String question09 = MDS_Question_Option.question09; String question10 = MDS_Question_Option.question10;
			String question11 = MDS_Question_Option.question11; String question12 = MDS_Question_Option.question12;
			String question13 = MDS_Question_Option.question13; String question14 = MDS_Question_Option.question14;
			String question15 = MDS_Question_Option.question15; String question16 = MDS_Question_Option.question16;
			String question17 = MDS_Question_Option.question17; String question18 = MDS_Question_Option.question18;
			String question19 = MDS_Question_Option.question19; String question20 = MDS_Question_Option.question20;
			String question21 = MDS_Question_Option.question21; String question22 = MDS_Question_Option.question22;

			WebElement option1 = MDS_Question_Option.option1(driver); WebElement option5 = MDS_Question_Option.option5(driver);

			WebElement questionclass = driver.findElement(By.xpath("//span[@class='ass-intro-title ass-questions']"));

			String questionText = questionclass.getText();

			if (questionText.contains(question02) || questionText.contains(question01) ||
				questionText.contains(question03) || questionText.contains(question04) ||
				questionText.contains(question05) || questionText.contains(question09) ||
				questionText.contains(question10) || questionText.contains(question11) ||
				questionText.contains(question13) || questionText.contains(question15) ||
				questionText.contains(question19) || questionText.contains(question20) ||
				questionText.contains(question21)) {

				option1.click(); Thread.sleep(500);

			} else if (questionText.contains(question06) || questionText.contains(question07) ||
					 questionText.contains(question08) || questionText.contains(question12) ||
					 questionText.contains(question14) || questionText.contains(question16) ||
					 questionText.contains(question17) || questionText.contains(question18)) {

				option5.click(); Thread.sleep(500);
				
			} else if (questionText.contains(question22)) {

				option1.click(); Thread.sleep(500);

				driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click(); Thread.sleep(500);
			}
		}
		
		Thread.sleep(500);

		for (int i = 1; i <= 32; i++) {

			String question23 = MDS_Question_Option.question23; String question24 = MDS_Question_Option.question24;
			String question25 = MDS_Question_Option.question25; String question26 = MDS_Question_Option.question26;
			String question27 = MDS_Question_Option.question27; String question28 = MDS_Question_Option.question28;
			String question29 = MDS_Question_Option.question29; String question30 = MDS_Question_Option.question30;
			String question31 = MDS_Question_Option.question31; String question32 = MDS_Question_Option.question32;
			String question33 = MDS_Question_Option.question33; String question34 = MDS_Question_Option.question34;
			String question35 = MDS_Question_Option.question35; String question36 = MDS_Question_Option.question36;
			String question37 = MDS_Question_Option.question37; String question38 = MDS_Question_Option.question38;
			String question39 = MDS_Question_Option.question39; String question40 = MDS_Question_Option.question40;
			String question41 = MDS_Question_Option.question41; String question42 = MDS_Question_Option.question42;
			String question43 = MDS_Question_Option.question43; String question44 = MDS_Question_Option.question44;
			String question45 = MDS_Question_Option.question45; String question46 = MDS_Question_Option.question46;
			String question47 = MDS_Question_Option.question47; String question48 = MDS_Question_Option.question48;
			String question49 = MDS_Question_Option.question49; String question50 = MDS_Question_Option.question50;
			String question51 = MDS_Question_Option.question51; String question52 = MDS_Question_Option.question52;
			String question53 = MDS_Question_Option.question53; String question54 = MDS_Question_Option.question54;

			WebElement option6 = MDS_Question_Option.option6(driver); WebElement option10 = MDS_Question_Option.option10(driver);

			WebElement questionclass = driver.findElement(By.xpath("//span[@class='ass-intro-title ass-questions']"));

			String questionText = questionclass.getText();

			if (questionText.contains(question23) || questionText.contains(question24) ||
				questionText.contains(question30) || questionText.contains(question41) ||
				questionText.contains(question42) || questionText.contains(question44) ||
				questionText.contains(question45) || questionText.contains(question46) ||
				questionText.contains(question48) || questionText.contains(question49) ||
				questionText.contains(question50) || questionText.contains(question51) ||
				questionText.contains(question52) || questionText.contains(question53) ||
				questionText.contains(question54)) {

				option10.click(); Thread.sleep(500);
				
			} else if (questionText.contains(question25) || questionText.contains(question26) ||
					 questionText.contains(question27) || questionText.contains(question28) ||
					 questionText.contains(question29) || questionText.contains(question47) ||
					 questionText.contains(question31) || questionText.contains(question32) ||
					 questionText.contains(question33) || questionText.contains(question34) ||
					 questionText.contains(question35) || questionText.contains(question36) ||
					 questionText.contains(question37) || questionText.contains(question38) ||
					 questionText.contains(question39) || questionText.contains(question40) ||
					 questionText.contains(question43)) {

				option6.click(); Thread.sleep(500);
				
			}

		}

		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		
		Thread.sleep(11000);
        
        WebElement button = driver.findElement(By.xpath("(//button[@class='ass-start-btn text-uppercase'])[1]"));
        
        button.click();
        
        LocalDateTime gen = LocalDateTime.now();
        
        DateTimeFormatter formattergen = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");
        
        String formattedDateTimegen = gen.format(formattergen);
        
        System.out.println("Report generated: " + formattedDateTimegen);

		driver.findElement(By.xpath("//button[contains(text(),'Home')]")).click();

		System.out.println("The Result of MDS Algorithm Scenario05 are listed below:");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='exercise-list-title'])[1]")));

		WebElement focus01 = driver.findElement(By.xpath("(//div[@class='exercise-list-title'])[1]"));

		String actualtext01 = focus01.getText();

		String expectedtext01 = "Lifestyle";

		if (actualtext01.contains(expectedtext01)) {

			System.out.println("Focusarea01: " + actualtext01);

		} else {

			System.out.println("Text is not as expected. Actual: " + actualtext01 + ", Expected: " + expectedtext01);
		}

		System.out.println("");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='exercise-list-title'])[2]")));

		WebElement focus02 = driver.findElement(By.xpath("(//div[@class='exercise-list-title'])[2]"));

		String actualtext02 = focus02.getText();

		String expectedtext02 = "Addictions";

		if (actualtext02.contains(expectedtext02)) {

			System.out.println("Focusarea02: " + actualtext02);

		} else {

			System.out.println("Text is not as expected. Actual: " + actualtext02 + ", Expected: " + expectedtext02);
		}

		System.out.println("");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='exercise-list-title'])[3]")));

		WebElement focus03 = driver.findElement(By.xpath("(//div[@class='exercise-list-title'])[3]"));

		String actualtext03 = focus03.getText();

		String expectedtext03 = "Stress less";

		if (actualtext03.contains(expectedtext03)) {

			System.out.println("Focusarea03: " + actualtext03);

		} else {

			System.out.println("Text is not as expected. Actual: " + actualtext03 + ", Expected: " + expectedtext03);
		}

		System.out.println("");
		
		driver.findElement(By.xpath("//a[@id='profileDropdown']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'SETTINGS')]")).click();
		
		WebElement firstnameelement= driver.findElement(By.xpath("//input[@id='firstName']"));
		
		String firstname = firstnameelement.getAttribute("value");
		
		WebElement lastnameelement = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		String lastname = lastnameelement.getAttribute("value");
		
		System.out.println("Username: "+firstname+" "+lastname);
		
		WebElement genderelement = driver.findElement(By.xpath("//select[@class='genderselect']"));
		
		String gender = genderelement.getAttribute("defaults");
		
		System.out.println("User Gender: "+gender);
		
		WebElement dobElement = driver.findElement(By.xpath("//input[@id='DOB']"));
		
		String dobText = dobElement.getAttribute("value");
		
		LocalDate dob = LocalDate.parse(dobText);
		
        LocalDate currentDate = LocalDate.now();
        
        Period period = Period.between(dob, currentDate);
        
        int age = period.getYears();
        
        System.out.println("User Age: "+age+" Years");
        
        System.out.println("=========================PDF TESTING===============================");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the URL of the PDF file:");
        
        String pdfUrl = scanner.nextLine();
        
        URL pdfurl = new URL(pdfUrl);
        
        InputStream ip = pdfurl.openStream();
		
		BufferedInputStream bf = new BufferedInputStream(ip);
		
		Thread.sleep(1000);
		
		PDDocument PDDoc = PDDocument.load(bf, "062000");
		
		PDFTextStripper pdfstr = new PDFTextStripper();
		
		System.out.println("=========================PAGE COUNT===============================");
		
		//Page Count
		
		int pagecount = PDDoc.getNumberOfPages();
		
		System.out.println("Pdf Total Page Count: " + pagecount);
		
		Assert.assertEquals(pagecount, 10);
		
		System.out.println("=========================PAGE COUNT===============================");
		
		System.out.println("=========================FULL PDF CONTENT===============================");
		
		//Full Page Content
		
		String pdffullcontent = pdfstr.getText(PDDoc);
				
		System.out.println(pdffullcontent);
		
		System.out.println("=========================FULL PDF CONTENT===============================");
				
		System.out.println("=========================PAGE CONTENT - 01===============================");
		
		pdfstr.setStartPage(1);
		
		pdfstr.setEndPage(1);
		
		String pagecontent01 = pdfstr.getText(PDDoc);
		
		if(pagecontent01.contains(firstname+" "+lastname)) {
			
			System.out.println("Username is Corrert");
			
		}else {
			
			System.out.println("Username is Incorrert");
		}
		
		boolean ageresult = pagecontent01.contains("Age: "+age+" Years");
		
		if (ageresult) {
			
		    System.out.println("User Age is Correct");
		    
		}else {
			
		    System.out.println("User Age is Incorrect");
		}

		if(pagecontent01.contains(gender)) {
			
			System.out.println("User Gender is Corrert");
			
		}else {
			
			System.out.println("User Gender is Incorrert");
		}
				
		if(pagecontent01.contains(formattedDateTime)) {
			
			System.out.println("Test Taken Date and Time is Corrert");
			
		}else {
			
			System.out.println("Test Taken Date and Time is Incorrert");
		}
				
		if(pagecontent01.contains(formattedDateTimegen)) {
			
			System.out.println("Report Generated Date and Time is Corrert");
			
		}else {
			
			System.out.println("Report Generated Date and Time is Incorrert");
		}
		
		System.out.println("=========================PAGE CONTENT - 01===============================");
		
		System.out.println("=========================PAGE CONTENT - 03===============================");
		
		pdfstr.setStartPage(3);
		
		pdfstr.setEndPage(3);
		
		String pagecontent03 = pdfstr.getText(PDDoc);
		
		if(pagecontent03.contains(expectedtext01)) {
			
			System.out.println("Your Focus Area01 is Corrert");
			
		} else {
			
			System.out.println("Your Focus Area01 is Incorrert");
		}
		
		if(pagecontent03.contains(expectedtext02)) {
			
			System.out.println("Your Focus Area02 is Corrert");
			
		} else {
			
			System.out.println("Your Focus Area02 is Incorrert");
		}
		
		if(pagecontent03.contains("Stress")) {
			
			System.out.println("Your Focus Area03 is Corrert");
			
		} else {
			
			System.out.println("Your Focus Area03 is Incorrert");
		}

		System.out.println("=========================PAGE CONTENT - 03===============================");
		
		System.out.println("=========================PAGE CONTENT - 04===============================");
		
		pdfstr.setStartPage(4);
		
		pdfstr.setEndPage(4);
		
		String pagecontent04 = pdfstr.getText(PDDoc);
		
		String page04resultvalue = "Mood and Emotions 42/90\r\n"
				+ "DEPRESSION 04/20\r\n"
				+ "ANXIETY 11/15\r\n"
				+ "STRESS 11/15\r\n"
				+ "INTOLERANCE OF UNCERTAINTY 02/10\r\n"
				+ "OBSESSIONS & COMPULSIONS 02/10\r\n"
				+ "ANGER 11/15\r\n"
				+ "PHOBIAS 01/05\r\n"
				+ "Behaviour Patterns 20/60\r\n"
				+ "PERFECTIONISM 02/10\r\n"
				+ "IMPULSIVITY 02/10\r\n"
				+ "PROCRASTINATION 11/15\r\n"
				+ "BURNOUT 03/15\r\n"
				+ "DISTRACTIBILITY 02/10\r\n"
				+ "Cognitive Skills 11/55\r\n"
				+ "ATTENTION 02/10\r\n"
				+ "MEMORY 02/10\r\n"
				+ "LEARNING 02/10\r\n"
				+ "SELF-ESTEEM 02/10\r\n"
				+ "EXECUTIVE FUNCTIONS 03/15\r\n"
				+ "Social Skills 05/25\r\n"
				+ "SOCIAL SKILLS 02/10\r\n"
				+ "COMMUNICATION 03/15\r\n"
				+ "Lifestyle 40/40\r\n"
				+ "LIFESTYLE 25/25\r\n"
				+ "ADDICTIONS 15/15";
		
		if(pagecontent04.contains(page04resultvalue)) {
			
			System.out.println("A Snapshot of Your Scores are Corrert");
			
		}else {
			
			System.out.println("A Snapshot of Your Scores are Incorrert");
		}
		
		System.out.println("=========================PAGE CONTENT - 04===============================");

		// driver.quit();
	}
}
