package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class qzone extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.qzone", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.qzone.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.awtrix _app = null;
public String _viewer = "";
public b4j.example.main _main = null;
public String  _app_evaljobresponse(b4j.example.qzone __ref,b4j.example.awtrix._jobresponse _resp) throws Exception{
__ref = this;
RDebugUtils.currentModule="qzone";
if (Debug.shouldDelegate(ba, "app_evaljobresponse", false))
	 {return ((String) Debug.delegate(ba, "app_evaljobresponse", new Object[] {_resp}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _reader = null;
String _line = "";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub App_evalJobResponse(Resp As JobResponse)";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Try";
try {RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="If Resp.success Then";
if (_resp.Success /*boolean*/ ) { 
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Select Resp.jobNr";
switch (BA.switchObjectToInt(_resp.jobNr /*int*/ ,(int) (1))) {
case 0: {
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Dim Reader As TextReader";
_reader = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Reader.Initialize(Resp.Stream)";
_reader.Initialize((java.io.InputStream)(_resp.Stream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ .getObject()));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Dim line As String";
_line = "";
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="line = Reader.ReadLine";
_line = _reader.ReadLine();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Do While line <> Null";
while (_line!= null) {
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="If line.Contains(\"总浏览量\") Then";
if (_line.contains("总浏览量")) { 
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="viewer=line.SubString2(line.IndexOf(\"\"\"\")+1";
__ref._viewer /*String*/  = _line.substring((int) (_line.indexOf("\"")+1),(int) (_line.indexOf("viewer")-1));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="line = Reader.ReadLine";
_line = _reader.ReadLine();
 }
;
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Reader.Close";
_reader.Close();
 break; }
}
;
 };
 } 
       catch (Exception e20) {
			ba.setLastException(e20);RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Log(\"Error in: \"& App.AppName & CRLF & LastExcep";
__c.Log("Error in: "+__ref._app /*b4j.example.awtrix*/ ._appname /*String*/ +__c.CRLF+BA.ObjectToString(__c.LastException(ba)));
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="Log(\"API response: \" & CRLF & Resp.ResponseStrin";
__c.Log("API response: "+__c.CRLF+_resp.ResponseString /*String*/ );
 };
RDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="End Sub";
return "";
}
public String  _app_genframe(b4j.example.qzone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="qzone";
if (Debug.shouldDelegate(ba, "app_genframe", false))
	 {return ((String) Debug.delegate(ba, "app_genframe", null));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub App_genFrame";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="App.genText(viewer,True,1,Null)";
__ref._app /*b4j.example.awtrix*/ ._gentext /*String*/ (null,__ref._viewer /*String*/ ,__c.True,(int) (1),(int[])(__c.Null));
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="App.drawBMP(0,0,App.getIcon(58),8,8)";
__ref._app /*b4j.example.awtrix*/ ._drawbmp /*String*/ (null,(int) (0),(int) (0),__ref._app /*b4j.example.awtrix*/ ._geticon /*short[]*/ (null,(int) (58)),(int) (8),(int) (8));
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="End Sub";
return "";
}
public String  _app_startdownload(b4j.example.qzone __ref,int _jobnr) throws Exception{
__ref = this;
RDebugUtils.currentModule="qzone";
if (Debug.shouldDelegate(ba, "app_startdownload", false))
	 {return ((String) Debug.delegate(ba, "app_startdownload", new Object[] {_jobnr}));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub App_startDownload(jobNr As Int)";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Select jobNr";
switch (_jobnr) {
case 1: {
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="App.DownloadURL= \"https://user.qzone.qq.com/\"&A";
__ref._app /*b4j.example.awtrix*/ ._downloadurl /*String*/  = "https://user.qzone.qq.com/"+BA.ObjectToString(__ref._app /*b4j.example.awtrix*/ ._get /*Object*/ (null,"QQ"))+"/";
 break; }
}
;
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="End Sub";
return "";
}
public String  _appstarted(b4j.example.qzone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="qzone";
if (Debug.shouldDelegate(ba, "appstarted", false))
	 {return ((String) Debug.delegate(ba, "appstarted", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub AppStarted";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.qzone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="qzone";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Dim App As AWTRIX";
_app = new b4j.example.awtrix();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Dim viewer As String";
_viewer = "";
RDebugUtils.currentLine=196613;
 //BA.debugLineNum = 196613;BA.debugLine="End Sub";
return "";
}
public String  _getnicename(b4j.example.qzone __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="qzone";
if (Debug.shouldDelegate(ba, "getnicename", false))
	 {return ((String) Debug.delegate(ba, "getnicename", null));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="public Sub GetNiceName() As String";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Return App.AppName";
if (true) return __ref._app /*b4j.example.awtrix*/ ._appname /*String*/ ;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.qzone __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="qzone";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize() As String";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="App.Initialize(Me,\"App\")";
__ref._app /*b4j.example.awtrix*/ ._initialize /*String*/ (null,ba,this,"App");
RDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="App.AppName=\"Qzone\"";
__ref._app /*b4j.example.awtrix*/ ._appname /*String*/  = "Qzone";
RDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="App.AppVersion=\"2.1\"";
__ref._app /*b4j.example.awtrix*/ ._appversion /*String*/  = "2.1";
RDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="App.AppDescription=$\" 	Demostrate the number of v";
__ref._app /*b4j.example.awtrix*/ ._appdescription /*String*/  = ("\n"+"	Demostrate the number of viewer of ur Qzone<br />\n"+"	<small>Created by Monsterlady</small> \n"+"	");
RDebugUtils.currentLine=262161;
 //BA.debugLineNum = 262161;BA.debugLine="App.SetupInfos= $\" 	<b>QQ:</b>  As the name impli";
__ref._app /*b4j.example.awtrix*/ ._setupinfos /*String*/  = ("\n"+"	<b>QQ:</b>  As the name implies, your QQ number.\n"+"	");
RDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="App.NeedDownloads=1";
__ref._app /*b4j.example.awtrix*/ ._needdownloads /*int*/  = (int) (1);
RDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="App.Icons=Array As Int(58)";
__ref._app /*b4j.example.awtrix*/ ._icons /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (58)});
RDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="App.TickInterval=65";
__ref._app /*b4j.example.awtrix*/ ._tickinterval /*int*/  = (int) (65);
RDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="App.LockApp=False";
__ref._app /*b4j.example.awtrix*/ ._lockapp /*boolean*/  = __c.False;
RDebugUtils.currentLine=262178;
 //BA.debugLineNum = 262178;BA.debugLine="App.appSettings=CreateMap(\"QQ\":\"\")";
__ref._app /*b4j.example.awtrix*/ ._appsettings /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("QQ"),(Object)("")});
RDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="App.MakeSettings";
__ref._app /*b4j.example.awtrix*/ ._makesettings /*String*/ (null);
RDebugUtils.currentLine=262181;
 //BA.debugLineNum = 262181;BA.debugLine="Return \"AWTRIX20\"";
if (true) return "AWTRIX20";
RDebugUtils.currentLine=262182;
 //BA.debugLineNum = 262182;BA.debugLine="End Sub";
return "";
}
public Object  _run(b4j.example.qzone __ref,String _tag,anywheresoftware.b4a.objects.collections.Map _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="qzone";
if (Debug.shouldDelegate(ba, "run", false))
	 {return ((Object) Debug.delegate(ba, "run", new Object[] {_tag,_params}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="public Sub Run(Tag As String, Params As Map) As Ob";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Return App.AppControl(Tag,Params)";
if (true) return __ref._app /*b4j.example.awtrix*/ ._appcontrol /*Object*/ (null,_tag,_params);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return null;
}
}