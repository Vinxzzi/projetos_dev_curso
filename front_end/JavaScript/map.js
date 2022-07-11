//LIstas (MAP)

/*const maca={
    value:2,

}
const orange={
    value:3,
}


function mapComThis(arr,thisArg){
    return arr.map(function(item){
        return item * this.value;

    }, thisArg);
}
const nums=[1,2];

console.log( 'this->maca',mapComThis(nums,maca));
console.log('this->orange', mapComThis(nums, orange));*/

function mapSemThis(arr){
    return arr.map(function(item){
        return item*3;
    });
}

const nums=[1,2,3];
let result=mapSemThis(nums);
console.log('O resultado é:',result,'!! \n É o arry original é:',nums, '.');