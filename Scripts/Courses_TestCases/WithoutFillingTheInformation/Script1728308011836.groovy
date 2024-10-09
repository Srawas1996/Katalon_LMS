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

WebUI.setEncryptedText(findTestObject('Login/Page_Login/password'), 'RigbBhfdqOBGNlJIWM1ClA==')

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

WebUI.click(findTestObject('Course/Page_Add Courses/button_Finish'))

WebUI.verifyElementText(findTestObject('Course/WithoutFillingTheData/Subject Is Requierd'), 'The Subjects field is required.')

WebUI.click(findTestObject('Course/Page_Add Courses/Choose Subjects'))

WebUI.click(findTestObject('Course/Page_Add Courses/Math'))

WebUI.click(findTestObject('Course/Page_Add Courses/Click On Course Subject'))

WebUI.click(findTestObject('Course/Page_Add Courses/Click on Math Subject'))

WebUI.click(findTestObject('Course/Page_Add Courses/button_Finish'))

WebUI.verifyElementText(findTestObject('Course/WithoutFillingTheData/Choose Course Point (0 - 100)'), 'Choose Course Point (0 - 100%)')

WebUI.verifyElementText(findTestObject('Course/WithoutFillingTheData/The Group field is required'), 'The Group field is required.')

WebUI.verifyElementText(findTestObject('Course/WithoutFillingTheData/The Group Type field is required'), 'The Group Type field is required.')

WebUI.verifyElementText(findTestObject('Course/WithoutFillingTheData/The Teacher field is required'), 'The Teacher field is required.')

WebUI.closeBrowser()

