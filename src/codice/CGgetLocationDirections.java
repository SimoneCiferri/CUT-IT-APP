package codice;

public class CGgetLocationDirections {
	
	private BeanShopBeanCGDirections SB;
	
	public CGgetLocationDirections(){
		this((BeanShopBeanCGDirections)null);
	}
	
	public CGgetLocationDirections(BeanShopBeanCGDirections sb) {
		this.SB=sb;
	}
	
	public void update() {
		System.out.println("Il Controller grafico chiede l'update alla bean...");
		SB.updateNomeEIndirizzo();
	}
	
}
