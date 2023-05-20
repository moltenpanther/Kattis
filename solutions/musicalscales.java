import java.util.Scanner;

public class Kattis{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
        
        String[] Ascale = {"A", "B", "C#", "D", "E", "F#", "G#"};
        String[] ASscale = {"A", "A#", "C", "D", "D#", "F", "G"};
        String[] Bscale = {"A#", "B", "C#", "D#", "E", "F#","G#"};
        String[] Cscale = {"A", "B", "C", "D", "E", "F", "G"};
        String[] CSscale = {"A#", "C", "C#", "D#", "F", "F#", "G#"};
        String[] Dscale = {"A", "B", "C#", "D", "E", "F#", "G"};
        String[] DSscale = {"A#", "C", "D", "D#", "F", "G", "G#"};
        String[] Escale = {"A", "B", "C#", "D#", "E", "F#", "G#"};
        String[] Fscale = {"A", "A#", "C", "D", "E", "F", "G"};
        String[] FSscale = {"A#", "B", "C#", "D#", "F", "F#", "G", "G#"};
        String[] Gscale = {"A", "B", "C", "D", "E", "F#", "G"};
        String[] GSscale = {"A#", "C", "C#", "D#", "F", "G", "G#"};
    
        boolean inA = true;
        boolean inAS = true;
        boolean inB = true;
        boolean inC = true;
        boolean inCS = true;
        boolean inD = true;
        boolean inDS = true;
        boolean inE = true;
        boolean inF = true;
        boolean inFS = true;
        boolean inG = true;
        boolean inGS = true;
        
        int num = Integer.parseInt(scan.nextLine());
        String[] song = scan.nextLine().split(" ");
        
        for(int i = 0; i < num; i++) {
        	if(inA) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(Ascale[j])) {
        				inA = true;
        				j = 7;
        			}else {
        				inA = false;
        			}
        		}
        	}
        	if(inAS) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(ASscale[j])) {
        				inAS = true;
        				j = 7;
        			}else {
        				inAS = false;
        			}
        		}
        	}
        	if(inB) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(Bscale[j])) {
        				inB = true;
        				j = 7;
        			}else {
        				inB = false;
        			}
        		}
        	}
        	if(inC) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(Cscale[j])) {
        				inC = true;
        				j = 7;
        			}else {
        				inC = false;
        			}
        		}
        	}
        	if(inCS) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(CSscale[j])) {
        				inCS = true;
        				j = 7;
        			}else {
        				inCS = false;
        			}
        		}
        	}
        	if(inD) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(Dscale[j])) {
        				inD = true;
        				j = 7;
        			}else {
        				inD = false;
        			}
        		}
        	}
        	if(inDS) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(DSscale[j])) {
        				inDS = true;
        				j = 7;
        			}else {
        				inDS = false;
        			}
        		}
        	}
        	if(inE) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(Escale[j])) {
        				inE = true;
        				j = 7;
        			}else {
        				inE = false;
        			}
        		}
        	}
        	if(inF) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(Fscale[j])) {
        				inF = true;
        				j = 7;
        			}else {
        				inF = false;
        			}
        		}
        	}
        	if(inFS) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(FSscale[j])) {
        				inFS = true;
        				j = 7;
        			}else {
        				inFS = false;
        			}
        		}
        	}
        	if(inG) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(Gscale[j])) {
        				inG = true;
        				j = 7;
        			}else {
        				inG = false;
        			}
        		}
        	}
        	if(inGS) {
        		for(int j = 0; j < 7; j++) {
        			if(song[i].equals(GSscale[j])) {
        				inGS = true;
        				j = 7;
        			}else {
        				inGS = false;
        			}
        		}
        	}	
        }
        
        if(inA) {
        	System.out.print("A ");
        }
        if(inAS) {
        	System.out.print("A# ");
        }
        if(inB) {
        	System.out.print("B ");
        }
        if(inC) {
        	System.out.print("C ");
        }
        if(inCS) {
        	System.out.print("C# ");
        }
        if(inD) {
        	System.out.print("D ");
        }
        if(inDS) {
        	System.out.print("D# ");
        }
        if(inE) {
        	System.out.print("E ");
        }
        if(inF) {
        	System.out.print("F ");
        }
        if(inFS) {
        	System.out.print("F# ");
        }
        if(inG) {
        	System.out.print("G ");
        }
        if(inGS) {
        	System.out.print("G#");
        }
        
        if(!inA && !inAS && !inB && !inC && !inCS && !inD && !inDS && !inE && !inF && !inFS && !inG && !inGS) {
        	System.out.println("none");
        }
        
    }
}