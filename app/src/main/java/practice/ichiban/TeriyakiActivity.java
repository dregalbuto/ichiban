package practice.ichiban;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeriyakiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teriyaki);

        Button cart = (Button) findViewById(R.id.cart);
        cart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(TeriyakiActivity.this, CartActivity.class));
            }
        });

        Button add = (Button) findViewById(R.id.addtoorder);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(TeriyakiActivity.this, ItemAddedActivity.class));
            }
        });
    }
}
