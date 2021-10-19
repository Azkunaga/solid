package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public VAT VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;

// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		
		float VATema;
// Dedukzioa kalkulatu
		billDeduction = (billAmount * deductionPercentage) / 100;
// VAT kalkulatzen dugu
		VATema = VAT.calcVAT(this.billDeduction);
// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeduction) + VATema;
	}
}