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

Mobile.startApplication('C:\\Users\\anjaneyulu.s\\Desktop\\Android NC Api\\india.com_v1.2.0.apk', true)

Mobile.tap(findTestObject('User_Share_App/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.TextView0 - LOGIN'), 0)

Mobile.setText(findTestObject('User_Share_App/android.widget.EditText0 - Email ID'), 'anjaneyulu.s@zee.esselgroup.com', 
    0)

Mobile.setText(findTestObject('User_Share_App/android.widget.EditText0 - Password'), 'Anji@17081994', 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.TextView0 - LOGIN (1)'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.TextView0 - Settings'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.TextView0 - Share app'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.ImageView0'), 0)

Mobile.setText(findTestObject('User_Share_App/android.widget.MultiAutoCompleteTextView0'), 'anjaneyulu.sangisetti@gmail.com', 
    0)

Mobile.setText(findTestObject('User_Share_App/android.widget.EditText0 - Subject'), 'Hiiiiiiiiiiii plsssssssssssssss helloooooooooooooooo', 
    0)

Mobile.tap(findTestObject('User_Share_App/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.LinearLayout0'), 0)

Mobile.tap(findTestObject('User_Share_App/android.widget.TextView0 - Yes'), 0)

Mobile.closeApplication()

