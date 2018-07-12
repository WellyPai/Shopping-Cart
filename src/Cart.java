import java.util.ArrayList;
public class Cart {
	
	ArrayList<String> productCode;
	ArrayList<Integer> quantity;
	int index;
	
	public Cart(){
		productCode = new ArrayList<String>();
		quantity = new ArrayList<Integer>();
		index = 0;
	}

	public void addProduct(String product, int qty)	{
		int indexof = productCode.indexOf(product);
		if(indexof == -1)
		{
			productCode.add(product);
			quantity.add(qty);
			index++;
		}
		else
		{
			int temp = quantity.get(indexof);
			quantity.set(indexof, temp+qty);
		}
		
	}
	
	public void showCart(){
		if(index==0){
			System.out.println("Cart kosong");
		}
		else
		{
			for(int x=0;x<index;x++){
				System.out.println(productCode.get(x)+" "+quantity.get(x));
			}
		}		
	}
	
	public void removeProduct(String product)
	{
		int indexof = productCode.indexOf(product);
		if(indexof == -1)
		{
			System.out.println("Produk tidak ditemukan");
		}
		else
		{
			productCode.remove(indexof);
			quantity.remove(indexof);
			index--;
		}
	}
}
