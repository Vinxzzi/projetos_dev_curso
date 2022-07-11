 /*const valor={
    par:2,
 }
 function numsPares(arr,thisArg){
    return arr.filter(function(item){
        return item % this.par==0;

    } ,thisArg);
 }

 const nums=[2,3,5,6,8,11,12,14];

 let numP=numsPares(nums,valor);

 console.log('As variaveis pares sao:', numP);*/

 function numsPares(arr){
    return arr.filter(function(item){
        return item %2===0;

    })
 }
 const nums=[2,3,5,6,8,11,12,14];
 console.log(numsPares(nums));

