package Week4.day1;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {
	
	
	public void connect() {
		System.out.println("Connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}
	
	public void executeUpload() {
		System.out.println("executeUpload");
		
	}
	
	public void executeQuery() {
		System.out.println("executeQuery");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection connect = new JavaConnection();
		connect.connect();
		connect.disconnect();
		connect.executeUpload();
		connect.executeQuery();
	}

	
}
