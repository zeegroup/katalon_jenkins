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

Mobile.startApplication(GlobalVariable.apk, true)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - LOGIN'), 0)

Mobile.setText(findTestObject('User_Edit_Location/android.widget.EditText0 - Email ID'), 'sudheer@mailnesia.com', 0)

Mobile.setText(findTestObject('User_Edit_Location/android.widget.EditText0 - Password'), '1234567', 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - LOGIN (1)'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - Account'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - Location'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - EDIT LOCATION'), 0)

Mobile.setText(findTestObject('User_Edit_Location/android.widget.EditText0 - HOUSEFLAT.NO'), 'Near Kondapur Flot no 6_155/A', 0)

Mobile.setText(findTestObject('User_Edit_Location/android.widget.EditText0 - LANDMARK'), 'Near RDO office ', 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - SAVE AND PROCEED'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - CONFIRM LOCATION'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('User_Edit_Location/android.widget.TextView0 - Yes'), 0)

Mobile.closeApplication()

