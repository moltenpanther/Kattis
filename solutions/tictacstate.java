import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tictacstate {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cases = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < cases; i++) {
            
            int oct = Integer.parseInt(br.readLine(), 8);       
            String bin = Integer.toBinaryString(oct);
            
            // Padding the binary string with 0s
            while(bin.length() < 19) {
                bin = "0" + bin;
            }
                        
            char turn = bin.charAt(0);
            String board = bin.substring(1, 10);
            String played = bin.substring(10);

            // Check played rows            
            int[] playedCount = new int[8];
            
            String[] lines = new String[8];
            lines[0] = played.charAt(8) + "" + played.charAt(7) + "" + played.charAt(6);
            lines[1] = played.charAt(5) + "" + played.charAt(4) + "" + played.charAt(3);
            lines[2] = played.charAt(2) + "" + played.charAt(1) + "" + played.charAt(0);
            lines[3] = played.charAt(8) + "" + played.charAt(5) + "" + played.charAt(2);
            lines[4] = played.charAt(7) + "" + played.charAt(4) + "" + played.charAt(1);
            lines[5] = played.charAt(6) + "" + played.charAt(3) + "" + played.charAt(0);
            lines[6] = played.charAt(8) + "" + played.charAt(4) + "" + played.charAt(0);
            lines[7] = played.charAt(6) + "" + played.charAt(4) + "" + played.charAt(2);
            
            String[] threes = new String[8];
            threes[0] = board.charAt(8) + "" + board.charAt(7) + "" + board.charAt(6);
            threes[1] = board.charAt(5) + "" + board.charAt(4) + "" + board.charAt(3);
            threes[2] = board.charAt(2) + "" + board.charAt(1) + "" + board.charAt(0);
            threes[3] = board.charAt(8) + "" + board.charAt(5) + "" + board.charAt(2);
            threes[4] = board.charAt(7) + "" + board.charAt(4) + "" + board.charAt(1);
            threes[5] = board.charAt(6) + "" + board.charAt(3) + "" + board.charAt(0);
            threes[6] = board.charAt(8) + "" + board.charAt(4) + "" + board.charAt(0);
            threes[7] = board.charAt(6) + "" + board.charAt(4) + "" + board.charAt(2);
            
            
            for(int j = 0; j < 8; j++) {
                playedCount[j] = get1Count(lines[j]);
            }
            
            boolean xwins = false;
            boolean owins = false;
            for(int j = 0; j < 8; j++) {        
                if(playedCount[j] == 3) {   
                    String three = threes[j];
                    if(three != null) {                     
                        if(three.charAt(0) == three.charAt(1) && three.charAt(1) == three.charAt(2)) {
                            if(three.charAt(0) == '1') {
                                xwins = true;
                            }else {
                                owins = true;
                            }
                            j = 8;
                        }
                    }
                }
            }
                        
            // Output
            if(xwins || owins) {
                if(xwins) {
                    System.out.println("X wins");
                }else {
                    System.out.println("O wins");
                }
            }else {             
                
                int ones = get1Count(played);
                
                if(ones <= 8) {
                    System.out.println("In progress");
                }else {
                    System.out.println("Cat's");                    
                }
            }           
        }
        
        br.close();
    }

    private static int get1Count(String line) {
        
        int count = 0;
        for(int i = 0; i < line.length(); i++) {
            if(line.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

}

