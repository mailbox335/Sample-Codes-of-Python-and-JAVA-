//import java.util.*;
public class GaussianElimination3x4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using the Gaussian Elimination method to "
				+ "solve the 3x4 metrix!");
		
		
		float[][] metrix={{-2,2,3,4},
				 		  {2,3,4,5},
				 		  {3,4,5,6}};

					
		for(int i=0;i<metrix.length;i++) {
			for(int j=0;j<metrix[0].length;j++) {
			System.out.print(metrix[i][j]+"     ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<metrix.length;i++) {
			
			//To find next non-zero row then exchange
			if (metrix[i][i]==0) {
				for(int m=i+1;m<metrix.length;m++) {
					if(metrix[m][i]!=0) {
						for(int n=0;n<metrix[0].length;n++) {
							float tmp1=metrix[i][n];
							metrix[i][n]=metrix[m][n];
							metrix[m][n]=tmp1;
						}
						
					}
					break;
				}
			}
			
			//make the elements positive and first element is 1.
			if(metrix[i][i]<0) {
				float tmp1=metrix[i][i]*(-1);
				for(int n=0;n<metrix[0].length;n++) {					
					metrix[i][n]=metrix[i][n]*(-1);
					metrix[i][n]=metrix[i][n]/tmp1;					
				}	
			}
			else if(metrix[i][i]>0) {
				float tmp1=metrix[i][i];
				for(int n=0;n<metrix[0].length;n++) {					
					
					metrix[i][n]=metrix[i][n]/tmp1;					
				}	
			}
			
			//make the element of the same column of following rows zero			
			if(i+1==metrix.length) break;
						
			for(int j=i+1;j<metrix.length;j++) {
				if(metrix[j][i]>0) {
					float tmp1=metrix[j][i];
					for(int n=0;n<metrix[0].length;n++) {
						
						metrix[j][n]=metrix[i][n]*tmp1-metrix[j][n];
					}				
				}
				else if(metrix[j][i]<0) {
					float tmp1=metrix[j][i]*(-1);
					for(int n=0;n<metrix[0].length;n++) {
						
						metrix[j][n]=metrix[i][n]*tmp1+metrix[j][n];
				
					}
				}
			}
		}
		
		
		System.out.println();
		System.out.println("!******************************!");

		for(int i=0;i<metrix.length;i++) {
			for(int j=0;j<metrix[0].length;j++) {
			System.out.print(metrix[i][j]+"    ");
			}
			System.out.println();
		}		

	}
	
	
}
