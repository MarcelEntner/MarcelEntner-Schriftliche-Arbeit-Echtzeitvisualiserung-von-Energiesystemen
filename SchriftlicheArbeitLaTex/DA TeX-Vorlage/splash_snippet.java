/*
 * Author: Mr.X																						
 * Date: MM:YYYY																							
 * Description: Splash Screen																				
*/

new Handler().postDelayed(new Runnable(){
	@Override
	public void run() {
 
		/* Create an Intent that will start the Menu-Activity. */
		Intent mainIntent = new Intent(Heartbeat.this,MainScreen.class);
        	Heartbeat.this.startActivity(mainIntent);
        	Heartbeat.this.finish();
	}
}, SPLASH_DISPLAY_LENGHT);

