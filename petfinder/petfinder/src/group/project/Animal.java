package group.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/** Second Activity. */
public class Animal extends Activity{

    

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_info);        
        
        //spinner 1 for animal type selection
        Spinner animalTypeSpinner = (Spinner) findViewById(R.id.animalTypeSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.animal_type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        animalTypeSpinner.setAdapter(adapter);
        //animalTypeSpinner.setOnItemSelectedListener(new MyOnItemSelectedListener());
        
             	
      //spinner 2 for selecting the breed
        Spinner breedSpinner = (Spinner) findViewById(R.id.breedSpinner);        
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(
                this, R.array.dogs, android.R.layout.simple_spinner_item);        
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breedSpinner.setAdapter(adapter2);        
        //breedSpinner.setOnItemSelectedListener(new MyOnItemSelectedListener());
        
        //spinner 3 for selecting animal size selection
        Spinner SizeSpinner = (Spinner) findViewById(R.id.sizeSpinner);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(
                this, R.array.size, android.R.layout.simple_spinner_item);        
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SizeSpinner.setAdapter(adapter3);        
        //SizeSpinner.setOnItemSelectedListener(new MyOnItemSelectedListener());
        
        
        //spinner 4 for selecting color      
        Spinner colorSpinner = (Spinner) findViewById(R.id.colorSpinner);
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(
                this, R.array.color, android.R.layout.simple_spinner_item);
        
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        colorSpinner.setAdapter(adapter4);        
        //colorSpinner.setOnItemSelectedListener(new MyOnItemSelectedListener());
               
        

    }
    
    public class MyOnItemSelectedListener implements OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent,
            View view, int pos, long id) {
                    
          Toast.makeText(parent.getContext(), "the value is "+ parent.getItemAtPosition(pos).toString(),Toast.LENGTH_LONG).show();
           
                 
                    
        }

        public void onNothingSelected(AdapterView parent) {
          // Do nothing.
        }
        
    }
  //Instance Variables
    
     protected String type;
     protected String breed;  
     protected String size;  
     protected String color;
     protected String comment;
     protected String picture;
  
 //Non-parameterized Constructor to initialize members to null
  
     public Animal()
  
     {
         type = "";
         breed = "";  
         size = "";  
         color = "";
         comment = "";
         picture = "";
  
     }
  
 //parameterized Constructor to initialize members with user input
  
     public Animal(String atype, String abreed, String asize, String acolor, String acomment, String apicture)
  
     {
         type = atype;  
         breed = abreed;  
         size = asize;  
         color = acolor;
         comment = acomment;
         picture = apicture;
  
     }
    
}