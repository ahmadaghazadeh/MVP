package ahmad.aghazadeh.mvp.fragment.login;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextWatcher;

import ahmad.aghazadeh.mvp.BR;
import ahmad.aghazadeh.mvp.binding.SimpleTextWatcher;

/**
 * Created by 890683 on 1/19/2016.
 */
public class LoginModelView extends BaseObservable implements ILoginView {



    String userName;
    String password;
    boolean isLoading;
    boolean isNotification = false;


    @Bindable
    public CharSequence getPassword() {
        return password;
    }

    @Bindable
    public CharSequence getUserName() {
        return userName;
    }

    @Bindable
    public boolean isLoading() {
        return isLoading;
    }


    public TextWatcher getOnUsernameChanged() {

        return new SimpleTextWatcher() {
            @Override
            public void onTextChanged(String newValue) {
                userName=newValue;
                notifyPropertyChanged(BR.userName);
            }
        };
    }


    public TextWatcher getOnPasswordChanged() {

        return new SimpleTextWatcher() {
            @Override
            public void onTextChanged(String newValue) {
                password=newValue;
                notifyPropertyChanged(BR.password);
            }
        };
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void navigateToHome() {

    }
}
