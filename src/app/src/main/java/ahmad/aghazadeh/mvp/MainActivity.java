package ahmad.aghazadeh.mvp;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ahmad.aghazadeh.mvp.fragment.login.LoginFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, new LoginFragment())
                .commit();

    }
}
