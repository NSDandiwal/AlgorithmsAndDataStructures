
public class QuickUnionWeightedUF {
	private int id[];
	private int sz[];
	
	public QuickUnionWeightedUF(int N){
		id = new int[N];
		sz = new int[N];
		for(int i = 0; i < id.length; i++) {
			id[i] = i;
			sz[i] = 1;
		}
	}
	
	private int root(int p) {
		while(p != id[p]) p = id[p];
		return p;
	}
	
	public void union(int p, int q) {
		int rootp = root(p);
		int rootq = root(q);
		if(rootp == rootq) return;
		if(sz[rootp] < sz[rootq]) {
			id[rootp] = rootq;
			sz[rootq] += sz[rootp];
		} else {
			id[rootq] = rootp;
			sz[rootp] += sz[rootq];
		}
		printArray();
		System.out.println();
		System.out.println();
	}
	
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	public void printArray() {
		for(int i = 0; i < id.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 0; i < id.length; i++) {
			System.out.print(id[i] + "\t");
		}
	}
	
	public void printSizeArray() {
		for(int i = 0; i < sz.length; i++) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for(int i = 0; i < sz.length; i++) {
			System.out.print(sz[i] + "\t");
		}
	}
}
