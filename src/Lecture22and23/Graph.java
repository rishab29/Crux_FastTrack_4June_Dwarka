package Lecture22and23;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class Graph {
	private class Vertex {
		String name;
		HashMap<Vertex, Integer> nbrs;

		public Vertex(String name) {
			this.name = name;
			this.nbrs = new HashMap<>();
		}

		public void display() {
			String osf = this.name + "=>";
			Set<Vertex> nbrs = this.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				osf = osf + nbr.name + "(" + this.nbrs.get(nbr) + "), ";
			}
			osf = osf + "END";
			System.out.println(osf);

		}
	}

	private HashMap<String, Vertex> vtces;
	private int numvtces;

	public Graph() {
		this.vtces = new HashMap<>();
		this.numvtces = 0;
	}

	public int numVtces() {
		return this.vtces.size();
	}

	public void addVertex(String name) {
		if (this.vtces.containsKey(name)) {
			return;
		}
		Vertex vtx = new Vertex(name);
		this.vtces.put(name, vtx);
	}

	public void removeVertex(String name) {
		if (!this.vtces.containsKey(name)) {
			return;
		}
		Vertex rvtx = this.vtces.get(name);
		Set<Vertex> nbrs = rvtx.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			nbr.nbrs.remove(rvtx);
		}

		this.vtces.remove(name);

	}

	public int numEdges() {

		Collection<Vertex> allvtces = this.vtces.values();
		int rv = 0;
		for (Vertex onevtx : allvtces) {
			rv = rv + onevtx.nbrs.size();
		}
		rv = rv / 2;
		return rv;
	}

	public void addEdge(String name1, String name2, int cost) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.put(vtx2, cost);
		vtx2.nbrs.put(vtx1, cost);

	}

	public void removeEdge(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null || !vtx1.nbrs.containsKey(vtx2)) {
			return;
		}

		vtx1.nbrs.remove(vtx2);
		vtx2.nbrs.remove(vtx1);

	}

	public void display() {
		Collection<Vertex> allvtces = this.vtces.values();

		for (Vertex onevtx : allvtces) {
			onevtx.display();
		}
		System.out.println("**********************");
	}

	public boolean hasPath(String name1, String name2) {
		Vertex vtx1 = this.vtces.get(name1);
		Vertex vtx2 = this.vtces.get(name2);

		if (vtx1 == null || vtx2 == null) {
			return false;
		}
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		return this.hasPathIterative(vtx1, vtx2, explored);
	}

	private boolean hasPathRecursive(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		if (!explored.containsKey(vtx1)) {
			explored.put(vtx1, true);
		} else {
			return false;
		}
		if (vtx1.nbrs.containsKey(vtx2)) {
			return true;
		}
		Set<Vertex> nbrs = vtx1.nbrs.keySet();
		for (Vertex nbr : nbrs) {
			if (this.hasPathRecursive(nbr, vtx2, explored)) {
				return true;
			}
		}
		return false;
	}

	private boolean hasPathIterative(Vertex vtx1, Vertex vtx2, HashMap<Vertex, Boolean> explored) {
		LinkedList<Vertex> queue = new LinkedList<>();
		queue.add(vtx1);
		while (!queue.isEmpty()) {
			Vertex rv = queue.remove();
			if (!explored.containsKey(rv)) {
				explored.put(rv, true);
				if (rv.nbrs.containsKey(vtx2)) {
					return true;
				} else {
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
		}
		return false;
	}
	
	public void dft() {
		LinkedList<Vertex> stack = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				stack.addFirst(vtx);
			}
			while (!stack.isEmpty()) {
				Vertex rv = stack.removeFirst();
				if (!explored.containsKey(rv)) {
					explored.put(rv, true);
					System.out.print(rv.name);
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							stack.addFirst(nbr);
						}
					}
				}
			}
		}
	}
	
	public void bft() {
		LinkedList<Vertex> queue = new LinkedList<>();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		Collection<Vertex> vtces = this.vtces.values();
		for (Vertex vtx : vtces) {
			if (!explored.containsKey(vtx)) {
				queue.add(vtx);
			}
			while (!queue.isEmpty()) {
				Vertex rv = queue.remove();
				if (!explored.containsKey(rv)) {
					explored.put(rv, true);
					System.out.print(rv.name);
					Set<Vertex> nbrs = rv.nbrs.keySet();
					for (Vertex nbr : nbrs) {
						if (!explored.containsKey(nbr)) {
							queue.add(nbr);
						}
					}
				}
			}
		}
	}
	
	public boolean isConnected() {
		LinkedList<Vertex> queue = new LinkedList<>();
		Collection<Vertex> vtces = this.vtces.values();
		HashMap<Vertex, Boolean> explored = new HashMap<>();
		queue.add((Vertex) vtces.toArray()[0]);
		while (!queue.isEmpty()) {
			Vertex rv = queue.remove();
			if (!explored.containsKey(rv)) {
				explored.put(rv, true);
				// System.out.print(rv.name);
				Set<Vertex> nbrs = rv.nbrs.keySet();
				for (Vertex nbr : nbrs) {
					if (!explored.containsKey(nbr)) {
						queue.add(nbr);
					}
				}
			}
		}

		return this.vtces.size() == explored.size();
	}
	
	public void Dijkstras(String source1) {
		int[] dis = new int[this.vtces.size()];
		for (int i = 0; i < dis.length; i++) {
			dis[i] = Integer.MAX_VALUE;
		}
		Vertex v = this.vtces.get(source1);
		dis[source1.charAt(0) - 65] = 0;
		Queue<String> queue = new LinkedList<>();
		queue.add(source1);
		while (!queue.isEmpty()) {
			String str = queue.remove();
			Vertex vtx = this.vtces.get(str);
			Set<Vertex> nbrs = vtx.nbrs.keySet();
			for (Vertex nbr : nbrs) {
				int oldcost = dis[nbr.name.charAt(0) - 65];
				int newcost = dis[vtx.name.charAt(0) - 65] + vtx.nbrs.get(nbr);
				if (newcost < oldcost) {
					dis[nbr.name.charAt(0) - 65] = newcost;
					queue.add(nbr.name);
				}
			}
		}
		for (int i = 0; i < dis.length; i++) {
			System.out.print(dis[i] + " ");
		}
		System.out.println();
	}

	// ================================================

	private class PrimsPair implements Comparable<PrimsPair> {
		String vname;
		String acqvname;
		int cost;

		public PrimsPair(String name) {
			this.vname = name;
			this.acqvname = null;
			this.cost = Integer.MAX_VALUE;
		}

		@Override
		public int compareTo(PrimsPair o) {
			return this.cost - o.cost;
		}
	}

	public Graph primsAlgo() {
		Graph mst = new Graph();
		HashMap<String, PrimsPair> map = new HashMap<>();
		Heap<PrimsPair> heap = new Heap<>(true); // Min heap

		// PART 1
		// Make pairs for all vertices & add in heap, hashmap
		for (String key : this.vtces.keySet()) {
			PrimsPair np = new PrimsPair(key);
			heap.add(np);
			map.put(key, np);
		}

		// PART 2
		// 1. Remove pair from heap
		// 2. Add in MST
		// 3. Update its nbrs
		while (!heap.isEmpty()) {

			// Step 1
			PrimsPair rp = heap.remove();
			map.remove(rp.vname);

			// Step 2
			if (rp.acqvname == null) {
				mst.addVertex(rp.vname);
			} else {
				mst.addVertex(rp.vname);
				mst.addEdge(rp.vname, rp.acqvname, rp.cost);
			}

			// Step 3
			for (Vertex nbr : this.vtces.get(rp.vname).nbrs.keySet()) {
				if (map.containsKey(nbr.name)) {
					PrimsPair gp = map.get(nbr.name);
					int oldcost = gp.cost;
					int newcost = this.vtces.get(rp.vname).nbrs.get(nbr);
					if (newcost < oldcost) {
						gp.acqvname = rp.vname;
						gp.cost = newcost;
						heap.updatePriority(gp);
					}
				}
			}
		}

		return mst;
	}
}
