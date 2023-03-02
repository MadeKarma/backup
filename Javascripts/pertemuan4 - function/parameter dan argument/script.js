function tambah(a, b) {
    return a + b
}
// bisa begini
// var a = parseInt(prompt('masukan nilai pertama'))
// var b = parseInt(prompt('masukan nilai kedua'))
// var hasil = tambah(a, b)
// alert(hasil)
// // atau begini
// alert(tambah(2, 3))

function kali(a,b){
    return a*b
}
var hasil = kali(tambah(1,2), tambah(3,4))
console.log(hasil)
