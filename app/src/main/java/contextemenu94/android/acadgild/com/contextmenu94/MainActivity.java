package contextemenu94.android.acadgild.com.contextmenu94;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtVw= (TextView) findViewById(R.id.txtViewContenxtMenu);
        registerForContextMenu(txtVw);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if(v.getId()==R.id.txtViewContenxtMenu)
        {
            getMenuInflater().inflate(R.menu.main,menu);
            menu.setHeaderTitle("Context Menu");
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item){

        if(item.getItemId()==R.id.action1){
            Toast.makeText(MainActivity.this, "This is Action1", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.action2){
            Toast.makeText(MainActivity.this, "This is Action2", Toast.LENGTH_LONG).show();
        }
        else if(item.getItemId()==R.id.action3){
            Toast.makeText(MainActivity.this, "This is Action3", Toast.LENGTH_LONG).show();
        }
        else{
            return false;
        }
        return true;
    }
}
