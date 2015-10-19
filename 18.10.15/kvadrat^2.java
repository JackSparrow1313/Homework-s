public class Azaza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = args[0];
        
        double a,b,c;
        int pos = 0;
        String sym = "";
        for(; input.charAt(pos) != 'x'; pos++)
        {
            sym += input.charAt(pos);
        }
        a = Double.parseDouble(sym);
        sym = "";
        
        pos += 3;
        
        for(; input.charAt(pos) != 'x'; pos++)
        {
            sym += input.charAt(pos);
        }
        b = Double.parseDouble(sym); sym = "";
        
        pos++;
        
        for(; pos < input.length(); pos++)
        {
            sym += input.charAt(pos);
        }
        c = Double.parseDouble(sym); sym = "";
        
        double D = b * b - 4 * a * c;
        double x1,x2;
        
        if(D >= 0)
        {
            x1 = (-b - Math.sqrt(D))/ 2 * a;
            x2 = (-b + Math.sqrt(D))/ 2 * a;
            
            System.out.println("x1= " + Double.toString(x1));
            System.out.println("x2= " + Double.toString(x2));
        }
        else System.out.print("no!");
    }
    
}
