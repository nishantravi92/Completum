package com.whiteyolk.nishantr.completum;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class ToDoListActivity extends ListActivity {
    public static final int MENU_SETTINGS = Menu.NONE+1;
    public static final int REQUEST_ADD_ITEMS = 1;
    ToDoListAdapter toDoListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.to_do_list_view);
        final EditText editText = (EditText)findViewById(R.id.textView);
        editText.clearFocus();
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE))
                        .showSoftInput(editText, InputMethodManager.SHOW_FORCED);
            }
        });
        //toDoListAdapter = new ToDoListAdapter(this);
        //this.setListAdapter(toDoListAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    public void addItems() {
        Intent intent = new Intent(this, AddToDoItemActivity.class);
        startActivityForResult(intent, REQUEST_ADD_ITEMS);
    }

}
