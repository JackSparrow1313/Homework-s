import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
        
/*
class Product for ILMAZ13
*/

public class Shop {
    double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double buy(Product p) {
        return this.money -= p.getPrice();
    }

    public String maxWeight(Product a, Product b) {
        if (a.getWeight() > b.getWeight()) return a.getName();
        else return b.getName();
    }

    public String mostExpensive(Product a, Product b) {
        if (a.getPrice() > b.getPrice()) return a.getName();
        else return b.getName();
    }
        public static void main(String[] args){
        GregorianCalendar cal = new GregorianCalendar();
        cal.set(2015, 11, 1);
		GregorianCalendar cal1 = new GregorianCalendar();
        cal1.set(2015,9,14);
        Product a = new  Product("pie","ru", 1000, cal, 40);
		Product b = new  Product("MEAT","kh", 5000, cal1, 35);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
                        Shop m = new Shop();
                        m.setMoney(10000.00);
                        m.buy(a);
                        System.out.println(m.buy(b));
                        System.out.println(m.maxWeight(a, b));
                        System.out.println(m.mostExpensive(a, b));
    }
    
    
}