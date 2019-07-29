B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.51
@EndOfDesignText@
Sub Class_Globals
	Dim App As AWTRIX

	'declare needed variables
	Dim viewer As String
End Sub

' ignore
Public Sub Initialize() As String
	
	App.Initialize(Me,"App")
	
	'change plugin name (must be unique, avoid spaces)
	App.AppName="Qzone"
	
	'Version of the App
	App.AppVersion="2.1"
	
	'Description of the App. You can use HTML to format it
	App.AppDescription=$"
	Demostrate the number of viewer of ur Qzone<br />
	<small>Created by Monsterlady</small> 
	"$
		
	'SetupInstructions. You can use HTML to format it
	App.SetupInfos= $"
	<b>QQ:</b>  As the name implies, your QQ number.
	"$
	
	'How many downloadhandlers should be generated
	App.NeedDownloads=1
	
	'IconIDs from AWTRIXER.
	App.Icons=Array As Int(58)
	
	'Tickinterval in ms (should be 65 by default)
	App.TickInterval=65
	
	'If set to true AWTRIX will wait for the "finish" command before switch to the next app.
	App.LockApp=False
	
	'needed Settings for this App (Wich can be configurate from user via webinterface)
	App.appSettings=CreateMap("QQ":"")
	
	App.MakeSettings
	Return "AWTRIX20"
End Sub

' ignore
public Sub GetNiceName() As String
	Return App.AppName
End Sub

' ignore
public Sub Run(Tag As String, Params As Map) As Object
	Return App.AppControl(Tag,Params)
End Sub

Public Sub AppStarted
	
End Sub

'Called with every update from Awtrix
'return one URL for each downloadhandler
Sub App_startDownload(jobNr As Int)
	Select jobNr
		Case 1
			App.DownloadURL= "https://user.qzone.qq.com/"&App.get("QQ")&"/"
	End Select
End Sub


'process the response from each download handler
'if youre working with JSONs you can use this online parser
'to generate the code automaticly
'https://json.blueforcer.de/ 
Sub App_evalJobResponse(Resp As JobResponse)
	Try
		If Resp.success Then
			Select Resp.jobNr
				Case 1
					Dim Reader As TextReader
					Reader.Initialize(Resp.Stream)
					Dim line As String
					line = Reader.ReadLine
					Do While line <> Null
						If line.Contains("总浏览量") Then
							viewer=line.SubString2(line.IndexOf("""")+1,line.IndexOf("viewer")-1)
							Exit
						End If
						line = Reader.ReadLine
					Loop
					Reader.Close
			End Select
		End If
	Catch
		Log("Error in: "& App.AppName & CRLF & LastException)
		Log("API response: " & CRLF & Resp.ResponseString)
	End Try
End Sub

Sub App_genFrame
	App.genText(viewer,True,1,Null)
	App.drawBMP(0,0,App.getIcon(58),8,8)
End Sub
