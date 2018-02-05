import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class DynamicConnectivityClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value of N: ");
		int N = StdIn.readInt();
		QuickUnionWeightedUF uf = new QuickUnionWeightedUF(N);
		uf.union(4, 3);
		uf.union(3, 8);
		uf.union(6, 5);
		uf.union(9, 4);
		uf.union(2, 1);
		uf.union(5, 0);
		uf.union(7, 2);
		uf.union(6, 1);
		uf.union(4, 5);
		System.out.println(uf.connected(3, 2));
		System.out.println(uf.connected(4, 3));
		System.out.println(uf.connected(4, 5));
		
		uf.printSizeArray();
	}

	
}
