function showView() {
    var input_a = document.getElementById('a');
    var input_b= document.getElementById('b');
    var input_c = document.getElementById('c');
    var view_equation = document.getElementById('view');
    var view_result = document.getElementById('result');
    var a, b, c;
    var formatEquation;
    a = input_a.value;
    b = input_b.value;
    c = input_c.value;
    if( a == 1) {
        a = "";
    }
    formatEquation = a+"x"+"^2"+" + "+b+"x "+"+ "+c+" = "+ 0;
    view_equation.value = formatEquation;
    view_result.value = result(a, b, c);

}
function result(a ,b ,c ) {
    var delta, x1, x2, tmp ="";
    if( a == 0) {
        x1 = (-c) / b;
        tmp = "x= "+x1;
    } else {
           delta = b*b - 4*a*c;
           if(delta > 0) {
               x1 = (-b - Math.sqrt(delta))/ 2*a;
               x2 = (-b + Math.sqrt(delta))/ 2*a;
               tmp ="x1 = "+ x1 +"," +"x2 = "+ x2;
           } else if(delta < 0) {
               tmp ="Phương trình vô nghiệm!"
           } else if( delta == 0) {
               x1 = x2 = (-b)/ 2*a;
               tmp = "x1 = x2 ="+ x1;
           }
    }
    return tmp;
}