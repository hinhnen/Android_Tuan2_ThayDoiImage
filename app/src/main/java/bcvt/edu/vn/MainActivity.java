package bcvt.edu.vn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private RadioButton rbDog, rbCat, rbRabbit, rbBird, rbPig;
    private Button btnHienthi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setControl();
        setEvent();

    }

    private void setControl(){
        imageView = (ImageView)findViewById(R.id.img);
        rbCat = findViewById(R.id.img_cat);
        rbDog = findViewById(R.id.img_dog);
        rbRabbit = findViewById(R.id.img_rabbit);
        rbBird = findViewById(R.id.img_bird);
        rbPig = findViewById(R.id.img_pig);
        btnHienthi = findViewById(R.id.ok);
    }

    private void setEvent(){
        btnHienthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.cho);
                if(rbCat.isChecked()) {
                    imageView.setImageResource(R.drawable.meo);
                }
                if(rbDog.isChecked()){
                    imageView.setImageResource(R.drawable.cho);
                }
                if(rbBird.isChecked()){
                    imageView.setImageResource(R.drawable.chim);
                }
                if(rbRabbit.isChecked()){
                    imageView.setImageResource(R.drawable.tho);
                }
                if(rbPig.isChecked()){
                    imageView.setImageResource(R.drawable.heo);
                }
            }
        });
    }
}
