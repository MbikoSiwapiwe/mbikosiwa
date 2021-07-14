package com.maven.mavenproject.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigateToHomeSteps {

	WebDriver driver;
	
	@Given("I navigate to home page")
	public void i_navigate_to_home_page() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.ilabquality.com/");
		 driver.manage().window().maximize();
	}

	@When("I click on Careers link")
	public void i_click_on_careers_link() {
	  driver.findElement(By.xpath("//li[@id='menu-item-1373']//a[normalize-space()='CAREERS']")).click();
	}

	@When("Select South Africa")
	public void select_south_africa() {
		driver.findElement(By.xpath("//a[normalize-space()='South Africa']")).click();
	}

	@Then("I click on the first job hyperlink")
	public void i_click_on_the_first_job_hyperlink() {
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
		
	}
	
	@Then("Populate the form once displayed")
	public void populate_the_form_once_displayed() {
		driver.findElement(By.xpath("//a[normalize-space()='South Africa']")).click();
		
		driver.quit();
		}
	
}
