class Palindrom{
    public static void main (String[] args){
	String a = args[0];
	boolean b = true;
	for (int i = 0; i < a.length(); i++){
		if (a.charAt(i) < 48  ||  a.charAt(i) > 58){
			System.out.print("Error!");
			b = false;
			break;
		}
	}
		if (b){
			int g = a.length() - 1;
			int m = g/2;
			int i;
			for(int j = 0; j<= m; j++){
				if(a.charAt(j) != a.charAt(g - j)){
					System.out.print(" There is not palindrom");
					b = false;
                                        break;
				}
			}	
		}
		if (b) System.out.print(a + " palindrom");
	}
}