package customKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Keywords {

	@Keyword
	public void mLogin(String emailID, String password) {
		Mobile.startApplication('C:\\Users\\anjaneyulu.s\\Desktop\\Android NC Api\\app-production-debug.apk', true)
		Thread.sleep(40000);
		Mobile.tap(findTestObject('User_Login/android.widget.TextView0 - NEXT'), 0)

		Mobile.tap(findTestObject('User_Login/android.widget.TextView0 - LOGIN'), 0)

		Mobile.setText(findTestObject('User_Login/android.widget.EditText0 - Email ID'), emailID, 0)

		Mobile.setText(findTestObject('User_Login/android.widget.EditText0 - Password'), password, 0)

		Mobile.tap(findTestObject('User_Login/android.widget.ImageButton0'), 0)

		Mobile.tap(findTestObject('User_Login/android.widget.TextView0 - LOGIN (1)'), 0)
	}


	@Keyword
	public void mReg(String email, String mNumber) {

		Mobile.startApplication('C:\\Users\\anjaneyulu.s\\Desktop\\Android NC Api\\app-production-debug.apk', true)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - NEXT'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - SIGNUP'), 0)

		Mobile.setText(findTestObject('Signup/android.widget.EditText0 - First Name'), 'Anji', 0)

		Mobile.setText(findTestObject('Signup/android.widget.EditText0 - Last Name'), 'Sangisetti', 0)

		Mobile.setText(findTestObject('Signup/android.widget.EditText0 - Email ID'), email, 0)

		Mobile.setText(findTestObject('Signup/android.widget.EditText0 - Mobile No'), 91.toString() + mNumber.toString(), 10)

		Mobile.setText(findTestObject('Signup/android.widget.EditText0 - Choose password (Min 6 chars)'), '12345678', 0)

		Mobile.tap(findTestObject('Signup/android.widget.ImageButton0'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.RadioButton0 - Male'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - SIGNUP (1)'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - Reading'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - NEXT (1)'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.Switch0 - Off'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - DONE'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - CONFIRM LOCATION'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.FrameLayout0'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.LinearLayout0'), 0)

		Mobile.tap(findTestObject('Signup/android.widget.TextView0 - Yes'), 0)
	}
	@Keyword
	public void mLogout() {
		Mobile.tap(findTestObject('User_Login/android.widget.FrameLayout0'), 0)

		Mobile.tap(findTestObject('User_Login/android.widget.LinearLayout0'), 0)

		Mobile.tap(findTestObject('User_Login/android.widget.TextView0 - Yes'), 0)
	}


	@Keyword
	public void closeApp() {
		Mobile.closeApplication()
	}
	}
