import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boggle {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int[] scores = {0, 0, 0, 1, 1, 2, 3, 5, 11};
        
        // Reading in the words
        int num = Integer.parseInt(br.readLine());
        Word[] words = new Word[num];
        
        for(int i = 0; i < num; i++) {
            String line = br.readLine();
            Word word = new Word(line, scores[line.length()]);
            words[i] = word;
        }
        
        br.readLine();
        
        // Reading in the boards
        num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            
            int[][] grid = new int[4][4];
            
            // Counting the letters
            for(int j = 0; j < 4; j++) {
                String line = br.readLine();
                for(int k = 0; k < 4; k++) {
                    grid[j][k] = line.charAt(k);
                }
            }
            
            // Looping the words
            int total = 0;
            int numWords = 0;
            
            int bestScore = -1;
            String longestWord = "";
            
            for(int j = 0; j < words.length; j++) {
                
                Word word = words[j];
                String wordStr = word.getWord();
                int start = wordStr.charAt(0);
                
                // DFS!!!
                boolean good = false;
                for(int m = 0; m < 4; m++) {
                    
                    boolean[][] visited = new boolean[4][4];
                    for(int n = 0; n < 4; n++) {
                        
                        int ch = grid[m][n];
                        
                        // If grid has a match, DFS!
                        if(ch == start) {
                            good = dfs(grid, m, n, wordStr, visited);
                            if(good) {
                                m = 4;
                                n = 4;
                            }
                        }
                        
                    }
                }
                
                // Updating info on a found word
                if(good) {
                    int score = word.getPoints();
                    total += score;
                    
                    String newWord = word.getWord();
                    if(score > bestScore) {
                        bestScore = score;
                        longestWord = newWord;
                    }else if(score == bestScore) {
                        if(newWord.compareTo(longestWord) < 0) {
                            longestWord = newWord;
                        }
                    }
                    
                    numWords++;
                }
            }
            
            // Adding output
            sb.append(total + " ");
            sb.append(longestWord + " ");
            sb.append(numWords + "\n");
            
            br.readLine();
        }
        
        // Output
        System.out.print(sb);
        
        br.close();
    }
    
    // DFS!!!
    public static boolean dfs(int[][] grid, int row, int col, String word, boolean[][] visited) {
        
        // Word completely found
        if (word.isEmpty()) {
            return true;
        }
        
        // Out of bounds
        if (row < 0 || row >= 4 || col < 0 || col >= 4) {
            return false;
        }
        
        // Already visited or not a match
        if(visited[row][col] || grid[row][col] != word.charAt(0)) {
            return false;
        }

        visited[row][col] = true;

        // Checking surrounding letters
        for (int rows = -1; rows <= 1; rows++) {
            for (int cols = -1; cols <= 1; cols++) {
                if (rows != 0 || cols != 0) {
                    
                    // Recurses(?) to the next letter
                    if (dfs(grid, row + rows, col + cols, word.substring(1), visited)) {
                        return true;
                    }
                }
            }
        }
        
        visited[row][col] = false;
        
        return false;
    }
    
}

class Word {
    
    String word;
    int points;
    
    public Word(String word, int points) {
        this.word = word;
        this.points = points;
    }
    
    public String getWord() {
        return word;
    }
    
    public void setWord(String word) {
        this.word = word;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void setPoints(int points) {
        this.points = points;
    }
    
}
