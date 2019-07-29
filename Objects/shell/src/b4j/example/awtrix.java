
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class awtrix {
    public static RemoteObject myClass;
	public awtrix() {
	}
    public static PCBA staticBA = new PCBA(null, awtrix.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _appduration = RemoteObject.createImmutable(0);
public static RemoteObject _scrollposition = RemoteObject.createImmutable(0);
public static RemoteObject _shouldshow = RemoteObject.createImmutable(false);
public static RemoteObject _forcedownload = RemoteObject.createImmutable(false);
public static RemoteObject _lockapp = RemoteObject.createImmutable(false);
public static RemoteObject _icons = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _appname = RemoteObject.createImmutable("");
public static RemoteObject _appversion = RemoteObject.createImmutable("");
public static RemoteObject _tickinterval = RemoteObject.createImmutable(0);
public static RemoteObject _needdownloads = RemoteObject.createImmutable(0);
public static RemoteObject _updateinterval = RemoteObject.createImmutable(0);
public static RemoteObject _appdescription = RemoteObject.createImmutable("");
public static RemoteObject _setupinfos = RemoteObject.createImmutable("");
public static RemoteObject _appsettings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _serverversion = RemoteObject.createImmutable("");
public static RemoteObject _displaytime = RemoteObject.createImmutable(0);
public static RemoteObject _matrixwidth = RemoteObject.createImmutable(0);
public static RemoteObject _matrixheight = RemoteObject.createImmutable(0);
public static RemoteObject _downloadurl = RemoteObject.createImmutable("");
public static RemoteObject _downloadheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _startedat = RemoteObject.createImmutable(0L);
public static RemoteObject _icomap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _renderedicons = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _animcounter = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _iconlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _timermap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _set = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _target = RemoteObject.declareNull("Object");
public static RemoteObject _commandlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _colorcounter = RemoteObject.createImmutable(0);
public static RemoteObject _starttime = RemoteObject.createImmutable("");
public static RemoteObject _endtime = RemoteObject.createImmutable("");
public static RemoteObject _charmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _textbuffer = RemoteObject.createImmutable("");
public static RemoteObject _textlength = RemoteObject.createImmutable(0);
public static RemoteObject _uppercaseletters = RemoteObject.createImmutable(false);
public static RemoteObject _systemcolor = null;
public static RemoteObject _event = RemoteObject.createImmutable("");
public static RemoteObject _enabled = RemoteObject.createImmutable(false);
public static RemoteObject _noicon = null;
public static RemoteObject _isrunning = RemoteObject.createImmutable(false);
public static RemoteObject _menu = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _menulist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.randomaccessfile.B4XSerializator");
public static RemoteObject _noiconmessage = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"animCounter",_ref.getField(false, "_animcounter"),"AppDescription",_ref.getField(false, "_appdescription"),"Appduration",_ref.getField(false, "_appduration"),"AppName",_ref.getField(false, "_appname"),"appSettings",_ref.getField(false, "_appsettings"),"AppVersion",_ref.getField(false, "_appversion"),"bc",_ref.getField(false, "_bc"),"CharMap",_ref.getField(false, "_charmap"),"colorCounter",_ref.getField(false, "_colorcounter"),"commandList",_ref.getField(false, "_commandlist"),"DisplayTime",_ref.getField(false, "_displaytime"),"DownloadHeader",_ref.getField(false, "_downloadheader"),"DownloadURL",_ref.getField(false, "_downloadurl"),"Enabled",_ref.getField(false, "_enabled"),"endtime",_ref.getField(false, "_endtime"),"event",_ref.getField(false, "_event"),"forceDownload",_ref.getField(false, "_forcedownload"),"icoMap",_ref.getField(false, "_icomap"),"iconList",_ref.getField(false, "_iconlist"),"Icons",_ref.getField(false, "_icons"),"isRunning",_ref.getField(false, "_isrunning"),"LockApp",_ref.getField(false, "_lockapp"),"MatrixHeight",_ref.getField(false, "_matrixheight"),"MatrixWidth",_ref.getField(false, "_matrixwidth"),"Menu",_ref.getField(false, "_menu"),"MenuList",_ref.getField(false, "_menulist"),"NeedDownloads",_ref.getField(false, "_needdownloads"),"noIcon",_ref.getField(false, "_noicon"),"noIconMessage",_ref.getField(false, "_noiconmessage"),"RenderedIcons",_ref.getField(false, "_renderedicons"),"scrollposition",_ref.getField(false, "_scrollposition"),"ServerVersion",_ref.getField(false, "_serverversion"),"Set",_ref.getField(false, "_set"),"SetupInfos",_ref.getField(false, "_setupinfos"),"ShouldShow",_ref.getField(false, "_shouldshow"),"StartedAt",_ref.getField(false, "_startedat"),"starttime",_ref.getField(false, "_starttime"),"SystemColor",_ref.getField(false, "_systemcolor"),"Target",_ref.getField(false, "_target"),"TextBuffer",_ref.getField(false, "_textbuffer"),"TextLength",_ref.getField(false, "_textlength"),"TickInterval",_ref.getField(false, "_tickinterval"),"timermap",_ref.getField(false, "_timermap"),"UpdateInterval",_ref.getField(false, "_updateinterval"),"UppercaseLetters",_ref.getField(false, "_uppercaseletters")};
}
}