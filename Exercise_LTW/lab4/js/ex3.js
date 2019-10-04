
function addGeeting() {
    var arr = ['Hello World', 'Hello Person', 'Nice to meet you', 'Good morning'];
    var index = Math.floor(Math.random()*4);
    var tmp = arr[index];
    var p_tag = document.createElement("P");
    p_tag.innerText = tmp;
    document.getElementById('content').appendChild(p_tag);
    
}