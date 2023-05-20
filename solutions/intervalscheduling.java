import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<Task>();
        
        int num = scan.nextInt();
        int[] finishes = new int[num];
        
        for(int i = 0; i < num; i++) {
            
            int begin = scan.nextInt();
            int end = scan.nextInt();
            
            Task task = new Task(begin, end);
            list.add(task);
            
            finishes[i] = end;
        }
        
        Arrays.sort(finishes);
        Collections.sort(list, Comparator.comparing(Task :: getFinish));
        
        int lastFinish = Integer.MIN_VALUE;
        int count = 0;        
        for(int i = 0; i < num; i++) {
            
            int start = list.get(i).start;
            if(start >= lastFinish) {
                count++;
                lastFinish = finishes[i];
            }

        }
        
        System.out.println(count);
        
        scan.close();
    }    
    
}

class Task {

	int start = 0;
	int finish = 0;
	
	public Task(int start, int finish) {
		this.start = start;
		this.finish = finish;
	}
	
	public int getStart() {
		return start;
	}
	
	public void setStart(int start) {
		this.start = start;
	}
	
	public int getFinish() {
		return finish;
	}
	
	public void setFinish(int finish) {
		this.finish = finish;
	}
	
}
