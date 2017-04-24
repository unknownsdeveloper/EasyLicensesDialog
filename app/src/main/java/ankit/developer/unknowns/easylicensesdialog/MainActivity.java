package ankit.developer.unknowns.easylicensesdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.marcoscg.easylicensesdialog.EasyLicensesDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnLic = (Button)findViewById(R.id.btnLic);
        btnLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyLicensesDialog easyLicensesDialog = new EasyLicensesDialog(MainActivity.this);
                easyLicensesDialog.setTitle("License");
                easyLicensesDialog.setCancelable(true);
                easyLicensesDialog.setPositiveButton(android.R.string.ok, null);
                easyLicensesDialog.show();
            }

        });

    }
}
