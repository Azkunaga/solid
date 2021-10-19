package srp;

public class BillDeduction {
	public int deductionPercentage;
	public float billDeduction;

	public float calc(float billAmount) {
		if (billAmount > 50000)
			billDeduction = (billAmount * deductionPercentage + 5) / 100;
		else
			billDeduction = (billAmount * deductionPercentage) / 100;

		return billDeduction;
	}
}
