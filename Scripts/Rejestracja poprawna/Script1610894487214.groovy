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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://profil.wp.pl/login.html?zaloguj=poczta')

WebUI.click(findTestObject('Object Repository/Page_Poczta - Najlepsza Poczta, najwiksze z_b55023/a_Za konto'))

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Imi_4dc6f2c8-3d36-1ac4-37ba-65f7323680b6'), 
    'Jan')

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Nazwisko_c955c580-0a04-0422-da39-d93c_4988df'), 
    'Kowaslki')

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/label_Mczyzna'))

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Dzie_day'), '21')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Za konto w WP Poczcie/select_MiesicStyczeLutyMarzecKwiecieMajCzer_3573e7'), 
    '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Za konto w WP Poczcie/select_Rok202120202019201820172016201520142_d522cf'), 
    '1994', true)

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Wybierz login_46977f7e-bffe-7772-f8d6_b700cd'), 
    Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Haso_password'), '9KzOjDimb7zsqjjOXXaQnQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Powtrz haso_rePassword'), '9KzOjDimb7zsqjjOXXaQnQ==')

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_To najbezpieczniejszy sposb odzyskani_af8bc3'), 
    '600 600 601')

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/label_Konto bezpatne'))

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/strong_Zaznacz wszystkie ponisze'))

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/button_Za konto'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/a_Zaloguj si do WP Poczty'))

