var allurl = $("#allurl").html();
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

$(function (){
//	header.json
    $.getJSON(allurl + "index.html", function(data) {
	//$.getJSON("json/header.json", function(data) {
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
	
//  slide.json
    $.getJSON(allurl + "getslidenavbar.html", function(data){
        var slidenavbarres = data.slidenavbar;
        var slidenavbar = "";
        $.each(slidenavbarres,function(i,item){
            slidenavbar += "<li><img src='" + item.srcB + "' alt='" + item.alt + "'></li>";
        });
        $("#slidenavbar").html(slidenavbar);
        $(".rslides").responsiveSlides({
            auto: true,
            speed: 500,
            timeout: 4000,
            pager: false,   
            nav: true,
            random: false, 
            pause: false,
            pauseControls: true, 
            prevText: "Previous",
            nextText: "Next",   
            maxwidth: "",      
            namespace: "rslides"
        });
        $(".slidenavs").height($("#slidenavbar").height());
    });
//  homelist.json
    $.getJSON(allurl + "gethomelist.html", function(data){
        var i;
        //通知公告
        var noticeres = data.notice;
        var notice = "";
        $.each(noticeres,function(i,item){
            notice += "<a id='" + item.id + "' href='" + item.u + "'>" + item.n.substring(0,20) + "...<time>" + dateFormat(item.t, "m.dd") + "</time></a>";
        });
        $("#notice").html(notice);

        // 学院新闻
        var newsres = data.news;
        var news = "";
        $.each(newsres,function(i,item){
        	news += "<a id='" + item.id + "' href='" + item.u + "'>" + item.n.substring(0,20) + "...<time>" + dateFormat(item.t, "m.dd") + "</time></a>";
        });
        $("#news").html(news);

        // 在线展示
        var onlineshowres = data.onlineshow;
        var onlineshow = "";
        $.each(onlineshowres,function(i,item){
        	onlineshow += "<a id='" + item.id + "' href='" + item.u + "'>" + item.n.substring(0,20) + "...<time>" + dateFormat(item.t, "m.dd") + "</time></a>";
        });
        $("#onlineshow").html(onlineshow);

        // 学院动态
        var trendres = data.trend;
        var trend = "";
        $.each(trendres,function(i,item){
        	trend += "<a id='" + item.id + "' href='" + item.u + "'>" + item.n.substring(0,20) + "...<time>" + dateFormat(item.t, "m.dd") + "</time></a>";
        });
        $("#trend").html(trend);

        // 展览讲座
        var displayres = data.display;
        var display = "";
        $.each(displayres,function(i,item){
        	display += "<a id='" + item.id + "' href='" + item.u + "'>" + item.n.substring(0,20) + "...<time>" + dateFormat(item.t, "m.dd") + "</time></a>";
        });
        $("#display").html(display);

        // 快速链接
        /*var siteres = data.site;
        var site = "<div class='am-g'><div class='am-u-md-6'>";
        $.each(siteres,function(i,item){
        	site += "<a id='" + item.id + "' href='" + item.u + "'>" + item.n + "</a>";
            if(i==2){
                site += "</div><div class='am-u-md-6'>";
            }
        });
        site += "</div></div>";
        $("#site").html(site);*/
    });
    
    /*$.getJSON("json/newmediatalk.json", function(data) {
    	var pic1res = data.pic1;
    	var pic1 = "<ul><li><a href='#' title='" + pic1res.title + "'><img src='" + pic1res.imgpath + "'></a><div class='mask'><div class='pic'><div class='pic-title'>" + pic1res.title + "</div><div class='pic-date'>" + dateFormat(pic1res.date, "yyyy-m-dd") + "</div><a class='pic-ckxq' href='" + pic1res.href + "'>查看详情</a></div></div></li></ul>";
    	$("#pic1").html(pic1);
    	
    	var pic2res = data.pic2;
    	var pic2 = "<ul><li><a href='#' title='" + pic2res.title + "'><img src='" + pic2res.imgpath + "'></a><div class='mask'><div class='pic'><div class='pic-title'>" + pic2res.title + "</div><div class='pic-date'>" + dateFormat(pic2res.date, "yyyy-m-dd") + "</div><a class='pic-ckxq' href='" + pic2res.href + "'>查看详情</a></div></div></li></ul>";
    	$("#pic2").html(pic2);
    	
    	var pic3res = data.pic3;
    	var pic3 = "<ul><li><a href='#' title='" + pic3res.title + "'><img src='" + pic3res.imgpath + "'></a><div class='mask'><div class='pic'><div class='pic-title'>" + pic3res.title + "</div><div class='pic-date'>" + dateFormat(pic3res.date, "yyyy-m-dd") + "</div><a class='pic-ckxq' href='" + pic3res.href + "'>查看详情</a></div></div></li></ul>";
    	$("#pic3").html(pic3);
    	
    	var pic4res = data.pic4;
    	var pic4 = "<ul><li><a href='#' title='" + pic4res.title + "'><img src='" + pic4res.imgpath + "'></a><div class='mask'><div class='pic'><div class='pic-title'>" + pic4res.title + "</div><div class='pic-date'>" + dateFormat(pic4res.date, "yyyy-m-dd") + "</div><a class='pic-ckxq' href='" + pic4res.href + "'>查看详情</a></div></div></li></ul>";
    	$("#pic4").html(pic4);
    });*/

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
});
$(".tlg-xmt li").on("mouseenter mouseleave",function(e) {
    var w = $(this).width();
    var h = $(this).height();
    var x = (e.pageX - this.offsetLeft - (w / 2)) * (w > h ? (h / w) : 1);
    var y = (e.pageY - this.offsetTop - (h / 2)) * (h > w ? (w / h) : 1);
    //alert(x);
    var direction = Math.round((((Math.atan2(y, x) * (180 / Math.PI)) + 180) / 90) + 3) % 4;
    //direction的值为“0,1,2,3”分别对应着“上，右，下，左”
    var eventType = e.type;
    //alert(e.type);
    if(e.type == 'mouseenter'){
       if(direction==0){
         $(this).find('.mask').css({'display':'block','top':-h+'px','left':'0px'}).animate({'top':'0px'});
       }else if(direction==1){
         $(this).find('.mask').css({'display':'block','left':w+'px','top':'0px'}).animate({'left':'0px'});
       }else if(direction==2){
         $(this).find('.mask').css({'display':'block','top':h+'px','left':'0px'}).animate({'top':'0px'});
       }else if(direction==3){
         $(this).find('.mask').css({'display':'block','left':-w+'px','top':'0px'}).animate({'left':'0px'});
       }
   }else{
       if(direction==0){
         $(this).find('.mask').animate({'top':-h+'px'});
       }else if(direction==1){
         $(this).find('.mask').animate({'left':w+'px'});
       }else if(direction==2){
         $(this).find('.mask').animate({'top':h+'px'});
       }else if(direction==3){
         $(this).find('.mask').animate({'left':-w+'px'});
       }
   }
});