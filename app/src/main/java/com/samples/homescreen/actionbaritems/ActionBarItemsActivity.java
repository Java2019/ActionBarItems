package com.samples.homescreen.actionbaritems;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarItemsActivity extends AppCompatActivity {

    private static final int IDM_OPEN = 1001;
    private static final int IDM_SAVE = 1002;
    private static final int IDM_EDIT = 1003;
    private static final int IDM_HELP = 1004;
    private static final int IDM_EXIT = 1005;

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_items);
        actionBar = getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, IDM_OPEN, 1, "Open")
                .setIcon(android.R.drawable.ic_menu_add)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        menu.add(Menu.NONE, IDM_SAVE, 1, "Save")
                .setIcon(android.R.drawable.ic_menu_save)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(Menu.NONE, IDM_EDIT, 1, "Edit")
                .setIcon(android.R.drawable.ic_menu_edit)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(Menu.NONE, IDM_HELP, 1, "Help")
                .setIcon(android.R.drawable.ic_menu_help)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
        menu.add(Menu.NONE, IDM_EXIT, 1, "Exit")
                .setIcon(android.R.drawable.ic_menu_add)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        CharSequence sequence = "";

        switch (item.getItemId()){
            case IDM_OPEN:
                sequence = "Open item selected";
                break;
            case IDM_SAVE:
                sequence = "Save item selected";
                break;
            case IDM_EDIT:
                sequence = "Edit item selected";
                break;
            case IDM_HELP:
                sequence = "Help item selected";
                break;
            case IDM_EXIT:
                sequence = "Exit item selected";
                break;
        }
        Toast.makeText(this, sequence, Toast.LENGTH_SHORT).show();
        return false;
    }
}
