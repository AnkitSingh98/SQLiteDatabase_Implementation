package com.ankithacks.learningsqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydbHelper mydbHelper=new mydbHelper(this);

        /*SQLiteDatabase db= mydbHelper.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put("Name","Amit");
        values.put("marks","60");

        long row=db.insert("stud",null,values);  //row contains the row number of nth row returned by this function

        System.out.println("Row no. is "+ row);
*/
       SQLiteDatabase db= mydbHelper.getReadableDatabase();

        String column[]={"Name","marks"};

        Cursor c=db.query("stud",column,null,null,null,null,null,null);
        c.moveToPosition(4);

        System.out.println("name is "+c.getString(0));


    }
}
