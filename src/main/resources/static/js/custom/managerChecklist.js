/**
 * Created by samson.palkar on 2/21/2017.
 */
function loadForm(formName) {
    var url = baseURL();
    $.ajax({
        type: 'GET',
        async: false,
        dataType: 'text',
        url: url + formName,
        success: function(data, status){
            console.log(data);
            window.location.href = baseURL() + formName;
            console.log(data);
        }
    });
}