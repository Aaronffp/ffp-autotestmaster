// 新增数据库信息
$("#databaseInfo").submit(function (event) {
    var no = $("#sno").val();
    var eng = $("#seng").val();
    var chs = $("#schs").val();
    var type = $("#stype").val();
    var port = $("#sport").val();
    var context = $("#scontext").val();
    var deployPath = $("#sdeployPath").val();
    var logPath = $("#slogPath").val();
    var dataPath = $("#sdataPath").val();
    var tempPath = $("#stempPath").val();
    var manager = $("#smanager").val();
    var note = $("#snote").val();

    var serviceFlag = $(".modal-title").text();

    var sconf = '{"no":"' + no + '", "eng":"' + eng + '", "chs":"' + chs + '", "type":"' + type + '", "port":"' + port + '", "context":"' + context + '", "deployPath":"' + deployPath + '", "logPath":"' + logPath + '", "dataPath":"' + dataPath + '", "tempPath":"' + tempPath + '", "manager":"' + manager + '", "note":"' + note + '"}';

    var option = {
        url: "http://127.0.0.1:8083/sconf",
        type: "POST",
        dataType: 'JSON',
        contentType: "application/json",
        data: sconf,
        cache: false, //false是不缓存，true为缓存
        async: true, //true为异步，false为同步
        beforeSend: function () {
        },
        success: function (result) {
            alert(result);
            window.location.reload();
        },
        complete: function (result) {
            window.location.reload();
        },
        error: function (result) {
            alert("新增失败");
            window.location.reload();
        }
    };

    //获取标识判断是否从修改进来
    if (serviceFlag == "修改服务定义") {
      option.type = 'PUT';
    }

    $.ajax(option);

    event.preventDefault();
});

$("#seng").bind('input',function(){
    var eng = $('#seng').val();

    if (eng === "") {
        $('#sdeployPath').val("");
        $('#slogPath').val("");
        $('#sdataPath').val("");
        $('#stempPath').val("");
    } else {
        $('#sdeployPath').val("/aaron/" + eng + "/");
        $('#slogPath').val("/aaron/logs/" + eng + "/");
        $('#sdataPath').val("/aaron/data/" + eng + "/");
        $('#stempPath').val("/aaron/temp/" + eng + "/");
    }
});

$("#sport").bind('input',function(){
    var port = $('#sport').val();

    if (port === "") {
        $('#sportDubbo').val("");
    } else {
        $('#sportDubbo').val(20000 + parseInt(port));
    }
});

$("#addService").click(function(){
    $('.modal-title').text("新增服务定义");
});

// 修改数据库表信息
$("#datatable-keytable").on('click', "button[id='modify']", function (event) {
    var sno = $(this).parents("tr").find("#no").text();
    var seng = $(this).parents("tr").find("#serviceNameEng").text();
    var schs = $(this).parents("tr").find("#serviceNameChs").text();
    var stype = $(this).parents("tr").find("#serviceType").text();
    var sport = $(this).parents("tr").find("#servicePort").text();
    var sportDubbo = $(this).parents("tr").find("#servicePortDubbo").text();
    var scontext = $(this).parents("tr").find("#serviceContext").text();
    var sdeployPath = $(this).parents("tr").find("#servicePathDeploy").text();
    var slogPath = $(this).parents("tr").find("#servicePathLog").text();
    var sdataPath = $(this).parents("tr").find("#servicePathData").text();
    var stempPath = $(this).parents("tr").find("#servicePathTemp").text();
    var smanager = $(this).parents("tr").find("#serviceManager").text();
    var snote = $(this).parents("tr").find("#serviceNote").text();
    var supdateTime = $(this).parents("tr").find("#serviceUpdateTime").text();

    var sconf = '{"no":"' + sno + '", "eng":"' + seng + '", "chs":"' + schs + '", "type":"' + stype + '", "port":"' + sport + '", "context":"' + scontext + '", "deployPath":"' + sdeployPath + '", "logPath":"' + slogPath + '", "dataPath":"' + sdataPath + '", "tempPath":"' + stempPath + '", "manager":"' + smanager + '", "note":"' + snote + '", "updateTime":"' + supdateTime + '"}';

    $('#sno').val(sno);
    $('#seng').val(seng);
    $('#schs').val(schs);
    $('#stype').val(stype);
    $('#sport').val(sport);
    $('#sportDubbo').val(sportDubbo);
    $('#scontext').val(scontext);
    $('#sdeployPath').val(sdeployPath);
    $('#slogPath').val(slogPath);
    $('#sdataPath').val(sdataPath);
    $('#stempPath').val(stempPath);
    $('#smanager').val(smanager);
    $('#snote').val(snote);
    $('#supdateTime').val(supdateTime);
    $('.modal-title').text("修改服务定义");
});

// 删除数据库表信息
$("#datatable-keytable").on('click', "button[id='delete']", function (event) {
    var sno = $(this).parents("tr").find("#no").text();
    var seng = $(this).parents("tr").find("#serviceNameEng").text();
    var schs = $(this).parents("tr").find("#serviceNameChs").text();
    var stype = $(this).parents("tr").find("#serviceType").text();
    var sport = $(this).parents("tr").find("#servicePort").text();
    var scontext = $(this).parents("tr").find("#serviceContext").text();
    var sdeployPath = $(this).parents("tr").find("#serviceDeployPath").text();
    var slogPath = $(this).parents("tr").find("#serviceLogPath").text();
    var sdataPath = $(this).parents("tr").find("#serviceDataPath").text();
    var stempPath = $(this).parents("tr").find("#serviceTempPath").text();
    var smanager = $(this).parents("tr").find("#serviceManager").text();
    var snote = $(this).parents("tr").find("#serviceNote").text();
    var supdateTime = $(this).parents("tr").find("#serviceUpdateTime").text();

    var sconf = '{"no":"' + sno + '", "eng":"' + seng + '", "chs":"' + schs + '", "type":"' + stype + '", "port":"' + sport + '", "context":"' + scontext + '", "deployPath":"' + sdeployPath + '", "logPath":"' + slogPath + '", "dataPath":"' + sdataPath + '", "tempPath":"' + stempPath + '", "manager":"' + smanager + '", "note":"' + snote + '", "updateTime":"' + supdateTime + '"}';

    option = {
        url: "http://127.0.0.1:8083/sconf",
        type: "DELETE",
        dataType: 'JSON',
        contentType: "application/json",
        data: sconf,
        cache: false, //false是不缓存，true为缓存
        async: true, //true为异步，false为同步
        beforeSend: function () {
        },
        success: function (result) {
            alert(result);
            window.location.reload();
        },
        complete: function (result) {
            window.location.reload();
        },
        error: function (result) {
            alert("删除失败");
            window.location.reload();
        }
    };
    
    if (confirm("确定删除服务定义信息？")) {
        $.ajax(option);
    }
});


// 查询数据库信息
$("#search").click(function(){
    var s_eng = $("#ceng").val();
    var s_manager = $("#cmanager").val();

    // 删除查询历史
    for (var i = $('tr.odd').length - 1; i > 0; i--) {
        $('tr.odd')[i].remove();
    }

    var dbInfo = {seng:s_eng, smanager:s_manager};

    option = {
        url: "http://127.0.0.1:8083/sconf",
        type: "GET",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
        cache: false, // false是不缓存，true为缓存
        async: true,  // true为异步，false为同步

        success: function(responseData){
            result = eval(responseData);

            $.each(result, function (i, n) {
                var row = $("#template").clone();
                row.removeClass('hide');
                
                for (attribute in n) {
                    row.find("#" + attribute).html(n[attribute]);
                }
                
                row.appendTo($("#datatable-keytable tbody"));
            });
        }
    };

    // 初始加载数据库信息
    $.ajax(option);
});

