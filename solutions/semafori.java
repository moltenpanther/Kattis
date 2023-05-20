import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num = scan.nextInt();
        int len = scan.nextInt();
        
        int[] light = new int[num];
        int[] red = new int[num];
        int[] green = new int[num];
        
        for(int i = 0; i < num; i++) {
        	light[i] = scan.nextInt();
        	red[i] = scan.nextInt();
        	green[i] = scan.nextInt();
        }
        
        int i = 0;
        int dis = 0;
        int time = 0;
        while(dis < len) {
        	
        	int thisDis = light[i];
        	if(i != 0) {
        		thisDis = light[i] - light[i - 1];        			
        	}
        	
        	dis += thisDis;
        	time += thisDis;
        	        	
        	int lightTiming = time % (red[i] + green[i]);
        	if(lightTiming >= 0 && lightTiming < red[i]) {
        		time += red[i] - lightTiming;
        	}
        	
        	i++;
        	if(i >= light.length) {
        		time += len - dis;
        		dis = len;
        	}
        }
        
        System.out.println(time);
        
        scan.close();
    }
    
}
