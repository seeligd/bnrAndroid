package net.dseelig.criminalintent;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.app.FragmentManager;

import net.dseelig.crimintalintent.R;


public class CrimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null){
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }


}
