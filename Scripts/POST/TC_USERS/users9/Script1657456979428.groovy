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

respon1 = WS.sendRequest(findTestObject('POST/users'))

WS.verifyResponseStatusCode(respon1, 201, FailureHandling.STOP_ON_FAILURE)
assert respon1.getStatusCode()== 201
WS.verifyElementPropertyValue(respon1, 'name', 'Glessa Reichert')
WS.verifyElementPropertyValue(respon1, 'username', 'Daphne')
WS.verifyElementPropertyValue(respon1, 'email', 'Chaim_McDonald@dana.io')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Diana Park')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 567')
WS.verifyElementPropertyValue(respon1, 'city', 'Bartholo')
WS.verifyElementPropertyValue(respon1, 'zipcode', '76495-3107')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '24.6464')
WS.verifyElementPropertyValue(respon1, 'lng', '-168.8880')
WS.verifyElementPropertyValue(respon1, 'phone', '(775)976-6794 x41207')
WS.verifyElementPropertyValue(respon1, 'website', 'Daniel.com')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Dan and Nad')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Switchable project')
WS.verifyElementPropertyValue(respon1, 'bs', 'aggregate technologies')