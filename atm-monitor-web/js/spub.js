// 新增修改数据库信息
$("#databaseInfo").submit(function (event) {
    var no = $("#sNo").text();
    var env = $("#sEnv").val();
    var serviceNameEng = $("#sserviceNameEng").val();
    var serviceNameChs = $("#sserviceNameChs").val();
    var serviceUrl = $("#sserviceUrl").val();
    var serviceUser = $("#sserviceUser").val();
    var servicePass = $("#sservicePass").val();
    var serviceUpdater = $("#sserviceUpdater").val();
    var serviceNote = $("#sserviceNote").val();

    var serviceFlag = $(".modal-title").text();

    var serviceInfo = '{"no":"' + no + '", "env":"' + env + '", "serviceNameEng":"' + serviceNameEng + '", "serviceNameChs":"' + serviceNameChs + '", "serviceUrl":"' + serviceUrl + '", "serviceUser":"' + serviceUser + '", "servicePass":"' + servicePass + '", "serviceUpdater":"' + serviceUpdater + '", "serviceNote":"' + serviceNote + '"}';

    console.log(serviceInfo);

    var option = {
        url: "http://172.16.8.5:8181/service",
        // url: "http://127.0.0.1:8083/service",
        type: "POST",
        dataType: 'JSON',
        contentType: "application/json",
        data: serviceInfo,
        cache: false, //false是不缓存，true为缓存
        async: true, //true为异步，false为同步
        beforeSend: function () {
            //请求前
        },
        success: function (result) {
            //请求成功时
            alert(result);
            window.location.reload();
        },
        complete: function (result) {
            //请求结束时
            // console.log("请求结束：" + serviceInfo);
            window.location.reload();
        },
        error: function (result) {
            //请求失败时
            alert("新增失败");
            window.location.reload();
        }
    };
    //获取标识判断是否从修改进来
    if (serviceFlag == "修改服务信息") {
      option.type = 'PUT';
    }
    
    $.ajax(option);

    event.preventDefault();
});

$("#addService").click(function(){
    $('.modal-title').text("新增服务信息");
});

// 修改数据库表信息
$("#datatable-keytable").on('click', "button[id='modify']", function (event) {
    var no = $(this).parents("tr").find("#no").text();
    var env = $(this).parents("tr").find("#env").text();
    var serviceNameEng = $(this).parents("tr").find("#serviceNameEng").text();
    var serviceNameChs = $(this).parents("tr").find("#serviceNameChs").text();
    var serviceUrl = $(this).parents("tr").find("#serviceUrl").text();
    var serviceUser = $(this).parents("tr").find("#serviceUser").text();
    var servicePass = $(this).parents("tr").find("#servicePass").text();
    var serviceUpdater = $(this).parents("tr").find("#serviceUpdater").text();
    var serviceUpdateTime = $(this).parents("tr").find("#serviceUpdateTime").text();
    var serviceNote = $(this).parents("tr").find("#serviceNote").text();

    var serviceInfo = '{"no":"' + no + '", "env":"' + env + '", "serviceNameEng":"' + serviceNameEng + '", "serviceNameChs":"' + serviceNameChs + '", "serviceUrl":"' + serviceUrl + '", "serviceUser":"' + serviceUser + '", "servicePass":"' + servicePass + '", "serviceUpdater":"' + serviceUpdater + '", "serviceUpdateTime":"' + serviceUpdateTime + '", "serviceNote":"' + serviceNote + '"}';

    console.log(serviceInfo);
    $('#sNo').text(no);
    $('#sEnv').val(env);
    $('#sserviceNameEng').val(serviceNameEng);
    $('#sserviceNameChs').val(serviceNameChs);
    $('#sserviceUrl').val(serviceUrl);
    $('#sserviceUser').val(serviceUser);
    $('#sservicePass').val(servicePass);
    $('#sserviceUpdater').val(serviceUpdater);
    $('#sserviceUpdateTime').val(serviceUpdateTime);
    $('#sserviceNote').val(serviceNote);
    $('.modal-title').text("修改服务信息");
    // $('#sserviceCreater').attr('readonly','');
});

// 删除数据库表信息
$("#datatable-keytable").on('click', "button[id='delete']", function (event) {
    var no = $(this).parents("tr").find("#no").text();
    var env = $(this).parents("tr").find("#env").text();
    var serviceNameEng = $(this).parents("tr").find("#serviceNameEng").text();
    var serviceNameChs = $(this).parents("tr").find("#serviceNameChs").text();
    var serviceUrl = $(this).parents("tr").find("#serviceUrl").text();
    var serviceUser = $(this).parents("tr").find("#serviceUser").text();
    var servicePass = $(this).parents("tr").find("#servicePass").text();
    var serviceUpdater = $(this).parents("tr").find("#serviceUpdater").text();
    var serviceUpdateTime = $(this).parents("tr").find("#serviceUpdateTime").text();
    var serviceNote = $(this).parents("tr").find("#serviceNote").text();

    var serviceInfo = '{"no":"' + no + '", "env":"' + env + '", "serviceNameEng":"' + serviceNameEng + '", "serviceNameChs":"' + serviceNameChs + '", "serviceUrl":"' + serviceUrl + '", "serviceUser":"' + serviceUser + '", "servicePass":"' + servicePass + '", "serviceUpdater":"' + serviceUpdater + '", "serviceUpdateTime":"' + serviceUpdateTime + '", "serviceNote":"' + serviceNote + '"}';

    console.log(serviceInfo);

    $.ajax({
        url: "http://172.16.8.5:8181/service",
        // url: "http://127.0.0.1:8083/service",
        type: "DELETE",
        dataType: 'JSON',
        contentType: "application/json",
        data: serviceInfo,
        cache: false, //false是不缓存，true为缓存
        async: true, //true为异步，false为同步
        beforeSend: function () {
            //请求前
        },
        success: function (result) {
            //请求成功时
            alert(result);
            window.location.reload();
        },
        complete: function (result) {
            //请求结束时
            // console.log("请求结束：" + serviceInfo);
            window.location.reload();
        },
        error: function (result) {
            //请求失败时
            alert("删除失败");
            window.location.reload();
        }
    });
});


// 查询数据库信息
$("#search").click(function(){
    var s_env = $("#senv").val();
    var s_eng = $("#seng").val();
    var s_updater = $("#supdater").val();

    if (s_env == "") {
        confirm("请选择服务所在环境！");
        return;
    };

    // 删除查询历史
    for (var i = $('tr.odd').length - 1; i > 0; i--) {
        $('tr.odd')[i].remove();
    }

    var dbInfo = {senv:s_env, seng:s_eng, supdater:s_updater};
    // alert(JSON.stringify(dbInfo));

    option = {
        url: "http://172.16.8.5:8181/service",
        // url: "http://127.0.0.1:8083/service",
        type: "GET",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
        cache: false, // false是不缓存，true为缓存
        async: true,  // true为异步，false为同步

        success: function(responseData){
            // console.log(responseData);
            result = eval(responseData);

            $.each(result, function (i, n) {
                // 克隆模板，创建一个新数据行
                var row = $("#template").clone();
                // 取消隐藏
                row.removeClass('hide');
                
                for (attribute in n) {
                    //循环json对象的属性，并赋值到数据行中对应的列，此处列的id就是相应的属性名称
                    if (attribute == "serviceUrl") {
                        row.find("#" + attribute).html("<a style=\"text-decoration:underline\" href=\"" + n[attribute] +"\" target=\"_blank\">" + n[attribute] + "</a>");
                    } else {
                        row.find("#" + attribute).html(n[attribute]);
                    };
                }
                
                row.appendTo($("#datatable-keytable tbody"));   
            });
        }
    }

    // 初始加载数据库信息
    $.ajax(option);
});

