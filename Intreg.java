
public class Intreg extends Tip {

	protected int valoare;
	
	public Intreg(int a) {
		valoare=a;
	}
	
	@Override
	public String getTip() {
		return "Tip: Intreg";
	}
	
	public int getValoare() {
		return this.valoare;
	}

	@Override
	public String toString() {
		return "" + this.getValoare();
	}

}
