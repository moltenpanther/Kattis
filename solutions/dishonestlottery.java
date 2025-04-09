import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class dishonestlottery {
    
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // Input
        int num = Integer.parseInt(br.readLine());
        int limit = num * 2;

        LinkedList<Integer> cheats = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        // Loop
        int[] arr = new int[51];
        for(int i = 0; i < num * 10; i++) {

         //   System.out.println(num + " " + limit + " " + i);

            String[] line = br.readLine().split(" ");
            for(int j = 0; j < 5; j++) {

                int lotteryNum = Integer.parseInt(line[j]);
                arr[lotteryNum]++;

                if(arr[lotteryNum] > limit && !set.contains(lotteryNum)) {
                    set.add(lotteryNum);
                    cheats.add(lotteryNum);
                 //   System.out.println("cheat " + lotteryNum + " " + arr[lotteryNum]);
                }
            }

        }

        Collections.sort(cheats);

        // Output
        if(cheats.size() == 0) {
            sb.append("-1");
        }

        for(int i = 0; i < cheats.size(); i++) {
            int cheat = cheats.get(i);
            sb.append(cheat).append(" ");
        }
        System.out.println(sb);

        br.close();
    }

}
