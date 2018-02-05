
public class Percolation {
	private int id[][];
	
	// create n-by-n grid, with all sites blocked
	public Percolation(int N){
		id = new int[N][N];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				id[i][j] = 0;
			}
		}
	}
	
	// open site (row, col) if it is not open already
	public void open(int row, int col) {
		id[row][col] = 1;
	}
	
	// is site (row, col) open?
	public boolean isOpen(int row, int col) {
		return id[row][col] == 1;
	}
	
	// is site (row, col) full?
	public boolean isFull() {
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
