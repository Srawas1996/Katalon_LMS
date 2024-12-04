import internal.GlobalVariable

import internal.GlobalVariable

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

WebUI.click(findTestObject('Object Repository/AcademicYear/Page_Home/Academic Years'))

WebUI.click(findTestObject('AcademicYear/Page_Academic Years/ThreeDotsAcademicYear'))

WebUI.click(findTestObject('Semester/Semesters from Academic year'))

WebUI.click(findTestObject('Semester/Plus sign'))

WebUI.click(findTestObject('Semester/Create Semester'))

WebUI.verifyElementText(findTestObject('Semester/English Name is required'), GlobalVariable.Name_Is_Required)

WebUI.verifyElementText(findTestObject('Semester/Arabic Name is required'), GlobalVariable.Arabic_Name_Is_Required)

WebUI.verifyElementText(findTestObject('Semester/Date Range is Required - start date'), GlobalVariable.Date_Range_is_Required)

WebUI.click(findTestObject('Semester/Start Date Semester'))

// Start Date Select
WebUI.click(findTestObject('Semester/Start Date/Start date month'))

WebUI.click(findTestObject('Semester/Start Date/Start Date Month Select'))

WebUI.click(findTestObject('Semester/Start Date/Start Date year'))

WebUI.click(findTestObject('Semester/Start Date/Start Date Year Select'))

WebUI.click(findTestObject('Semester/Start Date/Start date Day Select'))

WebUI.click(findTestObject('Semester/Create Semester'))

WebUI.verifyElementNotPresent(findTestObject('Semester/Date Range is Required - start date'), 0)

WebUI.verifyElementText(findTestObject('Semester/Date Range is Required - end date'), GlobalVariable.Date_Range_is_Required)

//End Date Select

WebUI.click(findTestObject('Semester/End Date Semester'))

WebUI.click(findTestObject('Semester/End Date/End Date - Month'))

WebUI.click(findTestObject('Semester/End Date/End Date - Month Select'))

WebUI.click(findTestObject('Semester/End Date/End Date - year'))

WebUI.click(findTestObject('Semester/End Date/End Date - Year Select'))

WebUI.click(findTestObject('Semester/End Date/End Date - Day Select'))

WebUI.click(findTestObject('Semester/Create Semester'))

WebUI.verifyElementNotPresent(findTestObject('Semester/Date Range is Required - end date'), 0)

WebUI.verifyElementText(findTestObject('Semester/Date Range is Required - actual start date'), GlobalVariable.Date_Range_is_Required)

// Actual Start Date Select
WebUI.click(findTestObject('Semester/Actual Start date Semester'))

WebUI.click(findTestObject('Semester/Actual Start Date/Actual Start Date Month'))

WebUI.click(findTestObject('Semester/Actual Start Date/Actual Start Date - Month Select'))

WebUI.click(findTestObject('Semester/Actual Start Date/Actual Start Date Year'))

WebUI.click(findTestObject('Semester/Actual Start Date/Actual Start Date - Year Select'))

WebUI.click(findTestObject('Semester/Actual Start Date/Actual Start Date - Day Select'))

WebUI.click(findTestObject('Semester/Create Semester'))

WebUI.verifyElementNotPresent(findTestObject('Semester/Date Range is Required - actual start date'), 0)

WebUI.verifyElementText(findTestObject('Semester/Date Range is Required - actual end date'), GlobalVariable.Date_Range_is_Required)

// Actual End Date Select
WebUI.click(findTestObject('Semester/Actual End date Semester'))

WebUI.delay(5)

WebUI.click(findTestObject('Semester/Actual End Date/Actual End Date - month'))

WebUI.click(findTestObject('Semester/Actual End Date/Actual End date - month Select'))

WebUI.click(findTestObject('Semester/Actual End Date/Actual End Date - year'))

WebUI.click(findTestObject('Semester/Actual End Date/Actaul End Date - Year Select'))

WebUI.click(findTestObject('Semester/Actual End Date/Actual End Date - Day Select'))

WebUI.click(findTestObject('Semester/Create Semester'))

WebUI.verifyElementNotPresent(findTestObject('Semester/Date Range is Required - actual end date'), 0)

