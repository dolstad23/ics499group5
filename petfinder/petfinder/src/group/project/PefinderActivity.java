package group.project;



import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;

public class PefinderActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
         
                
        Resources res = getResources(); // Resource object to get Drawables if using image
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab
        
        

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, PetfinderHome.class);

        /** Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("home").setIndicator("Home",
                          res.getDrawable(R.drawable.ic_tab_home))
                      .setContent(intent);
        */
        
        spec = tabHost.newTabSpec("home").setIndicator("Home")
            .setContent(intent);
        
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, PetfinderViewListings.class);
        /**
         * this is used if an in image is wanted for the tab
        spec = tabHost.newTabSpec("viewPosts").setIndicator("View Postings",
                          //res.getDrawable(R.drawable.ic_tab_lost))
                      //.setContent(intent);
                       * 
                       */
        spec = tabHost.newTabSpec("viewPosts").setIndicator("Listings")
            .setContent(intent);
            
        
        tabHost.addTab(spec);
        
               
            
            intent = new Intent().setClass(this, MyPF.class);    
            
        //Post tab
        spec = tabHost.newTabSpec("post").setIndicator("My PF")
                .setContent(intent);
            
            tabHost.addTab(spec);
            
            
        //changes the height of the tabs.
        int iCnt = tabHost.getTabWidget().getChildCount();
        for(int i=0; i<iCnt; i++){
          tabHost.getTabWidget().getChildAt(i).getLayoutParams().height /= 2;
          
        }
    }
}