// 查询
$("#search").click(function(){
    var s_eng = $("#eng").val();
    var s_status = $("#status").val();
    var s_env = $("#env").val();

    // 删除查询历史
    for (var i = $('tr#template').length - 1; i > 0; i--) {
        $('tr#template')[i].remove();
    }

    var dbInfo = {eng:s_eng, status:s_status, env:s_env};

    console.log(JSON.stringify(dbInfo));

    option = {
        url: "http://localhost:8083/db/compare",
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
                        if (attribute == "tblCompResult") {
                            row.find("#" + attribute).html(n[attribute] == "0" ? "成功" : "失败");
                        } else{
                            row.find("#" + attribute).html(n[attribute]);
                        }
                    }
                    
                    row.appendTo($("#datatable-keytable tbody"));
                });
            } else {
                alert("数据库当前无比对结果数据或未发现有差异。" );
            }
        }
    };

    $.ajax(option);
});


// 比对
$("#compare").click(function(){
    $("#compare").attr("disabled", true);
    $("#compare").attr("class", "btn btn-warning");

    var s_eng = $("#eng").val();

    var dbInfo = '{"eng":"' + s_eng + '"}';

    console.log(JSON.stringify(dbInfo));

    option = {
        url: "http://localhost:8083/db/compare",
        type: "POST",
        dataType: 'JSON',
        contentType: "application/json",
        data: dbInfo,
        crossDomain:true,
        cache: false, // false是不缓存，true为缓存
        async: true,  // true为异步，false为同步

        success: function(responseData){
            result = eval(responseData);

            if(result["code"] == 200200 && result["status"] == "ok") {
                alert(result["message"]);
            } else {
                alert("数据库比对发生异常，请检查！");
            }
        }
    };

    $.ajax(option);

    $("#compare").attr("disabled", false);
    $("#compare").attr("class", "btn btn-primary");
});
