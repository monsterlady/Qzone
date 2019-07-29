package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class awtrix_subs_0 {


public static RemoteObject  _addmenuitem(RemoteObject __ref,RemoteObject _options,RemoteObject _title,RemoteObject _typ,RemoteObject _key,RemoteObject _required) throws Exception{
try {
		Debug.PushSubsStack("addMenuItem (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,578);
if (RapidSub.canDelegate("addmenuitem")) { return __ref.runUserSub(false, "awtrix","addmenuitem", __ref, _options, _title, _typ, _key, _required);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Options", _options);
Debug.locals.put("Title", _title);
Debug.locals.put("Typ", _typ);
Debug.locals.put("Key", _key);
Debug.locals.put("required", _required);
 BA.debugLineNum = 578;BA.debugLine="Public Sub addMenuItem(Options As List,Title As St";
Debug.ShouldStop(2);
 BA.debugLineNum = 579;BA.debugLine="Dim m As Map";
Debug.ShouldStop(4);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 580;BA.debugLine="m.Initialize";
Debug.ShouldStop(8);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 581;BA.debugLine="m.Put(\"title\",Title)";
Debug.ShouldStop(16);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((_title)));
 BA.debugLineNum = 582;BA.debugLine="m.Put(\"type\",Typ)";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((_typ)));
 BA.debugLineNum = 583;BA.debugLine="m.Put(\"key\",Key)";
Debug.ShouldStop(64);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("key"))),(Object)((_key)));
 BA.debugLineNum = 584;BA.debugLine="m.Put(\"required\",required)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("required"))),(Object)((_required)));
 BA.debugLineNum = 585;BA.debugLine="If Options.Size>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_options.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 586;BA.debugLine="m.Put(\"options\",Options)";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("options"))),(Object)((_options.getObject())));
 };
 BA.debugLineNum = 588;BA.debugLine="MenuList.Add(m)";
Debug.ShouldStop(2048);
__ref.getField(false,"_menulist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_m.getObject())));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtoiconrenderer(RemoteObject __ref,RemoteObject _iconmap) throws Exception{
try {
		Debug.PushSubsStack("addToIconRenderer (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("addtoiconrenderer")) { return __ref.runUserSub(false, "awtrix","addtoiconrenderer", __ref, _iconmap);}
RemoteObject _runmarker = RemoteObject.createImmutable(false);
RemoteObject _ico = RemoteObject.createImmutable(0);
RemoteObject _ico1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _timer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
RemoteObject _icoexists = RemoteObject.createImmutable(false);
RemoteObject _timerico = RemoteObject.createImmutable(0);
Debug.locals.put("iconMap", _iconmap);
 BA.debugLineNum = 171;BA.debugLine="Private Sub addToIconRenderer(iconMap As Map)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 173;BA.debugLine="If iconMap.Size=0 Then Return";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_iconmap.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
Debug.CheckDeviceExceptions();if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 174;BA.debugLine="Dim runMarker As Boolean";
Debug.ShouldStop(8192);
_runmarker = RemoteObject.createImmutable(false);Debug.locals.put("runMarker", _runmarker);
 BA.debugLineNum = 175;BA.debugLine="If isRunning Then";
Debug.ShouldStop(16384);
if (__ref.getField(true,"_isrunning" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 176;BA.debugLine="stopIconRenderer";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.example.awtrix.class, "_stopiconrenderer" /*RemoteObject*/ );
 BA.debugLineNum = 177;BA.debugLine="runMarker=True";
Debug.ShouldStop(65536);
_runmarker = awtrix.__c.getField(true,"True");Debug.locals.put("runMarker", _runmarker);
 };
 BA.debugLineNum = 179;BA.debugLine="timermap.Clear";
Debug.ShouldStop(262144);
__ref.getField(false,"_timermap" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 180;BA.debugLine="icoMap.Clear";
Debug.ShouldStop(524288);
__ref.getField(false,"_icomap" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 181;BA.debugLine="animCounter.Clear";
Debug.ShouldStop(1048576);
__ref.getField(false,"_animcounter" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 182;BA.debugLine="RenderedIcons.Clear";
Debug.ShouldStop(2097152);
__ref.getField(false,"_renderedicons" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 183;BA.debugLine="For Each ico As Int In iconMap.Keys";
Debug.ShouldStop(4194304);
{
final RemoteObject group12 = _iconmap.runMethod(false,"Keys");
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_ico = BA.numberCast(int.class, group12.runMethod(false,"Get",index12));Debug.locals.put("ico", _ico);
Debug.locals.put("ico", _ico);
 BA.debugLineNum = 184;BA.debugLine="Dim ico1 As Map = iconMap.get(ico)";
Debug.ShouldStop(8388608);
_ico1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ico1.setObject(_iconmap.runMethod(false,"Get",(Object)((_ico))));Debug.locals.put("ico1", _ico1);
 BA.debugLineNum = 185;BA.debugLine="If ico1.ContainsKey(\"tick\") Then";
Debug.ShouldStop(16777216);
if (_ico1.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("tick")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 186;BA.debugLine="icoMap.Put(ico,ico1.Get(\"data\"))";
Debug.ShouldStop(33554432);
__ref.getField(false,"_icomap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_ico)),(Object)(_ico1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data"))))));
 BA.debugLineNum = 187;BA.debugLine="animCounter.Put(ico,0)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_animcounter" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_ico)),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 188;BA.debugLine="Dim timer As Timer";
Debug.ShouldStop(134217728);
_timer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");Debug.locals.put("timer", _timer);
 BA.debugLineNum = 189;BA.debugLine="timer.Initialize(\"Timer\",ico1.Get(\"tick\"))";
Debug.ShouldStop(268435456);
_timer.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Timer")),(Object)(BA.numberCast(long.class, _ico1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tick")))))));
 BA.debugLineNum = 190;BA.debugLine="Dim icoExists As Boolean=False";
Debug.ShouldStop(536870912);
_icoexists = awtrix.__c.getField(true,"False");Debug.locals.put("icoExists", _icoexists);Debug.locals.put("icoExists", _icoexists);
 BA.debugLineNum = 191;BA.debugLine="For Each timerico As Int In timermap.Values";
Debug.ShouldStop(1073741824);
{
final RemoteObject group20 = __ref.getField(false,"_timermap" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen20 = group20.runMethod(true,"getSize").<Integer>get()
;int index20 = 0;
;
for (; index20 < groupLen20;index20++){
_timerico = BA.numberCast(int.class, group20.runMethod(false,"Get",index20));Debug.locals.put("timerico", _timerico);
Debug.locals.put("timerico", _timerico);
 BA.debugLineNum = 192;BA.debugLine="If timerico=ico Then icoExists=True";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_timerico,BA.numberCast(double.class, _ico))) { 
_icoexists = awtrix.__c.getField(true,"True");Debug.locals.put("icoExists", _icoexists);};
 }
}Debug.locals.put("timerico", _timerico);
;
 BA.debugLineNum = 194;BA.debugLine="If Not(icoExists) Then timermap.Put(timer,ico)";
Debug.ShouldStop(2);
if (awtrix.__c.runMethod(true,"Not",(Object)(_icoexists)).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_timermap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_timer)),(Object)((_ico)));};
 }else {
 BA.debugLineNum = 196;BA.debugLine="RenderedIcons.Put(ico,ico1.Get(\"data\"))";
Debug.ShouldStop(8);
__ref.getField(false,"_renderedicons" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_ico)),(Object)(_ico1.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data"))))));
 };
 }
}Debug.locals.put("ico", _ico);
;
 BA.debugLineNum = 199;BA.debugLine="If runMarker Then";
Debug.ShouldStop(64);
if (_runmarker.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 200;BA.debugLine="startIconRenderer";
Debug.ShouldStop(128);
__ref.runClassMethod (b4j.example.awtrix.class, "_starticonrenderer" /*RemoteObject*/ );
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e32.toString()); BA.debugLineNum = 203;BA.debugLine="Log(\"Got Error from \" & AppName)";
Debug.ShouldStop(1024);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Got Error from "),__ref.getField(true,"_appname" /*RemoteObject*/ ))));
 BA.debugLineNum = 204;BA.debugLine="Log(\"Error in IconAdder:\")";
Debug.ShouldStop(2048);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error in IconAdder:")));
 BA.debugLineNum = 205;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
awtrix.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(awtrix.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appcontrol(RemoteObject __ref,RemoteObject _tag,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("AppControl (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("appcontrol")) { return __ref.runUserSub(false, "awtrix","appcontrol", __ref, _tag, _params);}
RemoteObject _downloadmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _res = RemoteObject.declareNull("b4j.example.awtrix._jobresponse");
RemoteObject _infos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = null;
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _isconfigured = RemoteObject.createImmutable(false);
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("Tag", _tag);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 226;BA.debugLine="Public Sub AppControl(Tag As String, Params As Map";
Debug.ShouldStop(2);
 BA.debugLineNum = 227;BA.debugLine="Select Case Tag";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("start"),BA.ObjectToString("downloadCount"),BA.ObjectToString("startDownload"),BA.ObjectToString("httpResponse"),BA.ObjectToString("running"),BA.ObjectToString("tick"),BA.ObjectToString("infos"),BA.ObjectToString("setSettings"),BA.ObjectToString("getUpdateInterval"),BA.ObjectToString("setEnabled"),BA.ObjectToString("getEnable"),BA.ObjectToString("stop"),BA.ObjectToString("getIcon"),BA.ObjectToString("iconList"),BA.ObjectToString("externalCommand"),BA.ObjectToString("getMenu"))) {
case 0: {
 BA.debugLineNum = 229;BA.debugLine="If SubExists(Target,event&\"_Started\") Then";
Debug.ShouldStop(16);
if (awtrix.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_Started")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 230;BA.debugLine="CallSub(Target,event&\"_Started\")";
Debug.ShouldStop(32);
awtrix.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_Started"))));
 };
 BA.debugLineNum = 232;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 233;BA.debugLine="Appduration = Params.Get(\"AppDuration\")";
Debug.ShouldStop(256);
__ref.setField ("_appduration" /*RemoteObject*/ ,BA.numberCast(int.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AppDuration"))))));
 BA.debugLineNum = 234;BA.debugLine="If DisplayTime>0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_displaytime" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 235;BA.debugLine="Appduration=DisplayTime";
Debug.ShouldStop(1024);
__ref.setField ("_appduration" /*RemoteObject*/ ,__ref.getField(true,"_displaytime" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 237;BA.debugLine="ServerVersion =	 Params.Get(\"ServerVersion\")";
Debug.ShouldStop(4096);
__ref.setField ("_serverversion" /*RemoteObject*/ ,BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ServerVersion"))))));
 BA.debugLineNum = 238;BA.debugLine="MatrixWidth = Params.Get(\"MatrixWidth\")";
Debug.ShouldStop(8192);
__ref.setField ("_matrixwidth" /*RemoteObject*/ ,BA.numberCast(int.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MatrixWidth"))))));
 BA.debugLineNum = 239;BA.debugLine="MatrixHeight = Params.Get(\"MatrixHeight\")";
Debug.ShouldStop(16384);
__ref.setField ("_matrixheight" /*RemoteObject*/ ,BA.numberCast(int.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("MatrixHeight"))))));
 BA.debugLineNum = 240;BA.debugLine="UppercaseLetters = Params.Get(\"UppercaseLetter";
Debug.ShouldStop(32768);
__ref.setField ("_uppercaseletters" /*RemoteObject*/ ,BA.ObjectToBoolean(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UppercaseLetters"))))));
 BA.debugLineNum = 241;BA.debugLine="CharMap = Params.Get(\"CharMap\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_charmap" /*RemoteObject*/ ).setObject (_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CharMap")))));
 BA.debugLineNum = 242;BA.debugLine="SystemColor = Params.Get(\"SystemColor\")";
Debug.ShouldStop(131072);
__ref.setField ("_systemcolor" /*RemoteObject*/ ,(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SystemColor"))))));
 BA.debugLineNum = 243;BA.debugLine="scrollposition=MatrixWidth";
Debug.ShouldStop(262144);
__ref.setField ("_scrollposition" /*RemoteObject*/ ,__ref.getField(true,"_matrixwidth" /*RemoteObject*/ ));
 BA.debugLineNum = 244;BA.debugLine="Set.Put(\"interval\",TickInterval)";
Debug.ShouldStop(524288);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("interval"))),(Object)((__ref.getField(true,"_tickinterval" /*RemoteObject*/ ))));
 BA.debugLineNum = 245;BA.debugLine="Set.Put(\"needDownload\",NeedDownloads)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("needDownload"))),(Object)((__ref.getField(true,"_needdownloads" /*RemoteObject*/ ))));
 BA.debugLineNum = 246;BA.debugLine="Set.Put(\"DisplayTime\", DisplayTime)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DisplayTime"))),(Object)((__ref.getField(true,"_displaytime" /*RemoteObject*/ ))));
 BA.debugLineNum = 247;BA.debugLine="Set.Put(\"forceDownload\", forceDownload)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("forceDownload"))),(Object)((__ref.getField(true,"_forcedownload" /*RemoteObject*/ ))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e23.toString()); BA.debugLineNum = 249;BA.debugLine="Log(\"Got Error from \" & AppName)";
Debug.ShouldStop(16777216);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Got Error from "),__ref.getField(true,"_appname" /*RemoteObject*/ ))));
 BA.debugLineNum = 250;BA.debugLine="Log(\"Error in start procedure\")";
Debug.ShouldStop(33554432);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error in start procedure")));
 BA.debugLineNum = 251;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
awtrix.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(awtrix.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 253;BA.debugLine="StartedAt=DateTime.now";
Debug.ShouldStop(268435456);
__ref.setField ("_startedat" /*RemoteObject*/ ,awtrix.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 254;BA.debugLine="noIconMessage=False";
Debug.ShouldStop(536870912);
__ref.setField ("_noiconmessage" /*RemoteObject*/ ,awtrix.__c.getField(true,"False"));
 BA.debugLineNum = 255;BA.debugLine="If ShouldShow Then";
Debug.ShouldStop(1073741824);
if (__ref.getField(true,"_shouldshow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 256;BA.debugLine="Set.Put(\"show\",timesComparative)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("show"))),(Object)((__ref.runClassMethod (b4j.example.awtrix.class, "_timescomparative" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 258;BA.debugLine="Set.Put(\"show\",ShouldShow)";
Debug.ShouldStop(2);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("show"))),(Object)((__ref.getField(true,"_shouldshow" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 260;BA.debugLine="Set.Put(\"hold\",LockApp)";
Debug.ShouldStop(8);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("hold"))),(Object)((__ref.getField(true,"_lockapp" /*RemoteObject*/ ))));
 BA.debugLineNum = 261;BA.debugLine="Set.Put(\"iconList\",Icons)";
Debug.ShouldStop(16);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("iconList"))),(Object)((__ref.getField(false,"_icons" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 262;BA.debugLine="Return Set";
Debug.ShouldStop(32);
if (true) return (__ref.getField(false,"_set" /*RemoteObject*/ ).getObject());
 break; }
case 1: {
 BA.debugLineNum = 264;BA.debugLine="Return NeedDownloads";
Debug.ShouldStop(128);
if (true) return (__ref.getField(true,"_needdownloads" /*RemoteObject*/ ));
 break; }
case 2: {
 BA.debugLineNum = 266;BA.debugLine="Dim downloadMap As Map";
Debug.ShouldStop(512);
_downloadmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("downloadMap", _downloadmap);
 BA.debugLineNum = 267;BA.debugLine="downloadMap.Initialize";
Debug.ShouldStop(1024);
_downloadmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 268;BA.debugLine="If SubExists(Target,event&\"_startDownload\") The";
Debug.ShouldStop(2048);
if (awtrix.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_startDownload")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 269;BA.debugLine="CallSub2(Target,event&\"_startDownload\",Params.";
Debug.ShouldStop(4096);
awtrix.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_startDownload"))),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jobNr"))))));
 BA.debugLineNum = 270;BA.debugLine="Dim downloadMap As Map";
Debug.ShouldStop(8192);
_downloadmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("downloadMap", _downloadmap);
 BA.debugLineNum = 271;BA.debugLine="downloadMap.Initialize";
Debug.ShouldStop(16384);
_downloadmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 272;BA.debugLine="downloadMap.Put(\"URL\",DownloadURL)";
Debug.ShouldStop(32768);
_downloadmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("URL"))),(Object)((__ref.getField(true,"_downloadurl" /*RemoteObject*/ ))));
 BA.debugLineNum = 273;BA.debugLine="downloadMap.Put(\"Header\",DownloadHeader)";
Debug.ShouldStop(65536);
_downloadmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Header"))),(Object)((__ref.getField(false,"_downloadheader" /*RemoteObject*/ ).getObject())));
 };
 BA.debugLineNum = 275;BA.debugLine="Return downloadMap";
Debug.ShouldStop(262144);
if (true) return (_downloadmap.getObject());
 break; }
case 3: {
 BA.debugLineNum = 277;BA.debugLine="Dim res As JobResponse";
Debug.ShouldStop(1048576);
_res = RemoteObject.createNew ("b4j.example.awtrix._jobresponse");Debug.locals.put("res", _res);
 BA.debugLineNum = 278;BA.debugLine="res.Initialize";
Debug.ShouldStop(2097152);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 279;BA.debugLine="res.jobNr=Params.Get(\"jobNr\")";
Debug.ShouldStop(4194304);
_res.setField ("jobNr" /*RemoteObject*/ ,BA.numberCast(int.class, _params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("jobNr"))))));
 BA.debugLineNum = 280;BA.debugLine="res.Success=Params.Get(\"success\")";
Debug.ShouldStop(8388608);
_res.setField ("Success" /*RemoteObject*/ ,BA.ObjectToBoolean(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("success"))))));
 BA.debugLineNum = 281;BA.debugLine="res.ResponseString=Params.Get(\"response\")";
Debug.ShouldStop(16777216);
_res.setField ("ResponseString" /*RemoteObject*/ ,BA.ObjectToString(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("response"))))));
 BA.debugLineNum = 282;BA.debugLine="res.Stream=Params.Get(\"InputStream\")";
Debug.ShouldStop(33554432);
_res.getField(false,"Stream" /*RemoteObject*/ ).setObject (_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("InputStream")))));
 BA.debugLineNum = 283;BA.debugLine="If SubExists(Target,event&\"_evalJobResponse\") T";
Debug.ShouldStop(67108864);
if (awtrix.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_evalJobResponse")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 284;BA.debugLine="CallSub2(Target,event&\"_evalJobResponse\",res)";
Debug.ShouldStop(134217728);
awtrix.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_evalJobResponse"))),(Object)((_res)));
 };
 BA.debugLineNum = 286;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return (awtrix.__c.getField(true,"True"));
 break; }
case 4: {
 BA.debugLineNum = 288;BA.debugLine="startIconRenderer";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.example.awtrix.class, "_starticonrenderer" /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 290;BA.debugLine="commandList.Clear";
Debug.ShouldStop(2);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 291;BA.debugLine="If SubExists(Target,event&\"_genFrame\") Then";
Debug.ShouldStop(4);
if (awtrix.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_genFrame")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 292;BA.debugLine="CallSub(Target,event&\"_genFrame\")'ignore";
Debug.ShouldStop(8);
awtrix.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_genFrame"))));
 };
 BA.debugLineNum = 294;BA.debugLine="Return commandList";
Debug.ShouldStop(32);
if (true) return (__ref.getField(false,"_commandlist" /*RemoteObject*/ ).getObject());
 break; }
case 6: {
 BA.debugLineNum = 296;BA.debugLine="Dim infos As Map";
Debug.ShouldStop(128);
_infos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("infos", _infos);
 BA.debugLineNum = 297;BA.debugLine="infos.Initialize";
Debug.ShouldStop(256);
_infos.runVoidMethod ("Initialize");
 BA.debugLineNum = 298;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(512);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 299;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\")";
Debug.ShouldStop(1024);
if (awtrix.__c.getField(false,"File").runMethod(true,"Exists",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".png")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 300;BA.debugLine="Dim in As InputStream";
Debug.ShouldStop(2048);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 301;BA.debugLine="in = File.OpenInput(File.Combine(File.DirApp,\"";
Debug.ShouldStop(4096);
_in = awtrix.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".png"))));Debug.locals.put("in", _in);
 BA.debugLineNum = 302;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(8192);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 303;BA.debugLine="out.InitializeToBytesArray(1000)";
Debug.ShouldStop(16384);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1000)));
 BA.debugLineNum = 304;BA.debugLine="File.Copy2(in, out)";
Debug.ShouldStop(32768);
awtrix.__c.getField(false,"File").runVoidMethod ("Copy2",(Object)((_in.getObject())),(Object)((_out.getObject())));
 BA.debugLineNum = 305;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(65536);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 306;BA.debugLine="out.Close";
Debug.ShouldStop(131072);
_out.runVoidMethod ("Close");
 };
 BA.debugLineNum = 308;BA.debugLine="infos.Put(\"pic\",data)";
Debug.ShouldStop(524288);
_infos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pic"))),(Object)((_data)));
 BA.debugLineNum = 309;BA.debugLine="Dim isconfigured As Boolean = True";
Debug.ShouldStop(1048576);
_isconfigured = awtrix.__c.getField(true,"True");Debug.locals.put("isconfigured", _isconfigured);Debug.locals.put("isconfigured", _isconfigured);
 BA.debugLineNum = 310;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\")";
Debug.ShouldStop(2097152);
if (awtrix.__c.getField(false,"File").runMethod(true,"Exists",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 311;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(File.Re";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"ConvertBytesToObject",(Object)(awtrix.__c.getField(false,"File").runMethod(false,"ReadBytes",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax")))))));Debug.locals.put("m", _m);
 BA.debugLineNum = 312;BA.debugLine="For Each v As Object In m.Values";
Debug.ShouldStop(8388608);
{
final RemoteObject group86 = _m.runMethod(false,"Values");
final int groupLen86 = group86.runMethod(true,"getSize").<Integer>get()
;int index86 = 0;
;
for (; index86 < groupLen86;index86++){
_v = group86.runMethod(false,"Get",index86);Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 313;BA.debugLine="If v=\"null\" Or v=\"\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_v,RemoteObject.createImmutable(("null"))) || RemoteObject.solveBoolean("=",_v,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 314;BA.debugLine="isconfigured=False";
Debug.ShouldStop(33554432);
_isconfigured = awtrix.__c.getField(true,"False");Debug.locals.put("isconfigured", _isconfigured);
 };
 }
}Debug.locals.put("v", _v);
;
 };
 BA.debugLineNum = 318;BA.debugLine="infos.Put(\"isconfigured\",isconfigured)";
Debug.ShouldStop(536870912);
_infos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("isconfigured"))),(Object)((_isconfigured)));
 BA.debugLineNum = 319;BA.debugLine="infos.Put(\"AppVersion\",AppVersion)";
Debug.ShouldStop(1073741824);
_infos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("AppVersion"))),(Object)((__ref.getField(true,"_appversion" /*RemoteObject*/ ))));
 BA.debugLineNum = 320;BA.debugLine="infos.Put(\"description\",AppDescription)";
Debug.ShouldStop(-2147483648);
_infos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("description"))),(Object)((__ref.getField(true,"_appdescription" /*RemoteObject*/ ))));
 BA.debugLineNum = 321;BA.debugLine="infos.Put(\"setupInfos\",SetupInfos)";
Debug.ShouldStop(1);
_infos.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("setupInfos"))),(Object)((__ref.getField(true,"_setupinfos" /*RemoteObject*/ ))));
 BA.debugLineNum = 322;BA.debugLine="Return infos";
Debug.ShouldStop(2);
if (true) return (_infos.getObject());
 break; }
case 7: {
 BA.debugLineNum = 324;BA.debugLine="MakeSettings";
Debug.ShouldStop(8);
__ref.runClassMethod (b4j.example.awtrix.class, "_makesettings" /*RemoteObject*/ );
 BA.debugLineNum = 325;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return (awtrix.__c.getField(true,"True"));
 break; }
case 8: {
 BA.debugLineNum = 327;BA.debugLine="Return UpdateInterval";
Debug.ShouldStop(64);
if (true) return (__ref.getField(true,"_updateinterval" /*RemoteObject*/ ));
 break; }
case 9: {
 BA.debugLineNum = 329;BA.debugLine="saveSingleSetting(\"Enabled\",Params.Get(\"Enabled";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.awtrix.class, "_savesinglesetting" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Enabled")),(Object)(_params.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Enabled"))))));
 BA.debugLineNum = 330;BA.debugLine="MakeSettings";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.awtrix.class, "_makesettings" /*RemoteObject*/ );
 break; }
case 10: {
 BA.debugLineNum = 332;BA.debugLine="Return Enabled";
Debug.ShouldStop(2048);
if (true) return (__ref.getField(true,"_enabled" /*RemoteObject*/ ));
 break; }
case 11: {
 BA.debugLineNum = 334;BA.debugLine="stopIconRenderer";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4j.example.awtrix.class, "_stopiconrenderer" /*RemoteObject*/ );
 break; }
case 12: {
 BA.debugLineNum = 336;BA.debugLine="If SubExists(Target,event&\"_iconRequest\") Then";
Debug.ShouldStop(32768);
if (awtrix.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_iconRequest")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 337;BA.debugLine="CallSub(Target,event&\"_iconRequest\")";
Debug.ShouldStop(65536);
awtrix.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_iconRequest"))));
 };
 BA.debugLineNum = 339;BA.debugLine="Return CreateMap(\"iconList\":Icons)";
Debug.ShouldStop(262144);
if (true) return (awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("iconList")),(__ref.getField(false,"_icons" /*RemoteObject*/ ).getObject())})).getObject());
 break; }
case 13: {
 BA.debugLineNum = 341;BA.debugLine="addToIconRenderer(Params)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4j.example.awtrix.class, "_addtoiconrenderer" /*RemoteObject*/ ,(Object)(_params));
 break; }
case 14: {
 BA.debugLineNum = 343;BA.debugLine="If SubExists(Target,event&\"_externalCommand\") T";
Debug.ShouldStop(4194304);
if (awtrix.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_externalCommand")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="CallSub2(Target,event&\"_externalCommand\",res)";
Debug.ShouldStop(8388608);
awtrix.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_externalCommand"))),(Object)((_res)));
 };
 break; }
case 15: {
 BA.debugLineNum = 347;BA.debugLine="Menu.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_menu" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 348;BA.debugLine="Menu.Put(\"Version\",\"1.6\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_menu" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Version"))),(Object)((RemoteObject.createImmutable("1.6"))));
 BA.debugLineNum = 349;BA.debugLine="Menu.Put(\"Theme\",\"Light Theme\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_menu" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Theme"))),(Object)((RemoteObject.createImmutable("Light Theme"))));
 BA.debugLineNum = 350;BA.debugLine="Menu.Put(\"Items\",MenuList)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_menu" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Items"))),(Object)((__ref.getField(false,"_menulist" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 351;BA.debugLine="Return Menu";
Debug.ShouldStop(1073741824);
if (true) return (__ref.getField(false,"_menu" /*RemoteObject*/ ).getObject());
 break; }
}
;
 BA.debugLineNum = 353;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) return (awtrix.__c.getField(true,"True"));
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calctextlength(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("calcTextLength (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,357);
if (RapidSub.canDelegate("calctextlength")) { return __ref.runUserSub(false, "awtrix","calctextlength", __ref, _text);}
RemoteObject _length = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("text", _text);
 BA.debugLineNum = 357;BA.debugLine="Public Sub calcTextLength(text As String) As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 358;BA.debugLine="If UppercaseLetters Then text = text.ToUpperCase";
Debug.ShouldStop(32);
if (__ref.getField(true,"_uppercaseletters" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_text = _text.runMethod(true,"toUpperCase");Debug.locals.put("text", _text);};
 BA.debugLineNum = 359;BA.debugLine="If TextBuffer<>text Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_textbuffer" /*RemoteObject*/ ),_text)) { 
 BA.debugLineNum = 360;BA.debugLine="Dim Length As Int";
Debug.ShouldStop(128);
_length = RemoteObject.createImmutable(0);Debug.locals.put("Length", _length);
 BA.debugLineNum = 361;BA.debugLine="For i=0 To text.Length-1";
Debug.ShouldStop(256);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 362;BA.debugLine="If CharMap.ContainsKey(Asc(text.CharAt(i))) The";
Debug.ShouldStop(512);
if (__ref.getField(false,"_charmap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((awtrix.__c.runMethod(true,"Asc",(Object)(_text.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i)))))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 363;BA.debugLine="Length=Length+(CharMap.Get(Asc(text.CharAt(i))";
Debug.ShouldStop(1024);
_length = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_length,BA.numberCast(double.class, (__ref.getField(false,"_charmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((awtrix.__c.runMethod(true,"Asc",(Object)(_text.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))))))))))}, "+",1, 0));Debug.locals.put("Length", _length);
 }else {
 BA.debugLineNum = 365;BA.debugLine="Length=Length+4";
Debug.ShouldStop(4096);
_length = RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(4)}, "+",1, 1);Debug.locals.put("Length", _length);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 368;BA.debugLine="TextBuffer=text";
Debug.ShouldStop(32768);
__ref.setField ("_textbuffer" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 369;BA.debugLine="TextLength=Length";
Debug.ShouldStop(65536);
__ref.setField ("_textlength" /*RemoteObject*/ ,_length);
 BA.debugLineNum = 370;BA.debugLine="Return Length";
Debug.ShouldStop(131072);
if (true) return _length;
 };
 BA.debugLineNum = 372;BA.debugLine="Return TextLength";
Debug.ShouldStop(524288);
if (true) return __ref.getField(true,"_textlength" /*RemoteObject*/ );
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Public Appduration As Int";
awtrix._appduration = RemoteObject.createImmutable(0);__ref.setField("_appduration",awtrix._appduration);
 //BA.debugLineNum = 14;BA.debugLine="Public scrollposition As Int";
awtrix._scrollposition = RemoteObject.createImmutable(0);__ref.setField("_scrollposition",awtrix._scrollposition);
 //BA.debugLineNum = 15;BA.debugLine="Public ShouldShow As Boolean = True";
awtrix._shouldshow = awtrix.__c.getField(true,"True");__ref.setField("_shouldshow",awtrix._shouldshow);
 //BA.debugLineNum = 16;BA.debugLine="Public forceDownload As Boolean";
awtrix._forcedownload = RemoteObject.createImmutable(false);__ref.setField("_forcedownload",awtrix._forcedownload);
 //BA.debugLineNum = 17;BA.debugLine="Public LockApp As Boolean=False";
awtrix._lockapp = awtrix.__c.getField(true,"False");__ref.setField("_lockapp",awtrix._lockapp);
 //BA.debugLineNum = 18;BA.debugLine="Public Icons As List";
awtrix._icons = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_icons",awtrix._icons);
 //BA.debugLineNum = 19;BA.debugLine="Public AppName As String";
awtrix._appname = RemoteObject.createImmutable("");__ref.setField("_appname",awtrix._appname);
 //BA.debugLineNum = 20;BA.debugLine="Public AppVersion As String";
awtrix._appversion = RemoteObject.createImmutable("");__ref.setField("_appversion",awtrix._appversion);
 //BA.debugLineNum = 21;BA.debugLine="Public TickInterval As Int";
awtrix._tickinterval = RemoteObject.createImmutable(0);__ref.setField("_tickinterval",awtrix._tickinterval);
 //BA.debugLineNum = 22;BA.debugLine="Public NeedDownloads As Int";
awtrix._needdownloads = RemoteObject.createImmutable(0);__ref.setField("_needdownloads",awtrix._needdownloads);
 //BA.debugLineNum = 23;BA.debugLine="Public UpdateInterval As Int";
awtrix._updateinterval = RemoteObject.createImmutable(0);__ref.setField("_updateinterval",awtrix._updateinterval);
 //BA.debugLineNum = 24;BA.debugLine="Public AppDescription As String";
awtrix._appdescription = RemoteObject.createImmutable("");__ref.setField("_appdescription",awtrix._appdescription);
 //BA.debugLineNum = 25;BA.debugLine="Public SetupInfos As String";
awtrix._setupinfos = RemoteObject.createImmutable("");__ref.setField("_setupinfos",awtrix._setupinfos);
 //BA.debugLineNum = 26;BA.debugLine="Public appSettings As Map";
awtrix._appsettings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_appsettings",awtrix._appsettings);
 //BA.debugLineNum = 27;BA.debugLine="Public ServerVersion As String";
awtrix._serverversion = RemoteObject.createImmutable("");__ref.setField("_serverversion",awtrix._serverversion);
 //BA.debugLineNum = 28;BA.debugLine="Public DisplayTime As Int";
awtrix._displaytime = RemoteObject.createImmutable(0);__ref.setField("_displaytime",awtrix._displaytime);
 //BA.debugLineNum = 29;BA.debugLine="Public MatrixWidth As Int = 32";
awtrix._matrixwidth = BA.numberCast(int.class, 32);__ref.setField("_matrixwidth",awtrix._matrixwidth);
 //BA.debugLineNum = 30;BA.debugLine="Public MatrixHeight As Int = 8";
awtrix._matrixheight = BA.numberCast(int.class, 8);__ref.setField("_matrixheight",awtrix._matrixheight);
 //BA.debugLineNum = 31;BA.debugLine="Public DownloadURL As String";
awtrix._downloadurl = RemoteObject.createImmutable("");__ref.setField("_downloadurl",awtrix._downloadurl);
 //BA.debugLineNum = 32;BA.debugLine="Public DownloadHeader As Map";
awtrix._downloadheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_downloadheader",awtrix._downloadheader);
 //BA.debugLineNum = 33;BA.debugLine="Public StartedAt As Long";
awtrix._startedat = RemoteObject.createImmutable(0L);__ref.setField("_startedat",awtrix._startedat);
 //BA.debugLineNum = 34;BA.debugLine="Private icoMap As Map";
awtrix._icomap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_icomap",awtrix._icomap);
 //BA.debugLineNum = 35;BA.debugLine="Private RenderedIcons As Map";
awtrix._renderedicons = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_renderedicons",awtrix._renderedicons);
 //BA.debugLineNum = 36;BA.debugLine="Private animCounter As Map";
awtrix._animcounter = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_animcounter",awtrix._animcounter);
 //BA.debugLineNum = 37;BA.debugLine="Private iconList As List'ignore";
awtrix._iconlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_iconlist",awtrix._iconlist);
 //BA.debugLineNum = 38;BA.debugLine="Private timermap As Map";
awtrix._timermap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_timermap",awtrix._timermap);
 //BA.debugLineNum = 39;BA.debugLine="Private Set As Map 'ignore";
awtrix._set = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_set",awtrix._set);
 //BA.debugLineNum = 40;BA.debugLine="Private Target As Object";
awtrix._target = RemoteObject.createNew ("Object");__ref.setField("_target",awtrix._target);
 //BA.debugLineNum = 41;BA.debugLine="Private commandList As List";
awtrix._commandlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_commandlist",awtrix._commandlist);
 //BA.debugLineNum = 42;BA.debugLine="Private colorCounter As Int";
awtrix._colorcounter = RemoteObject.createImmutable(0);__ref.setField("_colorcounter",awtrix._colorcounter);
 //BA.debugLineNum = 43;BA.debugLine="Private starttime As String =\"0\"";
awtrix._starttime = BA.ObjectToString("0");__ref.setField("_starttime",awtrix._starttime);
 //BA.debugLineNum = 44;BA.debugLine="Private endtime As String = \"0\"";
awtrix._endtime = BA.ObjectToString("0");__ref.setField("_endtime",awtrix._endtime);
 //BA.debugLineNum = 45;BA.debugLine="Private CharMap As Map";
awtrix._charmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_charmap",awtrix._charmap);
 //BA.debugLineNum = 46;BA.debugLine="Private TextBuffer As String";
awtrix._textbuffer = RemoteObject.createImmutable("");__ref.setField("_textbuffer",awtrix._textbuffer);
 //BA.debugLineNum = 47;BA.debugLine="Private TextLength As Int";
awtrix._textlength = RemoteObject.createImmutable(0);__ref.setField("_textlength",awtrix._textlength);
 //BA.debugLineNum = 48;BA.debugLine="Private UppercaseLetters As Boolean";
awtrix._uppercaseletters = RemoteObject.createImmutable(false);__ref.setField("_uppercaseletters",awtrix._uppercaseletters);
 //BA.debugLineNum = 49;BA.debugLine="Private SystemColor() As Int";
awtrix._systemcolor = RemoteObject.createNewArray ("int", new int[] {0}, new Object[]{});__ref.setField("_systemcolor",awtrix._systemcolor);
 //BA.debugLineNum = 50;BA.debugLine="Private event As String";
awtrix._event = RemoteObject.createImmutable("");__ref.setField("_event",awtrix._event);
 //BA.debugLineNum = 51;BA.debugLine="Private Enabled As Boolean = True";
awtrix._enabled = awtrix.__c.getField(true,"True");__ref.setField("_enabled",awtrix._enabled);
 //BA.debugLineNum = 52;BA.debugLine="Private noIcon() As Short = Array As Short(0, 0,";
awtrix._noicon = RemoteObject.createNewArray("short",new int[] {64},new Object[] {BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 63488),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0),BA.numberCast(short.class, 0)});__ref.setField("_noicon",awtrix._noicon);
 //BA.debugLineNum = 53;BA.debugLine="Private isRunning As Boolean";
awtrix._isrunning = RemoteObject.createImmutable(false);__ref.setField("_isrunning",awtrix._isrunning);
 //BA.debugLineNum = 54;BA.debugLine="Private Menu As Map";
awtrix._menu = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_menu",awtrix._menu);
 //BA.debugLineNum = 55;BA.debugLine="Private MenuList As List";
awtrix._menulist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_menulist",awtrix._menulist);
 //BA.debugLineNum = 56;BA.debugLine="Private bc As B4XSerializator";
awtrix._bc = RemoteObject.createNew ("anywheresoftware.b4a.randomaccessfile.B4XSerializator");__ref.setField("_bc",awtrix._bc);
 //BA.debugLineNum = 57;BA.debugLine="Private noIconMessage As Boolean";
awtrix._noiconmessage = RemoteObject.createImmutable(false);__ref.setField("_noiconmessage",awtrix._noiconmessage);
 //BA.debugLineNum = 59;BA.debugLine="Type JobResponse (jobNr As Int,Success As Boolean";
;
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _customcommand(RemoteObject __ref,RemoteObject _cmd) throws Exception{
try {
		Debug.PushSubsStack("customCommand (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("customcommand")) { return __ref.runUserSub(false, "awtrix","customcommand", __ref, _cmd);}
Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 540;BA.debugLine="Public Sub customCommand(cmd As Map)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 541;BA.debugLine="commandList.Add(cmd)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cmd.getObject())));
 BA.debugLineNum = 542;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawbmp(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _bmp,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("drawBMP (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("drawbmp")) { return __ref.runUserSub(false, "awtrix","drawbmp", __ref, _x, _y, _bmp, _width, _height);}
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("bmp", _bmp);
Debug.locals.put("width", _width);
Debug.locals.put("height", _height);
 BA.debugLineNum = 481;BA.debugLine="Public Sub drawBMP(x As Int,y As Int,bmp() As Shor";
Debug.ShouldStop(1);
 BA.debugLineNum = 482;BA.debugLine="commandList.Add(CreateMap(\"type\":\"bmp\",\"x\":x,\"y\":";
Debug.ShouldStop(2);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("bmp")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("bmp")),(_bmp),RemoteObject.createImmutable(("width")),(_width),RemoteObject.createImmutable(("height")),(_height)})).getObject())));
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawcircle(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _radius,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("drawCircle (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("drawcircle")) { return __ref.runUserSub(false, "awtrix","drawcircle", __ref, _x, _y, _radius, _color);}
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("Radius", _radius);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 495;BA.debugLine="Public Sub drawCircle(X As Int, Y As Int, Radius A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 496;BA.debugLine="If Color=Null Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("n",_color)) { 
 BA.debugLineNum = 497;BA.debugLine="commandList.Add(CreateMap(\"type\":\"circle\",\"x\":x,";
Debug.ShouldStop(65536);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("circle")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("r")),(_radius),RemoteObject.createImmutable(("color")),(__ref.getField(false,"_systemcolor" /*RemoteObject*/ ))})).getObject())));
 }else {
 BA.debugLineNum = 499;BA.debugLine="commandList.Add(CreateMap(\"type\":\"circle\",\"x\":x,";
Debug.ShouldStop(262144);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("circle")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("r")),(_radius),RemoteObject.createImmutable(("color")),(_color)})).getObject())));
 };
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawline(RemoteObject __ref,RemoteObject _x0,RemoteObject _y0,RemoteObject _x1,RemoteObject _y1,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("drawLine (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,531);
if (RapidSub.canDelegate("drawline")) { return __ref.runUserSub(false, "awtrix","drawline", __ref, _x0, _y0, _x1, _y1, _color);}
Debug.locals.put("X0", _x0);
Debug.locals.put("Y0", _y0);
Debug.locals.put("X1", _x1);
Debug.locals.put("Y1", _y1);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 531;BA.debugLine="Public Sub drawLine(X0 As Int,Y0 As Int,X1  As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 532;BA.debugLine="If Color=Null Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("n",_color)) { 
 BA.debugLineNum = 533;BA.debugLine="commandList.Add(CreateMap(\"type\":\"line\",\"x0\":X0,";
Debug.ShouldStop(1048576);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("line")),RemoteObject.createImmutable(("x0")),(_x0),RemoteObject.createImmutable(("y0")),(_y0),RemoteObject.createImmutable(("x1")),(_x1),RemoteObject.createImmutable(("y1")),(_y1),RemoteObject.createImmutable(("color")),(__ref.getField(false,"_systemcolor" /*RemoteObject*/ ))})).getObject())));
 }else {
 BA.debugLineNum = 535;BA.debugLine="commandList.Add(CreateMap(\"type\":\"line\",\"x0\":X0,";
Debug.ShouldStop(4194304);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("line")),RemoteObject.createImmutable(("x0")),(_x0),RemoteObject.createImmutable(("y0")),(_y0),RemoteObject.createImmutable(("x1")),(_x1),RemoteObject.createImmutable(("y1")),(_y1),RemoteObject.createImmutable(("color")),(_color)})).getObject())));
 };
 BA.debugLineNum = 537;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpixel(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("drawPixel (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,513);
if (RapidSub.canDelegate("drawpixel")) { return __ref.runUserSub(false, "awtrix","drawpixel", __ref, _x, _y, _color);}
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 513;BA.debugLine="Public Sub drawPixel(X As Int,Y As Int,Color() As";
Debug.ShouldStop(1);
 BA.debugLineNum = 514;BA.debugLine="If Color=Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("n",_color)) { 
 BA.debugLineNum = 515;BA.debugLine="commandList.Add(CreateMap(\"type\":\"pixel\",\"x\":x,\"";
Debug.ShouldStop(4);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("pixel")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("color")),(__ref.getField(false,"_systemcolor" /*RemoteObject*/ ))})).getObject())));
 }else {
 BA.debugLineNum = 517;BA.debugLine="commandList.Add(CreateMap(\"type\":\"pixel\",\"x\":x,\"";
Debug.ShouldStop(16);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("pixel")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("color")),(_color)})).getObject())));
 };
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawrect(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _width,RemoteObject _height,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("drawRect (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("drawrect")) { return __ref.runUserSub(false, "awtrix","drawrect", __ref, _x, _y, _width, _height, _color);}
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 522;BA.debugLine="Public Sub drawRect(X As Int,Y As Int,Width  As In";
Debug.ShouldStop(512);
 BA.debugLineNum = 523;BA.debugLine="If Color=Null Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("n",_color)) { 
 BA.debugLineNum = 524;BA.debugLine="commandList.Add(CreateMap(\"type\":\"rect\",\"x\":x,\"y";
Debug.ShouldStop(2048);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("rect")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("w")),(_width),RemoteObject.createImmutable(("h")),(_height),RemoteObject.createImmutable(("color")),(__ref.getField(false,"_systemcolor" /*RemoteObject*/ ))})).getObject())));
 }else {
 BA.debugLineNum = 526;BA.debugLine="commandList.Add(CreateMap(\"type\":\"rect\",\"x\":x,\"y";
Debug.ShouldStop(8192);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("rect")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("w")),(_width),RemoteObject.createImmutable(("h")),(_height),RemoteObject.createImmutable(("color")),(_color)})).getObject())));
 };
 BA.debugLineNum = 528;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtext(RemoteObject __ref,RemoteObject _text,RemoteObject _x,RemoteObject _y,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("drawText (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,486);
if (RapidSub.canDelegate("drawtext")) { return __ref.runUserSub(false, "awtrix","drawtext", __ref, _text, _x, _y, _color);}
Debug.locals.put("text", _text);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 486;BA.debugLine="Public Sub drawText(text As String,x As Int, y As";
Debug.ShouldStop(32);
 BA.debugLineNum = 487;BA.debugLine="If Color=Null Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("n",_color)) { 
 BA.debugLineNum = 488;BA.debugLine="commandList.Add(CreateMap(\"type\":\"text\",\"text\":t";
Debug.ShouldStop(128);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("text")),RemoteObject.createImmutable(("text")),(_text),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y)})).getObject())));
 }else {
 BA.debugLineNum = 490;BA.debugLine="commandList.Add(CreateMap(\"type\":\"text\",\"text\":t";
Debug.ShouldStop(512);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("text")),RemoteObject.createImmutable(("text")),(_text),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("color")),(_color)})).getObject())));
 };
 BA.debugLineNum = 492;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fill(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("fill (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("fill")) { return __ref.runUserSub(false, "awtrix","fill", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 545;BA.debugLine="Public Sub fill(Color() As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 546;BA.debugLine="If Color=Null Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("n",_color)) { 
 BA.debugLineNum = 547;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fill\",\"color\":";
Debug.ShouldStop(4);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("fill")),RemoteObject.createImmutable(("color")),(__ref.getField(false,"_systemcolor" /*RemoteObject*/ ))})).getObject())));
 }else {
 BA.debugLineNum = 549;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fill\",\"color\":";
Debug.ShouldStop(16);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("fill")),RemoteObject.createImmutable(("color")),(_color)})).getObject())));
 };
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fillcircle(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _radius,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("fillCircle (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,504);
if (RapidSub.canDelegate("fillcircle")) { return __ref.runUserSub(false, "awtrix","fillcircle", __ref, _x, _y, _radius, _color);}
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
Debug.locals.put("Radius", _radius);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 504;BA.debugLine="Public Sub fillCircle(X As Int, Y As Int, Radius A";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 505;BA.debugLine="If Color=Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_color)) { 
 BA.debugLineNum = 506;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fillCircle\",\"x";
Debug.ShouldStop(33554432);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("fillCircle")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("r")),(_radius),RemoteObject.createImmutable(("color")),(__ref.getField(false,"_systemcolor" /*RemoteObject*/ ))})).getObject())));
 }else {
 BA.debugLineNum = 508;BA.debugLine="commandList.Add(CreateMap(\"type\":\"fillCircle\",\"x";
Debug.ShouldStop(134217728);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),RemoteObject.createImmutable(("fillCircle")),RemoteObject.createImmutable(("x")),(_x),RemoteObject.createImmutable(("y")),(_y),RemoteObject.createImmutable(("r")),(_radius),RemoteObject.createImmutable(("color")),(_color)})).getObject())));
 };
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finish(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("finish (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,555);
if (RapidSub.canDelegate("finish")) { return __ref.runUserSub(false, "awtrix","finish", __ref);}
 BA.debugLineNum = 555;BA.debugLine="Public Sub finish";
Debug.ShouldStop(1024);
 BA.debugLineNum = 556;BA.debugLine="commandList.Add(CreateMap(\"type\":\"finish\"))";
Debug.ShouldStop(2048);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((awtrix.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("finish"))})).getObject())));
 BA.debugLineNum = 557;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _firsttick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FirstTick (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("firsttick")) { return __ref.runUserSub(false, "awtrix","firsttick", __ref);}
RemoteObject _iconid = RemoteObject.createImmutable(0);
RemoteObject _ico = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parse = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _bmproot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _bmp = null;
int _i = 0;
 BA.debugLineNum = 121;BA.debugLine="Private Sub FirstTick";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="For Each IconID As Int In icoMap.Keys";
Debug.ShouldStop(33554432);
{
final RemoteObject group1 = __ref.getField(false,"_icomap" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_iconid = BA.numberCast(int.class, group1.runMethod(false,"Get",index1));Debug.locals.put("IconID", _iconid);
Debug.locals.put("IconID", _iconid);
 BA.debugLineNum = 123;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 124;BA.debugLine="If icoMap.ContainsKey(IconID) Then";
Debug.ShouldStop(134217728);
if (__ref.getField(false,"_icomap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_iconid))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 125;BA.debugLine="Dim ico As List=icoMap.get(IconID)";
Debug.ShouldStop(268435456);
_ico = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ico.setObject(__ref.getField(false,"_icomap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid))));Debug.locals.put("ico", _ico);
 BA.debugLineNum = 126;BA.debugLine="Dim parse As JSONParser";
Debug.ShouldStop(536870912);
_parse = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parse", _parse);
 BA.debugLineNum = 127;BA.debugLine="If animCounter.Get(IconID)>ico.Size-1 Then ani";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_animcounter" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid)))),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_ico.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
__ref.getField(false,"_animcounter" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_iconid)),(Object)(RemoteObject.createImmutable((0))));};
 BA.debugLineNum = 128;BA.debugLine="parse.Initialize(ico.Get(animCounter.Get(IconI";
Debug.ShouldStop(-2147483648);
_parse.runVoidMethod ("Initialize",(Object)(BA.ObjectToString(_ico.runMethod(false,"Get",(Object)(BA.numberCast(int.class, __ref.getField(false,"_animcounter" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid)))))))));
 BA.debugLineNum = 129;BA.debugLine="Dim bmproot As List = parse.NextArray";
Debug.ShouldStop(1);
_bmproot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_bmproot = _parse.runMethod(false,"NextArray");Debug.locals.put("bmproot", _bmproot);Debug.locals.put("bmproot", _bmproot);
 BA.debugLineNum = 130;BA.debugLine="Dim bmp(bmproot.Size) As Short";
Debug.ShouldStop(2);
_bmp = RemoteObject.createNewArray ("short", new int[] {_bmproot.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 131;BA.debugLine="For i=0 To bmproot.Size-1";
Debug.ShouldStop(4);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_bmproot.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 132;BA.debugLine="bmp(i)=bmproot.Get(i)";
Debug.ShouldStop(8);
_bmp.setArrayElement (BA.numberCast(short.class, _bmproot.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 134;BA.debugLine="RenderedIcons.Put(IconID,bmp)";
Debug.ShouldStop(32);
__ref.getField(false,"_renderedicons" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_iconid)),(Object)((_bmp)));
 BA.debugLineNum = 135;BA.debugLine="animCounter.put(IconID,animCounter.Get(IconID)";
Debug.ShouldStop(64);
__ref.getField(false,"_animcounter" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_iconid)),(Object)((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_animcounter" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid)))),RemoteObject.createImmutable(1)}, "+",1, 0))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 139;BA.debugLine="Log(\"Got Error from \" & AppName)";
Debug.ShouldStop(1024);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Got Error from "),__ref.getField(true,"_appname" /*RemoteObject*/ ))));
 BA.debugLineNum = 140;BA.debugLine="Log(\"Error in IconPreloader:\")";
Debug.ShouldStop(2048);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error in IconPreloader:")));
 BA.debugLineNum = 141;BA.debugLine="Log(\"IconID:\" & IconID)";
Debug.ShouldStop(4096);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("IconID:"),_iconid)));
 BA.debugLineNum = 142;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
awtrix.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(awtrix.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 }
}Debug.locals.put("IconID", _iconid);
;
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gentext(RemoteObject __ref,RemoteObject _text,RemoteObject _iconoffset,RemoteObject _ypostition,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("genText (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("gentext")) { return __ref.runUserSub(false, "awtrix","gentext", __ref, _text, _iconoffset, _ypostition, _color);}
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("Text", _text);
Debug.locals.put("IconOffset", _iconoffset);
Debug.locals.put("yPostition", _ypostition);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 385;BA.debugLine="Public Sub genText(Text As String,IconOffset As Bo";
Debug.ShouldStop(1);
 BA.debugLineNum = 386;BA.debugLine="calcTextLength(Text)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.example.awtrix.class, "_calctextlength" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 387;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(4);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 388;BA.debugLine="If IconOffset Then offset = 24 Else offset = 32";
Debug.ShouldStop(8);
if (_iconoffset.<Boolean>get().booleanValue()) { 
_offset = BA.numberCast(int.class, 24);Debug.locals.put("offset", _offset);}
else {
_offset = BA.numberCast(int.class, 32);Debug.locals.put("offset", _offset);};
 BA.debugLineNum = 389;BA.debugLine="If TextLength>offset Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_textlength" /*RemoteObject*/ ),BA.numberCast(double.class, _offset))) { 
 BA.debugLineNum = 390;BA.debugLine="drawText(Text,scrollposition,yPostition,Color)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.example.awtrix.class, "_drawtext" /*RemoteObject*/ ,(Object)(_text),(Object)(__ref.getField(true,"_scrollposition" /*RemoteObject*/ )),(Object)(_ypostition),(Object)(_color));
 BA.debugLineNum = 391;BA.debugLine="scrollposition=scrollposition-1";
Debug.ShouldStop(64);
__ref.setField ("_scrollposition" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_scrollposition" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 392;BA.debugLine="If scrollposition< 0-TextLength  Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_scrollposition" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),__ref.getField(true,"_textlength" /*RemoteObject*/ )}, "-",1, 1)))) { 
 BA.debugLineNum = 393;BA.debugLine="If LockApp Then";
Debug.ShouldStop(256);
if (__ref.getField(true,"_lockapp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 394;BA.debugLine="finish";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.example.awtrix.class, "_finish" /*RemoteObject*/ );
 BA.debugLineNum = 395;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 397;BA.debugLine="scrollposition=MatrixWidth";
Debug.ShouldStop(4096);
__ref.setField ("_scrollposition" /*RemoteObject*/ ,__ref.getField(true,"_matrixwidth" /*RemoteObject*/ ));
 };
 };
 }else {
 BA.debugLineNum = 401;BA.debugLine="Dim x As Int";
Debug.ShouldStop(65536);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 402;BA.debugLine="If TextLength<offset+1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_textlength" /*RemoteObject*/ ),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_offset,RemoteObject.createImmutable(1)}, "+",1, 1)))) { 
 BA.debugLineNum = 403;BA.debugLine="If IconOffset Then";
Debug.ShouldStop(262144);
if (_iconoffset.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 404;BA.debugLine="x=((MatrixWidth/2)-TextLength/2)+4";
Debug.ShouldStop(524288);
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_matrixwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)),__ref.getField(true,"_textlength" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-/",1, 0)),RemoteObject.createImmutable(4)}, "+",1, 0));Debug.locals.put("x", _x);
 }else {
 BA.debugLineNum = 406;BA.debugLine="x=(MatrixWidth/2)-TextLength/2";
Debug.ShouldStop(2097152);
_x = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_matrixwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)),__ref.getField(true,"_textlength" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-/",1, 0));Debug.locals.put("x", _x);
 };
 };
 BA.debugLineNum = 409;BA.debugLine="drawText(Text,x,yPostition,Color)";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.example.awtrix.class, "_drawtext" /*RemoteObject*/ ,(Object)(_text),(Object)(_x),(Object)(_ypostition),(Object)(_color));
 };
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get(RemoteObject __ref,RemoteObject _settingskey) throws Exception{
try {
		Debug.PushSubsStack("get (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,461);
if (RapidSub.canDelegate("get")) { return __ref.runUserSub(false, "awtrix","get", __ref, _settingskey);}
Debug.locals.put("SettingsKey", _settingskey);
 BA.debugLineNum = 461;BA.debugLine="Public Sub get(SettingsKey As String) As Object";
Debug.ShouldStop(4096);
 BA.debugLineNum = 462;BA.debugLine="If appSettings.ContainsKey(SettingsKey) Then";
Debug.ShouldStop(8192);
if (__ref.getField(false,"_appsettings" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_settingskey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 463;BA.debugLine="Return appSettings.Get(SettingsKey)";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_appsettings" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_settingskey)));
 }else {
 BA.debugLineNum = 465;BA.debugLine="Log(SettingsKey & \" not found\")";
Debug.ShouldStop(65536);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_settingskey,RemoteObject.createImmutable(" not found"))));
 BA.debugLineNum = 466;BA.debugLine="Return \"\"";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable((""));
 };
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geticon(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("getIcon (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("geticon")) { return __ref.runUserSub(false, "awtrix","geticon", __ref, _id);}
Debug.locals.put("ID", _id);
 BA.debugLineNum = 210;BA.debugLine="Public Sub getIcon(ID As Int) As Short()";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="If RenderedIcons.ContainsKey(ID) Then";
Debug.ShouldStop(262144);
if (__ref.getField(false,"_renderedicons" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_id))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 212;BA.debugLine="Return RenderedIcons.Get(ID)";
Debug.ShouldStop(524288);
if (true) return (__ref.getField(false,"_renderedicons" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_id))));
 }else {
 BA.debugLineNum = 214;BA.debugLine="If noIconMessage = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_noiconmessage" /*RemoteObject*/ ),awtrix.__c.getField(true,"False"))) { 
 BA.debugLineNum = 215;BA.debugLine="Log(\"Got Error from \" & AppName)";
Debug.ShouldStop(4194304);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Got Error from "),__ref.getField(true,"_appname" /*RemoteObject*/ ))));
 BA.debugLineNum = 216;BA.debugLine="Log(\"Icon \" & ID & \" not found\")";
Debug.ShouldStop(8388608);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Icon "),_id,RemoteObject.createImmutable(" not found"))));
 BA.debugLineNum = 217;BA.debugLine="noIconMessage=True";
Debug.ShouldStop(16777216);
__ref.setField ("_noiconmessage" /*RemoteObject*/ ,awtrix.__c.getField(true,"True"));
 };
 BA.debugLineNum = 220;BA.debugLine="Return noIcon";
Debug.ShouldStop(134217728);
if (true) return __ref.getField(false,"_noicon" /*RemoteObject*/ );
 };
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _class,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "awtrix","initialize", __ref, _ba, _class, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("class", _class);
Debug.locals.put("Eventname", _eventname);
 BA.debugLineNum = 63;BA.debugLine="Public Sub Initialize(class As Object, Eventname A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="DownloadHeader.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_downloadheader" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="event=Eventname";
Debug.ShouldStop(1);
__ref.setField ("_event" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 66;BA.debugLine="iconList.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_iconlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="Icons.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_icons" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="commandList.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_commandlist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="RenderedIcons.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_renderedicons" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 70;BA.debugLine="icoMap.Initialize";
Debug.ShouldStop(32);
__ref.getField(false,"_icomap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="animCounter.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_animcounter" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="timermap.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_timermap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="Set.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_set" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="Menu.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_menu" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="MenuList.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_menulist" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="Target=class";
Debug.ShouldStop(2048);
__ref.setField ("_target" /*RemoteObject*/ ,_class);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makesettings(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MakeSettings (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("makesettings")) { return __ref.runUserSub(false, "awtrix","makesettings", __ref);}
RemoteObject _data = null;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
int _counter = 0;
RemoteObject _settingskey = RemoteObject.createImmutable("");
 BA.debugLineNum = 413;BA.debugLine="Public Sub MakeSettings";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 414;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\"),A";
Debug.ShouldStop(536870912);
if (awtrix.__c.getField(false,"File").runMethod(true,"Exists",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 415;BA.debugLine="Dim data() As Byte = File.ReadBytes(File.Combine";
Debug.ShouldStop(1073741824);
_data = awtrix.__c.getField(false,"File").runMethod(false,"ReadBytes",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax"))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 416;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(data)";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"ConvertBytesToObject",(Object)(_data)));Debug.locals.put("m", _m);
 BA.debugLineNum = 417;BA.debugLine="For Each k As String In appSettings.Keys";
Debug.ShouldStop(1);
{
final RemoteObject group4 = __ref.getField(false,"_appsettings" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 418;BA.debugLine="If Not(m.ContainsKey(k)) Then";
Debug.ShouldStop(2);
if (awtrix.__c.runMethod(true,"Not",(Object)(_m.runMethod(true,"ContainsKey",(Object)((_k))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 419;BA.debugLine="m.Put(k,appSettings.Get(k))";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)((_k)),(Object)(__ref.getField(false,"_appsettings" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k)))));
 }else {
 BA.debugLineNum = 421;BA.debugLine="appSettings.Put(k,m.Get(k))";
Debug.ShouldStop(16);
__ref.getField(false,"_appsettings" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)(_m.runMethod(false,"Get",(Object)((_k)))));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 424;BA.debugLine="For Counter = m.Size -1 To 0 Step -1";
Debug.ShouldStop(128);
{
final int step11 = -1;
final int limit11 = 0;
_counter = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step11 > 0 && _counter <= limit11) || (step11 < 0 && _counter >= limit11) ;_counter = ((int)(0 + _counter + step11))  ) {
Debug.locals.put("Counter", _counter);
 BA.debugLineNum = 425;BA.debugLine="Dim SettingsKey As String = m.GetKeyAt(Counter)";
Debug.ShouldStop(256);
_settingskey = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _counter))));Debug.locals.put("SettingsKey", _settingskey);Debug.locals.put("SettingsKey", _settingskey);
 BA.debugLineNum = 426;BA.debugLine="If Not(SettingsKey=\"UpdateInterval\" Or Settings";
Debug.ShouldStop(512);
if (awtrix.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_settingskey,BA.ObjectToString("UpdateInterval")) || RemoteObject.solveBoolean("=",_settingskey,BA.ObjectToString("StartTime")) || RemoteObject.solveBoolean("=",_settingskey,BA.ObjectToString("EndTime")) || RemoteObject.solveBoolean("=",_settingskey,BA.ObjectToString("DisplayTime")) || RemoteObject.solveBoolean("=",_settingskey,RemoteObject.createImmutable("Enabled"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 427;BA.debugLine="If Not(appSettings.ContainsKey(SettingsKey)) T";
Debug.ShouldStop(1024);
if (awtrix.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_appsettings" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_settingskey))))).<Boolean>get().booleanValue()) { 
_m.runVoidMethod ("Remove",(Object)((_settingskey)));};
 };
 }
}Debug.locals.put("Counter", _counter);
;
 BA.debugLineNum = 430;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 431;BA.debugLine="Enabled=m.Get(\"Enabled\")";
Debug.ShouldStop(16384);
__ref.setField ("_enabled" /*RemoteObject*/ ,BA.ObjectToBoolean(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Enabled"))))));
 BA.debugLineNum = 432;BA.debugLine="starttime=m.Get(\"StartTime\")";
Debug.ShouldStop(32768);
__ref.setField ("_starttime" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StartTime"))))));
 BA.debugLineNum = 433;BA.debugLine="endtime=m.Get(\"EndTime\")";
Debug.ShouldStop(65536);
__ref.setField ("_endtime" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EndTime"))))));
 BA.debugLineNum = 434;BA.debugLine="UpdateInterval=m.Get(\"UpdateInterval\")";
Debug.ShouldStop(131072);
__ref.setField ("_updateinterval" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("UpdateInterval"))))));
 BA.debugLineNum = 435;BA.debugLine="DisplayTime=m.Get(\"DisplayTime\")";
Debug.ShouldStop(262144);
__ref.setField ("_displaytime" /*RemoteObject*/ ,BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("DisplayTime"))))));
 BA.debugLineNum = 436;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\"";
Debug.ShouldStop(524288);
awtrix.__c.getField(false,"File").runVoidMethod ("WriteBytes",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax"))),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"ConvertObjectToBytes",(Object)((_m.getObject())))));
 BA.debugLineNum = 437;BA.debugLine="If SubExists(Target,event&\"_settingsChanged\") T";
Debug.ShouldStop(1048576);
if (awtrix.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_settingsChanged")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 438;BA.debugLine="CallSub(Target,event&\"_settingsChanged\")'ignor";
Debug.ShouldStop(2097152);
awtrix.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_event" /*RemoteObject*/ ),RemoteObject.createImmutable("_settingsChanged"))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e28) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e28.toString()); BA.debugLineNum = 441;BA.debugLine="Log(\"Got Error from \" & AppName)";
Debug.ShouldStop(16777216);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Got Error from "),__ref.getField(true,"_appname" /*RemoteObject*/ ))));
 BA.debugLineNum = 442;BA.debugLine="Log(\"Error while saving settings\")";
Debug.ShouldStop(33554432);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error while saving settings")));
 BA.debugLineNum = 443;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
awtrix.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(awtrix.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 }else {
 BA.debugLineNum = 446;BA.debugLine="Dim m As Map";
Debug.ShouldStop(536870912);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 447;BA.debugLine="m.Initialize";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 448;BA.debugLine="m.Put(\"UpdateInterval\",UpdateInterval)";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("UpdateInterval"))),(Object)((__ref.getField(true,"_updateinterval" /*RemoteObject*/ ))));
 BA.debugLineNum = 449;BA.debugLine="m.Put(\"StartTime\",\"00:00\")";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StartTime"))),(Object)((RemoteObject.createImmutable("00:00"))));
 BA.debugLineNum = 450;BA.debugLine="m.Put(\"EndTime\",\"00:00\")";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EndTime"))),(Object)((RemoteObject.createImmutable("00:00"))));
 BA.debugLineNum = 451;BA.debugLine="m.Put(\"DisplayTime\",\"0\")";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("DisplayTime"))),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 452;BA.debugLine="m.Put(\"Enabled\",True)";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Enabled"))),(Object)((awtrix.__c.getField(true,"True"))));
 BA.debugLineNum = 453;BA.debugLine="For Each k As String In appSettings.Keys";
Debug.ShouldStop(16);
{
final RemoteObject group40 = __ref.getField(false,"_appsettings" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen40 = group40.runMethod(true,"getSize").<Integer>get()
;int index40 = 0;
;
for (; index40 < groupLen40;index40++){
_k = BA.ObjectToString(group40.runMethod(false,"Get",index40));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 454;BA.debugLine="m.Put(k,appSettings.Get(k))";
Debug.ShouldStop(32);
_m.runVoidMethod ("Put",(Object)((_k)),(Object)(__ref.getField(false,"_appsettings" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k)))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 456;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\")";
Debug.ShouldStop(128);
awtrix.__c.getField(false,"File").runVoidMethod ("WriteBytes",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax"))),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"ConvertObjectToBytes",(Object)((_m.getObject())))));
 };
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rainbow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Rainbow (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,560);
if (RapidSub.canDelegate("rainbow")) { return __ref.runUserSub(false, "awtrix","rainbow", __ref);}
 BA.debugLineNum = 560;BA.debugLine="Public Sub Rainbow As Int()";
Debug.ShouldStop(32768);
 BA.debugLineNum = 561;BA.debugLine="colorCounter=colorCounter+1";
Debug.ShouldStop(65536);
__ref.setField ("_colorcounter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_colorcounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 562;BA.debugLine="If colorCounter>255 Then colorCounter=0";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_colorcounter" /*RemoteObject*/ ),BA.numberCast(double.class, 255))) { 
__ref.setField ("_colorcounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));};
 BA.debugLineNum = 563;BA.debugLine="Return(wheel(colorCounter))";
Debug.ShouldStop(262144);
if (true) return (__ref.runClassMethod (b4j.example.awtrix.class, "_wheel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_colorcounter" /*RemoteObject*/ ))));
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savesinglesetting(RemoteObject __ref,RemoteObject _key,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("saveSingleSetting (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("savesinglesetting")) { return __ref.runUserSub(false, "awtrix","savesinglesetting", __ref, _key, _value);}
RemoteObject _data = null;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("key", _key);
Debug.locals.put("value", _value);
 BA.debugLineNum = 470;BA.debugLine="Private Sub saveSingleSetting(key As String, value";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 471;BA.debugLine="If File.Exists(File.Combine(File.DirApp,\"Apps\"),A";
Debug.ShouldStop(4194304);
if (awtrix.__c.getField(false,"File").runMethod(true,"Exists",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 472;BA.debugLine="Dim data() As Byte = File.ReadBytes(File.Combine";
Debug.ShouldStop(8388608);
_data = awtrix.__c.getField(false,"File").runMethod(false,"ReadBytes",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax"))));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 473;BA.debugLine="Dim m As Map = bc.ConvertBytesToObject(data)";
Debug.ShouldStop(16777216);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"ConvertBytesToObject",(Object)(_data)));Debug.locals.put("m", _m);
 BA.debugLineNum = 474;BA.debugLine="m.Put(key,value)";
Debug.ShouldStop(33554432);
_m.runVoidMethod ("Put",(Object)((_key)),(Object)(_value));
 BA.debugLineNum = 475;BA.debugLine="File.WriteBytes(File.Combine(File.DirApp,\"Apps\")";
Debug.ShouldStop(67108864);
awtrix.__c.getField(false,"File").runVoidMethod ("WriteBytes",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"Combine",(Object)(awtrix.__c.getField(false,"File").runMethod(true,"getDirApp")),(Object)(RemoteObject.createImmutable("Apps")))),(Object)(RemoteObject.concat(__ref.getField(true,"_appname" /*RemoteObject*/ ),RemoteObject.createImmutable(".ax"))),(Object)(__ref.getField(false,"_bc" /*RemoteObject*/ ).runMethod(false,"ConvertObjectToBytes",(Object)((_m.getObject())))));
 };
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starticonrenderer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("startIconRenderer (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("starticonrenderer")) { return __ref.runUserSub(false, "awtrix","starticonrenderer", __ref);}
RemoteObject _k = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
 BA.debugLineNum = 106;BA.debugLine="Private Sub startIconRenderer";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="isRunning=True";
Debug.ShouldStop(1024);
__ref.setField ("_isrunning" /*RemoteObject*/ ,awtrix.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="FirstTick";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.example.awtrix.class, "_firsttick" /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="For Each k As Timer In timermap.Keys";
Debug.ShouldStop(4096);
{
final RemoteObject group3 = __ref.getField(false,"_timermap" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = (group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 110;BA.debugLine="k.Enabled=True";
Debug.ShouldStop(8192);
_k.runMethod(true,"setEnabled",awtrix.__c.getField(true,"True"));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopiconrenderer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("stopIconRenderer (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("stopiconrenderer")) { return __ref.runUserSub(false, "awtrix","stopiconrenderer", __ref);}
RemoteObject _k = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
 BA.debugLineNum = 114;BA.debugLine="Private Sub stopIconRenderer";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="isRunning=False";
Debug.ShouldStop(262144);
__ref.setField ("_isrunning" /*RemoteObject*/ ,awtrix.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="For Each k As Timer In timermap.Keys";
Debug.ShouldStop(524288);
{
final RemoteObject group2 = __ref.getField(false,"_timermap" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = (group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 117;BA.debugLine="k.Enabled=False";
Debug.ShouldStop(1048576);
_k.runMethod(true,"setEnabled",awtrix.__c.getField(true,"False"));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timer_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Timer_Tick (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("timer_tick")) { return __ref.runUserSub(false, "awtrix","timer_tick", __ref);}
RemoteObject _iconid = RemoteObject.createImmutable(0);
RemoteObject _ico = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parse = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _bmproot = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _bpm = null;
int _i = 0;
 BA.debugLineNum = 147;BA.debugLine="Private Sub Timer_Tick";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 149;BA.debugLine="Dim iconid As Int=timermap.Get(Sender)";
Debug.ShouldStop(1048576);
_iconid = BA.numberCast(int.class, __ref.getField(false,"_timermap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(awtrix.__c.runMethod(false,"Sender",__ref.getField(false, "ba")))));Debug.locals.put("iconid", _iconid);Debug.locals.put("iconid", _iconid);
 BA.debugLineNum = 150;BA.debugLine="If icoMap.ContainsKey(iconid) Then";
Debug.ShouldStop(2097152);
if (__ref.getField(false,"_icomap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_iconid))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 151;BA.debugLine="Dim ico As List= icoMap.get(iconid)";
Debug.ShouldStop(4194304);
_ico = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_ico.setObject(__ref.getField(false,"_icomap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid))));Debug.locals.put("ico", _ico);
 BA.debugLineNum = 152;BA.debugLine="Dim parse As JSONParser";
Debug.ShouldStop(8388608);
_parse = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parse", _parse);
 BA.debugLineNum = 153;BA.debugLine="If animCounter.Get(iconid)>ico.Size-1 Then anim";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(false,"_animcounter" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid)))),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_ico.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
__ref.getField(false,"_animcounter" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_iconid)),(Object)(RemoteObject.createImmutable((0))));};
 BA.debugLineNum = 154;BA.debugLine="parse.Initialize(ico.Get(animCounter.Get(iconid";
Debug.ShouldStop(33554432);
_parse.runVoidMethod ("Initialize",(Object)(BA.ObjectToString(_ico.runMethod(false,"Get",(Object)(BA.numberCast(int.class, __ref.getField(false,"_animcounter" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid)))))))));
 BA.debugLineNum = 155;BA.debugLine="Dim bmproot As List = parse.NextArray";
Debug.ShouldStop(67108864);
_bmproot = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_bmproot = _parse.runMethod(false,"NextArray");Debug.locals.put("bmproot", _bmproot);Debug.locals.put("bmproot", _bmproot);
 BA.debugLineNum = 156;BA.debugLine="Dim bpm(bmproot.Size) As Short";
Debug.ShouldStop(134217728);
_bpm = RemoteObject.createNewArray ("short", new int[] {_bmproot.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("bpm", _bpm);
 BA.debugLineNum = 157;BA.debugLine="For i=0 To bmproot.Size-1";
Debug.ShouldStop(268435456);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {_bmproot.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 158;BA.debugLine="bpm(i)=bmproot.Get(i)";
Debug.ShouldStop(536870912);
_bpm.setArrayElement (BA.numberCast(short.class, _bmproot.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 160;BA.debugLine="RenderedIcons.Put(iconid,bpm)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_renderedicons" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_iconid)),(Object)((_bpm)));
 BA.debugLineNum = 161;BA.debugLine="animCounter.put(iconid,animCounter.Get(iconid)+";
Debug.ShouldStop(1);
__ref.getField(false,"_animcounter" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_iconid)),(Object)((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, __ref.getField(false,"_animcounter" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_iconid)))),RemoteObject.createImmutable(1)}, "+",1, 0))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e17.toString()); BA.debugLineNum = 164;BA.debugLine="Log(\"Got Error from \" & AppName)";
Debug.ShouldStop(8);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Got Error from "),__ref.getField(true,"_appname" /*RemoteObject*/ ))));
 BA.debugLineNum = 165;BA.debugLine="Log(\"Error in IconRenderer:\")";
Debug.ShouldStop(16);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error in IconRenderer:")));
 BA.debugLineNum = 166;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
awtrix.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(awtrix.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 167;BA.debugLine="stopIconRenderer";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.example.awtrix.class, "_stopiconrenderer" /*RemoteObject*/ );
 };
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _timescomparative(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("timesComparative (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("timescomparative")) { return __ref.runUserSub(false, "awtrix","timescomparative", __ref);}
RemoteObject _startt = null;
RemoteObject _endt = null;
RemoteObject _hour = RemoteObject.createImmutable(0);
RemoteObject _minute = RemoteObject.createImmutable(0);
RemoteObject _second = RemoteObject.createImmutable(0);
RemoteObject _now = RemoteObject.createImmutable(0);
RemoteObject _start = RemoteObject.createImmutable(0);
RemoteObject _stop = RemoteObject.createImmutable(0);
 BA.debugLineNum = 80;BA.debugLine="Private Sub timesComparative  As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 82;BA.debugLine="If starttime = endtime Then Return True";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_starttime" /*RemoteObject*/ ),__ref.getField(true,"_endtime" /*RemoteObject*/ ))) { 
Debug.CheckDeviceExceptions();if (true) return awtrix.__c.getField(true,"True");};
 BA.debugLineNum = 83;BA.debugLine="Dim startT() As String=Regex.Split(\":\",starttime";
Debug.ShouldStop(262144);
_startt = awtrix.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(true,"_starttime" /*RemoteObject*/ )));Debug.locals.put("startT", _startt);Debug.locals.put("startT", _startt);
 BA.debugLineNum = 84;BA.debugLine="Dim EndT() As String=Regex.Split(\":\",endtime)";
Debug.ShouldStop(524288);
_endt = awtrix.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(true,"_endtime" /*RemoteObject*/ )));Debug.locals.put("EndT", _endt);Debug.locals.put("EndT", _endt);
 BA.debugLineNum = 85;BA.debugLine="Dim hour As Int=DateTime.GetHour(DateTime.Now)";
Debug.ShouldStop(1048576);
_hour = awtrix.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(awtrix.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("hour", _hour);Debug.locals.put("hour", _hour);
 BA.debugLineNum = 86;BA.debugLine="Dim minute As Int=DateTime.GetMinute(DateTime.No";
Debug.ShouldStop(2097152);
_minute = awtrix.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(awtrix.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("minute", _minute);Debug.locals.put("minute", _minute);
 BA.debugLineNum = 87;BA.debugLine="Dim second As Int=DateTime.GetSecond(DateTime.No";
Debug.ShouldStop(4194304);
_second = awtrix.__c.getField(false,"DateTime").runMethod(true,"GetSecond",(Object)(awtrix.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("second", _second);Debug.locals.put("second", _second);
 BA.debugLineNum = 88;BA.debugLine="Dim now, start, stop As Int";
Debug.ShouldStop(8388608);
_now = RemoteObject.createImmutable(0);Debug.locals.put("now", _now);
_start = RemoteObject.createImmutable(0);Debug.locals.put("start", _start);
_stop = RemoteObject.createImmutable(0);Debug.locals.put("stop", _stop);
 BA.debugLineNum = 89;BA.debugLine="now = ((hour * 3600) + (minute * 60) + second)";
Debug.ShouldStop(16777216);
_now = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_hour,RemoteObject.createImmutable(3600)}, "*",0, 1)),(RemoteObject.solve(new RemoteObject[] {_minute,RemoteObject.createImmutable(60)}, "*",0, 1)),_second}, "++",2, 1));Debug.locals.put("now", _now);
 BA.debugLineNum = 90;BA.debugLine="start = (startT(0) * 3600) + (startT(1) * 60)";
Debug.ShouldStop(33554432);
_start = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _startt.getArrayElement(true,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(3600)}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _startt.getArrayElement(true,BA.numberCast(int.class, 1))),RemoteObject.createImmutable(60)}, "*",0, 0))}, "+",1, 0));Debug.locals.put("start", _start);
 BA.debugLineNum = 91;BA.debugLine="stop = ( EndT(0)* 3600) + (EndT(1) * 60)";
Debug.ShouldStop(67108864);
_stop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _endt.getArrayElement(true,BA.numberCast(int.class, 0))),RemoteObject.createImmutable(3600)}, "*",0, 0)),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _endt.getArrayElement(true,BA.numberCast(int.class, 1))),RemoteObject.createImmutable(60)}, "*",0, 0))}, "+",1, 0));Debug.locals.put("stop", _stop);
 BA.debugLineNum = 92;BA.debugLine="If (start < stop) Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("<",_start,BA.numberCast(double.class, _stop)))) { 
 BA.debugLineNum = 93;BA.debugLine="Return (now >= start And now <= stop )";
Debug.ShouldStop(268435456);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_now,BA.numberCast(double.class, _start)) && RemoteObject.solveBoolean("k",_now,BA.numberCast(double.class, _stop))));
 }else {
 BA.debugLineNum = 95;BA.debugLine="Return (now >= start Or now <= stop)";
Debug.ShouldStop(1073741824);
Debug.CheckDeviceExceptions();if (true) return BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_now,BA.numberCast(double.class, _start)) || RemoteObject.solveBoolean("k",_now,BA.numberCast(double.class, _stop))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e18.toString()); BA.debugLineNum = 98;BA.debugLine="Log(\"Got Error from \" & AppName)";
Debug.ShouldStop(2);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Got Error from "),__ref.getField(true,"_appname" /*RemoteObject*/ ))));
 BA.debugLineNum = 99;BA.debugLine="Log(\"Error in TimesComparative:\")";
Debug.ShouldStop(4);
awtrix.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("Error in TimesComparative:")));
 BA.debugLineNum = 100;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
awtrix.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(awtrix.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 101;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return awtrix.__c.getField(true,"True");
 };
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _wheel(RemoteObject __ref,RemoteObject _wheelpos) throws Exception{
try {
		Debug.PushSubsStack("wheel (awtrix) ","awtrix",2,__ref.getField(false, "ba"),__ref,566);
if (RapidSub.canDelegate("wheel")) { return __ref.runUserSub(false, "awtrix","wheel", __ref, _wheelpos);}
Debug.locals.put("Wheelpos", _wheelpos);
 BA.debugLineNum = 566;BA.debugLine="Private Sub wheel(Wheelpos As Int) As Int() 'ignor";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 567;BA.debugLine="If(Wheelpos < 85) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("<",_wheelpos,BA.numberCast(double.class, 85)))) { 
 BA.debugLineNum = 568;BA.debugLine="Return Array As Int(Wheelpos * 3, 255 - Wheelpos";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createNewArray("int",new int[] {3},new Object[] {RemoteObject.solve(new RemoteObject[] {_wheelpos,RemoteObject.createImmutable(3)}, "*",0, 1),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),_wheelpos,RemoteObject.createImmutable(3)}, "-*",1, 1),BA.numberCast(int.class, 0)});
 }else 
{ BA.debugLineNum = 569;BA.debugLine="else if(Wheelpos < 170) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("<",_wheelpos,BA.numberCast(double.class, 170)))) { 
 BA.debugLineNum = 570;BA.debugLine="Wheelpos =Wheelpos- 85";
Debug.ShouldStop(33554432);
_wheelpos = RemoteObject.solve(new RemoteObject[] {_wheelpos,RemoteObject.createImmutable(85)}, "-",1, 1);Debug.locals.put("Wheelpos", _wheelpos);
 BA.debugLineNum = 571;BA.debugLine="Return  Array As Int(255 - Wheelpos * 3, 0, Whee";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createNewArray("int",new int[] {3},new Object[] {RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),_wheelpos,RemoteObject.createImmutable(3)}, "-*",1, 1),BA.numberCast(int.class, 0),RemoteObject.solve(new RemoteObject[] {_wheelpos,RemoteObject.createImmutable(3)}, "*",0, 1)});
 }else {
 BA.debugLineNum = 573;BA.debugLine="Wheelpos =Wheelpos- 170";
Debug.ShouldStop(268435456);
_wheelpos = RemoteObject.solve(new RemoteObject[] {_wheelpos,RemoteObject.createImmutable(170)}, "-",1, 1);Debug.locals.put("Wheelpos", _wheelpos);
 BA.debugLineNum = 574;BA.debugLine="Return  Array As Int(0, Wheelpos * 3, 255 - Whee";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createNewArray("int",new int[] {3},new Object[] {BA.numberCast(int.class, 0),RemoteObject.solve(new RemoteObject[] {_wheelpos,RemoteObject.createImmutable(3)}, "*",0, 1),RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(255),_wheelpos,RemoteObject.createImmutable(3)}, "-*",1, 1)});
 }}
;
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}