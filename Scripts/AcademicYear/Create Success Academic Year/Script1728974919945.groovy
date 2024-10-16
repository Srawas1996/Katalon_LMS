import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import java.util.List
import java.util.Random



WebUI.openBrowser('https://dev-lms-frontend.joacademy.tech/')
WebDriver driver = DriverFactory.getWebDriver()

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Login/Page_Login/UserName'), 'owner@app.com')

WebUI.sendKeys(findTestObject('Login/Page_Login/password'), '12345678')

WebUI.click(findTestObject('Login/Page_Login/Sign In'))

WebUI.verifyElementVisible(findTestObject('Login/Page_Home/CheckTheHomePageTitle'))

WebUI.click(findTestObject('Course/Page_Home/ClickOnSettings'))

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Home/Academic Years'))

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Academic Years/PlusSignAcademicYear'))

WebUI.sendKeys(findTestObject('AcademicYear/Creating Page Element/Arabic Name'), 'فحص الاوتوميشن')

WebUI.sendKeys(findTestObject('AcademicYear/Creating Page Element/English Name'), 'AutomationTest')

WebUI.click(findTestObject('AcademicYear/StartDate Select/StartDate'))

WebUI.click(findTestObject('AcademicYear/StartDate Select/MonthDropDownList'))

WebUI.click(findTestObject('AcademicYear/StartDate Select/SeptemberSelect'))

WebUI.click(findTestObject('AcademicYear/Creating Page Element/YearSelect'))

WebUI.click(findTestObject('AcademicYear/StartDate Select/YearSelect'))

WebUI.click(findTestObject('AcademicYear/StartDate Select/SelectDay'))

List<WebElement> days = driver.findElements(By.xpath("//button[@name='day']"))

// Generate a random index
Random rand = new Random()
int randomIndex = rand.nextInt(days.size()) // Ensures index is within the range

// Click on the randomly selected day
days.get(randomIndex).click()

WebUI.click(findTestObject('AcademicYear/EndDate Select/End Date'))

WebUI.click(findTestObject('AcademicYear/EndDate Select/MonthSelect'))

WebUI.click(findTestObject('AcademicYear/EndDate Select/Select June'))

WebUI.click(findTestObject('AcademicYear/Creating Page Element/YearSelect'))

WebUI.click(findTestObject('AcademicYear/EndDate Select/Select Year 2022'))

WebUI.click(findTestObject('AcademicYear/EndDate Select/Select Day'))
// Get the WebDriver instance


// Find all day elements using the common XPath for the days
List<WebElement> days2 = driver.findElements(By.xpath("//button[@name='day']"))

// Generate a random index
Random rand2 = new Random()
int randomIndex2 = rand2.nextInt(days2.size()) // Ensures index is within the range

// Click on the randomly selected day
days2.get(randomIndex2).click()

WebUI.click(findTestObject('AcademicYear/Page_Academic Years/Create Button'))

WebUI.verifyElementClickable(findTestObject('AcademicYear/Page_Academic Years/ThreeDotsAcademicYear'))

WebUI.closeBrowser()

