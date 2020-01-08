(function($){
$.fn.blurjs=function(_1){
_1.cacheExpired=_1.cacheExpired||Number.MAX_VALUE;
var _2=(new Date()).getTime();
var _3=document.createElement("canvas");
var _4=false;
var _5=($(this).selector).replace(/[^a-zA-Z0-9]/g,"");
if(!_3.getContext){
return;
}
_1=$.extend({source:"body",radius:5,overlay:"",offset:{x:0,y:0},optClass:"",cache:false,cacheKeyPrefix:"blurjs-",draggable:false,debug:false},_1);
var _6=[512,512,456,512,328,456,335,512,405,328,271,456,388,335,292,512,454,405,364,328,298,271,496,456,420,388,360,335,312,292,273,512,482,454,428,405,383,364,345,328,312,298,284,271,259,496,475,456,437,420,404,388,374,360,347,335,323,312,302,292,282,273,265,512,497,482,468,454,441,428,417,405,394,383,373,364,354,345,337,328,320,312,305,298,291,284,278,271,265,259,507,496,485,475,465,456,446,437,428,420,412,404,396,388,381,374,367,360,354,347,341,335,329,323,318,312,307,302,297,292,287,282,278,273,269,265,261,512,505,497,489,482,475,468,461,454,447,441,435,428,422,417,411,405,399,394,389,383,378,373,368,364,359,354,350,345,341,337,332,328,324,320,316,312,309,305,301,298,294,291,287,284,281,278,274,271,268,265,262,259,257,507,501,496,491,485,480,475,470,465,460,456,451,446,442,437,433,428,424,420,416,412,408,404,400,396,392,388,385,381,377,374,370,367,363,360,357,354,350,347,344,341,338,335,332,329,326,323,320,318,315,312,310,307,304,302,299,297,294,292,289,287,285,282,280,278,275,273,271,269,267,265,263,261,259];
var _7=[9,11,12,13,13,14,14,15,15,15,15,16,16,16,16,17,17,17,17,17,17,17,18,18,18,18,18,18,18,18,18,19,19,19,19,19,19,19,19,19,19,19,19,19,19,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,21,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24];
function _8(a,b,c,d,f,g){
if(isNaN(g)||g<1){
return;
}
g|=0;
var h=a.getContext("2d");
var j;
try{
try{
j=h.getImageData(b,c,d,f);
}
catch(e){
try{
netscape.security.PrivilegeManager.enablePrivilege("UniversalBrowserRead");
j=h.getImageData(b,c,d,f);
}
catch(e){
alert("Cannot access local image");
throw new Error("unable to access local image data: "+e);
}
}
}
catch(e){
alert("Cannot access image");
throw new Error("unable to access image data: "+e);
}
var k=j.data;
var x,y,i,p,yp,yi,yw,_9,_a,_b,_c,_d,_e,_f,_10,_11,pr,pg,pb,rbs;
var l=g+g+1;
var m=d<<2;
var n=d-1;
var o=f-1;
var q=g+1;
var r=q*(q+1)/2;
var s=new _12();
var t=s;
for(i=1;i<l;i++){
t=t.next=new _12();
if(i==q){
var u=t;
}
}
t.next=s;
var v=null;
var w=null;
yw=yi=0;
var z=_6[g];
var A=_7[g];
for(y=0;y<f;y++){
_f=_10=_11=_9=_a=_b=0;
_c=q*(pr=k[yi]);
_d=q*(pg=k[yi+1]);
_e=q*(pb=k[yi+2]);
_9+=r*pr;
_a+=r*pg;
_b+=r*pb;
t=s;
for(i=0;i<q;i++){
t.r=pr;
t.g=pg;
t.b=pb;
t=t.next;
}
for(i=1;i<q;i++){
p=yi+((n<i?n:i)<<2);
_9+=(t.r=(pr=k[p]))*(rbs=q-i);
_a+=(t.g=(pg=k[p+1]))*rbs;
_b+=(t.b=(pb=k[p+2]))*rbs;
_f+=pr;
_10+=pg;
_11+=pb;
t=t.next;
}
v=s;
w=u;
for(x=0;x<d;x++){
k[yi]=(_9*z)>>A;
k[yi+1]=(_a*z)>>A;
k[yi+2]=(_b*z)>>A;
_9-=_c;
_a-=_d;
_b-=_e;
_c-=v.r;
_d-=v.g;
_e-=v.b;
p=(yw+((p=x+g+1)<n?p:n))<<2;
_f+=(v.r=k[p]);
_10+=(v.g=k[p+1]);
_11+=(v.b=k[p+2]);
_9+=_f;
_a+=_10;
_b+=_11;
v=v.next;
_c+=(pr=w.r);
_d+=(pg=w.g);
_e+=(pb=w.b);
_f-=pr;
_10-=pg;
_11-=pb;
w=w.next;
yi+=4;
}
yw+=d;
}
for(x=0;x<d;x++){
_10=_11=_f=_a=_b=_9=0;
yi=x<<2;
_c=q*(pr=k[yi]);
_d=q*(pg=k[yi+1]);
_e=q*(pb=k[yi+2]);
_9+=r*pr;
_a+=r*pg;
_b+=r*pb;
t=s;
for(i=0;i<q;i++){
t.r=pr;
t.g=pg;
t.b=pb;
t=t.next;
}
yp=d;
for(i=1;i<=g;i++){
yi=(yp+x)<<2;
_9+=(t.r=(pr=k[yi]))*(rbs=q-i);
_a+=(t.g=(pg=k[yi+1]))*rbs;
_b+=(t.b=(pb=k[yi+2]))*rbs;
_f+=pr;
_10+=pg;
_11+=pb;
t=t.next;
if(i<o){
yp+=d;
}
}
yi=x;
v=s;
w=u;
for(y=0;y<f;y++){
p=yi<<2;
k[p]=(_9*z)>>A;
k[p+1]=(_a*z)>>A;
k[p+2]=(_b*z)>>A;
_9-=_c;
_a-=_d;
_b-=_e;
_c-=v.r;
_d-=v.g;
_e-=v.b;
p=(x+(((p=y+q)<o?p:o)*d))<<2;
_9+=(_f+=(v.r=k[p]));
_a+=(_10+=(v.g=k[p+1]));
_b+=(_11+=(v.b=k[p+2]));
v=v.next;
_c+=(pr=w.r);
_d+=(pg=w.g);
_e+=(pb=w.b);
_f-=pr;
_10-=pg;
_11-=pb;
w=w.next;
yi+=d;
}
}
h.putImageData(j,b,c);
};
function _12(){
this.r=0;
this.g=0;
this.b=0;
this.a=0;
this.next=null;
};
return this.each(function(){
var _13=$(this);
var _14=$(_1.source);
var _15=(_14.css("backgroundImage")).replace(/"/g,"").replace(/url\(|\)$/ig,"");
var ctx=_3.getContext("2d");
var _16=new Image();
_16.onload=function(){
if(!_4){
_3.style.display="none";
_3.width=_16.width;
_3.height=_16.height;
ctx.drawImage(_16,0,0);
_8(_3,0,0,_3.width,_3.height,_1.radius);
if(_1.overlay!=false){
ctx.beginPath();
ctx.rect(0,0,_16.width,_16.width);
ctx.fillStyle=_1.overlay;
ctx.fill();
}
var _17=_3.toDataURL();
if(_1.cache){
try{
if(_1.debug){
console.log("Cache Set");
}
localStorage.setItem(_1.cacheKeyPrefix+_5+"-"+_15+"-data-image",_17);
_18=localStorage.setItem(_1.cacheKeyPrefix+_5+"-"+_15+"-data-image-cacheAt",_2);
}
catch(e){
console.log(e);
}
}
}else{
var _17=_16.src;
}
var _19=_14.css("backgroundAttachment");
var _1a=(_19=="fixed")?"":"-"+((_13.offset().left)-(_14.offset().left)-(_1.offset.x))+"px -"+((_13.offset().top)-(_14.offset().top)-(_1.offset.y))+"px";
_13.css({"background-image":"url(\""+_17+"\")","background-repeat":_14.css("backgroundRepeat"),"background-position":_1a,"background-attachment":_19});
if(_1.optClass!=false){
_13.addClass(_1.optClass);
}
if(_1.draggable){
_13.css({"background-attachment":"fixed","background-position":"0 0"});
_13.draggable();
}
};
Storage.prototype.cacheChecksum=function(_1b){
var _1c="";
for(var key in _1b){
var obj=_1b[key];
if(obj.toString()=="[object Object]"){
_1c+=((obj.x).toString()+(obj.y).toString()+",").replace(/[^a-zA-Z0-9]/g,"");
}else{
_1c+=(obj+",").replace(/[^a-zA-Z0-9]/g,"");
}
}
var _1d=this.getItem(_1.cacheKeyPrefix+_5+"-"+_15+"-options-cache");
if(_1d!=_1c){
this.removeItem(_1.cacheKeyPrefix+_5+"-"+_15+"-options-cache");
this.setItem(_1.cacheKeyPrefix+_5+"-"+_15+"-options-cache",_1c);
if(_1.debug){
console.log("Settings Changed, Cache Emptied");
}
}
};
var _1e=null;
var _18=null;
if(_1.cache){
localStorage.cacheChecksum(_1);
_18=localStorage.getItem(_1.cacheKeyPrefix+_5+"-"+_15+"-data-image-cacheAt");
var _1f=parseInt(_2)-parseInt(_18);
if(_1f>0&&_1f<_1.cacheExpired){
_1e=localStorage.getItem(_1.cacheKeyPrefix+_5+"-"+_15+"-data-image");
}
}
if(_1e!=null){
if(_1.debug){
console.log("Cache Used");
}
_4=true;
_16.src=(_1e);
}else{
if(_1.debug){
console.log("Source Used");
}
_16.src=_15;
}
});
};
})(jQuery);

