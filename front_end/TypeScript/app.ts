let button= document.getElementById("button")
let input1= document.getElementById("input1")
let input2= document.getElementById("input2")

function adicionarNumero(n1:number, n2:number, devPrintar:boolean, frase:String){
   let  resultado= n1+n2;
    if(devPrintar){
        console.log(frase+ resultado);
    }
    return n1+n2
}

let devPrintar=true;
let frase= "O valor e: "

if(button){
    button.addEventListener("click" ()=>{
        if(input && input){
           console.log ( adicionarNumero( Number (input1.value), Number (input2.value), devPrintar, frase))
        }
})
}
