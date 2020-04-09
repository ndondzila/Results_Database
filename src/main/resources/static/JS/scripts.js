function birthDateCal(){

    var date = new Date();
    var cYear = date.getFullYear();
    var cMonth = date.getMonth();
    var cDate = date.getDate();

    $('#birthDate').datepicker({
        changeMonth:true,
        changeYear:true,
        yearRange: "c-100:c",
        maxDate: new Date(cYear, cMonth, cDate)
    });

}




function loadMeets (){
var ourRequest = new XMLHttpRequest();
ourRequest.open('GET', '/data');
ourRequest.onload = function(){
    var meetData = JSON.parse(ourRequest.responseText);
    renderHTML(meetData);
};
ourRequest.send();
}

function renderHTML(data){
    $("#nationalMeetList").empty();
    for(var i = 0; i < data.length; i++){
    $("#nationalMeetList").prepend("<a href='" + data[i].resultURL + "'><h5>" + data[i].name + "</h5>");
        console.log('function was called');
    }
    }