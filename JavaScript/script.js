document.write("■■■問1■■■<br>");

function m(r){
    return("円の面積は"+r*r*3.14+"ｃ㎡です。<br>")
}
document.write(m(5));
document.write(m(7));
document.write(m(10));

document.write("■■■問2■■■<br>");

function total(adult,child){
    return(adult*500+child*200+"円です。<br>");
}
document.write(total(2,4));
document.write(total(1,5));
document.write(total(3,7));