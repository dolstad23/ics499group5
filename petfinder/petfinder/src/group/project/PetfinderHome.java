package group.project;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.EditText;
import android.widget.TextView;

public class PetfinderHome extends Activity{
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        
        EditText text = (EditText)findViewById(R.id.editText1);
        text.setText(Html.fromHtml("Select Listings tab to:<br>" +
        		"- View pet posts<br>- Contact pet finders<br><br>Select My PF tab to:<br>- Create a post" +
        		"<br>- View/delete your posts<br>- View your profile matches"));

        
    }

}
