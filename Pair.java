 package generics;
public class Pair<k,v> {
	private k key;
	private v value;
	public Pair() {};
	public Pair(k key,v value) {
		 this.key = key;
		 this.value = value;
	}
	public k getKey() {
		return key;
	}
	public void setKey(k key) {
		this.key = key;
	}
	public v getValue() {
		return value;
	}
	public void setValue(v value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
	
}
