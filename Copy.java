import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		FileOutputStream fo = null;
		try {
			
			inputStream = new FileInputStream("data");
			int val;
			while((val = inputStream.read())!=-1)
			{
				
				try {
					fo = new FileOutputStream("Copy",true);
					fo.write(val);
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			fo.write('\n');
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

