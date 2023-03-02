package main

import (
	"fmt"
	// "strings"
	"sort"
)

func main() {
	// greeting := "hello there firends!"

	// fmt.Println(strings.Contains(greeting, "Holla!"))
	// fmt.Println(strings.ReplaceAll(greeting, "Holla", "Hai"))
	// fmt.Println(strings.ToUpper(greeting))
	// fmt.Println(strings.Index(greeting, "th"))
	// fmt.Println(strings.Split(greeting, " "))

	// the original value is unchanged
	// fmt.Println("original string value:", greeting)

	ages := []int{45, 20, 35, 30, 75, 60, 50, 25}
	// disorting dari terkecil ke terbesar
	sort.Ints(ages)
	fmt.Println(ages)

	index := sort.SearchInts(ages, 30)
	fmt.Println(index)

	names := []string{"Made", "Chamber", "Sova", "Mario"}

	sort.Strings(names)
	fmt.Println(names)

	fmt.Println(sort.SearchStrings(names, "Sova"))
}
