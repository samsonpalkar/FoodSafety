/**
 * Created by samson.palkar on 2/21/2017.
 */
function loadForm(formName) {
    //window.location.href  = formName;
    $.ajax({
        type: 'GET',
        async: false,
        contentType: 'application/json',
        //dataType: 'json',
        url: formName,
        success: function(data, textStatus, jqXHR) {
            //window.location.replace(formName);
            console.log(jqXHR);
        },
        error: function(data, textStatus, jqXHR) {
            //window.location.href = formName;
            console.log(jqXHR);
        }
    });

}