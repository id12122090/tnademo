$(document).ready(function () {
	fire_ajax_submit();
});
function fire_ajax_submit() {

    $.ajax({
        type: "GET",
        url: "/api/adscampaigns",
        timeout: 600000,
        success: function (data) {

            var json = JSON.stringify(data, null, 4);
            $('#feedback').html('<pre>'+json+'</pre>');
            jPut.users.data=json;
            

        },
        error: function (e) {
            var json = e.responseText;
            $('#feedback').html(json);
        }
    });

}