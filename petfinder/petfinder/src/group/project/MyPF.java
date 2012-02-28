package group.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MyPF extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypf);
        
        Button createPost = (Button) findViewById(R.id.button1);
        final EditText email = (EditText) findViewById(R.id.editText1);
        
        createPost.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	
            	String username = email.getText().toString();
            	
                if(username.length()>5){
            	Intent intent = new Intent(MyPF.this, PetfinderPost.class);
                startActivity(intent);
                }
            }
        });
        
        
        
}
}