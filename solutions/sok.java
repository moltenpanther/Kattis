import java.util.Scanner;

public class sok {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		Fruit[] fruit = {new Fruit(scan.nextDouble()), new Fruit(scan.nextDouble()), new Fruit(scan.nextDouble())};
		
		for(int i = 0; i < 3; i++) {
			fruit[i].rec = scan.nextDouble();
			fruit[i].recRatio = fruit[i].ing / fruit[i].rec;
		}
		
		double min = Math.min(fruit[0].recRatio, Math.min(fruit[1].recRatio, fruit[2].recRatio));
		
		for(Fruit f : fruit) {
			System.out.println(f.ing - (f.rec * min));
		}
		
		scan.close();
	}
	
}

class Fruit {

	double ing;
	double rec;
	double recRatio;

	public Fruit(double ing){
		this.ing = ing;
	}
	
}
