var jmlAngkot = 10,
   angkotBeroperasi = 6,
   noAngkot = 1;

while ( noAngkot <= angkotBeroperasi ) {
   console.log('Angkot No. ' + noAngkot + ' beroprasi dengan baik.');
noAngkot++;
}
for ( noAngkot = angkotBeroperasi + 1; noAngkot <= jmlAngkot; noAngkot++) {
   console.log('Angkot No. ' + noAngkot + ' sedang tidak beroperasi.');
}