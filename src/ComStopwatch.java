
public class ComStopwatch extends Graphic implements Runnable {

	
	@SuppressWarnings("deprecation")
	public void run() {
		
		
		
		for(int i=hr;i>=0;i--) {
			
			for(int ii=mn;ii>=0;ii--) {
				
				for (int iii = 59; iii >= 0; iii--) {
					
					if(hr==0 && mn==0 && iii ==0) {
						coWatch.setText(i+":"+ii+":"+iii);
						thread.stop();
					}
					else {
						
						try {
							Thread.sleep(1000);
						}
						catch (InterruptedException e) {
							e.printStackTrace();
						}
						coWatch.setText(i+":"+ii+":"+iii);
					}
					
				}
			}
		}
		
	}

}
