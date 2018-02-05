
public class QuickUnionUF {
	private int id[];
	
	public QuickUnionUF(int N){
		id = new int[N];
		for(int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}
	
	private int root(int p) {
		while(p != id[p]) p = id[p];
		return p;
	}
	
	public void union(int p, int q) {
		int rootp = root(p);
		id[rootp] = root(q);
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
}
