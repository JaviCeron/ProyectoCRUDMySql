package com.example.proyectocrudmysql;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import androidx.appcompat.app.AlertDialog;

public class Acercade {

    Dialog myDialog;
    AlertDialog.Builder dialogo;

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
    }*/

    public void acercade(final Context context){
        myDialog = new Dialog(context);
        myDialog.setContentView(R.layout.activity_acercade);
        myDialog.setTitle("acercade");
        myDialog.setCancelable(true);

       /* btn_buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        String action;
                        Intent intent = new Intent(context, MainActivity.class);
                        context.startActivity(intent);

                        myDialog.dismiss();

            }
        });
*/
       myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.DKGRAY));
        myDialog.show();
    }
}
