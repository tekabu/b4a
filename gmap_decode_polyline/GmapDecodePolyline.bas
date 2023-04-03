B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=11.5
@EndOfDesignText@
Sub Class_Globals
	Public Points As List
End Sub

Public Sub Initialize As GmapDecodePolyline
	Return Me
End Sub

Public Sub Decode(Polyline As String) As GmapDecodePolyline
	Points.Initialize
  
	Dim index As Int
	Dim lat As Int
	Dim lng As Int

	Do While index < Polyline.Length
		Dim b As Int
		Dim dlat As Int
		Dim dlng As Int
		Dim shift As Int
		Dim result As Int
		
		Do While True
			b = Asc(Polyline.SubString2(index, index + 1)) - 63
			index = index + 1
			result = Bit.Or(result, Bit.ShiftLeft(Bit.And(b, 0x1f), shift))
			shift = shift + 5
			If b < 0x20 Then Exit
		Loop
		
		If Bit.And(result, 1) = 1 Then
			dlat = Bit.Not(Bit.ShiftRight(result, 1))
		Else
			dlat = Bit.ShiftRight(result, 1)
		End If
		
		lat = lat + dlat
		shift = 0
		result = 0
		
		Do While True
			b = Asc(Polyline.SubString2(index, index + 1)) - 63
			index = index + 1
			result = Bit.Or(result, Bit.ShiftLeft(Bit.And(b, 0x1f), shift))
			shift = shift + 5
			If b < 0x20 Then Exit
		Loop
		
		If Bit.And(result, 1) = 1 Then
			dlng = Bit.Not(Bit.ShiftRight(result, 1))
		Else
			dlng = Bit.ShiftRight(result, 1)
		End If
		
		lng = lng + dlng
		
		Dim latlng As LatLng
		latlng.Initialize(lat / 100000, lng / 100000)
		
		Points.Add(latlng)
	Loop
	
	Return Me
End Sub