import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectOutputStream op = null;
		String str = "Hello World";
		
		try {
			op = new ObjectOutputStream(new FileOutputStream("stringdata"));
			op.writeObject(str);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
