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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebElement as Keys



WebUI.click(findTestObject('Course/Page_Home/ClickOnSettings'))

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Home/Academic Years'))

//WebUI.click(findTestObject('AcademicYear/Page_Academic Years/SelectFirstBulkAcademicYear'))
List<WebElement> checkboxes = driver.findElements(By.xpath("//button[@value='on']"))

// Generate a random number of selections or define how many checkboxes you want to select
Random rand = new Random()
int numToSelect = rand.nextInt(checkboxes.size()) +1

for (int i = 0; i < numToSelect && i < checkboxes.size()-1; i++) {
	checkboxes.get(i+1).click() // Click on the checkboxes
}

// Verify the number of elements in the list (if applicable)
WebUI.verifyElementText(findTestObject('AcademicYear/Page_Academic Years/NumberOfElementInTheList'), numToSelect.toString())
