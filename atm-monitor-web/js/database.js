// 新增数据库信息
$("#addDatabase").click(function(){
    $('#myModalLabel').text('新增数据库');
});

// 修改数据库信息
$("#databaseList").on('click', "button[id='modify']", function (event) {
    var dbNo = $(this).parents("tr").find("#dbNo").text();
    var dbEnv = $(this).parents("tr").find("#dbEnv").text();
    var dbNameEng = $(this).parents("tr").find("#dbNameEng").text();
    var dbNameChs = $(this).parents("tr").find("#dbNameChs").text();
    var dbBenchmark = $(this).parents("tr").find("#dbBenchmark").text();
    var dbType = $(this).parents("tr").find("#dbType").text();
    var dbDriver = $(this).parents("tr").find("#dbDriver").text();
    var dbUrl = $(this).parents("tr").find("#dbUrl").text();
    var dbUser = $(this).parents("tr").find("#dbUser").text();
    var dbPass = $(this).parents("tr").find("#dbPass").text();
    var dbCreater = $(this).parents("tr").find("#dbCreater").text();
    var dbCreateTime = $(this).parents("tr").find("#dbCreateTime").text();
    var dbUpdater = $(this).parents("tr").find("#dbUpdater").text();
    var dbUpdateTime = $(this).parents("tr").find("#dbUpdateTime").text();
    var dbNote = $(this).parents("tr").find("#dbNote").text();

    var dbInfo = '{"dbNo":"' + dbNo + '", "dbEnv":"' + dbEnv + '", "dbNameEng":"' + dbNameEng + '", "dbNameChs":"' + dbNameChs + '", "dbBenchmark":"' + dbBenchmark + '", "dbType":"' + dbType + '", "dbDriver":"' + dbDriver + '", "dbUrl":"' + dbUrl + '", "dbUser":"' + dbUser + '", "dbPass":"' + dbPass + '", "dbCreater":"' + dbCreater + '", "dbCreateTime":"' + dbCreateTime + '", "dbUpdater":"' + dbUpdater + '", "dbUpdateTime":"' + dbUpdateTime + '", "dbNote":"' + dbNote + '"}';

    // alert(dbInfo);

    // 修改数据传递：通过数据绑定
    $('#sdbNo').text(dbNo);
    $('#sdbEnv').val(dbEnv);
    $('#sdbNameEng').val(dbNameEng);
    $('#sdbNameChs').val(dbNameChs);

    // 激活需要修改的基准库标示，并移除非激活项
    $('input[value="' + dbBenchmark + '"]').parent().addClass('active');
    if(dbBenchmark == 1){
      $('input[value="0"]').parent().removeClass('active');
    } else {
      $('input[value="1"]').parent().removeClass('active');
    }

    $('#sdbType').val(dbType);
    $('#sdbDriver').val(dbDriver);
    $('#sdbUrl').val(dbUrl);
    $('#sdbUser').val(dbUser);
    $('#sdbPass').val(dbPass);
    $('#sdbCreater').val(dbCreater);
    // $('#sdbCreateTime').val(dbCreateTime);
    $('#sdbUpdater').val(dbUpdater);
    // $('#sdbUpdateTime').val(dbUpdateTime);
    $('#sdbNote').val(dbNote);
    
    // 修改模态框的标题，作为新增或删除的判定标识
    $('#myModalLabel').text('修改数据库');
    $('#sdbCreater').attr('readonly', '');
});

// 新增/修改数据库信息
$("#databaseInfo").submit(function (event) {
    var dbNo = $("#sdbNo").text();
    var dbEnv = $("#sdbEnv").val();
    var dbNameEng = $("#sdbNameEng").val();
    var dbNameChs = $("#sdbNameChs").val();
    var dbBenchmark = $('.radio-inline.btn.btn-default.active > input').val();
    var dbType = $("#sdbType").val();
    var dbDriver = $("#sdbDriver").val();
    var dbUrl = $("#sdbUrl").val();
    var dbUser = $("#sdbUser").val();
    var dbPass = $("#sdbPass").val();
    var dbCreater = $("#sdbCreater").val();
    var dbUpdater = $("#sdbUpdater").val();
    var dbNote = $("#sdbNote").val();

    var dbInfo = '{"dbNo":"' + dbNo + '", "dbEnv":"' + dbEnv + '", "dbNameEng":"' + dbNameEng + '", "dbNameChs":"' + dbNameChs + '", "dbBenchmark":"' + dbBenchmark + '", "dbType":"' + dbType + '", "dbDriver":"' + dbDriver + '", "dbUrl":"' + dbUrl + '", "dbUser":"' + dbUser + '", "dbPass":"' + dbPass + '", "dbCreater":"' + dbCreater + '", "dbUpdater":"' + dbUpdater + '", "dbNote":"' + dbNote + '"}';

    // 获取模态框的标题，用于判定请求方法
    var modalLabel = $('#myModalLabel').text();

    var option = {
        url: "http://localhost:8083/db",
        type: "POST",
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
            window.location.reload();
        },
        complete: function (result) {
            //请求结束时
            console.log("请求结束：" + dbInfo);
            window.location.reload();
        },
        error: function (result) {
            //请求失败时
            alert("新增失败");
            window.location.reload();
        }
    };

    if (modalLabel == "修改数据库") {
        option.type = "PUT";
    }

    $.ajax(option);

    event.preventDefault();
});

// 删除数据库信息
$("#databaseList").on('click', "button[id='delete']", function (event) {
    var dbNo = $(this).parents("tr").find("#dbNo").text();
    var dbEnv = $(this).parents("tr").find("#dbEnv").text();
    var dbNameEng = $(this).parents("tr").find("#dbNameEng").text();
    var dbNameChs = $(this).parents("tr").find("#dbNameChs").text();
    var dbBenchmark = $(this).parents("tr").find("#dbBenchmark").text();
    var dbType = $(this).parents("tr").find("#dbType").text();
    var dbDriver = $(this).parents("tr").find("#dbDriver").text();
    var dbUrl = $(this).parents("tr").find("#dbUrl").text();
    var dbUser = $(this).parents("tr").find("#dbUser").text();
    var dbPass = $(this).parents("tr").find("#dbPass").text();
    var dbCreater = $(this).parents("tr").find("#dbCreater").text();
    var dbCreateTime = $(this).parents("tr").find("#dbCreateTime").text();
    var dbUpdater = $(this).parents("tr").find("#dbUpdater").text();
    var dbUpdateTime = $(this).parents("tr").find("#dbUpdateTime").text();
    var dbNote = $(this).parents("tr").find("#dbNote").text();

    var dbInfo = '{"dbNo":"' + dbNo + '", "dbEnv":"' + dbEnv + '", "dbNameEng":"' + dbNameEng + '", "dbNameChs":"' + dbNameChs + '", "dbBenchmark":"' + dbBenchmark + '", "dbType":"' + dbType + '", "dbDriver":"' + dbDriver + '", "dbUrl":"' + dbUrl + '", "dbUser":"' + dbUser + '", "dbPass":"' + dbPass + '", "dbCreater":"' + dbCreater + '", "dbCreateTime":"' + dbCreateTime + '", "dbUpdater":"' + dbUpdater + '", "dbUpdateTime":"' + dbUpdateTime + '", "dbNote":"' + dbNote + '"}';

    alert(dbInfo);

    $.ajax({
        url: "http://localhost:8083/db",
        type: "DELETE",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
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
            console.log("请求结束：" + dbInfo);
            window.location.reload();
        },
        error: function (result) {
            //请求失败时
            alert("删除失败");
            window.location.reload();
        }
    });
});

// 设置数据库为基准库
$("#databaseList").on('click', "button[id='setBenchmark']", function (event) {
    var dbNo = $(this).parents("tr").find("#dbNo").text();
    var dbEnv = $(this).parents("tr").find("#dbEnv").text();
    var dbNameEng = $(this).parents("tr").find("#dbNameEng").text();
    var dbNameChs = $(this).parents("tr").find("#dbNameChs").text();
    var dbBenchmark = 1;
    var dbType = $(this).parents("tr").find("#dbType").text();
    var dbDriver = $(this).parents("tr").find("#dbDriver").text();
    var dbUrl = $(this).parents("tr").find("#dbUrl").text();
    var dbUser = $(this).parents("tr").find("#dbUser").text();
    var dbPass = $(this).parents("tr").find("#dbPass").text();
    var dbCreater = $(this).parents("tr").find("#dbCreater").text();
    var dbCreateTime = $(this).parents("tr").find("#dbCreateTime").text();
    var dbUpdater = $(this).parents("tr").find("#dbUpdater").text();
    var dbUpdateTime = $(this).parents("tr").find("#dbUpdateTime").text();
    var dbNote = $(this).parents("tr").find("#dbNote").text();

    var dbInfo = '{"dbNo":"' + dbNo + '", "dbEnv":"' + dbEnv + '", "dbNameEng":"' + dbNameEng + '", "dbNameChs":"' + dbNameChs + '", "dbBenchmark":"' + dbBenchmark + '", "dbType":"' + dbType + '", "dbDriver":"' + dbDriver + '", "dbUrl":"' + dbUrl + '", "dbUser":"' + dbUser + '", "dbPass":"' + dbPass + '", "dbCreater":"' + dbCreater + '", "dbCreateTime":"' + dbCreateTime + '", "dbUpdater":"' + dbUpdater + '", "dbUpdateTime":"' + dbUpdateTime + '", "dbNote":"' + dbNote + '"}';

    alert(dbInfo);

    $.ajax({
        url: "http://localhost:8083/db/benchmark",
        type: "PUT",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
        cache: false, //false是不缓存，true为缓存
        async: true, //true为异步，false为同步
        beforeSend: function () {
            //请求前
        },
        success: function (result) {
            //请求成功时
            if (result > 0) {
                alert("基准库设置成功，请知悉！");
            } else {
                alert("基准库设置失败，请确认！");
            }
            window.location.reload();
        },
        complete: function (result) {
            //请求结束时
            console.log("请求结束：" + dbInfo);
            window.location.reload();
        },
        error: function (result) {
            //请求失败时
            alert("基准库设置失败，请确认！");
            window.location.reload();
        }
    });
});

// 查询
$("#search").click(function(){
    var s_env = $("#env").val();
    var s_eng = $("#eng").val();
    var s_chs = $("#chs").val();
    var s_benchmark = $("#benchmark").val();

    // 删除查询历史
    for (var i = $('tr#template').length - 1; i > 0; i--) {
        $('tr#template')[i].remove();
    }

    var dbInfo = {env:s_env, eng:s_eng, chs:s_chs, benchmark:s_benchmark};

    // console.log(JSON.stringify(dbInfo));

    option = {
        url: "http://localhost:8083/db",
        type: "GET",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
        crossDomain:true,
        cache: false, // false是不缓存，true为缓存
        async: true,  // true为异步，false为同步

        success: function(responseData){
            result = eval(responseData);

            if (result.length > 0) {
                $.each(result, function (i, n) {
                    var row = $("#template").clone();
                    row.removeClass('hide');

                    for (attribute in n) {
                        if (attribute == "dbBenchmark") {
                            row.find("#" + attribute).html(n[attribute] == 1 ? "基准库" : "比对库");
                        } else{
                            row.find("#" + attribute).html(n[attribute]);
                        }
                    }
                    
                    row.appendTo($("#databaseList tbody"));
                });
            } else {
                alert("未查询到相应的数据库信息，请知悉！");
            }
        }
    };

    $.ajax(option);
});