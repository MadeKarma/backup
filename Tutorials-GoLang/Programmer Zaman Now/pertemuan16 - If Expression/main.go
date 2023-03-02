package main

import "fmt"

func main() {
	var name = "budi"

	if name == "Made" {
		fmt.Println("Hai Made")
	} else if name == "karma" {
		fmt.Println("Hai Karma")
	} else if name == "budi" {
		fmt.Println("Hai budi")
	} else {
		fmt.Println("Hi, programmer cerdas")
	}

	if length := len(name); length > 5 {
		fmt.Println("Terlalu panjang")
	} else {
		fmt.Println("Nama sudah benar")
	}
}
