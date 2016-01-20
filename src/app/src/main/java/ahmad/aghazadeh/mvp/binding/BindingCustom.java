package ahmad.aghazadeh.mvp.binding;

import android.databinding.BindingAdapter;

import android.widget.EditText;


/**
 * Created by 890683 on 1/19/2016.
 */
public class BindingCustom {

    @BindingAdapter("addTextChangedListener")
    public static void addTextChangedListener(EditText view, SimpleTextWatcher simpleTextWatcher) {
        view.addTextChangedListener(simpleTextWatcher);
    }
}