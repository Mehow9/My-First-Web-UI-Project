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

WebUI.click(findTestObject('Object Repository/Page_Poczta - Najlepsza Poczta, najwiksze z_b55023/a_Za konto (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Nazwisko_3a474b5c-fa22-c716-94af-b12d_e16812'), 
    'Kowalski')

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/label_Mczyzna (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Dzie_day (1)'), '21')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Za konto w WP Poczcie/select_MiesicStyczeLutyMarzecKwiecieMajCzer_3573e7 (1)'), 
    '04', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Za konto w WP Poczcie/select_Rok202120202019201820172016201520142_d522cf (1)'), 
    '1994', true)

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Wybierz login_86da53a4-b7bc-fba6-ade7_37f5df'), 
    Username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Haso_password (1)'), '9KzOjDimb7zsqjjOXXaQnQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_Powtrz haso_rePassword (1)'), 
    '9KzOjDimb7zsqjjOXXaQnQ==')

WebUI.setText(findTestObject('Object Repository/Page_Za konto w WP Poczcie/input_To najbezpieczniejszy sposb odzyskani_af8bc3 (1)'), 
    '600 600 602')

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/label_Konto bezpatne (1)'))

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/strong_Zaznacz wszystkie ponisze (1)'))

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/button_Za konto (1)'))

WebUI.click(findTestObject('Object Repository/Page_Za konto w WP Poczcie/li_Prosz wpisa poprawne imi'))

