package ahmad.aghazadeh.mvp.fragment.login;

import android.view.View;
import android.widget.Toast;

/**
 * Created by 890683 on 1/20/2016.
 */
public class LoginFragment extends LoginPresenter {
    @Override
    public void onClickForgetPassword(View v) {

    }

    @Override
    public void login(CharSequence user, CharSequence pass) {
        if(user.equals(pass))
        {
            Toast.makeText(getActivity(),"Login is ok",Toast.LENGTH_LONG).show();
        }else
        {
            Toast.makeText(getActivity(),"Login is nok",Toast.LENGTH_LONG).show();
        }

    }



}
