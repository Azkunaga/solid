package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public VAT VAT;
	public BillDeduction billDeduction;
	public float billTotal;
	public int deductionPercentage;

// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		
		float VATema;
		float billDeductionema;
// Dedukzioa kalkulatu
		billDeductionema = this.billDeduction.calc(billTotal);
// VAT kalkulatzen dugu
		VATema = VAT.calcVAT(billDeductionema);
// Totala kalkulatzen dugu
		billTotal = (billAmount - billDeductionema) + VATema;
	}
}