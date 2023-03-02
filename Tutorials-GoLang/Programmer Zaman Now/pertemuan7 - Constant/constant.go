package main

import "fmt"

func main() {
	// Penulisan constant

	// pertama
	// const firstname string = "Made"
	// const lastname = "Karma"
	// const value = 1000

	// Kedua
	const (
		firstname string = "Made"
		lastname         = "Karma"
		value            = 1000
	)

	// // error
	// firstname = "Tidak Bisa Diubah"
	// lastname = "Tidak Bisa Diubah"

	fmt.Println(firstname)
	fmt.Println(lastname)
	fmt.Println(value)
}
