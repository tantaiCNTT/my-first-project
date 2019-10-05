
function updateClock ( ) {
    var currentTime = new Date();
    var hours = currentTime.getHours();
    var minutes = currentTime.getMinutes();
    var seconds = currentTime.getSeconds();
    var time;
    if(seconds < 10) {
        seconds = "0"+ seconds;
    }
    if(minutes < 10) {
        minutes = "0"+ minutes;
    }
    time =hours+": "+minutes+": "+seconds;
    document.getElementById('clock').innerHTML = time;
    setTimeout(updateClock,1000);
}
updateClock();





