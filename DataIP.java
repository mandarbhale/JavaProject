import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIP {
	
	public static void main(String[] args) {
		FileOutputStream fo = null;
		DataOutputStream dout = null;
		
		try {
			fo = new FileOutputStream("PrimitiveData");
			dout = new DataOutputStream(fo);
			
			
			dout.writeInt(20);
			dout.writeFloat((float) 14.29);
			
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
