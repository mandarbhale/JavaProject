import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) {
		String str = "  Welcome To Xoriant Mandar";
		FileOutputStream fo = null;
		try {
			fo = new FileOutputStream("data",true);
			fo.write(str.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fo != null) {
				try {
					fo.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
