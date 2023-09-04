package dto;

public class ProductDTO {

	private String name;
	private int hashID;//primal_key
	private float price;

	public ProductDTO(String name, int hashID, float price) {
		setName(name);
		setHashID(hashID);
		setPrice(price);
	}
	
	@Override
	public String toString() {
		
		StringBuffer data = new StringBuffer();
		
		data.append("Data-Product: ");
		data.append("\n");
		data.append("Name: " + name);
		data.append("\n");
		data.append("Id-product: " + hashID);
		data.append("\n");
		data.append("Id-price: " + price);
		data.append("\n");
		data.append("-----------------------------");

		
		return data.toString()S;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHashID() {
		return hashID;
	}

	public void setHashID(int hashID) {
		this.hashID = hashID;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
