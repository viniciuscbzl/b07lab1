public class Polynomial{
	double []P;

	public Polynomial(){
		P = new double[]{0.0};
	}

	public Polynomial(double []A){
		P = new double[A.length];
		for(int i = 0; i<A.length;i++){
			P[i]=A[i];
		}
	}
	public Polynomial add(Polynomial B){
		Polynomial R;
		if (B.P.length < P.length){
			R = new Polynomial(P);
			for (int i=0;i<B.P.length;i++){
				R.P[i]+=B.P[i];
			}
		}
		else {
			R = new Polynomial(B.P);
			for (int i=0;i<P.length;i++){
				R.P[i] = P[i]+B.P[i];
			}
		}
	return R;
	}
	public double evaluate(double x){
		double result = 0.0;
		for(int i =0;i<P.length;i++){
			result+= P[i]*Math.pow(x,i);
		}
		return result;
	}
	public boolean hasRoot(double y){
		return evaluate(y) == 0.0;
	}
}