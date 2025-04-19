package Week4.day1;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		
		System.out.println(endpoint + " " + requestBody + " " + requestStatus);
		
	}
	
	public static void main(String[] args) {
		
		APIClient client = new APIClient();
		client.sendRequest("/endpoint");
		client.sendRequest("/endpoint", "/requestbody", true);
		

	}

}
