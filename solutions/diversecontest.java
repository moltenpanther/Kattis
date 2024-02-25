import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class diversecontest {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        
        int[] probIndex = new int[n];
        for(int i = 0; i < n; i++) {
            probIndex[i] = i;
        }
        
        // Reading in lines
        HashMap<Integer, LinkedList<String>> problems = new HashMap<Integer, LinkedList<String>>();
        for(int i = 0; i < n; i++) {
            
            line = br.readLine().split(" ");
            LinkedList<String> list = new LinkedList<String>();
            for(int j = 1; j < line.length; j++) {
                list.add(line[j]);
            }
            
            problems.put(i, list);
        }
        
        int half = k / 2;

        // Looping through combos
        int count = 0;
        List<List<Integer>> combos = generateComboLists(probIndex, k);
        for(List<Integer> combo : combos) {
            
            boolean good = true;
            HashMap<String, Integer> probCount = new HashMap<String, Integer>();
            for(int i = 0; i < k; i++) {
                
                int num = combo.get(i);
                    
                LinkedList<String> probList = problems.get(num);
                for(int j = 0; j < probList.size(); j++) {
                    
                    String prob = probList.get(j);
                    
                    if(!probCount.containsKey(prob)) {
                        probCount.put(prob, 0);
                    }
                    int val = probCount.get(prob) + 1;
                    probCount.put(prob, val);
                    
                    if(val > half) {
                        good = false;
                        i = k;
                        j = probList.size();
                    }
                }
            }
            
            if(good) {
                count++;
            }
        }

        // Output
        System.out.println(count);
        
        br.close();
    }
    
    // Makes lists for the combos
    public static List<List<Integer>> generateComboLists(int[] array, int k) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        
        generateCombos(array, k, 0, currentCombination, result);
        
        return result;
    }
    
    // Makes the combos
    public static void generateCombos(int[] array, int k, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        
        if (k == 0) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }
        
        for (int i = start; i < array.length; i++) {
            currentCombination.add(array[i]);
            generateCombos(array, k - 1, i + 1, currentCombination, result);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

}
