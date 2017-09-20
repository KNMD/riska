/*!
 * Start Bootstrap - SB Admin 2 v3.3.7+1 (http://startbootstrap.com/template-overviews/sb-admin-2)
 * Copyright 2013-2016 Start Bootstrap
 * Licensed under MIT (https://github.com/BlackrockDigital/startbootstrap/blob/gh-pages/LICENSE)
 */
var domain = "localhost",
    hostURL = "/riska",
    restURL = "/riska/rest",
    platformName = "期货智能交易平台",
    AjaxUtil = {
        beforeSend: function () {
            $.LoadingOverlay("show");
        },
        error: function (xhr) {
            console.log(xhr);
            if(403 == xhr.status) {
                window.location.href = hostURL + "/login.html";
            }
        },
        complete: function () {
            $.LoadingOverlay("hide");
        },
        createDataTableAJaxObj : function (url) {
            var me = this;
            return {
                url : url,
                error: function (xhr) {
                    me.error(xhr);
                }
            };
        }
    },
    DataTableUtil = {
        dateFormat: function (date) {
            if(null === date) {
                return "";
            }else {
                return date.getFullYear()+ "-" +
                    DataTableUtil.fixDate(date.getMonth() + 1) + "-" +
                    DataTableUtil.fixDate(date.getDate()) +" " +
                    DataTableUtil.fixDate(date.getHours()) + ":" +
                    DataTableUtil.fixDate(date.getMinutes()) + ":" +
                    DataTableUtil.fixDate(date.getSeconds());
            }
        },
        fixDate: function (number) {
            if(number > 10) {
                return number;
            }else {
                return "0" + number;
            }
        }
    };
$(function() {
    // set global ajax load
    $.ajaxSetup({
        beforeSend: function(){
            AjaxUtil.beforeSend();
        },
        error: function (xhr) {
            AjaxUtil.error(xhr);
        },
        complete : function () {
            AjaxUtil.complete();
        }
    });

    $("#navigation").load(hostURL + "/modules/navigation.html", function () {
        // $('#side-menu').metisMenu();
        // set nav active
        var url = window.location.href;
        // var element = $('ul.nav a').filter(function() {
        //     return this.href == url;
        // }).addClass('active').parent().parent().addClass('in').parent();
        if(url.indexOf("javascript:;") === -1) {
            var a = $('ul.nav a').filter(function() {
                    return this.href == url;
                }).addClass('active'),
                element = a.parent(),
                title = $(a).text();
            $("#page-wrapper h1").html(title);
            document.title = platformName + "-" + title
        }
        while (true) {
            if (element.is('li')) {
                element = element.parent().addClass('in').parent();
            } else {
                break;
            }
        }
    });

    

});

//Loads the correct sidebar on window load,
//collapses the sidebar on window resize.
// Sets the min-height of #page-wrapper to window size
$(function() {
    $(window).bind("load resize", function() {
        var topOffset = 50;
        var width = (this.window.innerWidth > 0) ? this.window.innerWidth : this.screen.width;
        if (width < 768) {
            $('div.navbar-collapse').addClass('collapse');
            topOffset = 100; // 2-row-menu
        } else {
            $('div.navbar-collapse').removeClass('collapse');
        }

        var height = ((this.window.innerHeight > 0) ? this.window.innerHeight : this.screen.height) - 1;
        height = height - topOffset;
        if (height < 1) height = 1;
        if (height > topOffset) {
            $("#page-wrapper").css("min-height", (height) + "px");
        }
    });


});
