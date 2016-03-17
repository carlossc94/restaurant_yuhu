package com.herprogramacion.restaurantericoparico.ui;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.herprogramacion.restaurantericoparico.R;
import com.herprogramacion.restaurantericoparico.modelo.Comida;
import com.herprogramacion.restaurantericoparico.modelo.Comida_Principal;


/**
 * Created by CarlosIsrael on 16/03/2016.
*/
public class DetailActivity extends AppCompatActivity {
    private static final String EXTRA_POSITION = "com.herprogramacion.restaurantericoparico.extra.POSITION";
    private static final String EXTRA_NAME = "com.herprogramacion.toolbarapp.nombre";
    private static final String EXTRA_DRAWABLE = "com.herprogramacion.toolbarapp.drawable";
    private static final String PRECIO= "com.herprogramacion.toolbarapp.nombre";
    int pos;

    public static void createInstance(Activity activity, Comida title) {
        Intent intent = getLaunchIntent(activity, title );

        activity.startActivity(intent);
    }
    public static Intent getLaunchIntent(Context context,Comida girl) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_NAME, girl.getNombre());
        intent.putExtra(EXTRA_DRAWABLE, girl.getIdDrawable());
        intent.putExtra(PRECIO, girl.getPrecio());
        return intent;
    }

    // Carga los datos en la vista

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setToolbar(); // Reemplazar la action bar

        Intent i = getIntent();
        String name = i.getStringExtra(EXTRA_NAME);
        int idDrawable = i.getIntExtra(EXTRA_DRAWABLE, pos);

        setupViews(i.getIntExtra(EXTRA_POSITION,1));

    }

    private void setupViews(int position) {
        TextView name = (TextView) findViewById(R.id.detail_name);
        TextView description = (TextView) findViewById(R.id.detail_description);
        TextView author = (TextView) findViewById(R.id.detail_author);
        TextView price = (TextView) findViewById(R.id.detail_price);

        ImageView image = (ImageView) findViewById(R.id.detail_image);

        Comida detailCourse = Comida.getCourseByPosition(position);
        name.setText(detailCourse.getNombre());
        description.setText("Costo: $55");
        author.setText("Creado Por: " + "Leonardo inzunza ");
        price.setText("$" + detailCourse.getPrecio());
        //rating.setRating(detailCourse.getRating());
        Glide.with(this).load(detailCourse.getIdDrawable()).into(image);


    }


    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)// Habilitar Up Button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            default:
                return super.onOptionsItemSelected(item);
            case android.R.id.home:
                // Obtener intent de la actividad padre
                Intent upIntent = NavUtils.getParentActivityIntent(this);
                upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // Comprobar si DetailActivity no se creó desde CourseActivity
                if (NavUtils.shouldUpRecreateTask(this, upIntent)
                        || this.isTaskRoot()) {

                    // Construir de nuevo la tarea para ligar ambas actividades
                    TaskStackBuilder.create(this)
                            .addNextIntentWithParentStack(upIntent)
                            .startActivities();
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // Terminar con el método correspondiente para Android 5.x
                    this.finishAfterTransition();
                    return true;
                }

                // Dejar que el sistema maneje el comportamiento del up button
                return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    public static void launch(Activity context, int position, View sharedView) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_POSITION, position);

        // Los elementos 4, 5 y 6 usan elementos compartidos,
        if (position >= 3) {
            ActivityOptions options0 = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                options0 = ActivityOptions
                        .makeSceneTransitionAnimation(context, sharedView, sharedView.getTransitionName());

            }
            context.startActivity(intent, options0.toBundle());
        } else {

            ActivityOptions options0 = null;
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                options0 = ActivityOptions.makeSceneTransitionAnimation(context);
            }
            context.startActivity(intent, options0.toBundle());

        }
    }
}