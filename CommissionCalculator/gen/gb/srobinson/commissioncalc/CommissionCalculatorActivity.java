package gb.srobinson.commissioncalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;





public class CommissionCalculatorActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ListView menulist = (ListView) findViewById(R.id.ListView_Menu) ;
        String[] items = { getResources().getString(R.string.menu_item_new),
        		getResources().getString(R.string.menu_item_load),
        		getResources().getString(R.string.menu_item_historical),
        		getResources().getString(R.string.menu_item_graph) };
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_items, items);
        menulist.setAdapter(adapt);
        menulist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_new))) {
                    // Launch the new Activity
                    startActivity(new Intent(CommissionCalculatorActivity.this, newActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_load))) {
                    // Launch the load Activity
                    startActivity(new Intent(CommissionCalculatorActivity.this, loadActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_historical))) {
                    // Launch the historical Activity
                    startActivity(new Intent(CommissionCalculatorActivity.this, historicalActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_graph))) {
                    // Launch the graphs Activity
                    startActivity(new Intent(CommissionCalculatorActivity.this, graphsActivity.class));
                }

			}
        });

    }; 
            }
