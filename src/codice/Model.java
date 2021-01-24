package codice;

import java.util.List;

public abstract class Model {
	
	private List<View> views;
	
	public void attach() {}
	
	public void detach() {}
	
	public void snotify() {}
}
