import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = Integer.valueOf(scan.nextLine());
		
		while(num != 0) {
				
			ArrayList<String> diner = new ArrayList<>();
			ArrayList<String> food = new ArrayList<>();
			ArrayList<String> foodABC = new ArrayList<>();
			
			//Menu Input
			for(int i = 0; i < num; i++) {
				
				//Making order an array and adding it to lists
				String[] order = scan.nextLine().split(" ");				
				for(int j = 0; j < order.length - 1; j++) {
					diner.add(order[0]);
					food.add(order[j + 1]);
					foodABC.add(order[j + 1]);							
				}
				
			}				
			//Sorting alphabetically and cleaning them up
			Collections.sort(foodABC);
			for(int i = 0; i < foodABC.size() - 1; i++) {	
				if(foodABC.get(i).equals(foodABC.get(i + 1))) {
					foodABC.remove(i);	
					i--;
				}
			}			
			
			//Finding matches and printing output
			for(int i = 0; i < foodABC.size(); i++) {
				ArrayList<String> dinerABC = new ArrayList<>();
				for(int j = 0; j < food.size(); j++) {
					if(foodABC.get(i).equals(food.get(j))){
						dinerABC.add(diner.get(j));
					}
				}
				Collections.sort(dinerABC);	
				System.out.print(foodABC.get(i) + " ");
				for(String j : dinerABC) {
					System.out.print(j + " ");
				}

				System.out.println();
			}
			
			//Here we go again!
			System.out.println();
			num = Integer.valueOf(scan.nextLine());	
		}
		scan.close();
	}
	
}	