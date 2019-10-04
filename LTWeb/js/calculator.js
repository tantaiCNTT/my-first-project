
function getNum(num) {
    var  input_var = document.getElementById("textview");
    switch (num) {
        case '0':
            input_var.value+= '0';
            break
        case '1':
            input_var.value+= '1';
            break;
        case '2':
            input_var.value+= '2';
            break;
        case '3':
            input_var.value+= '3';
            break;
        case '4':
            input_var.value+= '4';
            break;
        case '5':
            input_var.value+= '5';
            break;
        case '6':
            input_var.value+= '6';
            break;
        case '7':
            input_var.value+= '7';
            break;
        case '8':
            input_var.value+= '8';
            break
        case '9':
            input_var.value+= '9';
            break;
    }
}
function getOperation( operator) {
    var  input_var = document.getElementById("textview");
    var str = input_var.value;
    var l = str.length;
    var tmp = str[l - 1];
    switch (operator) {
        case '+' :
                if( tmp!= '/') {
                    input_var.value += '+';
                }
                break;
        case '-' :
                if( tmp!= '*' && tmp!= '/') {
                    input_var.value += '-';
                }
                break;
        case '*' :
                 if( tmp!= '/'&& tmp!= '+' && tmp!= '-' && tmp!= '*' && l!= 0) {
                    input_var.value += '*';
            }
                break;
        case '/':
                if( tmp!= '-' && tmp!= '+' && tmp!= '-'  && tmp!='/' && l!= 0) {
                    input_var.value += '/';
                }
                break;
        case '.':
                if( tmp!= '.') {
                    input_var.value += '.';

                }
                break;
        case '(':
                input_var.value += '(';
                break;
        case ')':
                if(l != 0 && checkErro(str)) {
                    input_var.value += ')';
                }
            break;
    }
}
function resest() {
    var  input_var = document.getElementById("textview");
    input_var.value="";
}
function back() {
    var  input_var = document.getElementById("textview");
    input_var.value = input_var.value.substring(0, input_var.value.length - 1);

}
function countCharToFind(str, charactor) {
    var l = str.length;
    var count = 0;
    for( let i = 0; i < l; i++) {
        if( str[i]== charactor) {
            count++;
        }
    }
    return count;
}
function addBackets(str,char, numberOfCharEnter) {
    var num = numberOfCharEnter ;
    var i = 0;
        while(i < num) {
                str += char;
                i++;
    }
        return str;
}
function checkErro(str) {
    var  input_var = document.getElementById("textview");
    var value_text = input_var.value;
    var numOpen = countCharToFind(value_text,'(');
    var numClose = countCharToFind(value_text,')');
         if(numOpen > numClose) {
             return true;
         }
}
function equal() {
    var  input_var = document.getElementById("textview");
    var value_text = input_var.value;
    var numOpen = countCharToFind(value_text,'(');
    var numClose = countCharToFind(value_text,')');
    var tmp = numOpen - numClose;

        if(value_text) {
            var str = addBackets(value_text,')',tmp);
            console.log('Fix Last'+": "+str);
            input_var.value = eval(str);
            }

}



