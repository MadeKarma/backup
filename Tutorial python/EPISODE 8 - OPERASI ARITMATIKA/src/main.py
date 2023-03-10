# Operasi aritmatika

a = 10
b = 3

#operasi tambah +
hasil = a + b
print(a,'+',b,'=',hasil)

#operasi pengurangan -
hasil = a - b
print(a,'-',b,'=',hasil)

#operasi perkalian *
hasil = a * b
print(a,'*',b,'=',hasil)

#operasi pembagian /
hasil = a / b
print(a,'/',b,'=',hasil)

#operasi eksponen (pangkat) **
hasil = a ** b
print(a,'**',b,'=',hasil)

#operasi modulus (sisa pembagian) %
hasil = a % b
print(a,'%',b,'=',hasil)

#operasi floor division //
hasil = a // b
print(a,'//',b,'=',hasil)

# prioritas operasi, operational precedence

x = 3
y = 2
z = 4

hasil = x ** y * z + x / y - y % z // x
print(x,"**",y,"*",z,"+",x,"/",y,"-",y,"%",z,"//",x, "=", hasil)

# urutan operasi
# ( )
# eksponen
# perkalian dan teman teman * / **
# pertambahan dan pengurangan 

hasil = x + y * z
print(x,"+",y,"*",z,"=",hasil)
# kurung akan mengambil langkah paling pertama
hasil = (x + y) * z
print("(",x,"+",y,")","*",z,"=",hasil)