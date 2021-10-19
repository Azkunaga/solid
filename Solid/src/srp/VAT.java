package srp;

public class VAT {

	public static float VAT = (float) 0.16;
	
	
	public float getVAT() {
		return VAT;
	}
	
	public float calcVAT(float billDeduction) {
		
		return billDeduction * VAT;
	}
}
