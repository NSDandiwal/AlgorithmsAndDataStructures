import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
	private int id[][];
	private WeightedQuickUnionUF uf;

	
	// create n-by-n grid, with all sites blocked
	public Percolation(int N){
		uf = new WeightedQuickUnionUF((N*N)+2);
		id = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				id[i][j] = 0;
			}
		}
	}
	
	// open site (row, col) if it is not open already
	public void open(int row, int col) {
		if(false) {//case for corners
			
		}
		if(false) {// handling top and bottom edges
			
		}
		if(true) {// handling left and right edges
			
		}
		id[row - 1][col - 1] = 1;
		
	}
	
	// is site (row, col) open?
	public boolean isOpen(int row, int col) {
		return id[row][col] == 1;
	}
	
	// is site (row, col) full?
	public boolean isFull(int row, int col) {
		return false;
	}
	
	// number of open sites
	public int numberOfOpenSites() {
		return 0;
	}
	
	// does the system percolate?
	public boolean percolates() {
		return false;
	}
	
	// test client
	public static void main(String[] args) {
		
	}
	
	
}
