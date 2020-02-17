$(function() {
    var shopId = getQueryString('shopId');
    var shopInfoUrl = '/o2o/shopadmin/getshopmanagementinfo?shopId=' + shopId;
    //会在controller中调用shopInfoUrl对应的相关方法，并得到JSON形式的返回值
    $.getJSON(shopInfoUrl, function(data) {
        if (data.redirect) {
            //若URL不包含shopID,则页面自动跳转
            window.location.href = data.url;
        } else {
            if (data.shopId !== undefined && data.shopId != null) {
                shopId = data.shopId;
            }
            $('#shopInfo')
                .attr('href', '/o2o/shopadmin/shopoperation?shopId=' + shopId);
        }
    });
});