import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;

public class arraysmoothening {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(line[i]);
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int freq : frequencyMap.values()) {
            maxHeap.offer(freq);
        }

        while (k > 0 && !maxHeap.isEmpty()) {
            int maxFreq = maxHeap.poll();
            if (maxFreq > 0) {
                maxFreq -= 1;
                k -= 1;
                if (maxFreq > 0) {
                    maxHeap.offer(maxFreq);
                }
            } else {
                break;
            }
        }

        int result = 0;
        if (!maxHeap.isEmpty()) {
            result = maxHeap.peek();
        }

        System.out.println(result);
        
        br.close();
    }
}
