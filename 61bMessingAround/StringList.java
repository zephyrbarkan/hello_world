public class StringList {
 	public String val;
 	public StringList tail;
 	public StringList(String val, StringList tail) {
 		this.val = val;
 		this.tail = tail;
 	}
 	public String toString1() {
 		if (tail == null) { return val; }
 		return val + " " + tail.toString1();
 	}
}													