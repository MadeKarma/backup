package main

import "fmt"

func main() {
	name := "Made"

	switch name {
	case "Made":
		fmt.Println("Halo Made")
	case "Joko":
		fmt.Println("Halo Joko")
	default:
		fmt.Println("Kenalan donk")
	}
}
