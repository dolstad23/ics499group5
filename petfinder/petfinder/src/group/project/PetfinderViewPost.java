package group.project;

import android.app.Activity;
//import android.R;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PetfinderViewPost extends ListActivity{
	
	
/** Called when the activity is first created. */
@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(group.project.R.layout.homepage);
		
		//setContentView(group.project.R.layout.lost_post);
				
        
        //String[] lostPosts = getResources().getStringArray(group.project.R.array.lost_array);
       // String[] foundPosts = getResources().getStringArray(group.project.R.array.found_array);
        
        //setListAdapter(new ArrayAdapter<String>(this, group.project.R.layout.lost_post, lostPosts));
		
		setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
                group.project.R.array.cats, group.project.R.layout.post_item));
		
		
		
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        // Perform action on clicks
		        RadioButton rb = (RadioButton) v;
		        Toast.makeText(PetfinderViewPost.this, rb.getText(), Toast.LENGTH_SHORT).show();
		    }
		};
		
		
	//	final RadioButton radio_lostpets = (RadioButton) findViewById(R.id.radio_lostpet);
	//	final RadioButton radio_foundpets = (RadioButton) findViewById(R.id.radio_foundpet);
	//	radio_lostpets.setOnClickListener(radio_listener);
	//	radio_foundpets.setOnClickListener(radio_listener);
		
		
		
	}


}
