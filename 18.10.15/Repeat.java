public class Repeat{
	public static void main (String[] args){
		String a = args[0];
		boolean c = true;
		for (int i=0; i < a.length() - 1; i++){
			if (a.charAt(i) == a.charAt(i + 1)){
				System.out.print("Repeat " + a.charAt(i));
				c = false;
			}			
		}
		if (c) System.out.print("No repeat");
	}
}