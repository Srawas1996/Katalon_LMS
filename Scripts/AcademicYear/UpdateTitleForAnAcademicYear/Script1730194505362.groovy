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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebElement as Keys

WebUI.click(findTestObject('Course/Page_Home/ClickOnSettings'))

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Home/Academic Years'))

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Academic Years/ThreeDotsAcademicYear'))


WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Academic Years/Update'))

String EnglishName = WebUI.getAttribute(findTestObject('Object Repository/AcademicYear/Creating Page Element/English Name'), 'value')

println(EnglishName)

WebUI.delay(3)

WebUI.clearText(findTestObject('Object Repository/AcademicYear/Creating Page Element/English Name'))

WebUI.setText(findTestObject('Object Repository/AcademicYear/Creating Page Element/English Name'),"Update " + EnglishName)

String ArabicName = WebUI.getAttribute(findTestObject('Object Repository/AcademicYear/Creating Page Element/Arabic Name'), 'value')

println(ArabicName)

WebUI.delay(3)

WebUI.clearText(findTestObject('Object Repository/AcademicYear/Creating Page Element/Arabic Name'))

WebUI.setText(findTestObject('Object Repository/AcademicYear/Creating Page Element/Arabic Name'),"Update " + ArabicName)

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Academic Years/button_Update'))

WebUI.verifyElementClickable(findTestObject('Object Repository/AcademicYear/Page_Academic Years/ThreeDotsAcademicYear'))
