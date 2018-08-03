/**
 * Created by fhd on 2018/7/17.
 */
$(document).ready(function () {
    var imgs=["1.png","2.png","3.png","4.png"];
    var i=1;
    window.timer=setInterval(move,3000);
    function move() {
        // console.log("qian "+i);
        if($("#i2").is(":hidden")){
            $("#i2").attr("src","sfImgs/"+imgs[i]);
            $("#i1").fadeOut(1000);
            $("#i2").fadeIn(1000);
        }else {
            $("#i1").attr("src","sfImgs/"+imgs[i]);
            $("#i2").fadeOut(1000);
            $("#i1").fadeIn(1000);
        }
        tog(i++);
        if(i>3) i=0;
    }
    $("#daohang span").mouseover(function () {
        $("#daohang span").width(10);
        $(this).width(30);
        clearInterval(window.timer)
        var sid = $(this).attr("id");
        if($("#i2").is(":hidden")){
            $("#i2").attr("src","sfImgs/"+imgs[sid]);
            $("#i1").fadeOut(1000);
            $("#i2").fadeIn(1000);
        }else {
            $("#i1").attr("src","sfImgs/"+imgs[sid]);
            $("#i2").fadeOut(1000);
            $("#i1").fadeIn(1000);
        }
    }).mouseout(function () {
        var sid = $(this).attr("id");
        i=parseInt(sid)+1;
        if(i==4) i=0;
        console.log(i);
        window.timer=setInterval(move,3000);
    });
    $("img").mousemove(function () {
        clearInterval(window.timer)
    }).mouseout(function () {
        window.timer=setInterval(move,3000);
    });
    function tog(index) {
        $("#"+index).width(30);
        if(index==0) index=3;
        else index--;
        $("#"+index).width(10);
    }
    $("#ldaohang li").mouseover(function () {
        $(this).css("background","white");
        $(this).css("opacity","1");
        $(this).find("span").css("color","darkgray");
        var i = $(this).attr("id")+"";
        console.log(i.index(1));
    }).mouseout(function () {
        $(this).css("background","black");
        $(this).find("span").css("color","white");
    });
    $(".select").focus(function () {
        $(this).css("width","100%");
        $(this).css("top","-50px");
        $("#fx").hide();
    }).blur(function () {
        $(".daohang>a").hide();
        $("#fx").hide();
        $(this).css("top","0px");
        $(this).css("width","207px");
        setTimeout(function () {
            $(".daohang>a").show();
            $("#fx").show();
        },200)
    });
    $("#fx").mouseover(function () {
        $(".faxian").show();
    }).mouseout(function () {
        setTimeout(function () {
            if((!$(".faxian").is(":hover"))&&(!$("#fx").is(":hover"))){
                $(".faxian").hide();
            }
        },1000);
    });
    $(".faxian").mouseout(function () {
        setTimeout(function () {
            if((!$(".faxian").is(":hover"))&&(!$("#fx").is(":hover"))){
                $(".faxian").hide();
            }
        },1000);
    });
    $(".create").click(function (e) {
        if(!$(".create1").is(":hidden")){
            $(".create1").hide();
        }else $(".create1").show();
        $(document).click(function () {
                $(".create1").hide();
        });
        e.stopPropagation();
    });
    $("#tongzhi").click(function (e) {
        if(!$(".message").is(":hidden")){
            if(!$(".message").is(":hover")){
                $(".message").hide();
            };
        }else $(".message").show();
        $(document).click(function () {
            if(!$(".message").is(":hover")){
                $(".message").hide();
            }
        });
        e.stopPropagation();
    });
    $(".m1 div").click(function () {
        $(".m1 div").css("border-bottom","0px solid #009a61");
        $(".m1 i").css("color","gray");
        $(this).css("border-bottom","2px solid #009a61");
        $(this).find("i").css("color","#009a61");
        $("#laba2").hide();
    });
    $(".m1 div").mouseover(function () {
        $(this).css("border-bottom","2px solid #009a61");
    }).mouseout(function () {
        if($(this).find("i").css("color")=="rgb(128, 128, 128)")
            $(this).css("border-bottom","0px solid #009a61");
    });
    $("#laba").click(function () {
        $("#laba2").show();
    });
    $("#user").mouseover(function () {
        $(".user-message").show();
    }).mouseout(function () {
        $(".user-message").hide();
    });
    $("#tuisong").click(function () {
        $(".peizhi").hide();
        $(".peizhi2").show();
    });
    $("#quxiao").click(function () {
        $(".peizhi2").hide();
        $(".peizhi").show();
    });
    $("#baocun").click(function () {
        $(".peizhi2").hide();
        $(".peizhi").show();
        var resoult="";
        if($("#nosee").is(":checked")) resoult="不看自己";
        if($("#zhisee").is(":checked")) resoult += "  只看推荐";
        console.log("用户所选信息："+resoult);
    });

    $('#goToTop').hide();        //隐藏go to top按钮
    $(window).scroll(function(){
        //window的scrolltop距离大于100时,显示
        if($(this).scrollTop() > 100){
            $('#goToTop').fadeIn();
        }else{
            $('#goToTop').fadeOut();
        }
    });
    $('#goToTop').click(function(){
        $('html ,body').animate({scrollTop: 0}, 300);
        return false;
    });
});


