package codice;

public class BeanShopBeanCGDirections {
	
	private ModelShop Shop;
	private String NomeShop;
	private String IndirizzoShop;
	
	public BeanShopBeanCGDirections() {
		this.Shop=(new ModelShop());
		this.NomeShop=Shop.getName();
		this.IndirizzoShop=Shop.getAddress();
	}
	
	public BeanShopBeanCGDirections(ModelShop shops) {
		this.Shop=shops;
		this.NomeShop=Shop.getName();
		this.IndirizzoShop=Shop.getAddress();
	}
	
	
	public String getNome() {
		return this.NomeShop;
	}
	
	public String getIndirizzoShop() {
		return this.IndirizzoShop;
	}
	
	public void updateNomeEIndirizzo() {
		System.out.println("La bean esegue l'update...\n");
		this.NomeShop=Shop.getName();
		this.IndirizzoShop=Shop.getAddress();
		this.Shop.setNoChanges();
	}
	
}
