//
// function  checkInputUserName() {
//  var getUser = document.getElementById('user');
//  var userName = getUser.value;
//  var getDivUser = document.getElementById('content_user');
//  var getPassword = document.getElementById('password');
//  var getDivPass = document.getElementById('content_password');
//  var password = getPassword.value;
//  if(userName =="" ){
//      var p1 = document.createElement('P');
//      p1.innerText="Please input user name!";
//      p1.style.color = 'red';
//      p1.style.marginLeft = '20px';
//      p1.style.fontSize ='12px';
//      getDivUser.appendChild(p1);
//  }
//  if(password=="") {
//      var p2= document.createElement('P');
//      p2.innerText="Please input password!";
//      p2.style.color = 'red';
//      p2.style.marginLeft = '20px';
//      p2.style.fontSize ='12px';
//      getDivPass.appendChild(p2);
//  }
//  if(password !=""){
//      var array = ['.','!','@','#','$','%','^','&','*','(',')','_','+','-','='];
//      var l1 = password.length;
//      var l2 = array.length;
//      var flag = false;
//       for( let i = 0; i < l1; i++) {
//           for( let j = 0 ; i < l2; j++) {
//                if(password[i] == array[i]) {
//                    flag = true;
//                    break;
//                }
//
//           }
//       }
//       if(flag == true) {
//           var p3 = document.createElement('P');
//           p3.innerText="Password cannot contain special characters!";
//           p3.style.color = 'red';
//           p3.style.marginLeft = '20px';
//           p3.style.fontSize ='12px';
//           getDivPass.appendChild(p3);
//
//       }
//
//
//  }
// }
function checkContain(character1, arr) {
    var flag = false;
    var l = arr.length;
    for( let i = 0; i < l ; i++ ) {
        if( character1 == arr[i]) {
            flag = true;

        }
    }

}
var str = '.';
var arr = ['.','!','@','#','$','%','^','&','*','(',')','_','+','-','='];
console.log(checkContain(str,arr));

