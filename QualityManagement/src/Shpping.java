
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shpping {
	
	public static void main(String[] args) {
		HashMap<String, Integer> shp = new HashMap<String, Integer>(); 
		shp.put("å", 5500);
		shp.put("����ũ", 2500);
		shp.put("��Ű", 4500);
		
		System.out.println(shp);
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("� ��ǰ�� �����Ұǰ���?");
			String product = scan.next();
			if(product == "0") {
				break;
			}
			System.out.print("�� �� �����Ұǰ���?");
			int number = scan.nextInt();
		}
		
		System.out.print(shp.get(product) * number);
		
		
	}
}
