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


public class Scenario01 {
	
	@SuppressWarnings("deprecation")
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
			
			WebElement option1 = MDS_Question_Option.option1(driver); WebElement option4 = MDS_Question_Option.option4(driver);
			WebElement option5 = MDS_Question_Option.option5(driver);

			WebElement questionclass = driver.findElement(By.xpath("//span[@class='ass-intro-title ass-questions']"));

			String questionText = questionclass.getText();
			
			if (questionText.contains(question02) || questionText.contains(question01) || 
				questionText.contains(question03) || questionText.contains(question04) ||
				questionText.contains(question05) || questionText.contains(question12) ||
				questionText.contains(question14) || questionText.contains(question15) ||
				questionText.contains(question16) || questionText.contains(question17) ||
				questionText.contains(question19) || questionText.contains(question20) ||
				questionText.contains(question21)) {

				option1.click(); Thread.sleep(500);

			}else if (questionText.contains(question06) || questionText.contains(question07) ||
					 questionText.contains(question08) || questionText.contains(question09) ||
					 questionText.contains(question10) || questionText.contains(question18)) {

				option5.click(); Thread.sleep(500);

			}else if (questionText.contains(question11)) {

				option4.click(); Thread.sleep(500);

			}else if (questionText.contains(question13)) {

				option4.click(); Thread.sleep(500);

				driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click(); Thread.sleep(500);

			}else if (questionText.contains(question22)) {

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
				questionText.contains(question25) || questionText.contains(question26) ||
				questionText.contains(question27) || questionText.contains(question28) ||
				questionText.contains(question30) || questionText.contains(question31) ||
				questionText.contains(question32) || questionText.contains(question33) ||
				questionText.contains(question34) || questionText.contains(question35) ||
				questionText.contains(question36) || questionText.contains(question37) ||
				questionText.contains(question38) || questionText.contains(question39) ||
				questionText.contains(question40) || questionText.contains(question43) ||
				questionText.contains(question47)) {

				option6.click(); Thread.sleep(500);
			}else if (questionText.contains(question29) || questionText.contains(question41) ||
					 questionText.contains(question42) || questionText.contains(question44) ||
					 questionText.contains(question45) || questionText.contains(question46) ||
					 questionText.contains(question48) || questionText.contains(question49) ||
					 questionText.contains(question50) || questionText.contains(question51) ||
					 questionText.contains(question52) || questionText.contains(question53) ||
					 questionText.contains(question54)) {

				option10.click(); Thread.sleep(500);
			}
		}

		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
        
        driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click();
		
        driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
        
        Thread.sleep(11000);
        
        WebElement button = driver.findElement(By.xpath("(//button[@class='ass-start-btn text-uppercase'])[1]"));
        
        //Duration timeout = Duration.ofSeconds(15);
        
        //WebDriverWait wait = new WebDriverWait(driver, timeout);
        
        //wait.until(ExpectedConditions.textToBePresentInElement(button, "Download Report"));
        
        button.click();
        
        LocalDateTime gen = LocalDateTime.now();
        
        DateTimeFormatter formattergen = DateTimeFormatter.ofPattern("hh:mm a, dd MMMM yyyy");
        
        String formattedDateTimegen = gen.format(formattergen);
        
        System.out.println("Report generated: " + formattedDateTimegen);
		
		driver.findElement(By.xpath("//button[contains(text(),'Home')]")).click();
		
        System.out.println("The Result of MDS Algorithm Scenario01 are listed below:");
        
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='exercise-list-title'])[1]")));
        
        WebElement focus01  = driver.findElement(By.xpath("(//div[@class='exercise-list-title'])[1]"));
		
		String actualtext01 = focus01.getText();
		
		String expectedtext01 = "Lifestyle";
		
		if (actualtext01.contains(expectedtext01)) {
            
			System.out.println("Focusarea01: " + actualtext01);
			
        }else {
            
        	System.out.println("Text is not as expected. Actual: " + actualtext01 + ", Expected: " + expectedtext01);
        }
		
		System.out.println("");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='exercise-list-title'])[2]")));
		
		WebElement focus02  = driver.findElement(By.xpath("(//div[@class='exercise-list-title'])[2]"));
		
		String actualtext02 = focus02.getText();
		
		String expectedtext02 = "Addictions";
		
		if (actualtext02.contains(expectedtext02)) {
            
			System.out.println("Focusarea02: " + actualtext02);
			
        }else {
            
        	System.out.println("Text is not as expected. Actual: " + actualtext02 + ", Expected: " + expectedtext02);
        }
		
		System.out.println("");
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='exercise-list-title'])[3]")));
		
		WebElement focus03  = driver.findElement(By.xpath("(//div[@class='exercise-list-title'])[3]"));
		
		String actualtext03 = focus03.getText();
		
		String expectedtext03 = "Manage mood";
		
		if (actualtext03.contains(expectedtext03)) {
            
			System.out.println("Focusarea03: " + actualtext03);
			
        }else {
            
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
		
		/*System.out.println("=========================FULL PDF CONTENT===============================");
		
		//Full Page Content
		
		String pdffullcontent = pdfstr.getText(PDDoc);
				
		System.out.println(pdffullcontent);
		
		System.out.println("=========================FULL PDF CONTENT===============================");*/
				
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
			
		}else {
			
			System.out.println("Your Focus Area01 is Incorrert");
		}
		
		if(pagecontent03.contains(expectedtext02)) {
			
			System.out.println("Your Focus Area02 is Corrert");
			
		}else {
			
			System.out.println("Your Focus Area02 is Incorrert");
		}
		
		if(pagecontent03.contains("Depression")) {
			
			System.out.println("Your Focus Area03 is Corrert");
			
		}else {
			
			System.out.println("Your Focus Area03 is Incorrert");
		}

		System.out.println("=========================PAGE CONTENT - 03===============================");
		
		System.out.println("=========================PAGE CONTENT - 04===============================");
		
		pdfstr.setStartPage(4);
		
		pdfstr.setEndPage(4);
		
		String pagecontent04 = pdfstr.getText(PDDoc);
		
		String page04resultvalue = "Mood and Emotions 32/90\r\n"
				+ "DEPRESSION 18/20\r\n"
				+ "ANXIETY 03/15\r\n"
				+ "STRESS 03/15\r\n"
				+ "INTOLERANCE OF UNCERTAINTY 02/10\r\n"
				+ "OBSESSIONS & COMPULSIONS 02/10\r\n"
				+ "ANGER 03/15\r\n"
				+ "PHOBIAS 01/05\r\n"
				+ "Behaviour Patterns 12/60\r\n"
				+ "PERFECTIONISM 02/10\r\n"
				+ "IMPULSIVITY 02/10\r\n"
				+ "PROCRASTINATION 03/15\r\n"
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
		
		System.out.println("=========================PAGE CONTENT - 05===============================");
		
		pdfstr.setStartPage(5);
		
		pdfstr.setEndPage(5);
		
		String pagecontent05 = pdfstr.getText(PDDoc);
		
		String REC_Mood_and_Emotions = "Mood and Emotions\r\n"
				+ "The extent to which mood and emotions impact wellness and functioning\r\n"
				+ "32/90\r\n"
				+ "You have a healthy emotional state, but it can be better.";
		
		if(pagecontent05.contains(REC_Mood_and_Emotions)) {
			
			System.out.println("REC_Mood_and_Emotions are Corrert");
			
		}else {
			
			System.out.println("REC_Mood_and_Emotions are Incorrert");
		}
		
		//Depression will not be correct because the pdfstr is not fecthing correctly
		String REC_Depression = "Depression\r\n"
				+ "You are finding it tough and must consider seeking professional help. As a check, we suggest you take\r\n"
				+ "the depression screener found on the depression page of this portal.\r\n"
				+ "18/20";
		
		if(pagecontent05.contains(REC_Depression)) {
			
			System.out.println("REC_Depression are Corrert");
			
		}else {
			
			System.out.println("REC_Depression are Incorrert");
		}
		
		String REC_Anxiety = "Anxiety\r\n"
				+ "You are not showing any symptoms of anxiety. The tools on this portal can help keep you anxiety-free.\r\n"
				+ "Do check them out. \r\n"
				+ "3/15";
		
		if(pagecontent05.contains(REC_Anxiety)) {
			
			System.out.println("REC_Anxiety are Corrert");
			
		}else {
			
			System.out.println("REC_Anxiety are Incorrert");
		}
		
		String REC_Stress = "Stress\r\n"
				+ "You are not unduly stressed and can meet life's challenges. Keep stress at bay using the vast array of\r\n"
				+ "tools available on this portal. \r\n"
				+ "3/15";
		
		if(pagecontent05.contains(REC_Stress)) {
			
			System.out.println("REC_Stress are Corrert");
			
		}else {
			
			System.out.println("REC_Stress are Incorrert");
		}
		
		String REC_Intolerance_of_Uncertainty = "Intolerance of Uncertainty\r\n"
				+ "You don't seem to be fazed by uncertainty at all. This trait is a great strength in a rapidly changing\r\n"
				+ "world of uncertainty. Ensure you keep it that way!  \r\n"
				+ "2/10";
		
		if(pagecontent05.contains(REC_Intolerance_of_Uncertainty)) {
			
			System.out.println("REC_Intolerance_of_Uncertainty are Corrert");
			
		}else {
			
			System.out.println("REC_Intolerance_of_Uncertainty are Incorrert");
		}
		
		String REC_Obessions_and_Compulsions = "Obessions & Compulsions\r\n"
				+ "You don't seem to have symptoms commonly associated with obsessive-compulsive disorder\r\n"
				+ "(OCD). Keep it that way!  \r\n"
				+ "2/10";
		
		if(pagecontent05.contains(REC_Obessions_and_Compulsions)) {
			
			System.out.println("REC_Obessions_and_Compulsions are Corrert");
			
		}else {
			
			System.out.println("REC_Obessions_and_Compulsions are Incorrert");
		}
		
		String REC_Anger = "Anger\r\n"
				+ "You have excellent control over your temper. This is undoubtedly an asset in maintaining personal and\r\n"
				+ "professional relationships. Continue being even-tempered using the anger management tools found on\r\n"
				+ "this portal. \r\n"
				+ "3/15";
		
		if(pagecontent05.contains(REC_Anger)) {
			
			System.out.println("REC_Anger are Corrert");
			
		}else {
			
			System.out.println("REC_Anger are Incorrert");
		}
		
		//Phobias will not be correct because the pdfstr is not fecthing correctly
		String REC_Phobias = "Phobias\r\n"
				+ "You don’t seem to have a problem with phobia. Keep this going! You will find resources and tools on\r\n"
				+ "the phobia page of this portal. Do check them out. \r\n"
				+ "1/5";
		
		if(pagecontent05.contains(REC_Phobias)) {
			
			System.out.println("REC_Phobias are Corrert");
			
		}else {
			
			System.out.println("REC_Phobias are Incorrert");
		}
		
		System.out.println("=========================PAGE CONTENT - 05===============================");
		
		System.out.println("=========================PAGE CONTENT - 06===============================");
		
		pdfstr.setStartPage(6);
		
		pdfstr.setEndPage(6);
		
		String pagecontent06 = pdfstr.getText(PDDoc);
		
		//Behaviour_Patterns will not be correct because the pdfstr is not fecthing correctly
		String REC_Behaviour_Patterns = "Behaviour Patterns\r\n"
				+ "Specific behaviours or personality traits that impact wellness and functioning\r\n"
				+ "12/60\r\n"
				+ "You have a healthy set of behaviour and personality traits.";
		
		if(pagecontent06.contains(REC_Behaviour_Patterns)) {
			
			System.out.println("REC_Behaviour_Patterns are Corrert");
			
		}else {
			
			System.out.println("REC_Behaviour_Patterns are Incorrert");
		}
		
		String REC_Perfectionism = "Perfectionism\r\n"
				+ "You do not allow perfectionism to stress you out or interfere with your productivity. Maintaining a\r\n"
				+ "healthy balance between perfectionist tendencies and the practical aspect of work is the right way to\r\n"
				+ "go. Keep this up! \r\n"
				+ "2/10";
		
		if(pagecontent06.contains(REC_Perfectionism)) {
			
			System.out.println("REC_Perfectionism are Corrert");
			
		}else {
			
			System.out.println("REC_Perfectionism are Incorrert");
		}
		
		String REC_Procrastination = "Procrastination\r\n"
				+ "Relax! You are not a procrastinator. This means you get things done mostly on time. Keep this up and\r\n"
				+ "be at your productive best. Always. \r\n"
				+ "3/15";
		
		if(pagecontent06.contains(REC_Procrastination)) {
			
			System.out.println("REC_Procrastination are Corrert");
			
		}else {
			
			System.out.println("REC_Procrastination are Incorrert");
		}
		
		//Burnout will not be correct because the pdfstr is not fecthing correctly
		String REC_Burnout = "Burnout\r\n"
				+ "You do not show any symptoms of burnout, and this is good news. If you don’t do so already, take steps\r\n"
				+ "to maintain a healthy work-life balance and keep stress at bay. You will find all the resources you need\r\n"
				+ "on the burnout page on this portal. Check them out.\r\n"
				+ "3/15";
		
		if(pagecontent06.contains(REC_Burnout)) {
			
			System.out.println("REC_Burnout are Corrert");
			
		}else {
			
			System.out.println("REC_Burnout are Incorrert");
		}
		
		String REC_Distractibility = "Distractibility\r\n"
				+ "There seems to be nothing wrong with your attention levels. In an age when distractions abound, this\r\n"
				+ "is a superpower! Continue to maintain this strength. Check out the resources and tools on this subject\r\n"
				+ "on the attention page of this portal. \r\n"
				+ "2/10";
		
		if(pagecontent06.contains(REC_Distractibility)) {
			
			System.out.println("REC_Distractibility are Corrert");
			
		}else {
			
			System.out.println("REC_Distractibility are Incorrert");
		}
		
		String REC_Impulsivity = "Impulsivity\r\n"
				+ "You are not impulsive. Continue to stay this way and act thoughtfully at all times. \r\n"
				+ "2/10";
		
		if(pagecontent06.contains(REC_Impulsivity)) {
			
			System.out.println("REC_Impulsivity are Corrert");
			
		}else {
			
			System.out.println("REC_Impulsivity are Incorrert");
		}
		
		String REC_Cognitive_Skills = "Cognitive_Skills\r\n"
				+ "The ability to effectively use mental faculties to achieve desired goals\r\n"
				+ "11/55\r\n"
				+ "Your cognitive skills are an area of strength.";
		
		if(pagecontent06.contains(REC_Cognitive_Skills)) {
			
			System.out.println("REC_Cognitive_Skills are Corrert");
			
		}else {
			
			System.out.println("REC_Cognitive_Skills are Incorrert");
		}
		
		String REC_Attention = "Attention\r\n"
				+ "You seem to have great powers of concentration. The ability to focus is a prerequisite for higher\r\n"
				+ "productivity at work, and you must nurture this strength. The assessments and tools on the attention\r\n"
				+ "page of this portal will help you maintain this valuable skill. \r\n"
				+ "2/10";
		
		if(pagecontent06.contains(REC_Attention)) {
			
			System.out.println("REC_Attention are Corrert");
			
		}else {
			
			System.out.println("REC_Attention are Incorrert");
		}
		
		//Memory will not be correct because the pdfstr is not fecthing correctly
		String REC_Memory = "Memory\r\n"
				+ "You seem to have a great memory. This is a strength that you should maintain. Check out the\r\n"
				+ "assessments and tools on the memory page on this portal - you will find them engaging and useful.\r\n"
				+ "2/10";
		
		if(pagecontent06.contains(REC_Memory)) {
			
			System.out.println("REC_Memory are Corrert");
			
		}else {
			
			System.out.println("REC_Memory are Incorrert");
		}
		
		System.out.println("=========================PAGE CONTENT - 06===============================");
		
		System.out.println("=========================PAGE CONTENT - 07===============================");
		
		pdfstr.setStartPage(7);
		
		pdfstr.setEndPage(7);
		
		String pagecontent07 = pdfstr.getText(PDDoc);
		
		String REC_Learning = "Learning\r\n"
				+ "You are an excellent learner with a solid ability to acquire new skills and knowledge. In a rapidly\r\n"
				+ "evolving world, the ability to learn and apply the learning when required determines work\r\n"
				+ "productivity and career progression. Continue to nurture this vital skill.   \r\n"
				+ "2/10";
		
		if(pagecontent07.contains(REC_Learning)) {
			
			System.out.println("REC_Learning are Corrert");
			
		}else {
			
			System.out.println("REC_Learning are Incorrert");
		}
		
		//Self_Esteem will not be correct because the pdfstr is not fecthing correctly
		String REC_Self_Esteem = "Self-Esteem\r\n"
				+ "You seem to be highly confident in your worth and abilities. You must maintain high self-esteem, to aid\r\n"
				+ "your personal and professional growth."
				+ "2/10";
		
		if(pagecontent07.contains(REC_Self_Esteem)) {
			
			System.out.println("REC_Self_Esteem are Corrert");
			
		}else {
			
			System.out.println("REC_Self_Esteem are Incorrert");
		}
		
		//Executive_Functions will not be correct because the pdfstr is not fecthing correctly
		String REC_Executive_Functions = "Executive Functions\r\n"
				+ "You have no significant concerns with your ability to engage in goal-directed behaviour. With excellent\r\n"
				+ "executive functioning, you manage your time well, think flexibly, and have the self-control to achieve\r\n"
				+ "your goals.\r\n"
				+ "3/15";
		
		if(pagecontent07.contains(REC_Executive_Functions)) {
			
			System.out.println("REC_Executive_Functions are Corrert");
			
		}else {
			
			System.out.println("REC_Executive_Functions are Incorrert");
		}
		
		String REC_Social_Skills = "Social Skills\r\n"
				+ "How you interact with, relate to, and see yourself in relation to others.\r\n"
				+ "5/25\r\n"
				+ "You have excellent social skills.\r\n"
				+ "Social Skills\r\n"
				+ "You seem to have excellent social skills. You possess good communication skills and are comfortable in\r\n"
				+ "social situations and meeting new people. This is an asset. Maintain it. \r\n"
				+ "2/10";
		
		if(pagecontent07.contains(REC_Social_Skills)) {
			
			System.out.println("REC_Social_Skills are Corrert");
			
		}else {
			
			System.out.println("REC_Social_Skills are Incorrert");
		}
		
		String REC_Communication = "Communication\r\n"
				+ "You have a great ability to communicate your thoughts and feelings effectively. Maintain this strength.\r\n"
				+ "3/15";
		
		if(pagecontent07.contains(REC_Communication)) {
			
			System.out.println("REC_Communication are Corrert");
			
		}else {
			
			System.out.println("REC_Communication are Incorrert");
		}
		
		String REC_Lifestyle = "Lifestyle\r\n"
				+ "Your lifestyle and its role in your physical and mental health\r\n"
				+ "40/40\r\n"
				+ "Take immediate steps to correct your lifestyle habits. Seek professional help if required. \r\n"
				+ "Lifestyle\r\n"
				+ "You seem to be leading a poor lifestyle. Get some professional help to work on your lifestyle. This is an\r\n"
				+ "investment in time that is worth making. \r\n"
				+ "25/25";
		
		if(pagecontent07.contains(REC_Lifestyle)) {
			
			System.out.println("REC_Lifestyle are Corrert");
			
		}else {
			
			System.out.println("REC_Lifestyle are Incorrert");
		}
		
		String REC_Addictions = "Addictions\r\n"
				+ "You seem to have a problem here, and this could be causing you distress. Seek professional help. For\r\n"
				+ "more on this topic, check out the resources and tools on the substance use/addictive behaviour page on\r\n"
				+ "this portal. \r\n"
				+ "15/15";
		
		if(pagecontent07.contains(REC_Addictions)) {
			
			System.out.println("REC_Addictions are Corrert");
			
		}else {
			
			System.out.println("REC_Addictions are Incorrert");
		}
		
		System.out.println("=========================PAGE CONTENT - 07===============================");
		
		driver.quit();
		
	}

}