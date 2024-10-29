import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class Testlistener {
	/**
	 * Executes before every test case starts.
	 * @param testCaseContext related information of the executed test case.
	 */
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		
		String testCaseId = testCaseContext.getTestCaseId()
		
		// If the test case is 'Invalid Login', skip the setup
		if (!testCaseId.contains('InvalidLogin')) {
			// Common setup actions for all other tests
			println "Executing common setup for Test Case: " + testCaseId
			WebUI.openBrowser('https://dev-lms-frontend.joacademy.tech/')
			WebUI.maximizeWindow()
			WebUI.deleteAllCookies()
			
			WebUI.sendKeys(findTestObject('Login/Page_Login/UserName'), 'owner@app.com')
			
			WebUI.sendKeys(findTestObject('Login/Page_Login/password'), '12345678')
			
			WebUI.click(findTestObject('Login/Page_Login/Sign In'))
		} else {
			println "Skipping setup for Test Case: " + testCaseId
		}

		
	}

	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def sampleAfterTestCase(TestCaseContext testCaseContext) {
		WebUI.closeBrowser()
	}
	
}