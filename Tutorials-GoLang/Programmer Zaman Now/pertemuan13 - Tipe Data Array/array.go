package main

import "fmt"

func main() {
	var names [3]string

	names[0] = "Made"
	names[1] = "Dwi"
	names[2] = "Karma"

	fmt.Println(names[0])
	fmt.Println(names[1])
	fmt.Println(names[2])

	var values = [3]int{
		98,
		95,
		88,
	}
	fmt.Println(values)
	fmt.Println(values[0])
	fmt.Println(values[1])
	fmt.Println(values[2])

	fmt.Println(len(names))
	fmt.Println(len(values))
}
