package week3.Assignment1;

public class APIClient {
	
	
	private void sendRequest(String endPoint) {
		System.out.println(endPoint);		

	}
	
	private void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println(endPoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);

	}

	public static void main(String[] args) {

		APIClient obj1= new APIClient();
		obj1.sendRequest("www.facebook.com");
		obj1.sendRequest("www.amazon.in", "RequestBody", true);
		

	}

}
