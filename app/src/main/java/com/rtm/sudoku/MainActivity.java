package com.rtm.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText etn;
private String[] listaCasillas = new String[81];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*etn=findViewById(R.id.et0012);
        listaCasillas[0] = String.valueOf(etn);
        Log.d("mendsaje",listaCasillas[0]);
        Toast mensaje = Toast.makeText(getApplicationContext(),listaCasillas[0],Toast.LENGTH_LONG);
        mensaje.show();

        //FUNCION GUARDA IDs DE TODOS LOS EDIT TEXT (futuras CELDAS)
        llenarListaCeldas();
       // String[] celdas = new String[81];*/
        llenarListaCeldas();
        imprimirListaCeldas();

    }

    private void llenarListaCeldas() {
        String cod = "0000";
        String  n = "et";
        for (int i = 0; i<81; i++){
            for(int r = 0; r<3; r++){//fila TABLA - r
                for(int c = 0; c<3; c++){//cuadrado de la fila de la TABLA - cuadrado
                    for (int f = 0; f<3; f++){//fila del cuadrado de la fila de la TABLA - fila
                        for(int et = 0; et<3; et++){//posicion de la fila del cuadrado de la fila de la TABLA -et
                            cod = (String.valueOf(r)+String.valueOf(c)+String.valueOf(f)+String.valueOf(et));
                            listaCasillas[i] = n + cod;
                        }

                    }
                }
            }
        }

    }
    private void imprimirListaCeldas(){
        for(int i = 0; i<81; i++){
            Toast mensaje = Toast.makeText(getApplicationContext(),listaCasillas[i],Toast.LENGTH_LONG);
            mensaje.show();
            Log.d("IDs:",listaCasillas[0]);
        }
    }
}