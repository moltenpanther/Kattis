import java.util.Scanner;

public class kitten {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);				
		Branch[] tree = new Branch[101];		
		
		int start = Integer.parseInt(scan.nextLine());
		String inp = scan.nextLine();
		String[] line = inp.split(" ");

		while(line.length > 1) {
			
			Branch stick = new Branch(Integer.parseInt(line[0]));
			if(tree[stick.val] != null) {
				stick = tree[stick.val];
			}else {
				tree[stick.val] = stick;				
			}
			
			for(int i = 1; i < line.length; i++) {
				int val = Integer.parseInt(line[i]);
				Branch leaf = new Branch(val);
				
				if(tree[leaf.val] != null) {
					tree[leaf.val].prev = stick;
				}else {
					leaf.prev = stick;
					tree[leaf.val] = leaf;				
				}
				
			}
			
			inp = scan.nextLine();
			line = inp.split(" ");
		}

		Branch kitten = tree[start];
		
		while(kitten != null) {
			
			System.out.print(kitten.val + " ");
			kitten = kitten.prev;
		}

		scan.close();
	}
	
}

class Branch {
	
	Branch prev;
	int val;
	
	public Branch(int val) {
		this.val = val;
	}

}