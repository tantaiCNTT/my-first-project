function getContent() {
    var tmp1 = document.getElementById('input_a');
    var tmp2 = document.getElementById("input_b");
    var tmp3 = document.getElementById("input_c");
    var tmp4 = document.getElementById("view_equation");
    var tmp5 =document.getElementById("result");
    var a = tmp1.value;
    var b = tmp2.value;
    var c = tmp3.value;
    if(a ==1) {
        a="";
    }
    tmp4.value = a+"x^2" +" + "+ b+"x" +" + "+ c +" = " + 0;
    tmp5.value = result(a,b,c);

}
function result(a, b, c) {
    var x1, x2, delta, result;
     if( a == 0) {
         x1 = (-c)/b;
         result ="x"+ "="+x1;
     } else {
         delta = b*b - 4*a*c;
          if(delta < 0) {
              result ="PT vô nghiệm!"
          } else if(delta > 0) {
              x1 = (-b -Math.sqrt(delta)/ 2*a);
              x2 = (-b +Math.sqrt(delta)/ 2*a);
              result ="x1= "+x1+","+"x2" + "= " +x2;
          } else if(delta == 0) {
              x1 = x2 = -b / 2*a;
              result="x1 = x2 = " + x1;
          }
     }
     return result;
}



