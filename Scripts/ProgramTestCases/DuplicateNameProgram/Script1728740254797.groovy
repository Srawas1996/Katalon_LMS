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


WebUI.click(findTestObject('Course/Page_Home/ClickOnSettings'))

WebUI.click(findTestObject('Program/Page_Home/Program'))

WebUI.click(findTestObject('Program/Page_Programs/ClickOnPlusSign'))

WebUI.sendKeys(findTestObject('Program/Page_Programs/English Name'), 'dddd')

WebUI.sendKeys(findTestObject('Program/Page_Programs/Arabic Name'), 'dddd')

WebUI.click(findTestObject('Program/Page_Programs/Program Type'))

WebUI.click(findTestObject('Program/Page_Programs/National'))

WebUI.sendKeys(findTestObject('Program/Page_Programs/Countries_Program'), 'Jordan')

WebUI.click(findTestObject('Program/Page_Programs/Jordan'))

WebUI.click(findTestObject('Program/Page_Programs/Create_Button'))

WebUI.verifyElementVisible(findTestObject('Program/Page_Programs/The name dddd in ar language is already taken'))

WebUI.verifyElementVisible(findTestObject('Program/Page_Programs/The name dddd in en language is already taken'))