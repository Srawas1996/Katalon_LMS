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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('https://dev-lms-frontend.joacademy.tech/')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.sendKeys(findTestObject('Login/Page_Login/UserName'), 'owner@app.com')

WebUI.sendKeys(findTestObject('Login/Page_Login/password'), '12345678')

WebUI.click(findTestObject('Login/Page_Login/Sign In'))

WebUI.verifyElementVisible(findTestObject('Login/Page_Home/CheckTheHomePageTitle'))

WebUI.click(findTestObject('Course/Page_Home/ClickOnSettings'))

WebUI.click(findTestObject('Course/Page_Home/Courses'))

WebUI.click(findTestObject('Course/Page_Courses/ClickOnPlusSign'))

WebUI.click(findTestObject('Course/Page_Add Courses/button_Select Academic Year'))

WebUI.click(findTestObject('Course/Page_Add Courses/Select 2024-2025'))

WebUI.click(findTestObject('Course/Page_Add Courses/button_Select Semester'))

WebUI.click(findTestObject('Course/Page_Add Courses/Select Semester one'))

WebUI.click(findTestObject('Course/Page_Add Courses/button_Next'))

WebUI.click(findTestObject('Course/Page_Add Courses/Choose Subjects'))

WebUI.click(findTestObject('Course/Page_Add Courses/Math'))

WebUI.click(findTestObject('Course/SecondCourse/Islamic Subject'))

WebUI.click(findTestObject('Course/Page_Add Courses/Click On Course Subject'))

WebUI.click(findTestObject('Course/Page_Add Courses/Click on Math Subject'))

//WebUI.click(findTestObject('Course/Page_Add Courses/GradingPersentage'))
WebDriver driver = DriverFactory.getWebDriver()

TestObject sliderObject = findTestObject('Course/Page_Add Courses/GradingPersentage')

WebElement sliderElement = WebUI.findWebElement(sliderObject)

// Initialize Actions class
Actions actions = new Actions(driver)

// Get the size of the slider element to calculate how far to drag
int sliderWidth = sliderElement.getSize().width

// Calculate the X offset based on the desired percentage (85% in this case)
int xOffset = ((sliderWidth * 1.5) as int)

// Drag the slider by the calculated X offset
for (int i = 0; i < 11; i++) {
    actions.clickAndHold(sliderElement).moveByOffset(xOffset, 0).release().perform()
}

WebUI.scrollToElement(findTestObject('Course/Page_Add Courses/button_Finish'), 0)

WebUI.click(findTestObject('Course/Page_Add Courses/Select Teacher'))

WebUI.sendKeys(findTestObject('Course/Page_Add Courses/Teacher_search'), 'Salim AlRawas')

WebUI.click(findTestObject('Course/Page_Add Courses/Select Salim AlRawas'))

WebUI.click(findTestObject('Course/Page_Add Courses/GroupYearSelect'))

WebUI.click(findTestObject('Course/Page_Add Courses/CategorySelect'))

WebUI.click(findTestObject('Course/Page_Add Courses/GradeSelect'))

WebUI.click(findTestObject('Course/Page_Add Courses/SectionSelect'))

WebUI.click(findTestObject('Course/SecondCourse/Islamic_FillTheInformation'))

WebUI.click(findTestObject('Course/SecondCourse/button_Select Teacher_Islamic'))

WebUI.sendKeys(findTestObject('Course/SecondCourse/Select Teacher_Search'), 'Salim AlRawas')

WebUI.click(findTestObject('Course/SecondCourse/Salim AlRawas_select'))

WebUI.click(findTestObject('Course/SecondCourse/Group Year'))

WebUI.click(findTestObject('Course/SecondCourse/Category'))

WebUI.click(findTestObject('Course/SecondCourse/Grade'))

WebUI.click(findTestObject('Course/SecondCourse/Select_A_Section'))

TestObject sliderObject2 = findTestObject('Object Repository/Course/SecondCourse/GradinPersentage_Islamic')

WebElement sliderElement2 = WebUI.findWebElement(sliderObject2)


// Get the size of the slider element to calculate how far to drag
int sliderWidth2 = sliderElement2.getSize().width

// Calculate the X offset based on the desired percentage (85% in this case)
int xOffset2 = ((sliderWidth2 * 1.5) as int)

// Drag the slider by the calculated X offset
for (int i = 0; i < 11; i++) {
	actions.clickAndHold(sliderElement2).moveByOffset(xOffset2, 0).release().perform()
}

WebUI.click(findTestObject('Course/Page_Add Courses/button_Finish'))