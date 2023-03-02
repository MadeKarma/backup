var tanya = true
while (tanya) {
// menangkap pilihan player
var p = prompt('Pilih : Gajah, Semut, Orang');

// menangkap pilihan computer
// membangkitkan bilangan random
var comp = Math.random();

if (comp < 0.34){
    comp = 'gajah'
} else if (comp >= 0.34 && comp < 0.67){
    comp = 'orang'
} else {
    comp = 'semut'
}
var hasil = ''
// menentukan rules
if (p == comp){
    hasil = 'seri'
} else if (p == 'gajah'){
    // if (comp == 'orang'){
    //     hasil = 'menang'
    // } else {
    //     hasil = 'kalah'
    // }
    hasil = (comp == 'orang') ? 'menang' : 'kalah';
} else if (p == 'orang'){
    hasil = (comp == 'gajah') ? 'kalah' : 'menang';
} else if (p == 'semut'){
    hasil = (comp == 'orang') ? 'kalah' : 'menang';
} else {
    hasil = 'Memasukan pilihan yang salah'
}
// tampilkan hasilnya
alert('Kamu memilih : '+ p +' dan Komputer memlih : '+ comp + '\nMaka hasilnya : Kamu '+ hasil)
tanya = confirm('lagi?')
}