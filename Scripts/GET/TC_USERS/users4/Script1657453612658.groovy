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

respon1 = WS.sendRequest(findTestObject('GET/users'))

WS.verifyResponseStatusCode(respon1, 200, FailureHandling.STOP_ON_FAILURE)
assert respon1.getStatusCode()== 200
WS.verifyElementPropertyValue(respon1, 'id', '4')
WS.verifyElementPropertyValue(respon1, 'name', 'Patricia Lebsack')
WS.verifyElementPropertyValue(respon1, 'username', 'Karianne')
WS.verifyElementPropertyValue(respon1, 'email', 'Julianne.OConner@kory.org')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Hoeger Mall')
WS.verifyElementPropertyValue(respon1, 'suite', 'Apt. 692')
WS.verifyElementPropertyValue(respon1, 'city', 'South Elvis')
WS.verifyElementPropertyValue(respon1, 'zipcode', '53919-4257')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '29.4572')
WS.verifyElementPropertyValue(respon1, 'lng', '-164.2990')
WS.verifyElementPropertyValue(respon1, 'phone', '493-170-9623 x156')
WS.verifyElementPropertyValue(respon1, 'website', 'kale.biz')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Robel-Corkery')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Multi-tiered zero tolerance productivity')
WS.verifyElementPropertyValue(respon1, 'bs', 'transition cutting-edge web services')