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

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - NEXT'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - LOGIN'), 0)

Mobile.setText(findTestObject('User_End_To_End_Flow/android.widget.EditText0 - Email ID'), 'sudheer@mailnesia.com', 
    0)

Mobile.setText(findTestObject('User_End_To_End_Flow/android.widget.EditText0 - Password'), '1234567', 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - LOGIN (1)'), 0)

Thread.sleep(30000);

Mobile.tap(findTestObject('User_Chat/android.widget.FrameLayout0'), 0)

Mobile.tap(findTestObject('User_Chat/android.widget.LinearLayout0'), 0)


//Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.FrameLayout0'), 0)

//Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.LinearLayout0'), 0)

Mobile.setText(findTestObject('User_End_To_End_Flow/android.widget.EditText0'), 'Hiiiiii hello ', 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.FrameLayout0 (1)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.LinearLayout0 (1)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - NEXT (1)'), 0)

Mobile.setText(findTestObject('User_End_To_End_Flow/android.widget.EditText0 - Subject'), 'I love you the more in that I believe you had liked me for my own sake and for nothing else.But man is not made for defeat. A man can be destroyed but not defeated', 
    0)

Mobile.setText(findTestObject('User_End_To_End_Flow/android.widget.EditText0 - Message'), 'When you reach the end of your rope, tie a knot in it and hang on.Let us sacrifice our today so that our children can have a better tomorrow.The most difficult thing is the decision to act, the rest is merely tenacity. The fears are paper tigers. You can do anything you decide to do. You can act to change and control your life; and the procedure, the process is its own reward', 
    0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - NEXT (2)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - POST'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.FrameLayout0 (2)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - View All'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.ImageButton0 (2)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.FrameLayout0 (3)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.LinearLayout0 (2)'), 0)

//Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - Share app'), 0)

//Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.ImageView0 (1)'), 0)

//Mobile.setText(findTestObject('User_End_To_End_Flow/android.widget.MultiAutoCompleteTextView0'), 'sudheer@mailnesia.com',    0)

//Mobile.setText(findTestObject('User_End_To_End_Flow/android.widget.EditText0 - Subject (1)'), 'Neighbhourhood app pls install ',     0)

//Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.ImageView0 (2)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.LinearLayout0 (3)'), 0)

Mobile.tap(findTestObject('User_End_To_End_Flow/android.widget.TextView0 - Yes'), 0)

Mobile.closeApplication()

