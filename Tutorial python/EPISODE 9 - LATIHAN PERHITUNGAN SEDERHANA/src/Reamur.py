# Latihan konversi satuan temperature

# program konversi celcius ke satuan lain

print("\nPROGRAM KONVERSI TEMPERATUR\n")

reamur = float(input("Masukan suhu dalam Reamur : "))
print("suhu adalah ",reamur, "Reamur")

# Fahrenheit
farenheit = (reamur * 9 /4) + 32
print("Suhu dalam farenheit adalah ",farenheit, "Fahrenheit")

# Celcius
celcius = reamur * 5 / 4
print("Suhu dalam celcius adalah ",celcius, "Celcius")

# kelvin
kelvin = (reamur * 5 / 4) + 273
print("Suhu dalam kelvin adalah ",kelvin, "Kelvin")