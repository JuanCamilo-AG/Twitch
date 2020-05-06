package com.example.retoappmockup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class AddTags extends AppCompatActivity {
    private Spinner spinner1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tags);

        spinner1=(Spinner)findViewById(R.id.spinner);
        String [] opciones= {"1 Credit Clear","100%", "12 Hour Challenge", "AMA"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spinner1.setAdapter(adapter);
    }

    public void onRadioButtonClicked(View view) {

       boolean checked=((RadioButton)view).isChecked();

       switch (view.getId()){
           case R.id.radioButton:
               if(checked){
                   Toast.makeText(this,"Soccer",Toast.LENGTH_LONG).show();
               }
               break;
           case R.id.radioButton2:
               if(checked){
                   Toast.makeText(this,"Multiplayer",Toast.LENGTH_LONG).show();
               }
               break;
           case R.id.radioButton3:
               if(checked){
                   Toast.makeText(this,"Competitive",Toast.LENGTH_LONG).show();
               }
               break;
           case R.id.radioButton4:
               if(checked){
                   Toast.makeText(this,"Plating whit Viewers",Toast.LENGTH_LONG).show();
               }
               break;
           case R.id.radioButton5:
               if(checked){
                   Toast.makeText(this,"Lets Play",Toast.LENGTH_LONG).show();}
               break;
           default:
               break;
       }
    }

    public void ShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(AddTags.this);
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage(R.string.message_alert);

        myAlertBuilder.setPositiveButton(R.string.ok_button, new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        Toast.makeText(getApplicationContext(), "Pressed OK",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton(R.string.cancel_button, new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "Pressed Cancel",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.show();
    }
}
