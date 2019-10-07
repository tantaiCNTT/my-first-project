
function result() {
  var getTextArea = document.getElementById("input_1");
  var getTextField = document.getElementById("input_2");
  var str1 = getTextArea.value;
  var str2 = getTextField.value;
  console.log(str1);
  var tmp;
       if(str1 == "" || str2 =="") {
          tmp ="Please input data!";
       }
      tmp = "Số lần xuất hiện: "+checkStr(str1,str2);
  alert(tmp);

}
function  checkStr(s1, s2) {
    var  l1 ,l2;
    if(s1 == null) {
        return 0 ;
    }
    else {
        var arr1 = s1.split(" ");
        var arr2 = s2.split(" ");
        console.log(arr1);
        l1 = arr1.length;
        l2 = arr2.length;
        var array = [];

        while (l1 >= l2) {
            var tmp = new Array(l2);
            for (let i = 0; i < l2; i++) {
                tmp[i] = arr1[i];
            }
            array.push(tmp);
            arr1.splice(0, 1);
            l1 = arr1.length;
        }
        var size = array.length;
        var count = 0;
        for (let i = 0; i < size; i++) {
            var tmp = [];
            tmp = array[i];
            if (checkWithSameSize(tmp, arr2)) {
                count++;
            }
        }
    }
     return count;
}
function  checkWithSameSize(arr1, arr2) {
    for( let i = 0 ; i < arr1.length; i++) {
        if( arr1[i] != arr2[i] ) {
            return false;
        }
    }
  return true;
}
result();