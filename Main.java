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
