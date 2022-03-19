public class Main {
	public static void calc(double vals[]) {
		int i;
		
		double sum = 0.0;
		
		double var;
		
		double mean;
		
		double sq_diffs = 0;
		
		double sd;
		
		for(i = 0; i < vals.length; i++) {
			sum += vals[i];
		}
		
		mean = sum / (vals.length);
		System.out.println("The mean of the values is " + mean);
		
		for(i=0; i < vals.length; i++) {
			sq_diffs += Math.pow((mean - vals[i]), 2);
		}
		var = sq_diffs / vals.length;
		sd = Math.sqrt(var);
		
		System.out.println("Variance is " + var + " , standard deviation is " + sd);
		
	}


	public static void main(String[] args) {
		double[] vals = {9.0, 9.5, 9.5, 10.0, 10.0, 10.0, 10.0, 10.5, 10.5, 10.5, 10.5, 11.0, 11.0, 11.0, 11.0, 11.0, 11.0, 11.5, 11.5, 11.5};
		calc(vals);
	}	
}
