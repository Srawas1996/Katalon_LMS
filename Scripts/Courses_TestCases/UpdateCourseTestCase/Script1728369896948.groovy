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

WebUI.openBrowser('https://dev-lms-frontend.joacademy.tech/')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.sendKeys(findTestObject('Login/Page_Login/UserName'), 'owner@app.com')

WebUI.sendKeys(findTestObject('Login/Page_Login/password'), '12345678')

WebUI.click(findTestObject('Login/Page_Login/Sign In'))

WebUI.verifyElementVisible(findTestObject('Login/Page_Home/CheckTheHomePageTitle'))

WebUI.click(findTestObject('Course/Page_Home/ClickOnSettings'))

WebUI.click(findTestObject('Course/Page_Home/Courses'))

WebUI.click(findTestObject('Object Repository/Course/CourseDetailsOption/CloseSettingPage'))

WebUI.click(findTestObject('Object Repository/Course/CourseDetailsOption/ThreeDots'))

WebUI.click(findTestObject('Object Repository/Course/CourseDetailsOption/Update'))

WebUI.sendKeys(findTestObject('Object Repository/Course/Page_Courses/Course Description (EN'), 'EnglishText')

WebUI.sendKeys(findTestObject('Course/Page_Courses/Course Description (AR)'), 'ArabicText')

WebUI.click(findTestObject('Course/Page_Courses/button_Update'))

WebUI.closeBrowser()

