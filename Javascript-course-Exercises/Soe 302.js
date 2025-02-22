
let Minus =  1;
let Minusplus =  2;
let Nom =  5;
let Maximumminus =  9;
let Maximum = 10;


let a = Number(prompt("Enter a number:"));
let b = Number(prompt("Enter a number:"));
let c = Number(prompt("Enter a number:"));


let Output = "";
if(a == Nom && b == Nom && c == Minus || Minusplus || Maximumminus) {
  Output = "Isosceles Traingle";
  console.log(Output);
}

else if(a == Minus || Minusplus || Maximumminus && b == Nom && c == Nom) {
  Output = "Isosceles Triangle";
  console.log(Output);
}

else if(a == Nom & b == Nom & c == Nom){
  Output = "Equilateral Triangle";
  console.log(Output);
}

else if(a == Minus & b == Nom & c == Maximumminus ){
  Output = "Scalene Triangle";
  console.log(Output);
}


else if(a == Minus & b == Maximumminus & c == Nom ){
  Output = "Scalene Triangle";
  console.log(Output);
}

else if(a == Minusplus & b == Nom & c == Maximumminus){
  Output = "Scalene Triangle";
  console.log(Output);
}

else if(a == Minusplus & b == Maximumminus & c == Nom){
  Output = "Scalene Triangle";
  console.log(Output);
}

else if(a == Nom & b == Minusplus & c == Maximumminus){
  Output = "Scalene Triangle";
  console.log(Output);
}


else if(a == Nom & b == Maximumminus & c == Minusplus){
  Output = "Scalene Triangle";
  console.log(Output);
}

else if(a == Maximum || b == Maximum || c == Maximum){
  Output = "Not a Triangle";
  console.log(Output);
}
