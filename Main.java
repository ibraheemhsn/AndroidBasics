//------------------------------------------------------------------
// show activity
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//-------------------------------------------------------------------
// OnClickListener
Button button = (Button) findViewById(R.id.button1);
/* or 
final Button button;
button = (Button) findViewById(R.id.button1);
*/

button.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
        // do anything here
        Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
        }
});

//------------------------------------------------------------------
// start new acivity
     public void startActivity2(View view) {
     Intent myIntent = new Intent(this, Main2Activity.class);
     // Main2Activity is new actitiy defined by xml layout and class java file.
     startActivity(myIntent);
    }

 //-----------------------------------------------------------------
// start new activity with sent data
        //creat bunndle
        Bundle b = new Bundle();
        
        //store data into bundle
        b.putString("fullname", fullname);
        b.putLong("phoneNumber", phone);
        b.putDouble("age", ageDouble);
        b.putBoolean("married", isMarried);
        
        //create intent
        Intent myIntent = new Intent(this, Main2Activity.class);
        //send data to activity and start it
        in.putExtras(b);
        startActivity(myIntent);

//--------------------------------------------------------------------
// get data in second activity
// https://examples.javacodegeeks.com/android/core/os/android-bundle-example/
                
        // get coming bundle and intenet
        Intent in = getIntent();
        Bundle b = in.getExtras();
        
        // get data from bundle
        String nameString = b.getString("fullname");
        Long phoneLong = b.getLong("phone");
        String ageDouble = b.getDouble("age");
        String isMarriedBoolean = b.getBoolean("isMarried");
        
        // now do anything here received data
        text1.setText ("full name :" + nameString);
        
        // from mainfeast set which activity will lunch first, by set intent-filter 
//---------------------------------------------------------------------
// getResources from res xml files
        String dep = getResources().getString(R.string.dep);
        String[] jobs = getResources().getStringArray(R.array.jobs);
        // see strings and arrays in string.xml file
        <string name="dep">computer engineer</string>
        <string-array name="jobs">
                <item name="technical" />
                <item name="sales" />
        </string-array>
        
        // how get string value from xml into xml
        @string/dep
        @string/etc...
                
//------------------------------------------------------------------------
// style.xml video 20
// https://www.youtube.com/watch?v=nBNGl1H69M0&index=20&list=PLF8OvnCBlEY3e0Yg990aAXreEru72_xWN               
           
//-----------------------------------------------------------------------

        
         
