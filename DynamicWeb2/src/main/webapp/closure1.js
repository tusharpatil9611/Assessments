/**
 * Annonomous function example create closure
 */
 function addition(a){
    return function(y){
        return a+y;
    };
}
var first=addition(5);  //passing value to a
var second=addition(10);
console.log("5+15 = "+first(15));   // answer will be 20
console.log("10+30 = "+second(30)); // 40