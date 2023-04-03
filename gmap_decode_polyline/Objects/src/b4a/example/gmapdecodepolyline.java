package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gmapdecodepolyline extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.gmapdecodepolyline");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.gmapdecodepolyline.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _points = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Points As List";
_points = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _decode(String _polyline) throws Exception{
int _index = 0;
int _lat = 0;
int _lng = 0;
int _b = 0;
int _dlat = 0;
int _dlng = 0;
int _shift = 0;
int _result = 0;
anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _latlng = null;
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Decode(Polyline As String)";
 //BA.debugLineNum = 9;BA.debugLine="Points.Initialize";
_points.Initialize();
 //BA.debugLineNum = 11;BA.debugLine="Dim index As Int";
_index = 0;
 //BA.debugLineNum = 12;BA.debugLine="Dim lat As Int";
_lat = 0;
 //BA.debugLineNum = 13;BA.debugLine="Dim lng As Int";
_lng = 0;
 //BA.debugLineNum = 15;BA.debugLine="Do While index < Polyline.Length";
while (_index<_polyline.length()) {
 //BA.debugLineNum = 16;BA.debugLine="Dim b As Int";
_b = 0;
 //BA.debugLineNum = 17;BA.debugLine="Dim dlat As Int";
_dlat = 0;
 //BA.debugLineNum = 18;BA.debugLine="Dim dlng As Int";
_dlng = 0;
 //BA.debugLineNum = 19;BA.debugLine="Dim shift As Int";
_shift = 0;
 //BA.debugLineNum = 20;BA.debugLine="Dim result As Int";
_result = 0;
 //BA.debugLineNum = 22;BA.debugLine="Do While True";
while (__c.True) {
 //BA.debugLineNum = 23;BA.debugLine="b = Asc(Polyline.SubString2(index, index + 1))";
_b = (int) (__c.Asc(BA.ObjectToChar(_polyline.substring(_index,(int) (_index+1))))-63);
 //BA.debugLineNum = 24;BA.debugLine="index = index + 1";
_index = (int) (_index+1);
 //BA.debugLineNum = 25;BA.debugLine="result = Bit.Or(result, Bit.ShiftLeft(Bit.And(b";
_result = __c.Bit.Or(_result,__c.Bit.ShiftLeft(__c.Bit.And(_b,((int)0x1f)),_shift));
 //BA.debugLineNum = 26;BA.debugLine="shift = shift + 5";
_shift = (int) (_shift+5);
 //BA.debugLineNum = 27;BA.debugLine="If b < 0x20 Then Exit";
if (_b<((int)0x20)) { 
if (true) break;};
 }
;
 //BA.debugLineNum = 30;BA.debugLine="If Bit.And(result, 1) = 1 Then";
if (__c.Bit.And(_result,(int) (1))==1) { 
 //BA.debugLineNum = 31;BA.debugLine="dlat = Bit.Not(Bit.ShiftRight(result, 1))";
_dlat = __c.Bit.Not(__c.Bit.ShiftRight(_result,(int) (1)));
 }else {
 //BA.debugLineNum = 33;BA.debugLine="dlat = Bit.ShiftRight(result, 1)";
_dlat = __c.Bit.ShiftRight(_result,(int) (1));
 };
 //BA.debugLineNum = 36;BA.debugLine="lat = lat + dlat";
_lat = (int) (_lat+_dlat);
 //BA.debugLineNum = 37;BA.debugLine="shift = 0";
_shift = (int) (0);
 //BA.debugLineNum = 38;BA.debugLine="result = 0";
_result = (int) (0);
 //BA.debugLineNum = 40;BA.debugLine="Do While True";
while (__c.True) {
 //BA.debugLineNum = 41;BA.debugLine="b = Asc(Polyline.SubString2(index, index + 1))";
_b = (int) (__c.Asc(BA.ObjectToChar(_polyline.substring(_index,(int) (_index+1))))-63);
 //BA.debugLineNum = 42;BA.debugLine="index = index + 1";
_index = (int) (_index+1);
 //BA.debugLineNum = 43;BA.debugLine="result = Bit.Or(result, Bit.ShiftLeft(Bit.And(b";
_result = __c.Bit.Or(_result,__c.Bit.ShiftLeft(__c.Bit.And(_b,((int)0x1f)),_shift));
 //BA.debugLineNum = 44;BA.debugLine="shift = shift + 5";
_shift = (int) (_shift+5);
 //BA.debugLineNum = 45;BA.debugLine="If b < 0x20 Then Exit";
if (_b<((int)0x20)) { 
if (true) break;};
 }
;
 //BA.debugLineNum = 48;BA.debugLine="If Bit.And(result, 1) = 1 Then";
if (__c.Bit.And(_result,(int) (1))==1) { 
 //BA.debugLineNum = 49;BA.debugLine="dlng = Bit.Not(Bit.ShiftRight(result, 1))";
_dlng = __c.Bit.Not(__c.Bit.ShiftRight(_result,(int) (1)));
 }else {
 //BA.debugLineNum = 51;BA.debugLine="dlng = Bit.ShiftRight(result, 1)";
_dlng = __c.Bit.ShiftRight(_result,(int) (1));
 };
 //BA.debugLineNum = 54;BA.debugLine="lng = lng + dlng";
_lng = (int) (_lng+_dlng);
 //BA.debugLineNum = 56;BA.debugLine="Dim latlng As LatLng";
_latlng = new anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper();
 //BA.debugLineNum = 57;BA.debugLine="latlng.Initialize(lat / 100000, lng / 100000)";
_latlng.Initialize(_lat/(double)100000,_lng/(double)100000);
 }
;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
