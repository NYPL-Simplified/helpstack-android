package com.example.helpstackexample;

import android.app.Application;

import com.tenmiles.helpstack.HSHelpStack;
import com.tenmiles.helpstack.gears.HSDeskGear;
import com.tenmiles.helpstack.gears.HSEmailGear;
import com.tenmiles.helpstack.gears.HSHappyfoxGear;

public class HSApplication extends Application {

	HSHelpStack helpStack;

	@Override
	public void onCreate() {
		super.onCreate();

		helpStack = HSHelpStack.getInstance(this);

		HSDeskGear deskGear =
				new HSDeskGear("URL","email@email.com","email@email.com","password","brandId");
		helpStack.setGear(deskGear);
	}
}
