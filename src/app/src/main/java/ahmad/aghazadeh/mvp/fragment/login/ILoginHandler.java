package ahmad.aghazadeh.mvp.fragment.login;

import android.view.View;

/**
 * Created by 890683 on 1/19/2016.
 */
public interface ILoginHandler {

    void onClickLogin(View view);

    void onClickForgetPassword(View v);

    void login(CharSequence user,CharSequence pass);

}
