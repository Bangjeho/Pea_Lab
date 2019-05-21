
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shpping {
	
	public static void main(String[] args) {
		HashMap<String, Integer> shp = new HashMap<String, Integer>(); 
		shp.put("책", 5500);
		shp.put("케이크", 2500);
		shp.put("쿠키", 4500);
		
		System.out.println(shp);
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("어떤 물품을 구매할건가요?");
			String product = scan.next();
			if(product == "0") {
				break;
			}
			System.out.print("몇 개 구매할건가요?");
			int number = scan.nextInt();
		}
		
		System.out.print(shp.get(product) * number);
		
		
	}
}
