package dev.kevinle.exploremvvm.viewmodel;

/**
 * Created by Kevin on 8/10/2016.
 */

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.os.Handler;
import android.support.design.widget.Snackbar;
import android.view.View;

public class LoginViewModel {
    public final ObservableField<String> email =
            new ObservableField<>();
    public final ObservableField<String> password =
            new ObservableField<>();
    public final ObservableField<Integer> busy =
            new ObservableField<>();

    public LoginViewModel(String email, String password) {
        this.email.set(email);
        this.password.set(password);
        this.busy.set(View.GONE);
    }

    public void onClick(final View view) {
        final String email = this.email.get();
        final String password = this.password.get();
        busy.set(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                busy.set(View.GONE);
                Snackbar.make(view, email + ", " + password, Snackbar.LENGTH_SHORT).show();
            }
        }, 500);
    }
}
