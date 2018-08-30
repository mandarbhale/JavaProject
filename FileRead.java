import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream inputStream = null;
		try {
			
			inputStream = new FileInputStream("data");
			int val;
			while((val = inputStream.read())!=-1)
			{
				System.out.println((char)val);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
