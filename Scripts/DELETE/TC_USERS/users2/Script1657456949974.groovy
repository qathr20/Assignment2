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

respon1 = WS.sendRequest(findTestObject('DELETE/users/id'))

WS.verifyResponseStatusCode(respon1, 200, FailureHandling.STOP_ON_FAILURE)
assert respon1.getStatusCode()== 200
WS.verifyElementPropertyValue(respon1, 'id', '2')
WS.verifyElementPropertyValue(respon1, 'name', 'Ervin Howell')
WS.verifyElementPropertyValue(respon1, 'username', 'Antonette')
WS.verifyElementPropertyValue(respon1, 'email', 'Shanna@melissa.tv')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Victor Plains')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 879')
WS.verifyElementPropertyValue(respon1, 'city', 'Wisokyburgh')
WS.verifyElementPropertyValue(respon1, 'zipcode', '90566-7771')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-43.9509')
WS.verifyElementPropertyValue(respon1, 'lng', '-34.4618')
WS.verifyElementPropertyValue(respon1, 'phone', '010-692-6593 x09125')
WS.verifyElementPropertyValue(respon1, 'website', 'anastasia.net')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Deckow-Crist')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Proactive didactic contingency')
WS.verifyElementPropertyValue(respon1, 'bs', 'synergize scalable supply-chains')