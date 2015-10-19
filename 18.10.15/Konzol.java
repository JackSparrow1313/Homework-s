public class Konzol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dist = (int)Math.round(args.length / 1.247);
        
        while(dist != 0)
        {
            for(int i = 0; i + dist < args.length; i++)
            {
                if(args[i].length() > args[i + dist].length())
                {
                    String temp = args[i];
                    args[i] = args[i + dist];
                    args[i + dist] = temp;
                }
            }
            dist--;
        }
        
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
    
}
