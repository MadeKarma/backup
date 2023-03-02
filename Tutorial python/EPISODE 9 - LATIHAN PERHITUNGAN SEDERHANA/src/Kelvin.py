# Latihan konversi satuan temperature

# program konversi celcius ke satuan lain

print("\nPROGRAM KONVERSI TEMPERATUR\n")

kelvin = float(input("Masukan suhu dalam kelvin : "))
print("suhu adalah ",kelvin, "Kelvin")

# celcius
celcius = kelvin - 273
print("Suhu dalam celcius adalah ",celcius, "Celcius")

# reamur
reamur = (kelvin - 273) * 4/5
print("Suhu dalam reamur adalah ",reamur, "Reamur")

# farenheit
farenheit = ((kelvin - 273) * 9 / 5) + 32
print("Suhu dalam farenheit adalah ",farenheit, "Farenheit")