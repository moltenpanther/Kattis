import java.util.Scanner;

public class bendilfaerslur {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
                
        String input = scan.next();
        
        String ans = "";
        
        // Handling IPv4
        if(input.contains(".")) {
            
            String[] address = input.split("\\.");
            for(int i = address.length - 1; i >= 0; i--) {
                ans += address[i] + ".";
            }
            
            ans += "in-addr.arpa.";

        // Handling IPv6
        }else if(input.contains(":")) {
            
            // With hidden 0s
            if(input.contains("::")) {
                
                String[] address = input.split("::");
                
                if(address.length == 0) {
                    ans = "0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.";
                }else {
                                    
                    String[] left = address[0].split(":");
                    String[] right = new String[0];
                    if(address.length > 1) {
                        right = address[1].split(":");
                    }
    
                    int chunks = left.length + right.length;
                    
                    // Right side
                    for(int i = right.length - 1; i >= 0; i--) {
                        String chunk = right[i];
                        for(int j = chunk.length() - 1; j >= 0; j--) {
                            ans += chunk.charAt(j) + ".";                       
                        }
                        for(int j = 3; j >= chunk.length(); j--) {
                            ans += "0.";
                        }
                    }
                    
                    // Middle
                    for(int i = chunks; i < 8; i++) {
                        ans += "0.0.0.0.";
                    }
                    
                    // Left side
                    for(int i = left.length - 1; i >= 0; i--) {
                        String chunk = left[i];
                        for(int j = chunk.length() - 1; j >= 0; j--) {
                            ans += chunk.charAt(j) + ".";                       
                        }
                        for(int j = 3; j >= chunk.length(); j--) {
                            ans += "0.";
                        }
                    }
                }
                
            // Without hidden 0s
            }else {             
                String[] address = input.split(":");
                for(int i = address.length - 1; i >= 0; i--) {
                    String chunk = address[i];
                    for(int j = chunk.length() - 1; j >= 0; j--) {
                        ans += chunk.charAt(j) + ".";                       
                    }
                    for(int j = 3; j >= chunk.length(); j--) {
                        ans += "0.";
                    }
                }
            }
            
            ans += "ip6.arpa.";
            
        }
        
        // Output
        System.out.println(ans);
        
        scan.close();
    }

}

