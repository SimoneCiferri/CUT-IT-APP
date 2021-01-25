package codice;

public class ViewCustomerGetLocationDirections extends View {
	
	private CGgetLocationDirections CG;
	BeanShopBeanCGDirections SB;
	
	
	public ViewCustomerGetLocationDirections() {
		this((CGgetLocationDirections)null, (BeanShopBeanCGDirections)null);
	}
	
	public ViewCustomerGetLocationDirections(CGgetLocationDirections cg, BeanShopBeanCGDirections sb) {
		this.CG=cg;
		this.SB=sb;
	}
	
	@Override
	public void update() {
		System.out.println("\nLa view richiede l'update...");
		CG.update();
	}
	
	public void printNomeEIndirizzo() {
		System.out.println("Nome Shop ->> "+ SB.getNome());
		System.out.println("IndirizzoShop Shop ->> "+ SB.getIndirizzoShop());
	}
}
