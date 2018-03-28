
public class GenerateBill {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int i;
		
		
		
		
		
		//item1.printDetail();
		PizzaOrder[] item1=new PizzaOrder[5];
		item1[0]=new PizzaOrder("panner pizza",2,20);
		item1[1]=new PizzaOrder("Mashroom Pizza",3,50);
		item1[2]=new PizzaOrder("Cheese Pizza",1,20);
		
		
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------Generation BIll--------------------------------------------");
		System.out.println("----------------------------------Pizza Order----------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("                                                                                           ");
		
		System.out.println("The Name of the product"    +    "Quantity"    +    "Price of Product"      +    "Total Price of Product:-");
		
		for(i=0;i<=2;i++)
		{
			total=(int) (total+item1[i].FindPrice());
			item1[i].printDetail();
			
			
		}

		System.out.println("Total Amount:-    "+total);
		
			int amount=total,gst_amt;
			amount=(amount*12)/100;
			gst_amt=total+amount;
			System.out.println("GST(12%) AMOUNT:-     "+amount);
			System.out.println("GST(12%) Afetr adding GST AMOUNT:-     "+gst_amt);
			System.out.println("----------------------------------THANK YOU ---------------------------------------------------------");
		
		
		
	}



}















