package Lecture22and23;

import java.util.ArrayList;
import java.util.HashMap;

public class Heap<T extends Comparable<T>> {		//klogN < NlogN
	private ArrayList<T> data;
	HashMap<T, Integer> map = new HashMap();
	
	private boolean isMin;
	
	public Heap() {
		this(false);
	}
	
	public Heap(boolean isMin) {
		this.data = new ArrayList<>();
		this.isMin = isMin;
	}
	
	public Heap(T[] items, boolean isMin) {		// O(N)
		this(isMin);
		for (T item : items) {
			this.data.add(item);
		}
		
		int index = this.size()/2 - 1;

		while (index>=0) {
			this.downheapify(index);
			index--;
		}
	}
	
	public int size() {
		return this.data.size();
	}
	
	public boolean isEmpty() {
		return this.data.size() == 0;
	}
	
	public T getHP() {
		return this.data.get(0);
	}
	
	public void add(T value) {
		this.data.add(value);
		this.map.put(value, this.size()-1);
		this.upheapify(this.size()-1);
	}
	
	private void upheapify(int ci) {
		if (ci==0) {
			return;
		}
		int pi = (ci-1)/2;
		if (!this.isLarger(pi, ci)) {
			this.swap(pi, ci);
			this.upheapify(pi);
		}
	}
	
	private void swap(int i, int j) {
		T ithdata = this.data.get(i);
		T jthdata = this.data.get(j);
		this.data.set(i, jthdata);
		this.data.set(j, ithdata);
		this.map.put(ithdata, j);
		this.map.put(jthdata, i);
	}
	
	private boolean isLarger(int i, int j) {
		T ithitem = this.data.get(i);
		T jthitem = this.data.get(j);

		if (this.isMin) {
			return ithitem.compareTo(jthitem) < 0;
		} else {
			return ithitem.compareTo(jthitem) > 0;
		}

	}
	
	public void display() {
		this.display(0);
	}
	
	private void display(int index) {
		int lci = 2*index + 1;
		int rci = 2*index + 2;
		String str = "";
		
		if (lci<this.size()) {
			T lc = this.data.get(lci);
			str = str + lc + "=>";
		}
		else {
			str = str + "END=>";
		}
		
		str = str + this.data.get(index);
		
		if (rci<this.size()) {
			T rc = this.data.get(rci);
			str = str + "<=" + rc;
		}
		else {
			str = str + "<=END";
		}
		
		System.out.println(str);
		
		if (lci<this.size()) {
			this.display(lci);
		}
		if (rci<this.size()) {
			this.display(rci);
		}
		
	}
	
	public T remove() {
		T rv = this.data.get(0);
		this.swap(0, this.size()-1);
		this.data.remove(this.size()-1);
		this.downheapify(0);
		this.map.remove(rv);
		return rv;
	}
	
	private void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mi = pi;
		if (lci < this.data.size() && this.isLarger(lci, mi)) {
			mi = lci;
		}
		if (rci < this.data.size() && this.isLarger(rci, mi)) {
			mi = rci;
		}

		if (mi != pi) {
			this.swap(mi, pi);
			this.downheapify(mi);
		}		
	}
	
	
	public void updatePriority(T pair) {
		int index = map.get(pair);
		this.upheapify(index);
	}
	
	
}

