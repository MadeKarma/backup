package main

import "fmt"

func main() {
	age := 16
	name := "Chamber"
	fmt.Print("Hello, ")
	fmt.Print("World! \n")
	fmt.Print("new Line \n")

	// Println
	fmt.Println("hello ninjas!")
	fmt.Println("goodbye ninjas!")
	fmt.Println("umur saya", age, "dan nama saya", name)

	// Printf (formatted strings) %_ = format specifier
	fmt.Printf("umur saya %v dan nama saya %v \n", age, name)
	fmt.Printf("umur saya %q dan nama saya %q \n", age, name)
	fmt.Printf("age is of type %T", age)
	fmt.Printf("you score %f points! \n", 255.55)
	fmt.Printf("you score %0.1f points! \n", 255.55)

	// Sprintf (save formatted strings)
	var str = fmt.Sprintf("umur saya %v dan nama saya %v \n", age, name)
	fmt.Println("the saved string is:", str)
}
