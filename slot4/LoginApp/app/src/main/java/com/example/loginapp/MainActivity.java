import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    public Button myButton;
    public EditText myUser;
    public EditText myPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = findViewById(R.id.btnOk);
        myUser = findViewById(R.id.editUser);
        myPass = findViewById(R.id.editPassword);
    }
    public void onLogin(View view)
    {
        if (myUser.getText().toString().equals("admin") &&
                myPass.getText().toString().equals("12345"))
        {
            Toast.makeText(getApplicationContext(),"Login successful",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Login failed",Toast.LENGTH_SHORT).show();
        }
    }
}
