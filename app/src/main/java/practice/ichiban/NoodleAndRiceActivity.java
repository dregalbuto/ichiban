package practice.ichiban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoodleAndRiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noodleandrice);

        Button cart = (Button) findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(NoodleAndRiceActivity.this, CartActivity.class));
            }
        });

        Button friedrice = (Button) findViewById(R.id.friedrice);
        friedrice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(NoodleAndRiceActivity.this, FriedRiceActivity.class));
            }
        });
    }
}
