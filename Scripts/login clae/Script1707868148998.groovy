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

Mobile.startApplication('C:\\Users\\ASUS\\Downloads\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/login/android.widget.TextView - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/login/username tap'), 0)

Mobile.setText(findTestObject('Object Repository/login/input username'), 'clae12', 0)

Mobile.tap(findTestObject('Object Repository/login/password tap'), 0)

Mobile.setText(findTestObject('Object Repository/login/input password'), '1234!aA', 0)

Mobile.tap(findTestObject('Object Repository/login/android.widget.Button - LOGIN'), 0)

def waitTime = 10 

//if (Mobile.verifyElementNotExist(findTestObject('Object Repository/login/uname pass incorrect'), waitTime)) {
//	println("Username atau password salah!")
//} else if (Mobile.verifyElementVisible(findTestObject('Object Repository/login/loggin yes'), waitTime)) {
//	println("Login berhasil!")
//	Mobile.tap(findTestObject('Object Repository/login/loggin yes'), 0)
//	Mobile.tap(findTestObject('Object Repository/login/home'), 0)
//} else {
//	println("Element untuk login berhasil tidak ditemukan!")
//	}

	
if (Mobile.waitForElementPresent(findTestObject('Object Repository/login/uname pass incorrect'), waitTime, FailureHandling.OPTIONAL)) {
		println("Username atau password salah!")
	} else {
		println("Login berhasil!")
		Mobile.tap(findTestObject('Object Repository/login/loggin yes'), 0)
		Mobile.tap(findTestObject('Object Repository/login/home'), 0)
	}
	
//def waitTime = 20// Waktu tunggu dalam detik
//
//// Menunggu untuk memastikan elemen username/pass salah tidak ditemukan
//if (!Mobile.verifyElementVisible(findTestObject('Object Repository/login/loggin yes'), waitTime)) {
//	// Jika elemen username/pass salah tidak ditemukan, lanjutkan ke langkah berikutnya
//		Mobile.tap(findTestObject('Object Repository/login/loggin yes'), 0)
//		Mobile.tap(findTestObject('Object Repository/login/home'), 0)
//	if (Mobile.verifyElementVisible(findTestObject('Object Repository/login/uname pass incorrect'), waitTime)) {
//		println("Username atau password salah!")
//	} else {
//		println("Element untuk login berhasil tidak ditemukan!")
//	}
//} 



//// Menunggu untuk memastikan elemen username/pass salah tidak ditemukan
//if (!Mobile.verifyElementVisible(findTestObject('Object Repository/login/uname pass incorrect'), waitTime)) {
//	// Jika elemen username/pass salah tidak ditemukan, lanjutkan ke langkah berikutnya
//	if (Mobile.verifyElementVisible(findTestObject('Object Repository/login/loggin yes'), waitTime)) {
//		println("Login berhasil!")
//		Mobile.tap(findTestObject('Object Repository/login/loggin yes'), 0)
//		Mobile.tap(findTestObject('Object Repository/login/home'), 0)
//	} else {
//		println("Element untuk login berhasil tidak ditemukan!")
//	}
//} else {
//	println("Username atau password salah!")
//}


//if ((Mobile.verifyElementVisible(findTestObject('Object Repository/login/uname pass incorrect'), 0) == true)) {
//	println("Username atau password salah!")
//} else{
//	Mobile.verifyElementVisible(findTestObject('Object Repository/login/loggin yes'), 0) == true 
//	println("Login berhasil!")
//	Mobile.tap(findTestObject('Object Repository/login/loggin yes'), 0)
//	Mobile.tap(findTestObject('Object Repository/login/home'), 0)
//	}

	
	


//if ((Mobile.verifyElementExist(findTestObject('Object Repository/login/loggin yes'), 0) == true )) {
//	println("Login berhasil!")
//
//	//Mobile.tap(findTestObject('Object Repository/login/android.widget.Button - LOGIN'), 0)
//	Mobile.tap(findTestObject('Object Repository/login/loggin yes'), 0)
//	Mobile.tap(findTestObject('Object Repository/login/home'), 0)
//}else {
//	Mobile.verifyElementExist(findTestObject('Object Repository/login/uname pass incorrect'), 0)
//	println("Username atau password salah!")
