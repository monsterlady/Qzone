
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class qzone {
    public static RemoteObject myClass;
	public qzone() {
	}
    public static PCBA staticBA = new PCBA(null, qzone.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _app = RemoteObject.declareNull("b4j.example.awtrix");
public static RemoteObject _viewer = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"App",_ref.getField(false, "_app"),"viewer",_ref.getField(false, "_viewer")};
}
}