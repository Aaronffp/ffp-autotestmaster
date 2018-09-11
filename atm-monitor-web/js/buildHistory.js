// 查询信息
$("#search").click(function(){
    var s_env = $("#env").val();
    var s_server = $("#server").val();
    var s_service = $("#service").val();
    var s_deployer = $("#deployer").val();
    var s_status = Number($("#status").val());

    // 删除查询历史
    for (var i = $('tr.odd').length - 1; i > 0; i--) {
        $('tr.odd')[i].remove();
    }

    var dbInfo = {env:s_env, server:s_server, service:s_service , deployer:s_deployer, status:s_status};
    // alert(JSON.stringify(dbInfo));

    option = {
        url: "http://127.0.0.1:8083/build",
        type: "GET",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
        crossDomain:true,
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
                    // 循环json对象的属性，并赋值到数据行中对应的列，此处列的id就是相应的属性名称
                    // row.find("#" + attribute).html(n[attribute]);
                    if (attribute == "buildGitUrl" || attribute == "buildJenkinsLink") {
                        row.find("#" + attribute).html("<a style=\"text-decoration:underline\" href=\"" + n[attribute] +"\" target=\"_blank\">" + n[attribute] + "</a>");
                    } else if(attribute == "buildStatus") {
                        var status = (n[attribute] == 1) ? "发布版本" : "测试版本";

                        if (status == "发布版本") {
                            row.find("#" + attribute).html("<strong class=\"text-success\">" + status + "</strong>");
                        } else{
                            row.find("#" + attribute).html("<a class=\"text-warning\">" + status + "</a>");
                        }

                        var option = (n[attribute] == 1) ? "取消发布" : "设置发布";
                        row.find("#option #setStatus").html(option);
                    } else {
                        row.find("#" + attribute).html(n[attribute]);
                    }
                }
                
                row.appendTo($("#datatable-keytable tbody"));
            });
        }
    };

    // 初始加载数据库信息
    $.ajax(option);
});

// 设置版本
$("#datatable-keytable").on('click', "button[id='setStatus']", function (event) {
    var id = $(this).parents("tr").find("#id").text();
    var buildEnv = $(this).parents("tr").find("#buildEnv").text();
    var buildServer = $(this).parents("tr").find("#buildServer").text();
    var buildService = $(this).parents("tr").find("#buildService").text();
    var buildDeployer = $(this).parents("tr").find("#buildDeployer").text();
    var buildVersion = $(this).parents("tr").find("#buildVersion").text();
    var buildStatus = $(this).parents("tr").find("#buildStatus").text() == "测试版本" ? 1 : 0;
    var buildGitUrl = $(this).parents("tr").find("#buildGitUrl").text();
    var buildGitBranch = $(this).parents("tr").find("#buildGitBranch").text();
    var buildJenkinsLink = $(this).parents("tr").find("#buildJenkinsLink").text();
    var buildTime = $(this).parents("tr").find("#buildTime").text();

    var dbInfo = '{"id":"' + id + '", "buildEnv":"' + buildEnv + '", "buildServer":"' + buildServer + '", "buildService":"' + buildService + '", "buildDeployer":"' + buildDeployer + '", "buildVersion":"' + buildVersion + '", "buildStatus":"' + buildStatus + '", "buildGitUrl":"' + buildGitUrl + '", "buildGitBranch":"' + buildGitBranch + '", "buildJenkinsLink":"' + buildJenkinsLink + '", "buildTime":"' + buildTime + '"}';

    // console.log(dbInfo);

    $.ajax({
        url: "http://127.0.0.1:8083/build",
        type: "PUT",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
        cache: false, //false是不缓存，true为缓存
        async: true,  //true为异步，false为同步

        beforeSend: function () {
            //请求前
        },
        success: function (result) {
            //请求成功时
            alert(result);
            // window.location.reload();
        },
        complete: function (result) {
            //请求结束时
            // console.log("请求结束：" + dbInfo);
            // window.location.reload();
        },
        error: function (result) {
            //请求失败时
            alert("设置失败");
            // window.location.reload();
        }
    });
});

