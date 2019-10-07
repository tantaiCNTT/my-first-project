function move() {
    var date = new Date();
    var seconds = date.getSeconds();
    var getImg = document.getElementById('img-center');
    var tmp = document.getElementById('container');
    var letter ="0123456789ABCDF";
    var color="#";
    for( let i = 0; i < 6; i++) {
        color+= letter[Math.floor((Math.random())*16)];
    }
    if(seconds % 2 == 0) {
        getImg.style.transform ="rotate(" + seconds*12 +"deg)";
        tmp.style.backgroundColor = color;

     console.log(seconds);
    }
    setTimeout(move,1000);

}
move();