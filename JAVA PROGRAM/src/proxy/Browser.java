package proxy;

import javax.swing.JOptionPane;

public class Browser {
	
	public void sendRequest(){
		String site = JOptionPane.showInputDialog("Enter the site URL");
		System.out.println(Integer.parseInt(site));
		String response = this.getInternetProvider().getResource(site);
		this.loadResponse(response);
	}
	
	private void loadResponse(String response){
		System.out.println(response);
	}
	
	private ISP getInternetProvider(){
		return new NetworkSettings().getInternet();
	}

}
