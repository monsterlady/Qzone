package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class qzone_subs_0 {


public static RemoteObject  _app_evaljobresponse(RemoteObject __ref,RemoteObject _resp) throws Exception{
try {
		Debug.PushSubsStack("App_evalJobResponse (qzone) ","qzone",1,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("app_evaljobresponse")) { return __ref.runUserSub(false, "qzone","app_evaljobresponse", __ref, _resp);}
RemoteObject _reader = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _line = RemoteObject.createImmutable("");
Debug.locals.put("Resp", _resp);
 BA.debugLineNum = 77;BA.debugLine="Sub App_evalJobResponse(Resp As JobResponse)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="Try";
Debug.ShouldStop(8192);
try { BA.debugLineNum = 79;BA.debugLine="If Resp.success Then";
Debug.ShouldStop(16384);
if (_resp.getField(true,"Success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="Select Resp.jobNr";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_resp.getField(true,"jobNr" /*RemoteObject*/ ),BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 82;BA.debugLine="Dim Reader As TextReader";
Debug.ShouldStop(131072);
_reader = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("Reader", _reader);
 BA.debugLineNum = 83;BA.debugLine="Reader.Initialize(Resp.Stream)";
Debug.ShouldStop(262144);
_reader.runVoidMethod ("Initialize",(Object)((_resp.getField(false,"Stream" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 84;BA.debugLine="Dim line As String";
Debug.ShouldStop(524288);
_line = RemoteObject.createImmutable("");Debug.locals.put("line", _line);
 BA.debugLineNum = 85;BA.debugLine="line = Reader.ReadLine";
Debug.ShouldStop(1048576);
_line = _reader.runMethod(true,"ReadLine");Debug.locals.put("line", _line);
 BA.debugLineNum = 86;BA.debugLine="Do While line <> Null";
Debug.ShouldStop(2097152);
while (RemoteObject.solveBoolean("N",_line)) {
 BA.debugLineNum = 87;BA.debugLine="If line.Contains(\"总浏览量\") Then";
Debug.ShouldStop(4194304);
if (_line.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("总浏览量"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 88;BA.debugLine="viewer=line.SubString2(line.IndexOf(\"\"\"\")+1";
Debug.ShouldStop(8388608);
__ref.setField ("_viewer" /*RemoteObject*/ ,_line.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_line.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("\""))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_line.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("viewer"))),RemoteObject.createImmutable(1)}, "-",1, 1))));
 BA.debugLineNum = 89;BA.debugLine="Exit";
Debug.ShouldStop(16777216);
if (true) break;
 };
 BA.debugLineNum = 91;BA.debugLine="line = Reader.ReadLine";
Debug.ShouldStop(67108864);
_line = _reader.runMethod(true,"ReadLine");Debug.locals.put("line", _line);
 }
;
 BA.debugLineNum = 93;BA.debugLine="Reader.Close";
Debug.ShouldStop(268435456);
_reader.runVoidMethod ("Close");
 break; }
}
;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e20) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e20.toString()); BA.debugLineNum = 97;BA.debugLine="Log(\"Error in: \"& App.AppName & CRLF & LastExcep";
Debug.ShouldStop(1);
qzone.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error in: "),__ref.getField(false,"_app" /*RemoteObject*/ ).getField(true,"_appname" /*RemoteObject*/ ),qzone.__c.getField(true,"CRLF"),qzone.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 BA.debugLineNum = 98;BA.debugLine="Log(\"API response: \" & CRLF & Resp.ResponseStrin";
Debug.ShouldStop(2);
qzone.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("API response: "),qzone.__c.getField(true,"CRLF"),_resp.getField(true,"ResponseString" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _app_genframe(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("App_genFrame (qzone) ","qzone",1,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("app_genframe")) { return __ref.runUserSub(false, "qzone","app_genframe", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Sub App_genFrame";
Debug.ShouldStop(32);
 BA.debugLineNum = 103;BA.debugLine="App.genText(viewer,True,1,Null)";
Debug.ShouldStop(64);
__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.awtrix.class, "_gentext" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_viewer" /*RemoteObject*/ )),(Object)(qzone.__c.getField(true,"True")),(Object)(BA.numberCast(int.class, 1)),(Object)((qzone.__c.getField(false,"Null"))));
 BA.debugLineNum = 104;BA.debugLine="App.drawBMP(0,0,App.getIcon(58),8,8)";
Debug.ShouldStop(128);
__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.awtrix.class, "_drawbmp" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.awtrix.class, "_geticon" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 58)))),(Object)(BA.numberCast(int.class, 8)),(Object)(BA.numberCast(int.class, 8)));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _app_startdownload(RemoteObject __ref,RemoteObject _jobnr) throws Exception{
try {
		Debug.PushSubsStack("App_startDownload (qzone) ","qzone",1,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("app_startdownload")) { return __ref.runUserSub(false, "qzone","app_startdownload", __ref, _jobnr);}
Debug.locals.put("jobNr", _jobnr);
 BA.debugLineNum = 65;BA.debugLine="Sub App_startDownload(jobNr As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Select jobNr";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_jobnr,BA.numberCast(int.class, 1))) {
case 0: {
 BA.debugLineNum = 68;BA.debugLine="App.DownloadURL= \"https://user.qzone.qq.com/\"&A";
Debug.ShouldStop(8);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_downloadurl" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("https://user.qzone.qq.com/"),__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.awtrix.class, "_get" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("QQ"))),RemoteObject.createImmutable("/")));
 break; }
}
;
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstarted(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AppStarted (qzone) ","qzone",1,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("appstarted")) { return __ref.runUserSub(false, "qzone","appstarted", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Public Sub AppStarted";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim App As AWTRIX";
qzone._app = RemoteObject.createNew ("b4j.example.awtrix");__ref.setField("_app",qzone._app);
 //BA.debugLineNum = 5;BA.debugLine="Dim viewer As String";
qzone._viewer = RemoteObject.createImmutable("");__ref.setField("_viewer",qzone._viewer);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getnicename(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetNiceName (qzone) ","qzone",1,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("getnicename")) { return __ref.runUserSub(false, "qzone","getnicename", __ref);}
 BA.debugLineNum = 50;BA.debugLine="public Sub GetNiceName() As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Return App.AppName";
Debug.ShouldStop(262144);
if (true) return __ref.getField(false,"_app" /*RemoteObject*/ ).getField(true,"_appname" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (qzone) ","qzone",1,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "qzone","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize() As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="App.Initialize(Me,\"App\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.awtrix.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("App")));
 BA.debugLineNum = 14;BA.debugLine="App.AppName=\"Qzone\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_appname" /*RemoteObject*/ ,BA.ObjectToString("Qzone"));
 BA.debugLineNum = 17;BA.debugLine="App.AppVersion=\"2.1\"";
Debug.ShouldStop(65536);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_appversion" /*RemoteObject*/ ,BA.ObjectToString("2.1"));
 BA.debugLineNum = 20;BA.debugLine="App.AppDescription=$\" 	Demostrate the number of v";
Debug.ShouldStop(524288);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_appdescription" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	Demostrate the number of viewer of ur Qzone<br />\n"),RemoteObject.createImmutable("	<small>Created by Monsterlady</small> \n"),RemoteObject.createImmutable("	"))));
 BA.debugLineNum = 26;BA.debugLine="App.SetupInfos= $\" 	<b>QQ:</b>  As the name impli";
Debug.ShouldStop(33554432);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_setupinfos" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("	<b>QQ:</b>  As the name implies, your QQ number.\n"),RemoteObject.createImmutable("	"))));
 BA.debugLineNum = 31;BA.debugLine="App.NeedDownloads=1";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_needdownloads" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 34;BA.debugLine="App.Icons=Array As Int(58)";
Debug.ShouldStop(2);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_icons" /*RemoteObject*/ ,qzone.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("int",new int[] {1},new Object[] {BA.numberCast(int.class, 58)}))));
 BA.debugLineNum = 37;BA.debugLine="App.TickInterval=65";
Debug.ShouldStop(16);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_tickinterval" /*RemoteObject*/ ,BA.numberCast(int.class, 65));
 BA.debugLineNum = 40;BA.debugLine="App.LockApp=False";
Debug.ShouldStop(128);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_lockapp" /*RemoteObject*/ ,qzone.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="App.appSettings=CreateMap(\"QQ\":\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_app" /*RemoteObject*/ ).setField ("_appsettings" /*RemoteObject*/ ,qzone.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("QQ")),(RemoteObject.createImmutable(""))})));
 BA.debugLineNum = 45;BA.debugLine="App.MakeSettings";
Debug.ShouldStop(4096);
__ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.awtrix.class, "_makesettings" /*RemoteObject*/ );
 BA.debugLineNum = 46;BA.debugLine="Return \"AWTRIX20\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("AWTRIX20");
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _run(RemoteObject __ref,RemoteObject _tag,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("Run (qzone) ","qzone",1,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("run")) { return __ref.runUserSub(false, "qzone","run", __ref, _tag, _params);}
Debug.locals.put("Tag", _tag);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 55;BA.debugLine="public Sub Run(Tag As String, Params As Map) As Ob";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Return App.AppControl(Tag,Params)";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_app" /*RemoteObject*/ ).runClassMethod (b4j.example.awtrix.class, "_appcontrol" /*RemoteObject*/ ,(Object)(_tag),(Object)(_params));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}