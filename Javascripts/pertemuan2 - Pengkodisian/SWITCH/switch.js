// var angka = prompt('masukan angka : ');

// switch( angka ) {
//     case '1' :
//         alert('anda memamsukan angka 1');
//     break;
//     case '2' :
//         alert('anda memamsukan angka 2');
//     break;
//     case '3' :
//         alert('anda memamsukan angka 3');
//     break;
//     default :
//         alert('yang anda masukan bukan angka')
// }

var item = prompt('masukan nama makanan / minuman : \n (cth: nasi, daging, susu, hamburger, softdrink');

switch ( item ) {
    case 'nasi' :
    case 'daging' :
    case 'susu' :
        alert('makanan / minuman SEHAT');
        break;
    case 'hamburger' :
    case 'softdrink' :
        alert('makanan / minuman TIDAK SEHAT');
        break;
    default :
        alert('yang anda masukan yang salah');
        break;
}