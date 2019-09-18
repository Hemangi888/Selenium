package Freamwork;

import java.io.IOException;

public class SecoundExample extends FreamworkExample{
	public static void main(String[] args) throws IOException {
		Url("Chrome","http://demo.automationtesting.in/Register.html");
		System.out.println("method called");
		sendkey("FullName","Heena");
		

}
}