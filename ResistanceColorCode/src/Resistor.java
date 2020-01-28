import java.lang.Math;

public class Resistor{
	
	public String colors[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	private int fst;
	private int sec;
	private int third;
	public double fth = 0.05;
	
	public Resistor(long resistance) {
		printColors(resistance);
	}
	
	public Resistor(String fst, String sec, String third) {
		this.fst = lookup(fst);
		this.sec = lookup(sec);
		this.third = lookup(third);
		
	}
	
	public Resistor(String fst, String sec, String third, double fth) {
		this(fst, sec, third);
		this.fth = fth;
	}
	
	public double resistance() {
		return ((fst*10) + sec) * Math.pow(10, third);
	}
	
	public static void main(String [] args) {
		
		Resistor r = null;
		int mode = args.length;
		
		switch(mode) {
		
		case 1:
			r = new Resistor(Long.parseLong(args[0]));
			break;
			
		case 3:
			r = new Resistor(args[0], args[1], args[2]);
			break;
			
		case 4:
			r = new Resistor(args[0], args[1], args[2], Double.parseDouble(args[3]));
			break;
			
		default:
			System.err.println("Invalid arguments");
			return;
		}
		
		
		if(mode == 3 || mode == 4) {
			System.out.println("The resistance for the color code: " + r.resistance());
			System.out.println("Max value for the code: " + (r.resistance() + r.resistance()*r.fth));
			System.out.println("Max value for the code: " + (r.resistance() - r.resistance()*r.fth));
		}
	
		System.out.println();
		System.out.println();
		
	}
	
	private int lookup(String color) {
		for(int i=0; i<colors.length; i++) {
			if(colors[i].equals(color))
				return i;
		}
		
		return -1;
	}
	
	private void printColors(long resistance) {
		int first;
		int second;
		int count = 0;
		
		while(resistance>99) {
			resistance = resistance/10;
			count++;
		}
		
		
		first = (int)resistance/10;
		second = (int)resistance%10;
		
		System.out.println();
		System.out.println();
		System.out.println("\tThe colors are as follows: " + colors[first] + ", " + colors[second] + ", "+ colors[count]);
	}
	
}