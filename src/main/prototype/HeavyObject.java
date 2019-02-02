package main.prototype;

public class HeavyObject implements Cloneable {

	private String a;
	private String b;
	private String c;

	public HeavyObject(String a, String b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "HeavyObject{" +
				"a='" + a + '\'' +
				", b='" + b + '\'' +
				", c='" + c + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof HeavyObject)) return false;

		HeavyObject that = (HeavyObject) o;

		if (a != null ? !a.equals(that.a) : that.a != null) return false;
		if (b != null ? !b.equals(that.b) : that.b != null) return false;
		return c != null ? c.equals(that.c) : that.c == null;
	}

	@Override
	public int hashCode() {
		int result = a != null ? a.hashCode() : 0;
		result = 31 * result + (b != null ? b.hashCode() : 0);
		result = 31 * result + (c != null ? c.hashCode() : 0);
		return result;
	}

	public String getA() {
		return a;
	}

	public String getB() {
		return b;
	}

	public String getC() {
		return c;
	}
}
