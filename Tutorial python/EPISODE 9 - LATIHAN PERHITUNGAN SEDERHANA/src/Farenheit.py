# Latihan konversi satuan temperature

# program konversi celcius ke satuan lain

print("\nPROGRAM KONVERSI TEMPERATUR\n")

farenheit = float(input("Masukan suhu dalam Farenheit : "))
print("suhu adalah ",farenheit, "Fahrenheit")

# celcius
celcius = (farenheit - 32) * 5 / 9
print("Suhu dalam celcius adalah ",celcius, "Celcius")

# reamur
reamur = (farenheit - 32) * 4 / 9
print("Suhu dalam reamur adalah ",reamur, "Reamur")

# kelvin
kelvin = ((farenheit - 32) * 5/9) + 273
print("Suhu dalam kelvin adalah ",kelvin, "Kelvin")