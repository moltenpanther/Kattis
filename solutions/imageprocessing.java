import java.util.Scanner;

public class Kattis {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int imageH = scan.nextInt();
        int imageW = scan.nextInt();
        int kernelH = scan.nextInt();
        int kernelW = scan.nextInt();
        
        int[][] image = new int[imageH][imageW];
        int[][] kernel = new int[kernelH][kernelW];
        int[][] flipped = new int[kernelH][kernelW];
        
        int outH = imageH - kernelH + 1;
        int outW = imageW - kernelW + 1;
        
        int[][] out = new int[outH][outW];
        
        // Loading Image Array
        for(int i = 0; i < imageH; i++) {
        	for(int j = 0; j < imageW; j++) {
        		image[i][j] = scan.nextInt();
        	}
        }
        
        // Loading Kernel Array
        for(int i = 0; i < kernelH; i++) {
        	for(int j = 0; j < kernelW; j++) {
        		kernel[i][j] = scan.nextInt();
        	}
        }
        
        // Flipping Kernel
        for(int i = 0; i < kernelH; i++) {
        	for(int j = 0; j < kernelW; j++) {
        		flipped[(kernelH - 1) - i][(kernelW - 1) - j] = kernel[i][j];
        	}
        }
        
        // Making Image
        for(int i = 0; i < outH; i++) {
        	for(int j = 0; j < outW; j++) {
        		
        		// Calculating Value
        		int sum = 0;
                for(int m = 0; m < kernelH; m++) {
                	for(int n = 0; n < kernelW; n++) {
                		sum += flipped[m][n] * image[i + m][j + n];
                	}
                }
        		
                out[i][j] = sum;
                
        	}
        }
        /*        
        // Printing Image Array
        for(int i = 0; i < imageH; i++) {
        	for(int j = 0; j < imageW; j++) {
        		System.out.print(image[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.println();
        // Printing Kernel Array
        for(int i = 0; i < kernelH; i++) {
        	for(int j = 0; j < kernelW; j++) {
        		System.out.print(kernel[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.println();        
        // Printing Flipped Array
        for(int i = 0; i < kernelH; i++) {
        	for(int j = 0; j < kernelW; j++) {
        		System.out.print(flipped[i][j] + " ");
        	}
        	System.out.println();
        }
        System.out.println();
        */
        // Printing Output Array
        for(int i = 0; i < outH; i++) {
        	for(int j = 0; j < outW; j++) {
        		System.out.print(out[i][j] + " ");
        	}
        	System.out.println();
        }
        scan.close();
    }    
	
}
