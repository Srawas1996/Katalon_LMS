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

WebUI.click(findTestObject('Blooms/Page_Home/Blooms Taxonomy'))

WebUI.sendKeys(findTestObject('Object Repository/Blooms/Page_Blooms Taxonomy/BloomSearch'), "My Blooms")

WebUI.verifyElementVisible(findTestObject('Object Repository/Blooms/Page_Blooms Taxonomy/No Data is found'))

WebUI.click(findTestObject('Object Repository/Blooms/Page_Blooms Taxonomy/button_Reset'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Blooms/Page_Blooms Taxonomy/BloomThreeDots'))

WebUI.sendKeys(findTestObject('Object Repository/Blooms/Page_Blooms Taxonomy/BloomSearch'), "Salim")

WebUI.delay(20)

WebUI.verifyElementVisible(findTestObject('Object Repository/Blooms/Page_Blooms Taxonomy/BloomThreeDots'))
