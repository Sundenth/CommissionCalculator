package gb.srobinson.commissioncalc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,
        		R.layout.menu_items, items);
        
        menulist.setAdapter(adapt);
        
        }
        
        
    }
