function randomButton() {
    var arr1 = [];
    var arr2 = [];
    for( let i = 0; i < 64; i++) {
        arr1[i] = i+1;
    }
     var l = 0;
     while( l < 64 ){
         var r = Math.floor((Math.random()*64)+1);
         for( var i = 0; i < arr1.length; i++) {
             if( arr1[i] == r) {
                 arr2[l] = arr1[i];
                 arr1.splice(i,1);
                 l++;
             }
         }
     }
     return arr2;
}
function createButton() {
    var arr = randomButton();
    var count = 0;
    var getContairn = document.getElementById("container-button");
    while (count < 64) {
        var button = document.createElement("button");
        var id_button = count;
        button.setAttribute('id',id_button);
        var text_name ="";
        var id= count;
        text_name = arr[count];
        button.value = text_name;
        button.innerHTML=text_name;
        getContairn.appendChild(button);
        count++;


    }

    // add onclick for all button
    var children = getContairn.children;
    for( let i = 0; i < 64; i++) {
        children[i].addEventListener("click", function () {
            var input = children[i].textContent;
            if(checkMin(input,arr)) {
                children[i].style.visibility ="hidden";

                        arr.splice(0,1);
            } else {
                alert("It is'nt smallest!")
            }

        })
    }









}


function checkMin(input, arr) {
    arr.sort( function (a, b) {
        return a - b;
    });
    if(input == arr[0]) {

        return true;
    }

    return false;
}
randomButton();

