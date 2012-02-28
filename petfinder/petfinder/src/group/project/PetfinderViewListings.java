package group.project;








//import android.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class PetfinderViewListings extends ListActivity{
	
	
/** Called when the activity is first created. */
@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.petfinder_listings);
					
        
        
		Button lostPets = (Button)findViewById(R.id.lostPets);
		Button foundPets = (Button)findViewById(R.id.foundPets);
		
		lostPets.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	fillData("lost");
            	
            }
		});
		
		foundPets.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
            	fillData("found");
            }
		});
		
		
		
		
			
		
	}
	//fills list with array data.
	private void fillData(String id) {
	    
		if(id == "lost"){
			
			setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
	                group.project.R.array.lost_array, group.project.R.layout.list_item));
			
			
		}
		else if (id == "found"){
			
			setListAdapter(ArrayAdapter.createFromResource(getApplicationContext(),
	                group.project.R.array.found_array, group.project.R.layout.list_item));
		}
		
		
	}



}
