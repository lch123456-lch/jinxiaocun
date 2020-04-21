$(document).ready(function() {
    var menuParent = $('.menu > .ListTitlePanel > div');//获取menu下的父层的DIV
    var menuList = $('.menuList');
    $('.menu > .menuParent > .ListTitlePanel > .ListTitle').each(function(i) {//获取列表的大标题并遍历
        $(menuList[i]).hide();
        $(this).click(function(){
            if($(menuList[i]).css('display') == 'none'){
                $(menuList[i]).slideDown(300);
            }
            else{
                $(menuList[i]).slideUp(300);
            }
        });
    });

    var navName = $("#navName").text();
    $(".menuList>.a>a").each(function(i){ //遍历每一个下面的标签
        var varNames = $(this).text();
        if(navName==varNames){
            $(this).parent().parent().show();
        }
    })

});
