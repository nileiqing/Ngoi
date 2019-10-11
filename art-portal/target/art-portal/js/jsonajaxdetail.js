var nodeid = $("#nodeid").html();
var allurl = $("#allurl").html();
var detailid = $("#detailid").html();
function showmid(index){
    var topMid = $(".top-mid").find("li.menu-item-has-children");
    if(topMid.eq(index).hasClass("active")){
        topMid.eq(index).removeClass("active");
    }
    else{
        for(var i=0;i<topMid.length;i++){
            if(topMid.eq(i).hasClass("active")){
                topMid.eq(i).removeClass("active");
            }
        }
        topMid.eq(index).addClass("active");
    }

    var topLeft = $(".top-left").find("li.menu-item-has-children");
    if(topLeft.eq(index).hasClass("active")){
        topLeft.eq(index).removeClass("active");
    }
    else{
        for(var j=0;j<topLeft.length;j++){
            if(topLeft.eq(j).hasClass("active")){
                topLeft.eq(j).removeClass("active");
            }
        }
        topLeft.eq(index).addClass("active");
    }
}

function showthird(j,k){
	var topMid = $(".top-mid").find("li.menu-item-has-children").eq(j).find("li.menu-itemthird-has-children");
    if(topMid.eq(k).hasClass("show")){
        topMid.eq(k).removeClass("show");
    }
    else{
        for(var i=0;i<topMid.length;i++){
            if(topMid.eq(i).hasClass("show")){
                topMid.eq(i).removeClass("show");
            }
        }
        topMid.eq(k).addClass("show");
    }
    
    var topLeft = $(".top-left").find("li.menu-item-has-children").eq(j).find("li.menu-itemthird-has-children");
    if(topLeft.eq(k).hasClass("show")){
        topLeft.eq(k).removeClass("show");
    }
    else{
        for(var z=0;z<topLeft.length;z++){
            if(topLeft.eq(z).hasClass("show")){
                topLeft.eq(z).removeClass("show");
            }
        }
        topLeft.eq(k).addClass("show");
    }
}

function shownext(index){
	$(".item-next").eq(index).show();
}
function hidenext(index){
	$(".item-next").eq(index).hide();
}

function detaillist(nodeid,currentpage){
//	detaillist.json
    $.getJSON(allurl + "detaillist/" + parseInt(nodeid) + ".html?currentpage=" + parseInt(currentpage), function(res) {
    	if(res.data.length==1){
    		detail(parseInt(res.data[0].id));
    	}
    	else{
    		$("#detailtitle").html(res.sort);
            $("#newsmodelnexttitle").html(res.sort);
            $("#newsmodelthirdtitle").html("");

            var detaillist = "<div id='detaillist'>";
            $.each(res.data,function(i,item){
            	var reg = /[\u4e00-\u9fa5]{2,}/g
            	var str = item.c;
            	if(str.match(reg)!=null){
                	str = str.match(reg).join("").substring(0,150);
            	}
                detaillist += "<a id='" + item.id + "' class='detaillistone' href='javascript:detail(" + item.id + ")'><h1>" + item.n + "</h1><div class='meta'>" + dateFormat(item.t, "yyyy年m月dd日") + "</div><p>" + str + "</p></a>";
            });
            detaillist += "</div>";
            $("#cont").html(detaillist);

            if(parseInt(res.pagecount)>1){
                var fenyelist = "<ul class='am-pagination am-pagination-centered'>";
                if(parseInt(res.currentpage)==1){
                    fenyelist += "<li class='am-disabled'><a href='javascript:void(0);'>&laquo;</a></li>";
                }
                else if(parseInt(res.currentpage)==2){
                    fenyelist += "<li class='prelink'><a href='javascript:detaillist(" + parseInt(nodeid) + "," + (parseInt(res.currentpage)-1) +");'>&laquo;</a></li>";
                    fenyelist += "<li class='selectpage'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)-1) +");'>" + (parseInt(res.currentpage)-1) + "</a></li>";
                }
                else{
                    fenyelist += "<li class='prelink'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)-1) +");'>&laquo;</a></li>";
                    fenyelist += "<li class='selectpage'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)-2) +");'>" + (parseInt(res.currentpage)-2) + "</a></li>";
                    fenyelist += "<li class='selectpage'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)-1) +");'>" + (parseInt(res.currentpage)-1) + "</a></li>";
                }
                fenyelist += "<li class='am-active'><a href='javascript:void(0);'>" + (parseInt(res.currentpage)) + "</a></li>";
                if(parseInt(res.currentpage)==parseInt(res.pagecount)){
                    fenyelist += "<li class='am-disabled'><a href='javascript:void(0);'>&raquo;</a></li>";
                }
                else if((parseInt(res.currentpage)+1)==parseInt(res.pagecount)){
                    fenyelist += "<li class='selectpage'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)+1) +");'>" + (parseInt(res.currentpage)+1) + "</a></li>";
                    fenyelist += "<li class='nextlink'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)+1) +");'>&raquo;</a></li>";
                }
                else{
                    fenyelist += "<li class='selectpage'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)+1) +");'>" + (parseInt(res.currentpage)+1) + "</a></li>";
                    fenyelist += "<li class='selectpage'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)+2) +");'>" + (parseInt(res.currentpage)+2) + "</a></li>";
                    fenyelist += "<li class='nextlink'><a href='javascript:detaillist(" + parseInt(nodeid) + ","  + (parseInt(res.currentpage)+1) +");'>&raquo;</a></li>";
                }
                fenyelist += "<li class='am-disabled'><a href='javascript:void(0);'>共" + parseInt(res.pagecount) + "页</a></li>";
                fenyelist += "</ul>";
                $("#cont").html($("#cont").html() + fenyelist);
            }
    	}
    });
}

//转到详情
function detail(detailnumber){
//	detail.json
	$.getJSON(allurl + "getcontentlist.html?categoryId=" + parseInt(detailnumber), function(res) {
        var detail = res.data;
        $("#detailtitle").html(detail.n);
        $("#newsmodelthirdtitle").html(" &gt;" + detail.n);
        $("#cont").html(detail.c);
    });
}

$(function (){
//	header.json
	$.getJSON(allurl + "index.html", function(data) {
        // 左部图片
        var headerimgleftres = data.headerimgleft;
        $("#headerimgleft").attr("src",headerimgleftres);
        // 顶部图片
        var headerimgtopres = data.headerimgtop;
        $("#headerimgtop").attr("src",headerimgtopres);
        // 顶部导航
        var headernavres = data.headernav;
        var headernav =  "";
        $.each(headernavres,function(i,item){
        	if(item.i.length==0){
        		headernav += "<li class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children'>";
        		headernav += "<a href='" + item.u + "' style='color:#6699CC;'>" + item.n + "</a>";
        		headernav += "</li>";
        	}else{
        		headernav += "<li class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children' onmouseover='javascript:showmid(" + i + ");' onmouseout='javascript:showmid(" + i + ");'>";
                headernav += "<a style='color:#6699CC;'>" + item.n + "</a>";
                headernav += "<ul class='sub-menu'>";
                $.each(item.i,function(j,itemnext){
                	if(itemnext.i.length==0){
                		headernav += "<li class='menu-item menu-item-type-post_type menu-item-object-page menu-itemthird-has-children'>";
                		headernav += "<a href='" + itemnext.u + "' style='color:#6699CC;'>" + itemnext.n + "</a>";
                		headernav += "</li>";
                	}else{
                		headernav += "<li class='menu-item menu-item-type-post_type menu-item-object-page menu-itemthird-has-children' onmouseover='javascript:showthird(" + i + "," + j + ")' onmouseout='javascript:showthird(" + i + "," + j + ")'>";
                		headernav += "<a style='color:#6699CC;'>" + itemnext.n + "</a>";
                		headernav += "<ul class='sub-menu-third'>";
                		$.each(itemnext.i,function(k,itemthird){
                			headernav += "<li class='menu-item menu-item-type-post_type menu-item-object-page'>";
                    		headernav += "<a href='" + itemthird.u + "' style='color:#6699CC;'>" + itemthird.n + "</a>";
                    		headernav += "</li>";
                        });
                		headernav += "</ul>";
                        headernav += "</li>";
                	}
                });
                headernav += "</ul>";
                headernav += "</li>";
        	}
        });
        $(".headernav").html(headernav);
    });

    // 底部footer.json
	$.getJSON(allurl + "getfooterresultlist.html", function(data) {
        // 底部左边
        var footerleftres = data.footerleft;
        // 图片
        $("#footerlogo").attr("src",footerleftres.img);
        // 电话、传真、地址
        var footerleft = "<li>电话：" + footerleftres.tel + "</li><li>Fax：" + footerleftres.fax + "</li><li>" + footerleftres.address + "</li>";
        $("#footerleft").html(footerleft);

        // 底部中间
        var footercenterres = data.footercenter;
        // 链接
        var footercenter = "";
        footercenter = "<ul class='am-u-sm-4'>";
        $.each(footercenterres,function(i,item){
            footercenter += "<li><a href='" + item.u + "' target='_blank'>" + item.n + "</a></li>";
            if(((i+1)%4==0)&&(i!=0)){
                footercenter += "</ul><ul class='am-u-sm-4'>";
            }
        });
        footercenter += "</ul>";
        $("#footercenter").html(footercenter);

        // 底部右边
        var footerrightres = data.footerright;
        var footerright = "<h3>关注我们</h3>";
        $.each(footerrightres,function(i,item){
            footerright += "<img class='am-radius am-img-thumbnail' title='' src='" + item.img + "' width='100' height='100'>";
            footerright += "<img class='am-radius am-img-thumbnail' title='' src='" + item.img1 + "' width='100' height='100'>";
        });
        $("#footerright").html(footerright);
    });
	
    detail(parseInt(detailid));

//    左边上边板块
    $.getJSON(allurl + "categoryNode/" + parseInt(nodeid) + ".html", function(data) {
    //$.getJSON("../json/left.json", function(data) {
        var newsres = data;
        $(".newsmodeltitle").html(newsres.n);
        var newsmodel = "";
        $.each(newsres.i ,function(i,item){
        	if(item.i.length==0){
        		newsmodel += "<li class='menu-item menu-item-type-post_type menu-item-object-page'>";
                newsmodel += "<a href='javascript:detaillist(" + item.id + ",1)'>" + item.n + "</a>";
                newsmodel += "</li>";
        	}else{
        		newsmodel += "<li class='menu-item menu-item-type-post_type menu-item-object-page' onmouseover='javascript:shownext(" + i + ");' onmouseout='javascript:hidenext(" + i + ");'>";
        		newsmodel += "<a style='color:#6699CC;'>" + item.n + "</a>";
        		newsmodel += "<ul class='item-next' style='display:none;'>";
        		$.each(item.i ,function(i,itemnext){
        			newsmodel += "<li class='menu-item menu-item-type-post_type menu-item-object-page'>";
        			newsmodel += "<a href='javascript:detaillist(" + itemnext.id + ",1)'>" + itemnext.n + "</a>";
                    newsmodel += "</li>";
        		});
        		newsmodel += "</ul>";
        		newsmodel += "</li>";
        	}
        });
        $("#newsmodel").html(newsmodel);
    });
    
//    学院特色
    $.getJSON(allurl + "gethomelist.html", function(data) {
        var trendres = data.trend;
        var trend = "";
        $.each(trendres,function(i,item){
            trend += "<li><time><span class='day'>" + dateFormat(item.t, "m.dd").split(".")[1] + "</span><span class='month'>" + dateFormat(item.t, "m.dd").split(".")[0] + "月</span></time>";
            trend += "<a id='" + item.id + "' href='javascript:detail(" + item.id + ")'>" + item.n + "</a></li>";
        });
        $("#trendsmodel").html(trend);
    });

});
