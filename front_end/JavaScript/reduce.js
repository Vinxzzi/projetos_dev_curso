// function somaNumeros(arr){
//     return arr.reduce(function(prev, current){
//         return prev + current;
//     }, 2);

// }

// const arr=[1,2];
// console.log(somaNumeros(arr));

function precosList(arr){
    return arr.reduce(function(prev,current){
        console.log({prev});
        console.log({current},'\n');
        
        return prev - current;
    }, 50)
}
const nums=[5,5,31,10];

if(precosList(nums)<0){
    let result=0;
    console.log('o saldo e de :',result);

}
console.log('o saldo e de :',precosList(nums));


