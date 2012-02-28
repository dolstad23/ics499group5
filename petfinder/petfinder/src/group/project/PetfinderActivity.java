package group.project;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class PetfinderActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        
    
        
        EditText text = (EditText)findViewById(R.id.editText1);
        text.setText(Html.fromHtml("Select Listings tab to:<br>" +
        		"- View pet posts<br>- Contact pet finders<br><br>Select My PF tab to:<br>- Create a post" +
        		"<br>- View/delete your posts<br>- View your profile matches"));
        
        
}
}