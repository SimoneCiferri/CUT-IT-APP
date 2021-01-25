package codice;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class Model {
	
	private List<View> views;
	
	public Model() {
		this((View) null);
	}
	
	public Model(View view) {
		this(new Vector<View>());
		if (view != null) {
			this.views.add(view);
		}
	}
	
	public Model(List<View> viewlist) {
		this.views = viewlist;
	}
	
	public void attach(View view) {
		this.views.add(view);
	}
	
	public void detach(View view) {
		this.views.remove(view);
	}
	
	public void notifyViews() {
		System.out.println("Notifico tutte le viste del cambiamento...\n");
		List<View> localViews = null;
		if (this.needToNotify()) {
			localViews = new ArrayList<View>(this.views);
		}
		if(localViews != null) {
			Iterator<View> iter = localViews.iterator();
			while (iter.hasNext()) {
				View viewToUpdate = iter.next();
				viewToUpdate.update();
			}
		}
		
	}
	
	protected abstract boolean needToNotify();
}
