package mx.ipn.tlamati;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class CreaYJuegaActivity extends AppCompatActivity {

    ViewPager viewPager;
    ViewPager viewPager2;
    ViewPager viewPager3;
    Adapter adapter;
    Adaptere adaptere;
    Adapteres adapteres;
    List<Model> models;
    List<Model> models2;
    List<Model> models3;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    ImageView im1,im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crea_y_juega);

        im1 = (ImageView) findViewById(R.id.im1) ;
        im2 = (ImageView) findViewById(R.id.im2) ;

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), MemoramaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        models = new ArrayList<>();
        models.add(new Model(R.drawable.monito1));
        models.add(new Model(R.drawable.monito2));
        models.add(new Model(R.drawable.monito3));
        models.add(new Model(R.drawable.monito4));
        models.add(new Model(R.drawable.monito_5));
        models2 = new ArrayList<>();
        models2.add(new Model(R.drawable.gorra1));
        models2.add(new Model(R.drawable.gorra2));
        models2.add(new Model(R.drawable.gorra3));
        models2.add(new Model(R.drawable.gorra4));
        models2.add(new Model(R.drawable.gorra5));
        models2.add(new Model(R.drawable.gorra6));
        models3 = new ArrayList<>();
        models3.add(new Model(R.drawable.traje1));
        models3.add(new Model(R.drawable.traje2));
        models3.add(new Model(R.drawable.traje3));
        models3.add(new Model(R.drawable.traje4));
        models3.add(new Model(R.drawable.traje5));
        models3.add(new Model(R.drawable.traje6));
        adapter = new Adapter(models, this);
        adaptere = new Adaptere(models2,this);
        adapteres = new Adapteres(models3,this);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager2 = (ViewPager) findViewById(R.id.viewPager2);
        viewPager3 = (ViewPager) findViewById(R.id.viewPager3);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);
        viewPager2.setAdapter(adaptere);
        viewPager2.setPadding(150,0,150,0);
        viewPager3.setAdapter(adapteres);
        viewPager3.setPadding(195,0,195,0);
        Integer[] colors_temp = {getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors = colors_temp;



    }
}
