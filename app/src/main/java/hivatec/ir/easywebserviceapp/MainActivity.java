package hivatec.ir.easywebserviceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import hivatec.ir.easywebservice.Callback;
import hivatec.ir.easywebservice.EasyWebservice;
import hivatec.ir.easywebservice.Method;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		new EasyWebservice("http://viewplusapp.ir/api/v1/test")
				.method(Method.POST)
				.addParam("id", 100)
				.call(new Callback.AB<Boolean, String>("res", "msg") {
					@Override
					public void onSuccess(Boolean aBoolean, String s) {

					}

					@Override
					public void onError(String error) {

					}
				});
	}

}
