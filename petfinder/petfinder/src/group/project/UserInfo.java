package group.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/** Second Activity. */
public class UserInfo extends Activity{

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_info);
        
        Button next = (Button)findViewById(R.id.Next);
        
        next.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // assign entered info to variables
            	
            	
            	EditText name = (EditText)findViewById(R.id.userName);
            	EditText mail = (EditText)findViewById(R.id.userEmail);
            	EditText password = (EditText)findViewById(R.id.userPassword);
            	EditText phone = (EditText)findViewById(R.id.userPhone);
            	
            	String uname = ""+name.getText();
            	String umail = ""+mail.getText();
            	String upass = ""+password.getText();
            	String uphone = ""+phone.getText();
            	
            	//create a user object
            	UserInfo tempUser = new UserInfo(uname,umail,upass,
            			uphone);
            	
            	// for testing only this will actually happen after confirming profile
            	// send user info to database
            	
            	//make connection             	
            	HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://www.bryannippoldt.com/petFinderScript.php");
                httppost.setHeader("Content-Type", "application/x-www-form-urlencoded");
                
                try {
                    // Add your data
                    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(2);
                    nameValuePairs.add(new BasicNameValuePair("task","addUserRecord"));
                    nameValuePairs.add(new BasicNameValuePair("email",umail));
                    nameValuePairs.add(new BasicNameValuePair("username",uname));
                    nameValuePairs.add(new BasicNameValuePair("password",upass));
                    nameValuePairs.add(new BasicNameValuePair("phone",uphone));
                    
                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                    // Execute HTTP Post Request
                    HttpResponse response = httpclient.execute(httppost);
                    
                 // get response content
                    HttpEntity entity = response.getEntity();
                    // convert stream to String
                    BufferedReader buf = new BufferedReader(new InputStreamReader(entity.getContent()));
                    StringBuilder sb1 = new StringBuilder();
                    String line = null;
                    while ((line = buf.readLine()) != null) {
                    sb1.append(line+"\n");}
                    
                    //Toast.makeText(getApplicationContext(), sb1.toString()+"",1).show();
                    

                } catch (ClientProtocolException e) {
                     System.out.print("failed");
                } catch (IOException e) {
                	System.out.print("failed");
                }
            	
            	System.out.println("buttonclicked");
            		Intent intent = new Intent(UserInfo.this, Animal.class);
                    startActivity(intent);
            }
        });
        
        
    }
    
  //Instance Variables
    
     protected String userName;
     protected String email;  
     protected String password;  
     protected String phone;
     
     
  
 //Non-parameterized Constructor to initialize members to null
  
     public UserInfo()
  
     {
         userName = "";
         email = "";  
         password = "";  
         phone = "";
  
     }
  
 //parameterized Constructor to initialize members with user input
  
     public UserInfo(String uname, String uemail, String upassword, String uphone)
  
     {
         userName = uname;  
         email = uemail;  
         password = upassword;  
         phone = uphone;
  
     }
     
     
     
     
    
}