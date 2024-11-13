import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class chemistsvows {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashSet<String> hash = getElements();

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            
            String word = br.readLine();
            boolean[] dp = new boolean[word.length() + 1];
            dp[0] = true;

            for (int j = 1; j <= word.length(); j++) {
                for (int k = 1; k <= 2 && k <= j; k++) {
                    
                    String sub = word.substring(j - k, j);
                    if (hash.contains(sub) && dp[j - k]) {
                        dp[j] = true;
                        break;
                    }
                }
            }

            // Output
            if (dp[word.length()]) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
        br.close();
    }

    static HashSet<String> getElements() {
        HashSet<String> hash = new HashSet<>();
        String[] elements = {
            "H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar",
            "K", "Ca", "Sc", "Ti", "V", "Cr", "Mn", "Fe", "Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr",
            "Rb", "Sr", "Y", "Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb", "Te", "I", "Xe",
            "Cs", "Ba", "La", "Ce", "Pr", "Nd", "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu",
            "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au", "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra",
            "Ac", "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md", "No", "Lr", "Rf", "Db",
            "Sg", "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Fl", "Lv"
        };

        for (String element : elements) {
            hash.add(element.toLowerCase());
        }

        return hash;
    }
}
