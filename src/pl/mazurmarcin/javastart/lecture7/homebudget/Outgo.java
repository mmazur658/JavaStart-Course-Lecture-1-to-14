package pl.mazurmarcin.javastart.lecture7.homebudget;

public class Outgo {

	private int monthNumer;
	private double amount;
	private String type;

	public int getMonthNumer() {
		return monthNumer;
	}

	public void setMonthNumer(int monthNumer) {

		if (monthNumer < 1 || monthNumer > 12)
			System.out.println("Number miesi�ca musi by� w przedziale 1-12");
		else
			this.monthNumer = monthNumer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {

		if (amount <= 0)
			System.out.println("Warto�� nie mo�� by� mniejsza b�dz r�wna zero");
		else
			this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Miesi��: " + monthNumer + ", Typ: " + type + ", Warto��: " + amount;
	}

	public Outgo(int monthNumer, double amount, String type) {
		this.monthNumer = monthNumer;
		this.amount = amount;
		this.type = type;
	}
	
	public Outgo() {
		
	}

}
