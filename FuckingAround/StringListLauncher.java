public class StringListLauncher {

	public static void nullify(StringList list) {
 		list.tail.tail = null;
 	}

	public static void nullify2(StringList list) {
 		StringList temp = list;
 		temp.tail = null;
 	}
 	
 	public static StringList nullify3(StringList list) {
 		list = null;
 		return list;
 	}
 	
 	public static void main(String[] args) {
 		StringList L = new StringList("we", null);
 		L.tail = new StringList("love", null);
 		L.tail.tail = new StringList("pie", null);
 		System.out.println(L.toString1());
 		nullify(L);
 		System.out.println(L.toString1());
 		nullify2(L);
 		System.out.println(L.toString1());
 		nullify3(L);
 		System.out.println(L.toString1());
 	}
}