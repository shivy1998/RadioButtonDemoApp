package lockdown.org.radiobuttondemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity
{
    Button btnChange;
    RadioGroup radioGroup;
    LinearLayout layout;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btnChange = findViewById(R.id.btnChange);
        radioGroup = findViewById(R.id.radioGroup);
        layout = findViewById(R.id.layout);
        btnChange.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                int radioid = radioGroup.getCheckedRadioButtonId();
                RadioButton rb = findViewById(radioid);
                String option = rb.getText().toString();
                if (option.equals("Red"))
                {
                    layout.setBackgroundColor(Color.RED);
                }
                else if (option.equals("Green"))
                {
                    layout.setBackgroundColor(Color.GREEN);
                }
                else if (option.equals("Blue"))
                {
                    layout.setBackgroundColor(Color.BLUE);
                }
                else if (option.equals("Yellow"))
                {
                    layout.setBackgroundColor(Color.YELLOW);
                }
            }
        });

    }
}
