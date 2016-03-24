package sample_0324;

public class apt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=9; i>=1; i--){
			for (int j=1; j<9; j++){
				if((i>=6)&&(j>=6)){
					break;
				}
				System.out.print((i*100+j) + " ");
				}
			System.out.println(" ");
			}
		}
	}
