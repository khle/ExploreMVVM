package dev.kevinle.exploremvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dev.kevinle.exploremvvm.databinding.ActivityMainBinding;
import dev.kevinle.exploremvvm.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        LoginViewModel loginViewModel = new LoginViewModel("", "");
        binding.setLoginViewModel(loginViewModel);
        binding.setHandler(loginViewModel);
    }
}
