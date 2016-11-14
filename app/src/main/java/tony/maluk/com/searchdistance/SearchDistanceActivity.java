package tony.maluk.com.searchdistance;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * Created by Tony on 14.11.2016.
 */

public class SearchDistanceActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvTop;
    TextView tvResult;
    Button btnCalc;
    EditText edtStart;
    EditText edtEnd;

    static int[] arr = {0, 23, 10, 14, 5, 9, 7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        btnCalc = (Button)findViewById(R.id.button_calculate);
        tvTop = (TextView) findViewById(R.id.text_on_top);
        tvResult = (TextView)findViewById(R.id.text_result);
        edtStart = (EditText)findViewById(R.id.edit_city_start);
        edtEnd = (EditText)findViewById(R.id.edit_city_end);

        btnCalc.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        tvResult.setText("Distance is " + path(edtStart.getText().toString(), edtEnd.getText().toString()));
    }

    public static int path(String c, String d){
        Integer x = Integer.valueOf(c);
        Integer y = Integer.valueOf(d);
        int distance = 0;
        for(int i = x + 1; i < y + 1; i++){
            distance = distance + arr[i];
        }
        return distance;
    }
}
