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

WS.verifyResponseStatusCode(respon1, 200, FailureHandling.STOP_ON_FAILURE)
assert respon1.getStatusCode()== 200
WS.verifyElementPropertyValue(respon1, 'name', 'Dennis Schulist')
WS.verifyElementPropertyValue(respon1, 'username', 'Leopoldo_Cery')
WS.verifyElementPropertyValue(respon1, 'email', 'Karley_Dahn@jasper.info')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Nora Crossing')
WS.verifyElementPropertyValue(respon1, 'suite', 'Apt. 007')
WS.verifyElementPropertyValue(respon1, 'city', 'South Creamy')
WS.verifyElementPropertyValue(respon1, 'zipcode', '23505-1330')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-71.4198')
WS.verifyElementPropertyValue(respon1, 'lng', '71.7479')
WS.verifyElementPropertyValue(respon1, 'phone', '1-477-935-8478 x6830')
WS.verifyElementPropertyValue(respon1, 'website', 'olahan.org')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Considine-Daniel')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'Synchronised interface')
WS.verifyElementPropertyValue(respon1, 'bs', 'innovative applications')