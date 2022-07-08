// Atividade de Operadores
function igual(x,y){
    var a;
    (x==y) ?  a=console.log("Os numeros" ,x, "e" ,y,"sao iguais."): a=console.log("os numeros",x,"e" ,y, "sao diferentes.") ; 
    return a;
}

function soma(x,y){
    var b,c;
    b=x+y;
    (b>10 && b<20) ? c=console.log("Sua soma é",b," ,que é maior que 10 e menor que 20."): (b>10 && b>20) ? c=console.log("Sua soma é" ,b, "que é maior que 10 e maior que 20."): (b<10 && b<20) ? c=console.log("Sua soma é",b, "que é menor que 10 e menor que 20."): c=0;

    return c;
}




var num1=prompt ("Digite um numero ");
var num1=prompt ("Digite um numero ");
console.log(igual(num1,num2),soma(num1,num2));


