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



WebUI.click(findTestObject('Course/Page_Home/ClickOnSettings'))

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Home/Academic Years'))

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Academic Years/PlusSignAcademicYear'))

WebUI.sendKeys(findTestObject('AcademicYear/Creating Page Element/Arabic Name'), 'فحص الاوتوميشن')

WebUI.sendKeys(findTestObject('AcademicYear/Creating Page Element/English Name'), 'asdy')

WebUI.click(findTestObject('AcademicYear/StartDate Select/StartDate'))

WebUI.click(findTestObject('AcademicYear/StartDate Select/SelectDay'))

WebUI.click(findTestObject('AcademicYear/EndDate Select/End Date'))

WebUI.click(findTestObject('AcademicYear/EndDate Select/Select Day'))

WebUI.click(findTestObject('AcademicYear/Page_Academic Years/Create Button'))

WebUI.verifyElementText(findTestObject('Object Repository/AcademicYear/OverLap_DuplicateNameValidations/The date range overlaps with an existing record'), "The date range overlaps with an existing record.")