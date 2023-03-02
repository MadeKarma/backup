package main

import (
	"fmt"
)

func main() {
	person := make(map[string]string)
	person["name"] = "Made"
	person["address"] = "Bali"
	person["title"] = "Programmer"

	fmt.Println(person)
	fmt.Println(person["name"])
	fmt.Println(person["address"])

	buku := make(map[string]string)
	buku["title"] = "Belajar Go-Lang"
	buku["Author"] = "Made Karma"
	buku["ups"] = "salah"
	fmt.Println(buku)
	fmt.Println(len(buku))

	delete(buku, "ups")

	fmt.Println(buku)
	fmt.Println(len(buku))
}
