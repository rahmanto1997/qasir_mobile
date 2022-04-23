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

Mobile.startExistingApplication('com.innovecto.etalastic')

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.RadioButton - English'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.Button - Next'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.Button - Log In'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.Button - SAAT APLIKASINYA DIGUNAKAN'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.Button - IZINKAN'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.EditText'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.TextView - Indonesia'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.EditText - Phone Number'), 0)

Mobile.sendKeys(findTestObject('Object Repository/qasir_mobile/android.widget.EditText - Phone Number (1)'), '89635901289')

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.EditText - PIN'), 0)

Mobile.sendKeys(findTestObject('Object Repository/qasir_mobile/android.widget.EditText - PIN (1)'), '010597')

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.Button - SAAT APLIKASINYA DIGUNAKAN (1)'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.Button - Select Outlet'), 0)

Mobile.tap(findTestObject('Object Repository/qasir_mobile/android.widget.ImageView (2)'), 0)

Mobile.closeApplication()

