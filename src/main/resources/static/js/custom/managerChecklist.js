/**
 * Created by samson.palkar on 2/21/2017.
 */
function loadForm(formName) {
    $.ajax({
        type: 'GET',
        async: false,
        dataType: 'text',
        url: baseHref() + formName,
        success: function(data, status){
            console.log(data);
            window.location.href = baseHref() + formName;
            console.log(data);
        }
    });
}