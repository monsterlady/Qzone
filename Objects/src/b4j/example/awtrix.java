package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class awtrix extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.awtrix", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.awtrix.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _jobresponse{
public boolean IsInitialized;
public int jobNr;
public boolean Success;
public String ResponseString;
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper Stream;
public void Initialize() {
IsInitialized = true;
jobNr = 0;
Success = false;
ResponseString = "";
Stream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public int _appduration = 0;
public int _scrollposition = 0;
public boolean _shouldshow = false;
public boolean _forcedownload = false;
public boolean _lockapp = false;
public anywheresoftware.b4a.objects.collections.List _icons = null;
public String _appname = "";
public String _appversion = "";
public int _tickinterval = 0;
public int _needdownloads = 0;
public int _updateinterval = 0;
public String _appdescription = "";
public String _setupinfos = "";
public anywheresoftware.b4a.objects.collections.Map _appsettings = null;
public String _serverversion = "";
public int _displaytime = 0;
public int _matrixwidth = 0;
public int _matrixheight = 0;
public String _downloadurl = "";
public anywheresoftware.b4a.objects.collections.Map _downloadheader = null;
public long _startedat = 0L;
public anywheresoftware.b4a.objects.collections.Map _icomap = null;
public anywheresoftware.b4a.objects.collections.Map _renderedicons = null;
public anywheresoftware.b4a.objects.collections.Map _animcounter = null;
public anywheresoftware.b4a.objects.collections.List _iconlist = null;
public anywheresoftware.b4a.objects.collections.Map _timermap = null;
public anywheresoftware.b4a.objects.collections.Map _set = null;
public Object _target = null;
public anywheresoftware.b4a.objects.collections.List _commandlist = null;
public int _colorcounter = 0;
public String _starttime = "";
public String _endtime = "";
public anywheresoftware.b4a.objects.collections.Map _charmap = null;
public String _textbuffer = "";
public int _textlength = 0;
public boolean _uppercaseletters = false;
public int[] _systemcolor = null;
public String _event = "";
public boolean _enabled = false;
public short[] _noicon = null;
public boolean _isrunning = false;
public anywheresoftware.b4a.objects.collections.Map _menu = null;
public anywheresoftware.b4a.objects.collections.List _menulist = null;
public anywheresoftware.b4a.randomaccessfile.B4XSerializator _bc = null;
public boolean _noiconmessage = false;
public b4j.example.main _main = null;
public String  _gentext(b4j.example.awtrix __ref,String _text,boolean _iconoffset,int _ypostition,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "gentext", false))
	 {return ((String) Debug.delegate(ba, "gentext", new Object[] {_text,_iconoffset,_ypostition,_color}));}
int _offset = 0;
int _x = 0;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub genText(Text As String,IconOffset As Bo";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="calcTextLength(Text)";
__ref._calctextlength /*int*/ (null,_text);
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim offset As Int";
_offset = 0;
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="If IconOffset Then offset = 24 Else offset = 32";
if (_iconoffset) { 
_offset = (int) (24);}
else {
_offset = (int) (32);};
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="If TextLength>offset Then";
if (__ref._textlength /*int*/ >_offset) { 
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="drawText(Text,scrollposition,yPostition,Color)";
__ref._drawtext /*String*/ (null,_text,__ref._scrollposition /*int*/ ,_ypostition,_color);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="scrollposition=scrollposition-1";
__ref._scrollposition /*int*/  = (int) (__ref._scrollposition /*int*/ -1);
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="If scrollposition< 0-TextLength  Then";
if (__ref._scrollposition /*int*/ <0-__ref._textlength /*int*/ ) { 
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="If LockApp Then";
if (__ref._lockapp /*boolean*/ ) { 
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="finish";
__ref._finish /*String*/ (null);
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="scrollposition=MatrixWidth";
__ref._scrollposition /*int*/  = __ref._matrixwidth /*int*/ ;
 };
 };
 }else {
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="If TextLength<offset+1 Then";
if (__ref._textlength /*int*/ <_offset+1) { 
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="If IconOffset Then";
if (_iconoffset) { 
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="x=((MatrixWidth/2)-TextLength/2)+4";
_x = (int) (((__ref._matrixwidth /*int*/ /(double)2)-__ref._textlength /*int*/ /(double)2)+4);
 }else {
RDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="x=(MatrixWidth/2)-TextLength/2";
_x = (int) ((__ref._matrixwidth /*int*/ /(double)2)-__ref._textlength /*int*/ /(double)2);
 };
 };
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="drawText(Text,x,yPostition,Color)";
__ref._drawtext /*String*/ (null,_text,_x,_ypostition,_color);
 };
RDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="End Sub";
return "";
}
public String  _drawbmp(b4j.example.awtrix __ref,int _x,int _y,short[] _bmp,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "drawbmp", false))
	 {return ((String) Debug.delegate(ba, "drawbmp", new Object[] {_x,_y,_bmp,_width,_height}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub drawBMP(x As Int,y As Int,bmp() As Shor";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="commandList.Add(CreateMap(\"type\":\"bmp\",\"x\":x,\"y\":";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("bmp"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("bmp"),(Object)(_bmp),(Object)("width"),(Object)(_width),(Object)("height"),(Object)(_height)}).getObject()));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public short[]  _geticon(b4j.example.awtrix __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "geticon", false))
	 {return ((short[]) Debug.delegate(ba, "geticon", new Object[] {_id}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub getIcon(ID As Int) As Short()";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="If RenderedIcons.ContainsKey(ID) Then";
if (__ref._renderedicons /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_id))) { 
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Return RenderedIcons.Get(ID)";
if (true) return (short[])(__ref._renderedicons /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_id)));
 }else {
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="If noIconMessage = False Then";
if (__ref._noiconmessage /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Log(\"Got Error from \" & AppName)";
__c.Log("Got Error from "+__ref._appname /*String*/ );
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Log(\"Icon \" & ID & \" not found\")";
__c.Log("Icon "+BA.NumberToString(_id)+" not found");
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="noIconMessage=True";
__ref._noiconmessage /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Return noIcon";
if (true) return __ref._noicon /*short[]*/ ;
 };
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="End Sub";
return null;
}
public Object  _get(b4j.example.awtrix __ref,String _settingskey) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "get", false))
	 {return ((Object) Debug.delegate(ba, "get", new Object[] {_settingskey}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub get(SettingsKey As String) As Object";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="If appSettings.ContainsKey(SettingsKey) Then";
if (__ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_settingskey))) { 
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Return appSettings.Get(SettingsKey)";
if (true) return __ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_settingskey));
 }else {
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Log(SettingsKey & \" not found\")";
__c.Log(_settingskey+" not found");
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.awtrix __ref,anywheresoftware.b4a.BA _ba,Object _class,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_class,_eventname}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub Initialize(class As Object, Eventname A";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="DownloadHeader.Initialize";
__ref._downloadheader /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="event=Eventname";
__ref._event /*String*/  = _eventname;
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="iconList.Initialize";
__ref._iconlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Icons.Initialize";
__ref._icons /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="commandList.Initialize";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="RenderedIcons.Initialize";
__ref._renderedicons /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="icoMap.Initialize";
__ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="animCounter.Initialize";
__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="timermap.Initialize";
__ref._timermap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786442;
 //BA.debugLineNum = 786442;BA.debugLine="Set.Initialize";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="Menu.Initialize";
__ref._menu /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="MenuList.Initialize";
__ref._menulist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=786445;
 //BA.debugLineNum = 786445;BA.debugLine="Target=class";
__ref._target /*Object*/  = _class;
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="End Sub";
return "";
}
public String  _makesettings(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "makesettings", false))
	 {return ((String) Debug.delegate(ba, "makesettings", null));}
byte[] _data = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
int _counter = 0;
String _settingskey = "";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub MakeSettings";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\"),A";
if (__c.File.Exists(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax")) { 
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim data() As Byte = File.ReadBytes(File.Combine";
_data = __c.File.ReadBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax");
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(data)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bc /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertBytesToObject(_data)));
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="For Each k As String In appSettings.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="If Not(m.ContainsKey(k)) Then";
if (__c.Not(_m.ContainsKey((Object)(_k)))) { 
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="m.Put(k,appSettings.Get(k))";
_m.Put((Object)(_k),__ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }else {
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="appSettings.Put(k,m.Get(k))";
__ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_m.Get((Object)(_k)));
 };
 }
};
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="For Counter = m.Size -1 To 0 Step -1";
{
final int step11 = -1;
final int limit11 = (int) (0);
_counter = (int) (_m.getSize()-1) ;
for (;_counter >= limit11 ;_counter = _counter + step11 ) {
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="Dim SettingsKey As String = m.GetKeyAt(Counter)";
_settingskey = BA.ObjectToString(_m.GetKeyAt(_counter));
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="If Not(SettingsKey=\"UpdateInterval\" Or Settings";
if (__c.Not((_settingskey).equals("UpdateInterval") || (_settingskey).equals("StartTime") || (_settingskey).equals("EndTime") || (_settingskey).equals("DisplayTime") || (_settingskey).equals("Enabled"))) { 
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="If Not(appSettings.ContainsKey(SettingsKey)) T";
if (__c.Not(__ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_settingskey)))) { 
_m.Remove((Object)(_settingskey));};
 };
 }
};
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="Try";
try {RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="Enabled=m.Get(\"Enabled\")";
__ref._enabled /*boolean*/  = BA.ObjectToBoolean(_m.Get((Object)("Enabled")));
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="starttime=m.Get(\"StartTime\")";
__ref._starttime /*String*/  = BA.ObjectToString(_m.Get((Object)("StartTime")));
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="endtime=m.Get(\"EndTime\")";
__ref._endtime /*String*/  = BA.ObjectToString(_m.Get((Object)("EndTime")));
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="UpdateInterval=m.Get(\"UpdateInterval\")";
__ref._updateinterval /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("UpdateInterval"))));
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="DisplayTime=m.Get(\"DisplayTime\")";
__ref._displaytime /*int*/  = (int)(BA.ObjectToNumber(_m.Get((Object)("DisplayTime"))));
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\"";
__c.File.WriteBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax",__ref._bc /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertObjectToBytes((Object)(_m.getObject())));
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="If SubExists(Target,event&\"_settingsChanged\") T";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_settingsChanged")) { 
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="CallSub(Target,event&\"_settingsChanged\")'ignor";
__c.CallSubNew(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_settingsChanged");
 };
 } 
       catch (Exception e28) {
			ba.setLastException(e28);RDebugUtils.currentLine=1507356;
 //BA.debugLineNum = 1507356;BA.debugLine="Log(\"Got Error from \" & AppName)";
__c.Log("Got Error from "+__ref._appname /*String*/ );
RDebugUtils.currentLine=1507357;
 //BA.debugLineNum = 1507357;BA.debugLine="Log(\"Error while saving settings\")";
__c.Log("Error while saving settings");
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 }else {
RDebugUtils.currentLine=1507361;
 //BA.debugLineNum = 1507361;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1507362;
 //BA.debugLineNum = 1507362;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=1507363;
 //BA.debugLineNum = 1507363;BA.debugLine="m.Put(\"UpdateInterval\",UpdateInterval)";
_m.Put((Object)("UpdateInterval"),(Object)(__ref._updateinterval /*int*/ ));
RDebugUtils.currentLine=1507364;
 //BA.debugLineNum = 1507364;BA.debugLine="m.Put(\"StartTime\",\"00:00\")";
_m.Put((Object)("StartTime"),(Object)("00:00"));
RDebugUtils.currentLine=1507365;
 //BA.debugLineNum = 1507365;BA.debugLine="m.Put(\"EndTime\",\"00:00\")";
_m.Put((Object)("EndTime"),(Object)("00:00"));
RDebugUtils.currentLine=1507366;
 //BA.debugLineNum = 1507366;BA.debugLine="m.Put(\"DisplayTime\",\"0\")";
_m.Put((Object)("DisplayTime"),(Object)("0"));
RDebugUtils.currentLine=1507367;
 //BA.debugLineNum = 1507367;BA.debugLine="m.Put(\"Enabled\",True)";
_m.Put((Object)("Enabled"),(Object)(__c.True));
RDebugUtils.currentLine=1507368;
 //BA.debugLineNum = 1507368;BA.debugLine="For Each k As String In appSettings.Keys";
{
final anywheresoftware.b4a.BA.IterableList group40 = __ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen40 = group40.getSize()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_k = BA.ObjectToString(group40.Get(index40));
RDebugUtils.currentLine=1507369;
 //BA.debugLineNum = 1507369;BA.debugLine="m.Put(k,appSettings.Get(k))";
_m.Put((Object)(_k),__ref._appsettings /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
RDebugUtils.currentLine=1507371;
 //BA.debugLineNum = 1507371;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\")";
__c.File.WriteBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax",__ref._bc /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertObjectToBytes((Object)(_m.getObject())));
 };
RDebugUtils.currentLine=1507373;
 //BA.debugLineNum = 1507373;BA.debugLine="End Sub";
return "";
}
public Object  _appcontrol(b4j.example.awtrix __ref,String _tag,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "appcontrol", false))
	 {return ((Object) Debug.delegate(ba, "appcontrol", new Object[] {_tag,_params}));}
anywheresoftware.b4a.objects.collections.Map _downloadmap = null;
b4j.example.awtrix._jobresponse _res = null;
anywheresoftware.b4a.objects.collections.Map _infos = null;
byte[] _data = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
boolean _isconfigured = false;
anywheresoftware.b4a.objects.collections.Map _m = null;
Object _v = null;
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub AppControl(Tag As String, Params As Map";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Select Case Tag";
switch (BA.switchObjectToInt(_tag,"start","downloadCount","startDownload","httpResponse","running","tick","infos","setSettings","getUpdateInterval","setEnabled","getEnable","stop","getIcon","iconList","externalCommand","getMenu")) {
case 0: {
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="If SubExists(Target,event&\"_Started\") Then";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_Started")) { 
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="CallSub(Target,event&\"_Started\")";
__c.CallSubNew(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_Started");
 };
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="Try";
try {RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Appduration = Params.Get(\"AppDuration\")";
__ref._appduration /*int*/  = (int)(BA.ObjectToNumber(_params.Get((Object)("AppDuration"))));
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="If DisplayTime>0 Then";
if (__ref._displaytime /*int*/ >0) { 
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="Appduration=DisplayTime";
__ref._appduration /*int*/  = __ref._displaytime /*int*/ ;
 };
RDebugUtils.currentLine=1310731;
 //BA.debugLineNum = 1310731;BA.debugLine="ServerVersion =	 Params.Get(\"ServerVersion\")";
__ref._serverversion /*String*/  = BA.ObjectToString(_params.Get((Object)("ServerVersion")));
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="MatrixWidth = Params.Get(\"MatrixWidth\")";
__ref._matrixwidth /*int*/  = (int)(BA.ObjectToNumber(_params.Get((Object)("MatrixWidth"))));
RDebugUtils.currentLine=1310733;
 //BA.debugLineNum = 1310733;BA.debugLine="MatrixHeight = Params.Get(\"MatrixHeight\")";
__ref._matrixheight /*int*/  = (int)(BA.ObjectToNumber(_params.Get((Object)("MatrixHeight"))));
RDebugUtils.currentLine=1310734;
 //BA.debugLineNum = 1310734;BA.debugLine="UppercaseLetters = Params.Get(\"UppercaseLetter";
__ref._uppercaseletters /*boolean*/  = BA.ObjectToBoolean(_params.Get((Object)("UppercaseLetters")));
RDebugUtils.currentLine=1310735;
 //BA.debugLineNum = 1310735;BA.debugLine="CharMap = Params.Get(\"CharMap\")";
__ref._charmap /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_params.Get((Object)("CharMap"))));
RDebugUtils.currentLine=1310736;
 //BA.debugLineNum = 1310736;BA.debugLine="SystemColor = Params.Get(\"SystemColor\")";
__ref._systemcolor /*int[]*/  = (int[])(_params.Get((Object)("SystemColor")));
RDebugUtils.currentLine=1310737;
 //BA.debugLineNum = 1310737;BA.debugLine="scrollposition=MatrixWidth";
__ref._scrollposition /*int*/  = __ref._matrixwidth /*int*/ ;
RDebugUtils.currentLine=1310738;
 //BA.debugLineNum = 1310738;BA.debugLine="Set.Put(\"interval\",TickInterval)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("interval"),(Object)(__ref._tickinterval /*int*/ ));
RDebugUtils.currentLine=1310739;
 //BA.debugLineNum = 1310739;BA.debugLine="Set.Put(\"needDownload\",NeedDownloads)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("needDownload"),(Object)(__ref._needdownloads /*int*/ ));
RDebugUtils.currentLine=1310740;
 //BA.debugLineNum = 1310740;BA.debugLine="Set.Put(\"DisplayTime\", DisplayTime)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("DisplayTime"),(Object)(__ref._displaytime /*int*/ ));
RDebugUtils.currentLine=1310741;
 //BA.debugLineNum = 1310741;BA.debugLine="Set.Put(\"forceDownload\", forceDownload)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("forceDownload"),(Object)(__ref._forcedownload /*boolean*/ ));
 } 
       catch (Exception e23) {
			ba.setLastException(e23);RDebugUtils.currentLine=1310743;
 //BA.debugLineNum = 1310743;BA.debugLine="Log(\"Got Error from \" & AppName)";
__c.Log("Got Error from "+__ref._appname /*String*/ );
RDebugUtils.currentLine=1310744;
 //BA.debugLineNum = 1310744;BA.debugLine="Log(\"Error in start procedure\")";
__c.Log("Error in start procedure");
RDebugUtils.currentLine=1310745;
 //BA.debugLineNum = 1310745;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=1310747;
 //BA.debugLineNum = 1310747;BA.debugLine="StartedAt=DateTime.now";
__ref._startedat /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=1310748;
 //BA.debugLineNum = 1310748;BA.debugLine="noIconMessage=False";
__ref._noiconmessage /*boolean*/  = __c.False;
RDebugUtils.currentLine=1310749;
 //BA.debugLineNum = 1310749;BA.debugLine="If ShouldShow Then";
if (__ref._shouldshow /*boolean*/ ) { 
RDebugUtils.currentLine=1310750;
 //BA.debugLineNum = 1310750;BA.debugLine="Set.Put(\"show\",timesComparative)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("show"),(Object)(__ref._timescomparative /*boolean*/ (null)));
 }else {
RDebugUtils.currentLine=1310752;
 //BA.debugLineNum = 1310752;BA.debugLine="Set.Put(\"show\",ShouldShow)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("show"),(Object)(__ref._shouldshow /*boolean*/ ));
 };
RDebugUtils.currentLine=1310754;
 //BA.debugLineNum = 1310754;BA.debugLine="Set.Put(\"hold\",LockApp)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("hold"),(Object)(__ref._lockapp /*boolean*/ ));
RDebugUtils.currentLine=1310755;
 //BA.debugLineNum = 1310755;BA.debugLine="Set.Put(\"iconList\",Icons)";
__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("iconList"),(Object)(__ref._icons /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=1310756;
 //BA.debugLineNum = 1310756;BA.debugLine="Return Set";
if (true) return (Object)(__ref._set /*anywheresoftware.b4a.objects.collections.Map*/ .getObject());
 break; }
case 1: {
RDebugUtils.currentLine=1310758;
 //BA.debugLineNum = 1310758;BA.debugLine="Return NeedDownloads";
if (true) return (Object)(__ref._needdownloads /*int*/ );
 break; }
case 2: {
RDebugUtils.currentLine=1310760;
 //BA.debugLineNum = 1310760;BA.debugLine="Dim downloadMap As Map";
_downloadmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1310761;
 //BA.debugLineNum = 1310761;BA.debugLine="downloadMap.Initialize";
_downloadmap.Initialize();
RDebugUtils.currentLine=1310762;
 //BA.debugLineNum = 1310762;BA.debugLine="If SubExists(Target,event&\"_startDownload\") The";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_startDownload")) { 
RDebugUtils.currentLine=1310763;
 //BA.debugLineNum = 1310763;BA.debugLine="CallSub2(Target,event&\"_startDownload\",Params.";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_startDownload",_params.Get((Object)("jobNr")));
RDebugUtils.currentLine=1310764;
 //BA.debugLineNum = 1310764;BA.debugLine="Dim downloadMap As Map";
_downloadmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1310765;
 //BA.debugLineNum = 1310765;BA.debugLine="downloadMap.Initialize";
_downloadmap.Initialize();
RDebugUtils.currentLine=1310766;
 //BA.debugLineNum = 1310766;BA.debugLine="downloadMap.Put(\"URL\",DownloadURL)";
_downloadmap.Put((Object)("URL"),(Object)(__ref._downloadurl /*String*/ ));
RDebugUtils.currentLine=1310767;
 //BA.debugLineNum = 1310767;BA.debugLine="downloadMap.Put(\"Header\",DownloadHeader)";
_downloadmap.Put((Object)("Header"),(Object)(__ref._downloadheader /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
 };
RDebugUtils.currentLine=1310769;
 //BA.debugLineNum = 1310769;BA.debugLine="Return downloadMap";
if (true) return (Object)(_downloadmap.getObject());
 break; }
case 3: {
RDebugUtils.currentLine=1310771;
 //BA.debugLineNum = 1310771;BA.debugLine="Dim res As JobResponse";
_res = new b4j.example.awtrix._jobresponse();
RDebugUtils.currentLine=1310772;
 //BA.debugLineNum = 1310772;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=1310773;
 //BA.debugLineNum = 1310773;BA.debugLine="res.jobNr=Params.Get(\"jobNr\")";
_res.jobNr /*int*/  = (int)(BA.ObjectToNumber(_params.Get((Object)("jobNr"))));
RDebugUtils.currentLine=1310774;
 //BA.debugLineNum = 1310774;BA.debugLine="res.Success=Params.Get(\"success\")";
_res.Success /*boolean*/  = BA.ObjectToBoolean(_params.Get((Object)("success")));
RDebugUtils.currentLine=1310775;
 //BA.debugLineNum = 1310775;BA.debugLine="res.ResponseString=Params.Get(\"response\")";
_res.ResponseString /*String*/  = BA.ObjectToString(_params.Get((Object)("response")));
RDebugUtils.currentLine=1310776;
 //BA.debugLineNum = 1310776;BA.debugLine="res.Stream=Params.Get(\"InputStream\")";
_res.Stream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .setObject((java.io.InputStream)(_params.Get((Object)("InputStream"))));
RDebugUtils.currentLine=1310777;
 //BA.debugLineNum = 1310777;BA.debugLine="If SubExists(Target,event&\"_evalJobResponse\") T";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_evalJobResponse")) { 
RDebugUtils.currentLine=1310778;
 //BA.debugLineNum = 1310778;BA.debugLine="CallSub2(Target,event&\"_evalJobResponse\",res)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_evalJobResponse",(Object)(_res));
 };
RDebugUtils.currentLine=1310780;
 //BA.debugLineNum = 1310780;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 break; }
case 4: {
RDebugUtils.currentLine=1310782;
 //BA.debugLineNum = 1310782;BA.debugLine="startIconRenderer";
__ref._starticonrenderer /*String*/ (null);
 break; }
case 5: {
RDebugUtils.currentLine=1310784;
 //BA.debugLineNum = 1310784;BA.debugLine="commandList.Clear";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=1310785;
 //BA.debugLineNum = 1310785;BA.debugLine="If SubExists(Target,event&\"_genFrame\") Then";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_genFrame")) { 
RDebugUtils.currentLine=1310786;
 //BA.debugLineNum = 1310786;BA.debugLine="CallSub(Target,event&\"_genFrame\")'ignore";
__c.CallSubNew(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_genFrame");
 };
RDebugUtils.currentLine=1310788;
 //BA.debugLineNum = 1310788;BA.debugLine="Return commandList";
if (true) return (Object)(__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .getObject());
 break; }
case 6: {
RDebugUtils.currentLine=1310790;
 //BA.debugLineNum = 1310790;BA.debugLine="Dim infos As Map";
_infos = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1310791;
 //BA.debugLineNum = 1310791;BA.debugLine="infos.Initialize";
_infos.Initialize();
RDebugUtils.currentLine=1310792;
 //BA.debugLineNum = 1310792;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=1310793;
 //BA.debugLineNum = 1310793;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\")";
if (__c.File.Exists(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".png")) { 
RDebugUtils.currentLine=1310794;
 //BA.debugLineNum = 1310794;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=1310795;
 //BA.debugLineNum = 1310795;BA.debugLine="in = File.OpenInput(File.Combine(File.DirApp,\"";
_in = __c.File.OpenInput(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".png");
RDebugUtils.currentLine=1310796;
 //BA.debugLineNum = 1310796;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=1310797;
 //BA.debugLineNum = 1310797;BA.debugLine="out.InitializeToBytesArray(1000)";
_out.InitializeToBytesArray((int) (1000));
RDebugUtils.currentLine=1310798;
 //BA.debugLineNum = 1310798;BA.debugLine="File.Copy2(in, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=1310799;
 //BA.debugLineNum = 1310799;BA.debugLine="data = out.ToBytesArray";
_data = _out.ToBytesArray();
RDebugUtils.currentLine=1310800;
 //BA.debugLineNum = 1310800;BA.debugLine="out.Close";
_out.Close();
 };
RDebugUtils.currentLine=1310802;
 //BA.debugLineNum = 1310802;BA.debugLine="infos.Put(\"pic\",data)";
_infos.Put((Object)("pic"),(Object)(_data));
RDebugUtils.currentLine=1310803;
 //BA.debugLineNum = 1310803;BA.debugLine="Dim isconfigured As Boolean = True";
_isconfigured = __c.True;
RDebugUtils.currentLine=1310804;
 //BA.debugLineNum = 1310804;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\")";
if (__c.File.Exists(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax")) { 
RDebugUtils.currentLine=1310805;
 //BA.debugLineNum = 1310805;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(File.Re";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bc /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertBytesToObject(__c.File.ReadBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax"))));
RDebugUtils.currentLine=1310806;
 //BA.debugLineNum = 1310806;BA.debugLine="For Each v As Object In m.Values";
{
final anywheresoftware.b4a.BA.IterableList group86 = _m.Values();
final int groupLen86 = group86.getSize()
;int index86 = 0;
;
for (; index86 < groupLen86;index86++){
_v = group86.Get(index86);
RDebugUtils.currentLine=1310807;
 //BA.debugLineNum = 1310807;BA.debugLine="If v=\"null\" Or v=\"\" Then";
if ((_v).equals((Object)("null")) || (_v).equals((Object)(""))) { 
RDebugUtils.currentLine=1310808;
 //BA.debugLineNum = 1310808;BA.debugLine="isconfigured=False";
_isconfigured = __c.False;
 };
 }
};
 };
RDebugUtils.currentLine=1310812;
 //BA.debugLineNum = 1310812;BA.debugLine="infos.Put(\"isconfigured\",isconfigured)";
_infos.Put((Object)("isconfigured"),(Object)(_isconfigured));
RDebugUtils.currentLine=1310813;
 //BA.debugLineNum = 1310813;BA.debugLine="infos.Put(\"AppVersion\",AppVersion)";
_infos.Put((Object)("AppVersion"),(Object)(__ref._appversion /*String*/ ));
RDebugUtils.currentLine=1310814;
 //BA.debugLineNum = 1310814;BA.debugLine="infos.Put(\"description\",AppDescription)";
_infos.Put((Object)("description"),(Object)(__ref._appdescription /*String*/ ));
RDebugUtils.currentLine=1310815;
 //BA.debugLineNum = 1310815;BA.debugLine="infos.Put(\"setupInfos\",SetupInfos)";
_infos.Put((Object)("setupInfos"),(Object)(__ref._setupinfos /*String*/ ));
RDebugUtils.currentLine=1310816;
 //BA.debugLineNum = 1310816;BA.debugLine="Return infos";
if (true) return (Object)(_infos.getObject());
 break; }
case 7: {
RDebugUtils.currentLine=1310818;
 //BA.debugLineNum = 1310818;BA.debugLine="MakeSettings";
__ref._makesettings /*String*/ (null);
RDebugUtils.currentLine=1310819;
 //BA.debugLineNum = 1310819;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
 break; }
case 8: {
RDebugUtils.currentLine=1310821;
 //BA.debugLineNum = 1310821;BA.debugLine="Return UpdateInterval";
if (true) return (Object)(__ref._updateinterval /*int*/ );
 break; }
case 9: {
RDebugUtils.currentLine=1310823;
 //BA.debugLineNum = 1310823;BA.debugLine="saveSingleSetting(\"Enabled\",Params.Get(\"Enabled";
__ref._savesinglesetting /*String*/ (null,"Enabled",_params.Get((Object)("Enabled")));
RDebugUtils.currentLine=1310824;
 //BA.debugLineNum = 1310824;BA.debugLine="MakeSettings";
__ref._makesettings /*String*/ (null);
 break; }
case 10: {
RDebugUtils.currentLine=1310826;
 //BA.debugLineNum = 1310826;BA.debugLine="Return Enabled";
if (true) return (Object)(__ref._enabled /*boolean*/ );
 break; }
case 11: {
RDebugUtils.currentLine=1310828;
 //BA.debugLineNum = 1310828;BA.debugLine="stopIconRenderer";
__ref._stopiconrenderer /*String*/ (null);
 break; }
case 12: {
RDebugUtils.currentLine=1310830;
 //BA.debugLineNum = 1310830;BA.debugLine="If SubExists(Target,event&\"_iconRequest\") Then";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_iconRequest")) { 
RDebugUtils.currentLine=1310831;
 //BA.debugLineNum = 1310831;BA.debugLine="CallSub(Target,event&\"_iconRequest\")";
__c.CallSubNew(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_iconRequest");
 };
RDebugUtils.currentLine=1310833;
 //BA.debugLineNum = 1310833;BA.debugLine="Return CreateMap(\"iconList\":Icons)";
if (true) return (Object)(__c.createMap(new Object[] {(Object)("iconList"),(Object)(__ref._icons /*anywheresoftware.b4a.objects.collections.List*/ .getObject())}).getObject());
 break; }
case 13: {
RDebugUtils.currentLine=1310835;
 //BA.debugLineNum = 1310835;BA.debugLine="addToIconRenderer(Params)";
__ref._addtoiconrenderer /*String*/ (null,_params);
 break; }
case 14: {
RDebugUtils.currentLine=1310837;
 //BA.debugLineNum = 1310837;BA.debugLine="If SubExists(Target,event&\"_externalCommand\") T";
if (__c.SubExists(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_externalCommand")) { 
RDebugUtils.currentLine=1310838;
 //BA.debugLineNum = 1310838;BA.debugLine="CallSub2(Target,event&\"_externalCommand\",res)";
__c.CallSubNew2(ba,__ref._target /*Object*/ ,__ref._event /*String*/ +"_externalCommand",(Object)(_res));
 };
 break; }
case 15: {
RDebugUtils.currentLine=1310841;
 //BA.debugLineNum = 1310841;BA.debugLine="Menu.Initialize";
__ref._menu /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1310842;
 //BA.debugLineNum = 1310842;BA.debugLine="Menu.Put(\"Version\",\"1.6\")";
__ref._menu /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Version"),(Object)("1.6"));
RDebugUtils.currentLine=1310843;
 //BA.debugLineNum = 1310843;BA.debugLine="Menu.Put(\"Theme\",\"Light Theme\")";
__ref._menu /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Theme"),(Object)("Light Theme"));
RDebugUtils.currentLine=1310844;
 //BA.debugLineNum = 1310844;BA.debugLine="Menu.Put(\"Items\",MenuList)";
__ref._menu /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("Items"),(Object)(__ref._menulist /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=1310845;
 //BA.debugLineNum = 1310845;BA.debugLine="Return Menu";
if (true) return (Object)(__ref._menu /*anywheresoftware.b4a.objects.collections.Map*/ .getObject());
 break; }
}
;
RDebugUtils.currentLine=1310847;
 //BA.debugLineNum = 1310847;BA.debugLine="Return True";
if (true) return (Object)(__c.True);
RDebugUtils.currentLine=1310848;
 //BA.debugLineNum = 1310848;BA.debugLine="End Sub";
return null;
}
public String  _addmenuitem(b4j.example.awtrix __ref,anywheresoftware.b4a.objects.collections.List _options,String _title,String _typ,String _key,boolean _required) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "addmenuitem", false))
	 {return ((String) Debug.delegate(ba, "addmenuitem", new Object[] {_options,_title,_typ,_key,_required}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub addMenuItem(Options As List,Title As St";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="m.Put(\"title\",Title)";
_m.Put((Object)("title"),(Object)(_title));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="m.Put(\"type\",Typ)";
_m.Put((Object)("type"),(Object)(_typ));
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="m.Put(\"key\",Key)";
_m.Put((Object)("key"),(Object)(_key));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="m.Put(\"required\",required)";
_m.Put((Object)("required"),(Object)(_required));
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="If Options.Size>0 Then";
if (_options.getSize()>0) { 
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="m.Put(\"options\",Options)";
_m.Put((Object)("options"),(Object)(_options.getObject()));
 };
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="MenuList.Add(m)";
__ref._menulist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="End Sub";
return "";
}
public String  _addtoiconrenderer(b4j.example.awtrix __ref,anywheresoftware.b4a.objects.collections.Map _iconmap) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "addtoiconrenderer", false))
	 {return ((String) Debug.delegate(ba, "addtoiconrenderer", new Object[] {_iconmap}));}
boolean _runmarker = false;
int _ico = 0;
anywheresoftware.b4a.objects.collections.Map _ico1 = null;
anywheresoftware.b4a.objects.Timer _timer = null;
boolean _icoexists = false;
int _timerico = 0;
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub addToIconRenderer(iconMap As Map)";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Try";
try {RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If iconMap.Size=0 Then Return";
if (_iconmap.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="Dim runMarker As Boolean";
_runmarker = false;
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="If isRunning Then";
if (__ref._isrunning /*boolean*/ ) { 
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="stopIconRenderer";
__ref._stopiconrenderer /*String*/ (null);
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="runMarker=True";
_runmarker = __c.True;
 };
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="timermap.Clear";
__ref._timermap /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="icoMap.Clear";
__ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="animCounter.Clear";
__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="RenderedIcons.Clear";
__ref._renderedicons /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=1179660;
 //BA.debugLineNum = 1179660;BA.debugLine="For Each ico As Int In iconMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group12 = _iconmap.Keys();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_ico = (int)(BA.ObjectToNumber(group12.Get(index12)));
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="Dim ico1 As Map = iconMap.get(ico)";
_ico1 = new anywheresoftware.b4a.objects.collections.Map();
_ico1.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_iconmap.Get((Object)(_ico))));
RDebugUtils.currentLine=1179662;
 //BA.debugLineNum = 1179662;BA.debugLine="If ico1.ContainsKey(\"tick\") Then";
if (_ico1.ContainsKey((Object)("tick"))) { 
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="icoMap.Put(ico,ico1.Get(\"data\"))";
__ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_ico),_ico1.Get((Object)("data")));
RDebugUtils.currentLine=1179664;
 //BA.debugLineNum = 1179664;BA.debugLine="animCounter.Put(ico,0)";
__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_ico),(Object)(0));
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="Dim timer As Timer";
_timer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=1179666;
 //BA.debugLineNum = 1179666;BA.debugLine="timer.Initialize(\"Timer\",ico1.Get(\"tick\"))";
_timer.Initialize(ba,"Timer",BA.ObjectToLongNumber(_ico1.Get((Object)("tick"))));
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="Dim icoExists As Boolean=False";
_icoexists = __c.False;
RDebugUtils.currentLine=1179668;
 //BA.debugLineNum = 1179668;BA.debugLine="For Each timerico As Int In timermap.Values";
{
final anywheresoftware.b4a.BA.IterableList group20 = __ref._timermap /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen20 = group20.getSize()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_timerico = (int)(BA.ObjectToNumber(group20.Get(index20)));
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="If timerico=ico Then icoExists=True";
if (_timerico==_ico) { 
_icoexists = __c.True;};
 }
};
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="If Not(icoExists) Then timermap.Put(timer,ico)";
if (__c.Not(_icoexists)) { 
__ref._timermap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_timer),(Object)(_ico));};
 }else {
RDebugUtils.currentLine=1179673;
 //BA.debugLineNum = 1179673;BA.debugLine="RenderedIcons.Put(ico,ico1.Get(\"data\"))";
__ref._renderedicons /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_ico),_ico1.Get((Object)("data")));
 };
 }
};
RDebugUtils.currentLine=1179676;
 //BA.debugLineNum = 1179676;BA.debugLine="If runMarker Then";
if (_runmarker) { 
RDebugUtils.currentLine=1179677;
 //BA.debugLineNum = 1179677;BA.debugLine="startIconRenderer";
__ref._starticonrenderer /*String*/ (null);
 };
 } 
       catch (Exception e32) {
			ba.setLastException(e32);RDebugUtils.currentLine=1179680;
 //BA.debugLineNum = 1179680;BA.debugLine="Log(\"Got Error from \" & AppName)";
__c.Log("Got Error from "+__ref._appname /*String*/ );
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="Log(\"Error in IconAdder:\")";
__c.Log("Error in IconAdder:");
RDebugUtils.currentLine=1179682;
 //BA.debugLineNum = 1179682;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=1179684;
 //BA.debugLineNum = 1179684;BA.debugLine="End Sub";
return "";
}
public String  _stopiconrenderer(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "stopiconrenderer", false))
	 {return ((String) Debug.delegate(ba, "stopiconrenderer", null));}
anywheresoftware.b4a.objects.Timer _k = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub stopIconRenderer";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="isRunning=False";
__ref._isrunning /*boolean*/  = __c.False;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="For Each k As Timer In timermap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._timermap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = (anywheresoftware.b4a.objects.Timer)(group2.Get(index2));
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="k.Enabled=False";
_k.setEnabled(__c.False);
 }
};
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public String  _starticonrenderer(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "starticonrenderer", false))
	 {return ((String) Debug.delegate(ba, "starticonrenderer", null));}
anywheresoftware.b4a.objects.Timer _k = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub startIconRenderer";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="isRunning=True";
__ref._isrunning /*boolean*/  = __c.True;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="FirstTick";
__ref._firsttick /*String*/ (null);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="For Each k As Timer In timermap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._timermap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = (anywheresoftware.b4a.objects.Timer)(group3.Get(index3));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="k.Enabled=True";
_k.setEnabled(__c.True);
 }
};
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="End Sub";
return "";
}
public boolean  _timescomparative(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "timescomparative", false))
	 {return ((Boolean) Debug.delegate(ba, "timescomparative", null));}
String[] _startt = null;
String[] _endt = null;
int _hour = 0;
int _minute = 0;
int _second = 0;
int _now = 0;
int _start = 0;
int _stop = 0;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub timesComparative  As Boolean";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Try";
try {RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If starttime = endtime Then Return True";
if ((__ref._starttime /*String*/ ).equals(__ref._endtime /*String*/ )) { 
if (true) return __c.True;};
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="Dim startT() As String=Regex.Split(\":\",starttime";
_startt = __c.Regex.Split(":",__ref._starttime /*String*/ );
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="Dim EndT() As String=Regex.Split(\":\",endtime)";
_endt = __c.Regex.Split(":",__ref._endtime /*String*/ );
RDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="Dim hour As Int=DateTime.GetHour(DateTime.Now)";
_hour = __c.DateTime.GetHour(__c.DateTime.getNow());
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="Dim minute As Int=DateTime.GetMinute(DateTime.No";
_minute = __c.DateTime.GetMinute(__c.DateTime.getNow());
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="Dim second As Int=DateTime.GetSecond(DateTime.No";
_second = __c.DateTime.GetSecond(__c.DateTime.getNow());
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="Dim now, start, stop As Int";
_now = 0;
_start = 0;
_stop = 0;
RDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="now = ((hour * 3600) + (minute * 60) + second)";
_now = (int) (((_hour*3600)+(_minute*60)+_second));
RDebugUtils.currentLine=851978;
 //BA.debugLineNum = 851978;BA.debugLine="start = (startT(0) * 3600) + (startT(1) * 60)";
_start = (int) (((double)(Double.parseDouble(_startt[(int) (0)]))*3600)+((double)(Double.parseDouble(_startt[(int) (1)]))*60));
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="stop = ( EndT(0)* 3600) + (EndT(1) * 60)";
_stop = (int) (((double)(Double.parseDouble(_endt[(int) (0)]))*3600)+((double)(Double.parseDouble(_endt[(int) (1)]))*60));
RDebugUtils.currentLine=851980;
 //BA.debugLineNum = 851980;BA.debugLine="If (start < stop) Then";
if ((_start<_stop)) { 
RDebugUtils.currentLine=851981;
 //BA.debugLineNum = 851981;BA.debugLine="Return (now >= start And now <= stop )";
if (true) return (_now>=_start && _now<=_stop);
 }else {
RDebugUtils.currentLine=851983;
 //BA.debugLineNum = 851983;BA.debugLine="Return (now >= start Or now <= stop)";
if (true) return (_now>=_start || _now<=_stop);
 };
 } 
       catch (Exception e18) {
			ba.setLastException(e18);RDebugUtils.currentLine=851986;
 //BA.debugLineNum = 851986;BA.debugLine="Log(\"Got Error from \" & AppName)";
__c.Log("Got Error from "+__ref._appname /*String*/ );
RDebugUtils.currentLine=851987;
 //BA.debugLineNum = 851987;BA.debugLine="Log(\"Error in TimesComparative:\")";
__c.Log("Error in TimesComparative:");
RDebugUtils.currentLine=851988;
 //BA.debugLineNum = 851988;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=851989;
 //BA.debugLineNum = 851989;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=851991;
 //BA.debugLineNum = 851991;BA.debugLine="End Sub";
return false;
}
public String  _savesinglesetting(b4j.example.awtrix __ref,String _key,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "savesinglesetting", false))
	 {return ((String) Debug.delegate(ba, "savesinglesetting", new Object[] {_key,_value}));}
byte[] _data = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub saveSingleSetting(key As String, value";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\"),A";
if (__c.File.Exists(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax")) { 
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim data() As Byte = File.ReadBytes(File.Combine";
_data = __c.File.ReadBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax");
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(data)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bc /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertBytesToObject(_data)));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="m.Put(key,value)";
_m.Put((Object)(_key),_value);
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\")";
__c.File.WriteBytes(__c.File.Combine(__c.File.getDirApp(),"Apps"),__ref._appname /*String*/ +".ax",__ref._bc /*anywheresoftware.b4a.randomaccessfile.B4XSerializator*/ .ConvertObjectToBytes((Object)(_m.getObject())));
 };
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="End Sub";
return "";
}
public int  _calctextlength(b4j.example.awtrix __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "calctextlength", false))
	 {return ((Integer) Debug.delegate(ba, "calctextlength", new Object[] {_text}));}
int _length = 0;
int _i = 0;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub calcTextLength(text As String) As Int";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If UppercaseLetters Then text = text.ToUpperCase";
if (__ref._uppercaseletters /*boolean*/ ) { 
_text = _text.toUpperCase();};
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If TextBuffer<>text Then";
if ((__ref._textbuffer /*String*/ ).equals(_text) == false) { 
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Dim Length As Int";
_length = 0;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="For i=0 To text.Length-1";
{
final int step4 = 1;
final int limit4 = (int) (_text.length()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="If CharMap.ContainsKey(Asc(text.CharAt(i))) The";
if (__ref._charmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(__c.Asc(_text.charAt(_i))))) { 
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Length=Length+(CharMap.Get(Asc(text.CharAt(i))";
_length = (int) (_length+(double)(BA.ObjectToNumber((__ref._charmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(__c.Asc(_text.charAt(_i))))))));
 }else {
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Length=Length+4";
_length = (int) (_length+4);
 };
 }
};
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="TextBuffer=text";
__ref._textbuffer /*String*/  = _text;
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="TextLength=Length";
__ref._textlength /*int*/  = _length;
RDebugUtils.currentLine=1376269;
 //BA.debugLineNum = 1376269;BA.debugLine="Return Length";
if (true) return _length;
 };
RDebugUtils.currentLine=1376271;
 //BA.debugLineNum = 1376271;BA.debugLine="Return TextLength";
if (true) return __ref._textlength /*int*/ ;
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Public Appduration As Int";
_appduration = 0;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Public scrollposition As Int";
_scrollposition = 0;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Public ShouldShow As Boolean = True";
_shouldshow = __c.True;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Public forceDownload As Boolean";
_forcedownload = false;
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Public LockApp As Boolean=False";
_lockapp = __c.False;
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="Public Icons As List";
_icons = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Public AppName As String";
_appname = "";
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Public AppVersion As String";
_appversion = "";
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Public TickInterval As Int";
_tickinterval = 0;
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="Public NeedDownloads As Int";
_needdownloads = 0;
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Public UpdateInterval As Int";
_updateinterval = 0;
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="Public AppDescription As String";
_appdescription = "";
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="Public SetupInfos As String";
_setupinfos = "";
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="Public appSettings As Map";
_appsettings = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="Public ServerVersion As String";
_serverversion = "";
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="Public DisplayTime As Int";
_displaytime = 0;
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="Public MatrixWidth As Int = 32";
_matrixwidth = (int) (32);
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="Public MatrixHeight As Int = 8";
_matrixheight = (int) (8);
RDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="Public DownloadURL As String";
_downloadurl = "";
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="Public DownloadHeader As Map";
_downloadheader = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="Public StartedAt As Long";
_startedat = 0L;
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="Private icoMap As Map";
_icomap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="Private RenderedIcons As Map";
_renderedicons = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="Private animCounter As Map";
_animcounter = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="Private iconList As List'ignore";
_iconlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720922;
 //BA.debugLineNum = 720922;BA.debugLine="Private timermap As Map";
_timermap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="Private Set As Map 'ignore";
_set = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="Private Target As Object";
_target = new Object();
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="Private commandList As List";
_commandlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720926;
 //BA.debugLineNum = 720926;BA.debugLine="Private colorCounter As Int";
_colorcounter = 0;
RDebugUtils.currentLine=720927;
 //BA.debugLineNum = 720927;BA.debugLine="Private starttime As String =\"0\"";
_starttime = "0";
RDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="Private endtime As String = \"0\"";
_endtime = "0";
RDebugUtils.currentLine=720929;
 //BA.debugLineNum = 720929;BA.debugLine="Private CharMap As Map";
_charmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720930;
 //BA.debugLineNum = 720930;BA.debugLine="Private TextBuffer As String";
_textbuffer = "";
RDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="Private TextLength As Int";
_textlength = 0;
RDebugUtils.currentLine=720932;
 //BA.debugLineNum = 720932;BA.debugLine="Private UppercaseLetters As Boolean";
_uppercaseletters = false;
RDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="Private SystemColor() As Int";
_systemcolor = new int[(int) (0)];
;
RDebugUtils.currentLine=720934;
 //BA.debugLineNum = 720934;BA.debugLine="Private event As String";
_event = "";
RDebugUtils.currentLine=720935;
 //BA.debugLineNum = 720935;BA.debugLine="Private Enabled As Boolean = True";
_enabled = __c.True;
RDebugUtils.currentLine=720936;
 //BA.debugLineNum = 720936;BA.debugLine="Private noIcon() As Short = Array As Short(0, 0,";
_noicon = new short[]{(short) (0),(short) (0),(short) (0),(short) (63488),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (63488),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0),(short) (0)};
RDebugUtils.currentLine=720937;
 //BA.debugLineNum = 720937;BA.debugLine="Private isRunning As Boolean";
_isrunning = false;
RDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="Private Menu As Map";
_menu = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=720939;
 //BA.debugLineNum = 720939;BA.debugLine="Private MenuList As List";
_menulist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=720940;
 //BA.debugLineNum = 720940;BA.debugLine="Private bc As B4XSerializator";
_bc = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=720941;
 //BA.debugLineNum = 720941;BA.debugLine="Private noIconMessage As Boolean";
_noiconmessage = false;
RDebugUtils.currentLine=720943;
 //BA.debugLineNum = 720943;BA.debugLine="Type JobResponse (jobNr As Int,Success As Boolean";
;
RDebugUtils.currentLine=720944;
 //BA.debugLineNum = 720944;BA.debugLine="End Sub";
return "";
}
public String  _customcommand(b4j.example.awtrix __ref,anywheresoftware.b4a.objects.collections.Map _cmd) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "customcommand", false))
	 {return ((String) Debug.delegate(ba, "customcommand", new Object[] {_cmd}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub customCommand(cmd As Map)";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="commandList.Add(cmd)";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cmd.getObject()));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public String  _drawcircle(b4j.example.awtrix __ref,int _x,int _y,int _radius,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "drawcircle", false))
	 {return ((String) Debug.delegate(ba, "drawcircle", new Object[] {_x,_y,_radius,_color}));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub drawCircle(X As Int, Y As Int, Radius A";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="If Color=Null Then";
if (_color== null) { 
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="commandList.Add(CreateMap(\"type\":\"circle\",\"x\":x,";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("circle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(__ref._systemcolor /*int[]*/ )}).getObject()));
 }else {
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="commandList.Add(CreateMap(\"type\":\"circle\",\"x\":x,";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("circle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(_color)}).getObject()));
 };
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="End Sub";
return "";
}
public String  _drawline(b4j.example.awtrix __ref,int _x0,int _y0,int _x1,int _y1,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "drawline", false))
	 {return ((String) Debug.delegate(ba, "drawline", new Object[] {_x0,_y0,_x1,_y1,_color}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub drawLine(X0 As Int,Y0 As Int,X1  As Int";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="If Color=Null Then";
if (_color== null) { 
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="commandList.Add(CreateMap(\"type\":\"line\",\"x0\":X0,";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("line"),(Object)("x0"),(Object)(_x0),(Object)("y0"),(Object)(_y0),(Object)("x1"),(Object)(_x1),(Object)("y1"),(Object)(_y1),(Object)("color"),(Object)(__ref._systemcolor /*int[]*/ )}).getObject()));
 }else {
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="commandList.Add(CreateMap(\"type\":\"line\",\"x0\":X0,";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("line"),(Object)("x0"),(Object)(_x0),(Object)("y0"),(Object)(_y0),(Object)("x1"),(Object)(_x1),(Object)("y1"),(Object)(_y1),(Object)("color"),(Object)(_color)}).getObject()));
 };
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="End Sub";
return "";
}
public String  _drawpixel(b4j.example.awtrix __ref,int _x,int _y,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "drawpixel", false))
	 {return ((String) Debug.delegate(ba, "drawpixel", new Object[] {_x,_y,_color}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub drawPixel(X As Int,Y As Int,Color() As";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="If Color=Null Then";
if (_color== null) { 
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="commandList.Add(CreateMap(\"type\":\"pixel\",\"x\":x,\"";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("pixel"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("color"),(Object)(__ref._systemcolor /*int[]*/ )}).getObject()));
 }else {
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="commandList.Add(CreateMap(\"type\":\"pixel\",\"x\":x,\"";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("pixel"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("color"),(Object)(_color)}).getObject()));
 };
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="End Sub";
return "";
}
public String  _drawrect(b4j.example.awtrix __ref,int _x,int _y,int _width,int _height,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "drawrect", false))
	 {return ((String) Debug.delegate(ba, "drawrect", new Object[] {_x,_y,_width,_height,_color}));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub drawRect(X As Int,Y As Int,Width  As In";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="If Color=Null Then";
if (_color== null) { 
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="commandList.Add(CreateMap(\"type\":\"rect\",\"x\":x,\"y";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("rect"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("w"),(Object)(_width),(Object)("h"),(Object)(_height),(Object)("color"),(Object)(__ref._systemcolor /*int[]*/ )}).getObject()));
 }else {
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="commandList.Add(CreateMap(\"type\":\"rect\",\"x\":x,\"y";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("rect"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("w"),(Object)(_width),(Object)("h"),(Object)(_height),(Object)("color"),(Object)(_color)}).getObject()));
 };
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return "";
}
public String  _drawtext(b4j.example.awtrix __ref,String _text,int _x,int _y,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "drawtext", false))
	 {return ((String) Debug.delegate(ba, "drawtext", new Object[] {_text,_x,_y,_color}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub drawText(text As String,x As Int, y As";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If Color=Null Then";
if (_color== null) { 
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="commandList.Add(CreateMap(\"type\":\"text\",\"text\":t";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text"),(Object)("text"),(Object)(_text),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y)}).getObject()));
 }else {
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="commandList.Add(CreateMap(\"type\":\"text\",\"text\":t";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text"),(Object)("text"),(Object)(_text),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("color"),(Object)(_color)}).getObject()));
 };
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="End Sub";
return "";
}
public String  _fill(b4j.example.awtrix __ref,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "fill", false))
	 {return ((String) Debug.delegate(ba, "fill", new Object[] {_color}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub fill(Color() As Int)";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="If Color=Null Then";
if (_color== null) { 
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fill\",\"color\":";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fill"),(Object)("color"),(Object)(__ref._systemcolor /*int[]*/ )}).getObject()));
 }else {
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fill\",\"color\":";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fill"),(Object)("color"),(Object)(_color)}).getObject()));
 };
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="End Sub";
return "";
}
public String  _fillcircle(b4j.example.awtrix __ref,int _x,int _y,int _radius,int[] _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "fillcircle", false))
	 {return ((String) Debug.delegate(ba, "fillcircle", new Object[] {_x,_y,_radius,_color}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub fillCircle(X As Int, Y As Int, Radius A";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If Color=Null Then";
if (_color== null) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fillCircle\",\"x";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fillCircle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(__ref._systemcolor /*int[]*/ )}).getObject()));
 }else {
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fillCircle\",\"x";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("fillCircle"),(Object)("x"),(Object)(_x),(Object)("y"),(Object)(_y),(Object)("r"),(Object)(_radius),(Object)("color"),(Object)(_color)}).getObject()));
 };
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="End Sub";
return "";
}
public String  _finish(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "finish", false))
	 {return ((String) Debug.delegate(ba, "finish", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub finish";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="commandList.Add(CreateMap(\"type\":\"finish\"))";
__ref._commandlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("finish")}).getObject()));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="End Sub";
return "";
}
public String  _firsttick(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "firsttick", false))
	 {return ((String) Debug.delegate(ba, "firsttick", null));}
int _iconid = 0;
anywheresoftware.b4a.objects.collections.List _ico = null;
anywheresoftware.b4j.objects.collections.JSONParser _parse = null;
anywheresoftware.b4a.objects.collections.List _bmproot = null;
short[] _bmp = null;
int _i = 0;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub FirstTick";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="For Each IconID As Int In icoMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_iconid = (int)(BA.ObjectToNumber(group1.Get(index1)));
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If icoMap.ContainsKey(IconID) Then";
if (__ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_iconid))) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="Dim ico As List=icoMap.get(IconID)";
_ico = new anywheresoftware.b4a.objects.collections.List();
_ico.setObject((java.util.List)(__ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid))));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Dim parse As JSONParser";
_parse = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="If animCounter.Get(IconID)>ico.Size-1 Then ani";
if ((double)(BA.ObjectToNumber(__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid))))>_ico.getSize()-1) { 
__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_iconid),(Object)(0));};
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="parse.Initialize(ico.Get(animCounter.Get(IconI";
_parse.Initialize(BA.ObjectToString(_ico.Get((int)(BA.ObjectToNumber(__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid)))))));
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="Dim bmproot As List = parse.NextArray";
_bmproot = new anywheresoftware.b4a.objects.collections.List();
_bmproot = _parse.NextArray();
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim bmp(bmproot.Size) As Short";
_bmp = new short[_bmproot.getSize()];
;
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="For i=0 To bmproot.Size-1";
{
final int step10 = 1;
final int limit10 = (int) (_bmproot.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="bmp(i)=bmproot.Get(i)";
_bmp[_i] = (short)(BA.ObjectToNumber(_bmproot.Get(_i)));
 }
};
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="RenderedIcons.Put(IconID,bmp)";
__ref._renderedicons /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_iconid),(Object)(_bmp));
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="animCounter.put(IconID,animCounter.Get(IconID)";
__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_iconid),(Object)((double)(BA.ObjectToNumber(__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid))))+1));
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="Log(\"Got Error from \" & AppName)";
__c.Log("Got Error from "+__ref._appname /*String*/ );
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="Log(\"Error in IconPreloader:\")";
__c.Log("Error in IconPreloader:");
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="Log(\"IconID:\" & IconID)";
__c.Log("IconID:"+BA.NumberToString(_iconid));
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 }
};
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="End Sub";
return "";
}
public int[]  _rainbow(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "rainbow", false))
	 {return ((int[]) Debug.delegate(ba, "rainbow", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub Rainbow As Int()";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="colorCounter=colorCounter+1";
__ref._colorcounter /*int*/  = (int) (__ref._colorcounter /*int*/ +1);
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If colorCounter>255 Then colorCounter=0";
if (__ref._colorcounter /*int*/ >255) { 
__ref._colorcounter /*int*/  = (int) (0);};
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Return(wheel(colorCounter))";
if (true) return (__ref._wheel /*int[]*/ (null,__ref._colorcounter /*int*/ ));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return null;
}
public int[]  _wheel(b4j.example.awtrix __ref,int _wheelpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "wheel", false))
	 {return ((int[]) Debug.delegate(ba, "wheel", new Object[] {_wheelpos}));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Private Sub wheel(Wheelpos As Int) As Int() 'ignor";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="If(Wheelpos < 85) Then";
if ((_wheelpos<85)) { 
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Return Array As Int(Wheelpos * 3, 255 - Wheelpos";
if (true) return new int[]{(int) (_wheelpos*3),(int) (255-_wheelpos*3),(int) (0)};
 }else 
{RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="else if(Wheelpos < 170) Then";
if ((_wheelpos<170)) { 
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Wheelpos =Wheelpos- 85";
_wheelpos = (int) (_wheelpos-85);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Return  Array As Int(255 - Wheelpos * 3, 0, Whee";
if (true) return new int[]{(int) (255-_wheelpos*3),(int) (0),(int) (_wheelpos*3)};
 }else {
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Wheelpos =Wheelpos- 170";
_wheelpos = (int) (_wheelpos-170);
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Return  Array As Int(0, Wheelpos * 3, 255 - Whee";
if (true) return new int[]{(int) (0),(int) (_wheelpos*3),(int) (255-_wheelpos*3)};
 }}
;
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="End Sub";
return null;
}
public String  _timer_tick(b4j.example.awtrix __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="awtrix";
if (Debug.shouldDelegate(ba, "timer_tick", false))
	 {return ((String) Debug.delegate(ba, "timer_tick", null));}
int _iconid = 0;
anywheresoftware.b4a.objects.collections.List _ico = null;
anywheresoftware.b4j.objects.collections.JSONParser _parse = null;
anywheresoftware.b4a.objects.collections.List _bmproot = null;
short[] _bpm = null;
int _i = 0;
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Timer_Tick";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Try";
try {RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim iconid As Int=timermap.Get(Sender)";
_iconid = (int)(BA.ObjectToNumber(__ref._timermap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(__c.Sender(ba))));
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If icoMap.ContainsKey(iconid) Then";
if (__ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_iconid))) { 
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Dim ico As List= icoMap.get(iconid)";
_ico = new anywheresoftware.b4a.objects.collections.List();
_ico.setObject((java.util.List)(__ref._icomap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid))));
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Dim parse As JSONParser";
_parse = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="If animCounter.Get(iconid)>ico.Size-1 Then anim";
if ((double)(BA.ObjectToNumber(__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid))))>_ico.getSize()-1) { 
__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_iconid),(Object)(0));};
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="parse.Initialize(ico.Get(animCounter.Get(iconid";
_parse.Initialize(BA.ObjectToString(_ico.Get((int)(BA.ObjectToNumber(__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid)))))));
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Dim bmproot As List = parse.NextArray";
_bmproot = new anywheresoftware.b4a.objects.collections.List();
_bmproot = _parse.NextArray();
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Dim bpm(bmproot.Size) As Short";
_bpm = new short[_bmproot.getSize()];
;
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="For i=0 To bmproot.Size-1";
{
final int step10 = 1;
final int limit10 = (int) (_bmproot.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="bpm(i)=bmproot.Get(i)";
_bpm[_i] = (short)(BA.ObjectToNumber(_bmproot.Get(_i)));
 }
};
RDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="RenderedIcons.Put(iconid,bpm)";
__ref._renderedicons /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_iconid),(Object)(_bpm));
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="animCounter.put(iconid,animCounter.Get(iconid)+";
__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_iconid),(Object)((double)(BA.ObjectToNumber(__ref._animcounter /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_iconid))))+1));
 };
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="Log(\"Got Error from \" & AppName)";
__c.Log("Got Error from "+__ref._appname /*String*/ );
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Log(\"Error in IconRenderer:\")";
__c.Log("Error in IconRenderer:");
RDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="stopIconRenderer";
__ref._stopiconrenderer /*String*/ (null);
 };
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="End Sub";
return "";
}
}