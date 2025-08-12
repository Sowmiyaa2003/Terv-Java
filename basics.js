/*let String="priya";                         /*basics using datatype*/
console.log(String);*/ //priya
/*var a="boolean";
console.log(a); */  //boolean
//number
/*let num=42;
console.log(num);*/ //42
//constant
/*const a=3.14;
console.log(a);*/   //3.14
//boolean use panni undefined
/*let boolean;
console.log(boolean);*/ //undefined
/*let a=null;
console.log(a); */ //null
/*
let y=BigInt(999999999999)
console.log(y)*/  //999999999999n
/*let x=10;
let y=20;
console.log(x==y)*/ //false
/*let object={name:"abc"}
console.log(object)*/ //abc
/*let arr=[10,20,30]
console.log(arr)  */ //[ 10, 20, 30] 
/*let sym=Symbol("id");
console.log(sym);   */ //Symbol(id)
/*
let obj={name:"xyz",
   g:function(){
    console.log("function datatype");
}
};
obj.g();*/     //function datatype
/*
let a=`hello `; //backticks use pannirukom
console.log(a); */
/*                                       
                      //operators
console.log(0=='0')  //true(== is loose it checks only the value)
console.log(0!='0')   //false(!= 0 is not equal to 0 false)
console.log(0==='0')  //false(=== is strict checks both value and datatype)
console.log(0!=='0') //true(!== is strict 0 is number but '0'is a string so both are not equal answer is true)*/
/*console.log(5**2) //exponent is taken as **
a=20
b=10
console.log(a+b) //
console.log(a-b)
console.log(a*b)
console.log(a/b)
console.log(a**b)
console.log(a%b)
console.log(a=b)
console.log(a+=b)
console.log(a-=b)
console.log(a>b)
console.log(a>=b)
console.log(a<b)
console.log(a<=b)
console.log(a!=b)
console.log(a>b)?true:false
console.log(0&&null)//0
console.log(null&&0)//null
console.log(0&&10)//0
console.log(10&&0)//0
console.log(0&&0)//0  */
/*a=20
b=10
console.log(a=b)//10
console.log(a>b)//false*/
//questions 1
let x="5";
let y=2;
console.log(x+y) //52
console.log(x-y) //3
//questions 2
let value=null;
console.log(typeof value) //oject
let str="javascript"
console.log(str.charAt(4))  //s
console.log(str.includes("script")); //true
console.log(str.slice(0,4)) //java
//questions 3
var string="Students"
let a=2025.
console.log(`Hello,`+` `+string+`!`+ `You are learning JavaScript in`+` ` +a)//Hello Students!You are learning JavaScript in 2025.( //this is done on using " ",' ',` ` is possible)
//questions 4(using backticks)
var String="Students"
let c=2025;
let b=`Hello, ${String}! you are learning JavaScript in ${c}.`           //(backticks only possible using $ others two not possible)
console.log(b)////Hello, Students! you are learning JavaScript in 2025.
//questions 5
console.log(10/0)//infinity
console.log("10"*2)//20
console.log("Hello"*2)//NaN(not a number)
//questions 6
