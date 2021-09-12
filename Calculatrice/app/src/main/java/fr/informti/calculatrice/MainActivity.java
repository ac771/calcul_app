package fr.informti.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;




import java.math.MathContext;

public class MainActivity extends AppCompatActivity {

    ImageView imageNum0;
    ImageView imageNum1;
    ImageView imageNum2;
    ImageView imageNum3;
    ImageView imageNum4;
    ImageView imageNum5;
    ImageView imageNum6;
    ImageView imageNum7;
    ImageView imageNum8;
    ImageView imageNum9;
    ImageView imageDel;
    ImageView imagePlus;
    ImageView imageMoins;
    ImageView imageEgal;
    ImageView imageFois;
    ImageView imageDivise;
    ImageView imageZ;
    ImageView imageZ1;
    ImageView imageZ3;
    ImageView imageVirgule;
    TextView textViewAffichage;
    Float resultFin;
    String elec;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewAffichage = (TextView)findViewById(R.id.textViewAffichage);

        //Button number 1
        imageNum1 = (ImageView)findViewById(R.id.imageNum1);
        imageNum1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "1";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(1));
                }

            }
        });
        //Button number 2
        imageNum2 = (ImageView)findViewById(R.id.imageNum2);
        imageNum2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "2";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(2));
                }

            }
        });
        //Button number 3
        imageNum3 = (ImageView)findViewById(R.id.imageNum3);
        imageNum3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "3";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(3));
                }

            }
        });
        //Button number 4
        imageNum4 = (ImageView)findViewById(R.id.imageNum4);
        imageNum4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {

                    String result = textViewAffichage.getText().toString();

                    if (!result.isEmpty()) {
                        result = result + "4";
                        textViewAffichage.setText(String.valueOf(result));
                    } else {
                        textViewAffichage.setText(String.valueOf(4));
                    }
            }

        });
        //Button number 5
        imageNum5 = (ImageView)findViewById(R.id.imageNum5);
        imageNum5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "5";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(5));
                }

            }
        });
        //Button number 6
        imageNum6 = (ImageView)findViewById(R.id.imageNum6);
        imageNum6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                    if (!result.isEmpty()){
                    result = result + "6";
                        textViewAffichage.setText(String.valueOf(result));
                }else{
                        textViewAffichage.setText(String.valueOf(6));
                }
            }
        });
        //Button number 7
        imageNum7 = (ImageView)findViewById(R.id.imageNum7);
        imageNum7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "7";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(7));
                }
            }
        });
        //Button number 8
        imageNum8 = (ImageView)findViewById(R.id.imageNum8);
        imageNum8.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "8";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(8));
                }
            }
        });
        //Button number 9
        imageNum9 = (ImageView)findViewById(R.id.imageNum9);
        imageNum9.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "9";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(9));
                }
            }
        });
        //Button number 0
        imageNum0 = (ImageView)findViewById(R.id.imageNum0);
        imageNum0.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    result = result + "0";
                    textViewAffichage.setText(String.valueOf(result));
                }else{
                    textViewAffichage.setText(String.valueOf(0));
                }
            }
        });

        imagePlus = (ImageView)findViewById(R.id.imagePlus);
        imagePlus.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    if(resultFin != null){
                        if (type == "egal"){
                            type="plus";
                            textViewAffichage.setText("");
                        }else{
                            resultFin = resultFin + Float.valueOf(result);
                            type="plus";
                            textViewAffichage.setText("");
                        }
                    }else{
                        resultFin = Float.valueOf(result);
                        type="plus";
                        textViewAffichage.setText("");
                    }
                }
            }
        });
        //Subtract button
        imageMoins = (ImageView)findViewById(R.id.imageMoins);
        imageMoins.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();


                if (!result.isEmpty()){
                    if(resultFin != null){
                        if (type == "egal"){
                            type="moins";
                            textViewAffichage.setText("");
                        }else {
                            resultFin = resultFin - Float.valueOf(result);
                            type = "moins";
                            textViewAffichage.setText("");
                        }
                    }else{
                        resultFin = Float.valueOf(result);
                        type="moins";
                        textViewAffichage.setText("");
                    }
                }
            }
        });
        //Split button
        imageDivise = (ImageView)findViewById(R.id.imageDivise);
        imageDivise.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();


                if (!result.isEmpty()){
                    if(resultFin != null){
                        if (type == "egal"){
                            type="divise";
                            textViewAffichage.setText("");
                        }else {
                            resultFin = resultFin / Float.valueOf(result);
                            type = "divise";
                            textViewAffichage.setText("");
                        }
                    }else{
                        resultFin = Float.valueOf(result);
                        type="divise";
                        textViewAffichage.setText("");
                    }
                }
            }
        });
        //multiplication button
        imageFois = (ImageView)findViewById(R.id.imageFois);
        imageFois.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();


                if (!result.isEmpty()){
                    if(resultFin != null){
                        if (type == "egal"){
                            type="fois";
                            textViewAffichage.setText("");
                        }else {
                            resultFin = resultFin * Float.valueOf(result);
                            type = "fois";
                            textViewAffichage.setText("");
                        }
                    }else{
                        resultFin = Float.valueOf(result);
                        type="fois";
                        textViewAffichage.setText("");
                    }
                }
            }
        });

        imageVirgule = (ImageView)findViewById(R.id.imageVirgule);
        imageVirgule.setOnClickListener(new View.OnClickListener(){



            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                //Si une virgule existe déjà ne rien faire.
                if(!result.contains(".")){
                    if (!result.isEmpty()){
                        if(resultFin != null){
                            if (type != "egal"){
                                 textViewAffichage.setText(String.valueOf(result)+".");
                            }
                        }else{

                            textViewAffichage.setText(String.valueOf(result)+".");

                        }
                    }
                }


            }
        });
        //Equal button
        imageEgal = (ImageView)findViewById(R.id.imageEgal);
        imageEgal.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String result = textViewAffichage.getText().toString();

                if (!result.isEmpty()){
                    if(resultFin != null){

                        switch (type) {
                            case "plus":
                                resultFin = resultFin + Float.valueOf(result);

                                textViewAffichage.setText(String.format("%.2f", resultFin));
                                type = "egal";
                                break;

                            case "moins":
                                resultFin = resultFin - Float.valueOf(result);
                                textViewAffichage.setText(String.format("%.2f", resultFin));
                                type = "egal";
                                break;

                            case "fois":
                                resultFin = resultFin * Float.valueOf(result);
                                textViewAffichage.setText(String.format("%.2f", resultFin));
                                type = "egal";
                                break;

                            case "divise":
                                resultFin = resultFin / Float.valueOf(result);
                                textViewAffichage.setText(String.format("%.2f", resultFin));
                                type = "egal";
                                break;

                            default:
                                break;
                        }
                    }else{
                        textViewAffichage.setText(String.valueOf(resultFin));
                    }
                }else{
                    textViewAffichage.setText(String.valueOf(resultFin));
                }
            }
        });
        //Delete button
        imageDel = (ImageView)findViewById(R.id.imageDel);
        imageDel.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                System.out.println("info2");
                resultFin = null;
                textViewAffichage.setText("");
            }
        });
        //Other button Z1
        imageZ1 = (ImageView)findViewById(R.id.imageZ1);
        imageZ1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                resultFin = null;
                textViewAffichage.setText("DISABLE v1");
            }
        });
        //Other button Z3
        imageZ3 = (ImageView)findViewById(R.id.imageZ3);
        imageZ3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                resultFin = null;
                textViewAffichage.setText("DISABLE db3");
            }
        });
        //Other button Z
        imageZ = (ImageView)findViewById(R.id.imageZ);
        imageZ.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                resultFin = null;
                textViewAffichage.setText("DISABLE tronc6");
            }
        });

    }
}