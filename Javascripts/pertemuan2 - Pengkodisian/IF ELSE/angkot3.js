var jmlAngkot = 10,
   angkotBeroperasi = 6;

for ( var noAngkot = 1; noAngkot <= jmlAngkot; noAngkot++ ) {

   if ( noAngkot <= 6 ) {
      console.log('Angkot No. ' + noAngkot + ' beroprasi dengan baik.');
   } else {
      console.log('Angkot No. ' + noAngkot + ' sedang tidak beroperasi.');
   }
}