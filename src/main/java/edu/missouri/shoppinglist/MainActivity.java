package edu.missouri.shoppinglist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Menu chocolatesMenu;
    private ActionBar chocolatesActionBar;
    private ImageView chocolatesImageView;
    private TextView titleTextView;
    private TextView priceTextView;
    private TextView optionTextView;
    private int chocolateIndex = 0;
    private int[] images = {
            R.drawable.milkchocolate,
            R.drawable.darkchocolate,
            R.drawable.whitechocolate
    };
    private String[] titles = {
            "Milk Chocolate",
            "Dark Chocolate",
            "White Chocolate"
    };
    private String[] prices = {
            "$5.00",
            "$6.00",
            "$9.00"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocolatesActionBar = getSupportActionBar();
        chocolatesActionBar.setTitle("A10 Shopping List - Chocolates");
        chocolatesImageView = findViewById(R.id.chocolatesImageView);
        titleTextView = findViewById(R.id.titleTextView);
        priceTextView = findViewById(R.id.priceTextView);
        optionTextView = findViewById(R.id.optionTextView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.chocolates, menu);
        chocolatesMenu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.choc_milk:
                chocolatesActionBar.setTitle("Milk Chocolate");
                chocolateIndex = 0;
                chocolatesImageView.setImageResource(images[chocolateIndex]);
                titleTextView.setText(titles[chocolateIndex]);
                priceTextView.setText(prices[chocolateIndex]);
                optionTextView.setText("");
                return true;
            case R.id.choc_dark:
                chocolatesActionBar.setTitle("Dark Chocolate");
                chocolateIndex = 1;
                chocolatesImageView.setImageResource(images[chocolateIndex]);
                titleTextView.setText(titles[chocolateIndex]);
                priceTextView.setText(prices[chocolateIndex]);
                optionTextView.setText("");
                return true;
            case R.id. choc_white:
                chocolatesActionBar.setTitle("White Chocolate");
                chocolateIndex = 2;
                chocolatesImageView.setImageResource(images[chocolateIndex]);
                titleTextView.setText(titles[chocolateIndex]);
                priceTextView.setText(prices[chocolateIndex]);
                optionTextView.setText("");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
