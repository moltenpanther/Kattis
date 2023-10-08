import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class chess {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
        	
        	String[] inp = br.readLine().split(" ");

        	Coord start = new Coord(inp[1].charAt(0), inp[0].charAt(0));
        	Coord end = new Coord(inp[3].charAt(0), inp[2].charAt(0));
        	
        	int[][] board = new int[8][8];
            
            // BFS time!
            Queue<Coord> queue = new LinkedList<Coord>();
            
            queue.add(start);
            board[start.x][start.y] = 'X';
            
            StringBuilder sb = new StringBuilder();
            LinkedList<String> list = new LinkedList<String>();
            
            boolean found = false;
            while(!queue.isEmpty()) {
                
            	Coord coord = queue.remove();
            	
            	if(coord.getX() == end.x && coord.getY() == end.y) {
            		
            		found = true;
            		// Print path coords
            		int count = 0;
            		while(coord.prev != null) {
            			
            			StringBuilder sbCoord = new StringBuilder();
            			
            			sbCoord.append(coord.chessY);
            			sbCoord.append(" ");
            			sbCoord.append(coord.chessX);
            			sbCoord.append(" ");
            			sbCoord.append(sb);
            			
            			list.add(0, sbCoord.toString());
            			
            			coord = coord.prev;
            			count++;
            		}
            		
            		sb.append(count);
            		sb.append(" ");
        			sb.append(coord.chessY);
        			sb.append(" ");
        			sb.append(coord.chessX);
        			sb.append(" ");
        			
        			for(String str : list) {
        				sb.append(str);
        			}
        			
            		break;
            		
            	}else {
            		            	
            		// Up Left
	                int x = coord.getX();
	                int y = coord.getY();
	                while(x - 1 >= 0 && y - 1 >= 0) {
	                    if(board[x - 1][y - 1] != 'X') {
	                    	Coord newCoord = new Coord(x - 1, y - 1, coord);
	                        queue.add(newCoord);
	                        board[x - 1][y - 1] = 'X';
	                    }
	                    x--;
	                    y--;
	                }
	                // Down Left
	                x = coord.getX();
	                y = coord.getY();
	                while(x + 1 < 8 && y - 1 >= 0) {
	                    if(board[x + 1][y - 1] != 'X') {
	                    	Coord newCoord = new Coord(x + 1, y - 1, coord);
	                        queue.add(newCoord);
	                        board[x + 1][y - 1] = 'X';
	                    }
	                    x++;
	                    y--;
	                }
	                // Down Right
	                x = coord.getX();
	                y = coord.getY();
	                while(x + 1 < 8 && y + 1 < 8) {
	                    if(board[x + 1][y + 1] != 'X') {
	                    	Coord newCoord = new Coord(x + 1, y + 1, coord);
	                        queue.add(newCoord);
	                        board[x + 1][y + 1] = 'X';
	                    }
	                    x++;
	                    y++;
	                }
	                // Up Right
	                x = coord.getX();
	                y = coord.getY();
	                while(x - 1 >= 0 && y + 1 < 8) {
	                    if(board[x - 1][y + 1] != 'X') {
	                    	Coord newCoord = new Coord(x - 1, y + 1, coord);
	                        queue.add(newCoord);
	                        board[x - 1][y + 1] = 'X';
	                    }
	                    x--;
	                    y++;
	                }	                
            	}
            }     
            
            // Output
            if(!found) {
            	sb.append("Impossible");
            }
            
            System.out.println(sb);
            sb.setLength(0);
        }
        
        br.close();
    }
    
}

class Coord {
	
	int x = 0;
	int y = 0;
	char chessX = '8';
	char chessY = 'A';
	
	int[] xToChess = {0, 1, 2, 3, 4, 5, 6, 7, 8};
	int[] chessToX = {8, 7, 6, 5, 4, 3, 2, 1, 0};
	
	
	Coord prev = null;

	public Coord() {
		
	}
	
	public Coord(char chessX, char chessY) {
		this.chessX = chessX;
		this.chessY = chessY;

		this.x = 56 - (int) chessX;
		this.y = (int) chessY - 65;
		
	}
	
	public Coord(int x, int y, Coord prev) {
		this.x = x;
		this.y = y;
		this.prev = prev;
		
		this.chessX = (char) (56 - x);
		this.chessY = (char) (y + 65);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Coord getPrev() {
		return prev;
	}

	public void setPrev(Coord prev) {
		this.prev = prev;
	}
	
	@Override
	public String toString() {
		return x + " " + y + " / " + chessX + " " + chessY;
	}
	
}
