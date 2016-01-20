package ahmad.aghazadeh.mvp.fragment.login;

/**
 * Created by 890683 on 1/19/2016.
 */
public interface ILoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();

 }
