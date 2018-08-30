import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		String num1;
		String num2;
		int n1 , n2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter you name");
		try {
			name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Welcome "+name);
		System.out.println("Now please enter 2 numbers..");
		
		try {
			num2 = br.readLine();
			num1 = br.readLine();
			n1 = Integer.parseInt(num1);
			n2 = Integer.parseInt(num2);
			System.out.println(n1+n2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
