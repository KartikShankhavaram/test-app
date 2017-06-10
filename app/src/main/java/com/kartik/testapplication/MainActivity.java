package com.kartik.testapplication;
/**
 * MPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:

 * package com.example.android.justjava;

 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing '+' and '-' buttons
        Button increment = (Button) findViewById(R.id.button2);
        Button decrement = (Button) findViewById(R.id.button3);

        // Adding onClickListener to '+' button
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity++;
                display(quantity);
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity--;
                display(quantity);
            }
        });
    }
    public int quantity=0;
    public int price = quantity*5;


    public void submitOrder(View view)
    {



        //display_price(quantity*5);


        //CheckBox C1 = (CheckBox)findViewById(R.id.whipped_cream_checkbox);
        //String truth ;

        create_order_summary();
    }
    /* Replacing with setOnClickListener on '+' button in onCreate
    public void increment()
    {
        quantity++;
        display(quantity);
    }
    */

    /* Replacing with setOnClickListener on '-' button in onCreate
    public void decrement()
    {
        quantity--;
        display(quantity);
    }
    */

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);

        quantityTextView.setText(""+ number);

    }
    private void create_order_summary()
    {

        TextView PriceTextView = (TextView) findViewById(R.id.order_text_view);

        // Price is not updated, so write quantity instead of price OR
        // (Remove comments if trying out)
        /*  price = quantity * 5;
            PriceTextView.setText("Name :Ninaad" + "\nquantity:"+quantity+"\nprice :"+quantity*5+"\nThank you");
        */
        PriceTextView.setText("Name :Ninaad" + "\nquantity:"+quantity+"\nprice :"+quantity*5+"\nThank you");
    }
}