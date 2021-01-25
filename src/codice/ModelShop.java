package codice;

public class ModelShop extends Model {
	
	private String NomeShop;
	private String IndirizzoShop;
	private boolean changes=false;
	
	public ModelShop() {
		this("noName","NoAddress");
	}
	
	public ModelShop(String nome, String Indirizzo) {
		this.NomeShop=nome;
		this.IndirizzoShop=Indirizzo;
	}
	
	protected boolean needToNotify() {
		return changes;
	}
	
	public String getName() {
		return this.NomeShop;
	}
	
	public String getAddress() {
		return this.IndirizzoShop;
	}
	
	public void setNomeShop() {
		this.NomeShop="Ebay";
		this.changes=true;
		this.notifyViews();
	}
	
	public void setIndirizzoShop() {
		this.IndirizzoShop="Torrenova";
		this.changes=true;
		this.notifyViews();
	}
	
	public void setNomeEIndirizzo() {
		this.NomeShop="Amazon";
		this.IndirizzoShop="Casirate D'adda";
		this.changes=true;
		this.notifyViews();
	}
	
	public void setNoChanges() {
		this.changes=false;
	}
	
}
