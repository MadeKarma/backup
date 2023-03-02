var s = '';
// for (var i = 0; i < 7; i++) {
//     for (var j = 0; j < i; j++) {
//         s += '*'
//     }
//     s += '\n'
// }
for (var i = 4; i > 0; i--) {
    for (var j = 0; j < i; j++) {
        s += '#';
    }
    if (i != even){
        s += '\n'
    }    
}
for (var q = 0; q <= 4; q++) {
    for (var w = 0; w < q; w++) {
        s += '#';
    }
    s += '\t'
    s += '\n'
}
console.log(s)