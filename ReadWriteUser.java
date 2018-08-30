import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteUser {

	
	 public static void main(String[] args) {
		 	
		 
		 User u1 = new User("Mandar", "qwertyuiop");
		 
		 String write = u1.toString();
		 
		 FileOutputStream fo = null;
			try {
				fo = new FileOutputStream("UsernamePassword",true);
				fo.write(write.getBytes());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}
	
}
