package com.witmermdsalgorithm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MDS_Question_Option {

	// MDS Questions

	public static final String question01 = "You eat a healthy diet at least 4-5 days a week.";
	public static final String question02 = "You exercise/engage in physical activity (30 minutes or more a day, at least 3-4 days a week).";
	public static final String question03 = "You socialise with family and friends outside of work.";
	public static final String question04 = "You indulge in hobbies outside of work";
	public static final String question05 = "You have adequate energy to meet life's demands (personal and work).";
	public static final String question06 = "Your use of alcohol/nicotine/other drugs/digital media has a negative impact on your work and relationships.";
	public static final String question07 = "You find it difficult to refrain from using alcohol/nicotine/other drugs, even if you want to.";
	public static final String question08 = "You find it difficult to stay away from digital media (e.g., video games, OTT platforms, social media, internet) even though it makes you feel worse.";
	public static final String question10 = "You experience overwhelming feelings of sadness/hopelessness/helplessness/guilt/loneliness.";
	public static final String question09 = "You experience feelings of low mood/disinterest in activities that you used to enjoy.";
	public static final String question11 = "You have difficulty sleeping well.";
	public static final String question12 = "You have trouble relaxing because you feel nervous/anxious/on edge.";
	public static final String question13 = "You get thoughts/feelings of harming yourself.";
	public static final String question14 = "You cannot stop/control worrying about routine things (work/health/relationships).";
	public static final String question15 = "You experience sudden bouts of intense fear/anxiety, accompanied by dizziness/shortness of breath/chest pain/trembling/hot flushes.";
	public static final String question16 = "You feel stressed because your work/people around you are demanding.";
	public static final String question17 = "Your work pressure is impacting one or more of the following: health/sleep/relationships.";
	public static final String question18 = "You bounce back easily after stressful events/situations (like conflicts, workplace issues, ill health, or personal problems).";
	public static final String question19 = "You become anxious/frustrated in uncertain/unstructured situations (like an unclear project brief, a new role, a new boss, etc.).";
	public static final String question20 = "Not knowing things in advance (like project deadlines or job transfers) upset you greatly.";
	public static final String question21 = "You have repetitive inappropriate/disturbing thoughts/impulses, which you find difficult to control (e.g., thoughts about contamination or something bad will happen or that you will hurt someone or repeated sexual thoughts).";
	public static final String question22 = "You repeatedly perform certain actions over and over again that you find difficult to refrain from doing (e.g., repeated washing, checking or arranging things, etc.).";
	public static final String question23 = "Your anger negatively impacts your relationships with others.";
	public static final String question24 = "You get angry at the slightest provocation.";
	public static final String question25 = "You become physically and/or verbally abusive when you get angry.";
	public static final String question26 = "You tend to avoid any of the following situations due to excessive fear/unpleasant feelings (a. Flying b. Heights c. Speaking in public d. Open spaces).";
	public static final String question27 = "You set such high standards for yourself that you find it difficult to meet them.";
	public static final String question28 = "You miss deadlines because you are never satisfied with the quality of your work.";
	public static final String question29 = "You always plan and prioritise work so that you comfortably meet deadlines.";
	public static final String question30 = "You often find excuses to delay doing the work that must be done.";
	public static final String question31 = "You often let your workload pile up to unmanageable levels.";
	public static final String question32 = "You often feel restless/fidgety, even when you must be still (e.g., in meetings, lectures, and other social situations).";
	public static final String question33 = "You do things on an impulse without much thought (even important tasks).";
	public static final String question34 = "You often do things – even important things (like working on a report, filing your taxes, listening to a lecture) – without really paying attention to them.";
	public static final String question35 = "You often tend to overlook or miss details when working on a task.";
	public static final String question36 = "You have become very cynical/negative at work.";
	public static final String question37 = "You feel mentally/physically exhausted or worn out due to work pressure.";
	public static final String question38 = "You have stopped caring about your performance/the quality of your work.";
	public static final String question39 = "You find it difficult to initiate/sustain conversations in social situations.";
	public static final String question40 = "You experience significant anxiety when it comes to participating in social situations (like parties, conferences, functions, meetings, etc.).";
	public static final String question41 = "You can verbally communicate your views/feelings/thoughts in a way that others easily understand.";
	public static final String question42 = "You can clearly express your opinions/feelings/thoughts in writing.";
	public static final String question43 = "You find it difficult to express your emotions.";
	public static final String question44 = "You find it easy to shift from one demanding task to another.";
	public static final String question45 = "You are able to sustain your attention/focus even while performing tasks that take a long time to finish.";
	public static final String question46 = "You can easily remember the names and faces of people you meet, even after a long period.";
	public static final String question47 = "You often find yourself trying to remember the location of everyday items (e.g., keys, wallet, glasses, etc.).";
	public static final String question48 = "You proactively take steps to acquire new skills/knowledge.";
	public static final String question49 = "You are able to apply new learning/skills/strategies to achieve desired outcomes.";
	public static final String question50 = "When you are stuck with a problem, you tend to look at it from different angles in order to come up with a novel solution.";
	public static final String question51 = "You put aside unpleasant feelings/emotions while taking important decisions.";
	public static final String question52 = "You easily adapt to different situations (like coming up with new ways of working or when you move into a new role) when required.";
	public static final String question53 = "You feel good about yourself (you are motivated/feel worthy).";
	public static final String question54 = "You demonstrate appropriate levels of self-confidence in the workplace.";
	
	// MDS Options

	public static WebElement option1(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Never')]"));
	}

	public static WebElement option2(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Rarely')]"));
	}

	public static WebElement option3(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Sometimes')]"));
	}

	public static WebElement option4(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Often ')]"));
	}

	public static WebElement option5(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Always')]"));
	}

	public static WebElement option6(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Strongly Disagree')]"));
	}

	public static WebElement option7(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Disagree')]"));
	}

	public static WebElement option8(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Neither Agree nor Disagree')]"));
	}

	public static WebElement option9(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Agree')]"));
	}

	public static WebElement option10(WebDriver driver) {
		return driver.findElement(By.xpath("//label[contains(text(),'Strongly Agree')]"));
	}

}
