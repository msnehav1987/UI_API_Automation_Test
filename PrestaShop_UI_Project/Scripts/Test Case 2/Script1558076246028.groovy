import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Open web site to test'
WebUI.openBrowser(GlobalVariable.baseURLTest)

'Wait for iFrame loaded'
WebUI.waitForElementPresent(findTestObject('Page Main/Page iFrame/iFrameLive'), 5)

'Navigate to iFrame'
WebUI.switchToFrame(findTestObject('Page Main/Page iFrame/iFrameLive'), 5)

'Hover the mouse over the ACCESSORIES menu item'
WebUI.mouseOver(findTestObject('Page Main/Page Accessories/Accessories Menu Item'))

'Click on HOME ACCESSORIES sub-menu item'
WebUI.click(findTestObject('Page Main/Page Accessories/Home Accessories Menu Item'))

'Wait for all products of HOME ACCESSORIES loaded'
WebUI.waitForElementPresent(findTestObject('Page Main/Page Accessories/sectionProducts'), 5)

'Verify HOME ACCESSORIES page is opened'
WebUI.verifyElementPresent(findTestObject('Page Main/Page Accessories/h1HomeAccessories'), 5)

'Verify the list of available products dislayed'
WebUI.verifyElementPresent(findTestObject('Page Main/Page Accessories/sectionProducts'), 5)

'Go out of iFrame'
WebUI.switchToDefaultContent()

'Close browser'
WebUI.closeBrowser()
