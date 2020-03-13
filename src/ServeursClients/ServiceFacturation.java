package ServeursClients;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService; 
import java.util.concurrent.Executors;

public class ServiceFacturation {
	
	private boolean work=false;
	private ServerSocket serverSocket=null; 
	private ExecutorService pool=null; 
	private Callable<Void> task=null;
	
	public ServiceFacturation(int port) {
		
	}
	public void process() {
		
	}
	public void arreterServeur() {
		
	}
}
