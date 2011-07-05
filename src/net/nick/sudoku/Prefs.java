package net.nick.sudoku;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Prefs extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle saved){
		super.onCreate(saved);
		addPreferencesFromResource(R.xml.settings);
	}

}
