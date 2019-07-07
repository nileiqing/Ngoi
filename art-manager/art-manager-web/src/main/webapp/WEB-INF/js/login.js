var jQ=jQuery.noConflict();
var dialog;
function init(_1){
var _2,i,_3;
_2=["uid","domain","password","dynamicPwd","verifyCode"];
for(i=0;i<_2.length;i++){
_3=document.getElementById(_2[i])||document.getElementsByName(_2[i])[0];
if(_3==null){
continue;
}
if(_3.type=="text"){
_3.onfocus=function(_4){
var e=_4||window.event;
var _5=e.target||e.srcElement;
jQ(_5).addClass("focus");
if(this.name=="verifyCode"){
var _6=document.getElementById("vcImageTR");
if(_6){
_6.style.display="";
}
}
};
_3.onblur=function(_7){
var e=_7||window.event;
var _8=e.target||e.srcElement;
jQ(_8).removeClass("focus");
};
}
if(_3.name=="uid"||_3.name=="password"){
_3.onkeyup=function(){
uidPasswordChanged();
};
}
if(!hasDefaultValue(_3)){
var _9=getCookie(_3.name);
if(_9){
_3.value=_9;
}
}
if(_3.name==_1){
_3.focus();
}
}
initCommon();
uidPasswordChanged();
};
function hasDefaultValue(_a){
return (!_a.getAttribute("ignoreIDV")&&_a.defaultValue)||_a.getAttribute("dvalue");
};
function switchLoginForm(id){
var _b=["userLoginTab","adminLoginTab"];
for(var i=0;i<_b.length;i++){
var _c=document.getElementById(_b[i]);
if(_c){
if(_c.id==id){
_c.className="active";
}else{
_c.className="inactive";
}
}
}
if(id=="adminLoginTab"){
jQ("#verifyCodeRow").css("display","none");
}else{
jQ("#verifyCodeRow").css("display","");
}
};
function initBackground(){
var bg=Math.round(Math.random());
backgroundDiv=jQ(".MainBg");
if(bg==1){
jQ(".Main").removeClass("Main").addClass("Main1");
jQ(".MainBg").removeClass("MainBg").addClass("MainBg1");
backgroundDiv=jQ(".MainBg1");
}
frostedGlass();
};
function initSubmitButtonStyle(){
var _d=new RegExp("^Button-.*\\s");
jQ("button[name='action:login']").bind("mouseover",function(){
this.className="Button-hover "+this.className;
});
jQ("button[name='action:login']").bind("mouseout",function(){
this.className=this.className.replace(_d,"");
});
jQ("button[name='action:login']").bind("click",function(){
this.className=this.className.replace(_d,"");
this.className="Button-click "+this.className;
});
};
function frostedGlass(){
if(jQ.browser.msie&&(jQ.browser.version=="6.0"||jQ.browser.version=="7.0"||jQ.browser.version=="8.0")){
jQ(".MainR").css({"background":"rgb(244,244,244)","border":"1px solid black;"});
jQ(".inpCode,.inpPW,.inpDomain,.inpUser").css({"border":"1px solid #B8B8B8"});
}else{
jQ(".MainR").blurjs({source:".MainBg,.MainBg1",radius:10,cacheExpired:30*1000,overlay:"rgba(244,244,244,0.5)",cache:false});
}
};
function initXT3index(){
initBackground();
initSubmitButtonStyle();
};
function initXT3(_e){
var _f,_10;
_f=["uid","domain","password","verifyCode"];
initInputCss(_f,_e);
changeIndexPage();
if(jQ("#faceVal,#dynamicPasswordLogin").length==0){
jQ(".TLine").hide();
}
jQ(document).mousedown(function(e){
e=e||window.event||this.parentWindow.event;
var _11=e.srcElement||e.target;
while(_11!==undefined&&_11!==null){
if(_11.className!="language"){
fadeOutElement(jQ(".localePanel").get(0));
}
if(_11.id!="inpDomain"){
fadeOutElement(jQ(".domainPanel").get(0));
}
if(_11.id!="faceSelectOption"){
fadeOutElement(jQ(".facePanel").get(0));
}
_11=_11.parentNode;
}
});
initCommon();
adjustHeight();
window.onresize=adjustHeight;
};
function getQuery(_12){
var reg=new RegExp("(^|&)"+_12+"=([^&]*)(&|$)");
var r=window.location.search.substr(1).match(reg);
if(r!=null){
return unescape(r[2]);
}
return null;
};
function changeIndexPage(){
var _13="Coremail.IndexPageData",_14=_15(),ts=_14["ts"],_16=location.protocol+"//"+location.host+"/coremail/index_data.jsp";
if(getQuery("temp_login_page_data")){
var _17;
if(_16.indexOf("?")>-1){
_17="&temp_login_page_data="+getQuery("temp_login_page_data");
}else{
_17="?temp_login_page_data="+getQuery("temp_login_page_data");
}
}
jQ.ajax({async:false,type:"GET",url:_16+(_17?_17:""),dataType:"JSON",success:function(_18){
_19(_18);
},error:function(_1a){
initXT3index();
}});
if(jQ("#links>*:last").length>0){
jQ("#links>*:last").html(jQ("#links>*:last").html().replace("|",""));
}
function _19(obj){
if(obj["background"]){
var _1b=_16+"?key=background&ts="+obj["ts"];
backgroundDiv.css("background-image","url("+_1b+")");
}else{
if(obj["indexPageData"]){
function _1c(el){
try{
if(el==="broadsideColor"){
return obj.indexPageData.loginPageData.background.broadsideColor;
}else{
if(el==="images"){
return obj.indexPageData.loginPageData.background.backgroundImage.images;
}else{
if(el==="isRotator"){
return obj.indexPageData.loginPageData.background.backgroundImage.isRotator;
}else{
if(el==="links"){
return obj.indexPageData.loginPageData.links;
}else{
if(el==="copyright"){
return obj.indexPageData.loginPageData.copyright;
}else{
if(el==="defaultLocale"){
return obj.indexPageData.loginPageData.loginForm.languages.defaultLocale;
}else{
if(el==="domains"){
return obj.indexPageData.loginPageData.loginForm.domains;
}else{
if(el==="submitButtonStyle"){
return obj.indexPageData.loginPageData.loginForm.submitButtonStyle;
}else{
if(el==="extraFunctions"){
return obj.indexPageData.loginPageData.loginForm.extraFunctions;
}else{
if(el==="loginModeForm"){
return obj.indexPageData.loginPageData.loginModeForm.loginMode;
}
}
}
}
}
}
}
}
}
}
}
catch(ex){
return false;
}
};
if(temp=_1c("submitButtonStyle")){
jQ("#login_button").css({"border":"1px solid "+temp.backgroundColor,"background-color":temp.backgroundColor,"color":temp.textColor});
}else{
initSubmitButtonStyle();
}
if(temp=_1c("defaultLocale")){
if(location.href.toString().indexOf("cus=1")<0){
setCookie("locale",temp);
if(window.location.href.toString().indexOf("?")>-1){
window.location=location+"&cus=1";
}else{
window.location=location+"?cus=1";
}
}
}
if(temp=_1c("copyright")){
jQ("#copyright").html(_1d(temp));
}
if(temp=_1c("domains")){
if(temp.defaultDomain){
jQ("#domainVal").html(temp.defaultDomain);
jQ("#domain").val(temp.defaultDomain);
}
if(temp.isDomainSelectable===false){
jQ("#inpDomain").remove();
}
}
if(temp=_1c("images")){
if(getQuery("temp_login_page_data")){
var _1e="&temp_login_page_data="+getQuery("temp_login_page_data");
}
if(_1c("isRotator")){
var n=Math.floor(Math.random()*temp.length+1)-1;
var _1b=_16+"?ts="+obj["ts"]+"&key="+temp[n]+(_1e?_1e:"");
jQ("#MainBg").css("background-image","url("+_1b+")");
}else{
var _1b=_16+"?ts="+obj["ts"]+"&key="+temp[0]+(_1e?_1e:"");
jQ("#MainBg").css("background-image","url("+_1b+")");
}
frostedGlass();
}else{
initBackground();
}
if(temp=_1c("broadsideColor")){
jQ("#Main").css("background-color",temp);
}
if(temp=_1c("links")){
var _1f=jQ("#links > *").detach();
for(var i=0;i<temp.length;i++){
node=_1f.filter("#"+temp[i].id);
if(node.length>0){
jQ("#links").append(node[0]);
}else{
var _20=temp[i].resource[login_page_custom.locale]?temp[i].resource[login_page_custom.locale]:temp[i].id;
jQ("#links").append("<span id=\""+temp[i].id+"\"><a target=\"_blank\" href=\""+temp[i].url+"\">"+_20+"</a> | </span>");
}
}
}
if(temp=_1c("extraFunctions")){
if(temp.enableUseSSL===false){
jQ("#enableUseSSLLabel").remove();
}
if(temp.enableRememberMe===false){
jQ("#saveUsernameLabel").remove();
}
if(temp.displayNewFeatures===false){
jQ("#newFeatures").remove();
}
}
}else{
initXT3index();
}
}
};
function _1d(str){
return str.replace(/&/gi,"&amp;").replace(/</gi,"&lt;").replace(/>/gi,"&gt;").replace(/\"/gi,"&quot;").replace(/'/gi,"&#039;");
};
function _15(){
var cs=document.cookie.split(/\s*;\s*/);
for(var i=0;i<cs.length;i++){
var _21=cs[i].split("=");
if(_13==_21[0]){
return _22(_21[1]);
}
}
return {};
};
function _22(s){
var str=decodeURIComponent(s);
var _23=str.split(":"),_24={};
for(var i=0;i<_23.length;i++){
var _25=_23[i].split("=");
_24[_25[0]]=_25[1];
}
return _24;
};
function _26(o){
var _27=[];
for(var k in o){
_27.push(k+"="+o[k]);
}
return encodeURIComponent(_27.join(":"));
};
};
function initInputCss(_28,_29){
var _2a;
for(var i=0;i<_28.length;i++){
_2a=document.getElementById(_28[i])||document.getElementsByName(_28[i])[0];
if(_2a==null){
continue;
}
if(_2a.type=="text"||_2a.type=="password"){
_2a.onmouseover=function(){
if(document.activeElement.name!=this.name){
jQ(this).addClass("inpOver");
jQ(this).removeClass("inpFocus");
}
};
_2a.onmouseout=function(){
if(document.activeElement.name!=this.name){
jQ(this).removeClass("inpOver");
jQ(this).removeClass("inpFocus");
}
};
_2a.onblur=function(){
jQ(this).removeClass("inpOver");
jQ(this).removeClass("inpFocus");
jQ(this).removeClass("inped");
if(jQ.trim(this.value).length>0){
jQ(this).addClass("inped");
}
if(this.type=="text"){
this.value=jQ.trim(this.value);
}
if(this.id=="uid"){
this.value=changePoint(this.value);
}
};
_2a.onfocus=function(){
jQ(this).removeClass("inpOver");
jQ(this).addClass("inpFocus");
};
}
if(!hasDefaultValue(_2a)){
var _2b=getCookie(_2a.name);
if(_2b){
if(_2a.name=="domain"){
changeDomain(_2b);
}else{
_2a.value=_2b;
}
}
}
if(_2a.name==_29){
_2a.focus();
}
if(jQ.trim(_2a.value).length>0){
jQ(_2a).addClass("inped");
}
}
};
function changePoint(_2c){
var _2d=unescape("\\u3002".replace(/\\u/gi,"%u"));
var _2e=_2c.indexOf("@");
if(_2e!=-1){
var _2f=jQ.trim(_2c.substring(0,_2e));
var _30=_2c.substring(_2e+1,_2c.length);
if(_30.indexOf(".")==-1&&_30.indexOf(_2d)!=-1){
var _31=_30.lastIndexOf(_2d);
_30=_30.substring(0,_31)+"."+_30.substring(_31+1,_30.length);
}
return _2f+"@"+_30;
}
return _2c;
};
function initCommon(){
(document.getElementById("vcImage")||{}).onclick=function(){
this.src=this.src.replace(/&rand=[\w\-\.]+/,"&rand="+Math.random());
};
(document.getElementById("vcHint")||{}).href="javascript:document.getElementById('vcImage').onclick();";
var _32=document.getElementById("homepage");
if(_32){
if(document.all){
_32.href="javascript:void(0);";
_32.style.behavior="url(#default#homepage)";
_32.onclick=function(){
this.setHomePage(document.location);
};
}else{
_32.style.display="none";
}
}
};
function adjustHeight(){
var _33=jQ("div[class='Head']").height();
var _34=jQ("div[class='Main']").length==0?jQ("div[class='Main1']").height():jQ("div[class='Main']").height();
var _35=jQ("div[class='MainM']").height();
var _36=jQ("div[class='footer']").height();
var _37=parseInt(jQ(".footer").css("padding-bottom"));
var _38=_33+_34+_35+_36+_37;
var top=(getClientSize()[1]-_38)/2;
if(top>0){
jQ("body").css("padding-top",top);
}else{
jQ("body").css("padding-top","0px");
}
adjustElPos(jQ("localeArea").get(0),jQ("#language").get(0),5,-4);
adjustElPos(jQ("#domainPanel").get(0),jQ("#inpDomain").get(0));
};
function getCookie(_39){
var reg=new RegExp("(^| )"+_39+"=([^;]*)(;|$)","gi");
var tmp=reg.exec(document.cookie);
return unescape((tmp||[])[2]||"");
};
function setCookie(_3a,_3b){
document.cookie=_3a+"="+escape(_3b)+";expires="+(new Date(1990,1,1)).toGMTString();
document.cookie=_3a+"="+escape(_3b)+";path=/"+";expires="+(new Date(2099,12,31)).toGMTString();
};
function changeLocale(_3c,_3d){
setCookie("locale",_3c);
if(window.location.href.toString().indexOf("cus=1")>-1){
window.location=location;
}else{
if(window.location.href.toString().indexOf("?")>-1){
window.location=location+"&cus=1";
}else{
window.location=location+"?cus=1";
}
}
};
function changeDomain(val){
jQ("input[name='domain']").val(val);
jQ("#domainVal").html(val);
fadeOutElement(jQ(".domainPanel").get(0));
};
function changeFace(key,val){
jQ("input[name='face']").val(key);
jQ("#faceVal").html(val);
fadeOutElement(jQ(".facePanel").get(0));
};
function fadeInElement(el,_3e,_3f,_40){
if(jQ(el).length>0){
if(jQ(el).is(":hidden")){
jQ(el).fadeIn();
adjustElPos(el,_3e,_3f,_40);
}
}
};
function displayFacePanel(el){
fadeInElement(jQ(".facePanel").get(0),el);
var _41=0-jQ(".facePanel").height()-jQ(el).height();
adjustElPos(jQ(".facePanel").get(0),el,_41-5,-12);
};
function fadeOutElement(el){
if(jQ(el).length>0){
if(jQ(el).is(":visible")){
jQ(el).fadeOut();
}
}
};
function adjustElPos(el,_42,_43,_44){
_43=_43||0;
_44=_44||0;
if(jQ(el).length>0){
if(jQ(el).is(":visible")){
jQ(el).css("top",jQ(_42).offset().top+jQ(_42).height()+_43+"px");
jQ(el).css("left",jQ(_42).offset().left+_44+"px");
}
}
};
function loginSubmit(_45,_46,_47){
document.getElementById("uid").value=changePoint(document.getElementById("uid").value);
_47=_47||"/coremail";
if((document.getElementById("saveUsername")||{checked:true}).checked){
setCookie("uid",document.getElementById("uid").value);
if(document.getElementById("domain")){
setCookie("domain",jQ("#domain").val());
}
}
if(document.getElementById("locale")){
setCookie("locale",document.getElementById("locale").value);
}
var _48=document.getElementById("speedtest");
if(_48){
var _49=getCookie("netSpeedServerHost");
if(_49){
var _4a=location.protocol+"//"+_49;
if(location.pathname){
_4a+=location.pathname;
}
_45.action=_4a;
}
}
var _4b=(document.getElementsByName("useSSL")[0]||{}).checked;
if(typeof (_4b)=="boolean"){
var _4c=_4b?"http://":"https://";
var _4d=_4b?"https://":"http://";
_45.action=(function translateProtocol(url){
if(url.charAt(0)=="/"){
if(location.protocol+"//"!=_4d){
return _4e(_4d+location.hostname+url);
}
return _4e(url);
}
if(url.substring(0,_4c.length).toLowerCase()==_4c){
var _4f=url.indexOf("/",_4c.length);
var _50=url.lastIndexOf(":",_4f);
if(_4f>0&&_50>0&&url.substring(_50+1,_4f).match(/^\d+$/)){
return _4e(_4d+url.substring(_4c.length,_50)+url.substring(_4f));
}else{
return _4e(_4d+url.substring(_4c.length));
}
}
return _4e(url);
})(_45.action);
}
if((document.getElementById("face_classic_cgi")||{}).selected){
if(document.all){
_46.returnValue=false;
}
document.getElementById("classic_cgi_form").elements["user"].value=_45.elements["uid"].value;
document.getElementById("classic_cgi_form").elements["pass"].value=_45.elements["password"].value;
document.getElementById("classic_cgi_form").submit();
return false;
}
function _4e(url){
if((document.getElementById("adminLoginTab")||{}).className=="active"){
var _51=url.substring(0,url.indexOf(_47));
url=_51+"/webadmin/index.jsp?submit=true";
}
return url;
};
return true;
};
function recoverPwd(_52){
_52.href+="?uid="+document.getElementById("uid").value;
};
function bookmarkMe(){
try{
window.external.AddFavorite(location.href,document.title);
}
catch(e){
alert(markme_msg);
}
};
function uidPasswordChanged(){
var _53=document.getElementById("verifyCellCode");
var _54=document.getElementById("sendVerifyCellCodeLink");
if(_54==null||_54==null){
return;
}
var _55=["uid","password"];
for(var i=0,len=_55.length;i<len;i++){
var _56=document.getElementById(_55[i])||document.getElementsByName(_55[i])[0];
if(_56.value==""){
_53.disabled=true;
_54.onclick=null;
return;
}
}
_53.disabled=false;
_54.onclick=submitSendVerifyCellCode;
};
function submitSendVerifyCellCode(){
if(dialog){
dialog.close();
}
var _57=document.getElementById("loginForm");
var _58=document.getElementsByName("action:sendVerifyCellCode")[0];
if(_58){
_58.disabled=false;
document.getElementById("verifyCellCode").value="";
_57.submit();
}
};
function initDialog(_59,_5a,_5b){
if(_59=="verifyCellCode"||_59=="dynamicPwd"){
var _5c=_59+"_d";
var msg=_5a+"<p><input type='text' class='inpKey' name='"+_5c+"'/>";
if(_59=="verifyCellCode"){
msg=msg+"<p>"+"<a href='javascript:submitSendVerifyCellCode();' style='padding-left: 10px;'>"+jQ("input[name='action:sendVerifyCellCode']").val()+"</a>";
}
var _5d={showMask:true,body:msg,button:_5b,actions:[function(){
jQ("input[name='"+_59+"']").val(jQ("input[name='"+_5c+"']").val());
jQ("button[name='action:login']").click();
}]};
dialog=new Dialog(_5d);
initInputCss([_5c],_5c);
}
};
function Dialog(_5e){
_5e=_5e||{};
var _5f=this;
var _60=document.getElementById("#dialogContainerPanel");
if(!_60){
_60=document.createElement("div");
_60.id="dialogContainerPanel";
document.body.appendChild(_60);
}
var _61=document.createElement("div");
var _62=""+"<div id='winFrame'>"+"<div class='winHead'>"+"<div class='closeBtn' id='closeBtn'><b class='ico icoClose'></b></div>"+"</div>"+"<div class='winMain'>$BODY$</div>"+"<div class='winFoot'>$BUTTONS$</div>"+"</div>";
_61.innerHTML=(document.all?"<iframe style=\"position:absolute;z-index:-1;top:0;left:0;width:0;height:0;);\" frameborder=0 src=\"javascript:''\"></iframe>":"")+"<div style=\"position:absolute;top:0;left:0;\">"+_62+"</div>";
var _63=_5e.showMask===undefined?false:_5e.showMask;
var _64=_5e.maskValue===undefined?0.5:_5e.maskValue;
var _65=_5e.button===undefined?"OK":_5e.button;
var _66=_5e.actions||[_5e.action];
var _67,_68;
for(var i=0,_69=_61.getElementsByTagName("*");_69[i];i++){
if(_69[i].childNodes.length==1&&_69[i].firstChild.nodeType==3){
var s=_69[i].firstChild.data;
_69[i].removeChild(_69[i].firstChild);
if(s=="$BODY$"){
_67=_69[i];
}else{
if(s=="$BUTTONS$"){
_68=_69[i];
}
}
}
}
_67.innerHTML=_5e.body;
_68.innerHTML=_6a(_65.split("_")).join(" ");
var _6b=jQ(_68).children("button");
for(var i=0;i<_6b.length;i++){
_6b[i].onclick=(function(k){
return function(){
_6c(k);
};
})(i);
}
_6d();
jQ("#closeBtn").click(_6e);
_5f.close=_6e;
function _6a(key){
var _6f=new Array();
for(var i=0;i<key.length;i++){
var _70=key[i].split(":");
var _71=_70.length>1?_70[1]:_70[0];
_6f.push("<button type='button' class='winBotton'>"+_71+"</button>");
}
return _6f;
};
function _72(_73,_74){
return (_73||function(){
})(_74||_67.getElementsByTagName("FORM")[0]||_67,_5f);
};
function _6c(_75){
if(_72(_66[_75])===false){
return;
}
_6e();
};
function _6e(){
if(_60==_61.parentNode){
_60.removeChild(_61);
}
var _76=(_60.lastChild||{}).previousSibling;
if(_76){
_76.style.zIndex=999;
}else{
_60.style.display="none";
_61.innerHTML="";
_60.innerHTML="";
}
};
function _77(){
_61.style.cssText="position:absolute;z-index:999;top:0;left:0;display:none;";
if(_60.firstChild==null){
var _78=_63?_64:0;
var _79=_63?_64*100:0;
if(getIEVersionLt10()){
_60.innerHTML="<div style=\"position:absolute;z-index:998;top:0;left:0;width:100%;height:100%;background-color:#b8b8b8;filter:alpha(opacity="+_79+");\">"+"<iframe style=\"position:absolute;z-index:-1;top:0;left:0;width:100%;height:100%;filter:alpha(opacity=0)\" frameborder=0 src=\"javascript:''\"></iframe>"+"</div>";
}else{
_60.innerHTML="<div style=\"position:absolute;z-index:998;top:0;left:0;width:100%;height:100%;background-color:#b8b8b8;opacity:"+_78+";\"></div>";
}
}
var _7a=_60.lastChild.previousSibling;
if(_7a){
_7a.style.zIndex=997;
}
_60.insertBefore(_61,_60.lastChild);
};
function _7b(){
_60.style.display="";
_61.style.display="";
_7c();
window.onresize=function(){
_7c();
};
};
function _7c(){
var div=_61.lastChild;
var w=div.offsetWidth;
var h=div.offsetHeight;
var _7d=getClientSize();
var _7e=_7d[0];
var _7f=_7d[1];
_61.style.left=Math.floor(Math.max(0,_7e-w)/2)+"px";
_61.style.top=Math.floor(Math.max(0,_7f-h)/2)+"px";
document.body.screenTop=document.body.screenLeft=0;
};
function _6d(){
_77();
_7b();
};
};
function getClientSize(){
return [jQ(window).width(),jQ(window).height()];
};
function getIEVersionLt10(){
var _80=navigator.userAgent;
if((_80.indexOf("MSIE")!=-1)&&(_80.indexOf("MSIE 10")==-1)){
return true;
}else{
return false;
}
};

