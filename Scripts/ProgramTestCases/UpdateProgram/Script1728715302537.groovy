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

WebUI.click(findTestObject('SideBarClick/SlideTheSttingBar'))

WebUI.click(findTestObject('Object Repository/Program/Page_Programs/ThreeDotsFromProgram'))

WebUI.click(findTestObject('Object Repository/Program/Page_Programs/Update_Button'))

WebUI.sendKeys(findTestObject('Program/Page_Programs/UpdateEnglishName'), 'UpdateTest1')

WebUI.sendKeys(findTestObject('Program/Page_Programs/UpdateArabicName'), 'تعديل اختبار 1')

WebUI.click(findTestObject('Program/Page_Programs/UpdateProgramType'))

WebUI.click(findTestObject('Program/Page_Programs/International'))

WebUI.click(findTestObject('Program/Page_Programs/RemoveContryFromProgram'))

WebUI.click(findTestObject('Program/Page_Programs/button_Update'))

WebUI.verifyElementClickable(findTestObject('Program/Page_Programs/ThreeDotsFromProgram'))