public class sushi {
    
    private String type;
    private String drink;
    private String sides;
    

    public sushi(){

    }

    public sushi(String type, String sides){
        this.type = type;
        this.sides = sides;
    }

    //question 2
    
    public sushi(String type, String drink, String sides)
    {
        this.type = type;
        this.drink = drink;
        this.sides = sides;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getDrink()
    {
        return drink;
    }

    public void setDrink(String drink)
    {
        this.drink = drink;
    }

    public String getSides()
    {
        return sides;
    }

    public void setName(String sides)
    {
        this.sides = sides;
    }

    public  boolean wasabiGinger()
    {
        return true;
    }

    public String welcome()
    {
        return "Welcome to the online sushi menu! Please order here:";
    }

    public String placeOrder(String order) 
    {
		return order;
	}
    public static void main(String[] args) 
    {
		sushi Sushi = new sushi("Maki Roll", "Green Tea", "Miso Soup");
		System.out.println(Sushi.placeOrder("Combo 1"));
		
	}


}
