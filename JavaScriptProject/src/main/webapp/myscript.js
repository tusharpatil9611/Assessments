window.alert("This is an External javaScript");
var x=10;
let y=15;
const z=x+y;
document.writeln("Value of X : "+x);
document.writeln("Value of Y : "+y);
document.writeln("Value of Z : "+z);
while(x<20){
    document.writeln("Printing Value X "+x);
    x++;
}
do{
    document.writeln("Printing Value X "+x);
    x++;
}while(x<30);
/* This is comment*/
// document.writeln("Tarkeshwar" + x)
for(;x<50;x++){
    document.writeln("Tarkeshwar" + x)
}
function addition(a,b){
    return a+b
}
function subtraction(a,b){
    return a-b
}    
document.writeln("Subtration of "+x+" and "+y+" : "+subtraction(x,y));
var name =prompt("Type Your Identity");
document.writeln("Your identity is "+name);