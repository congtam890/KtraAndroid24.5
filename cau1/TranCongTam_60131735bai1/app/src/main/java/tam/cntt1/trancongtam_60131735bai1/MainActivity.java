package tam.cntt1.trancongtam_60131735bai1;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editcao, editcanhb, editcanha;
    Button btntinhdientich, btntinhchuvi;
    TextView kqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWigget();
    }
    void TimWigget(){
        editcanha= (EditText) findViewById(R.id.editcanha);
        editcanhb= (EditText) findViewById(R.id.editcanhb);
        editcao= (EditText) findViewById(R.id.editcao);
        btntinhdientich= (Button)findViewById(R.id.btntinhdientich);
        btntinhchuvi= (Button)findViewById(R.id.btntinhchuvi);
        kqua= (TextView) findViewById(R.id.kqua);
        btntinhdientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = editcanha.getText().toString();
                int CanhA = Integer.parseInt(chuoi1);
                String chuoi2 = editcao.getText().toString();
                int ChieuCao = Integer.parseInt(chuoi2);
                int DienTich= ChieuCao*CanhA;
                kqua.setText(String.valueOf(DienTich));
            }
        });
        btntinhchuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = editcanha.getText().toString();
                int CanhA = Integer.parseInt(chuoi1);
                String chuoi2 = editcanhb.getText().toString();
                int CanhB = Integer.parseInt(chuoi2);
                int ChuVi = 2*(CanhA + CanhB);
                //kqua.setText(String.valueOf(ChuVi));
                kqua.setText("Kết quả"+ ChuVi);
            }
        });

    }


}