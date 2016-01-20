package ahmad.aghazadeh.mvp.fragment.login;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import ahmad.aghazadeh.mvp.R;
import ahmad.aghazadeh.mvp.databinding.ActivityMainBinding;


/**
 * Created by 890683 on 1/19/2016.
 */

public  abstract class LoginPresenter extends Fragment implements ILoginHandler {


    ActivityMainBinding binding;
    public LoginModelView loginModelView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,
                R.layout.activity_main,
                container,
                false);

        binding.setModel(loginModelView = new LoginModelView());
        binding.setHandler(this);
        return binding.getRoot();
    }

    @Override
    public void onClickLogin(View view) {
        if (loginModelView.getUserName().length() <= 3) {
            loginModelView.setUsernameError();
            return;
        }

        if (loginModelView.getPassword().length() <= 6) {
            loginModelView.setPasswordError();
            return;
        }

        login(loginModelView.getUserName(),loginModelView.getPassword());
    }

    @Override
    public abstract void onClickForgetPassword(View v)  ;

    @Override
    public abstract void login(CharSequence user, CharSequence pass);


}

