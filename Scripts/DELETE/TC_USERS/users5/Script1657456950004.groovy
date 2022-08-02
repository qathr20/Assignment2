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
WS.verifyElementPropertyValue(respon1, 'id', '5')
WS.verifyElementPropertyValue(respon1, 'name', 'Chelsey Dietrich')
WS.verifyElementPropertyValue(respon1, 'username', 'Kamren')
WS.verifyElementPropertyValue(respon1, 'email', 'Lucio_Hettinger@annie.ca')
WS.verifyElementPropertyValue(respon1, 'address')
WS.verifyElementPropertyValue(respon1, 'street', 'Skiles Walks')
WS.verifyElementPropertyValue(respon1, 'suite', 'Suite 351')
WS.verifyElementPropertyValue(respon1, 'city', 'Roscoeview')
WS.verifyElementPropertyValue(respon1, 'zipcode', '33263')
WS.verifyElementPropertyValue(respon1, 'geo')
WS.verifyElementPropertyValue(respon1, 'lat', '-31.8129')
WS.verifyElementPropertyValue(respon1, 'lng', '62.5342')
WS.verifyElementPropertyValue(respon1, 'phone', '(254)954-1289')
WS.verifyElementPropertyValue(respon1, 'website', 'demarco.info')
WS.verifyElementPropertyValue(respon1, 'company')
WS.verifyElementPropertyValue(respon1, 'name', 'Keebler LLC')
WS.verifyElementPropertyValue(respon1, 'catchPhrase', 'User-centric fault-tolerant solution')
WS.verifyElementPropertyValue(respon1, 'bs', 'revolutionize end-to-end systems')