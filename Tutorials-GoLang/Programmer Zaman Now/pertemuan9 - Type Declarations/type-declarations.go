package main

import "fmt"

func main() {
	type NoKTP string
	type Married bool

	var NoKtpMade NoKTP = "18741982741897419874"
	var marriedStatus Married = true
	fmt.Println(NoKtpMade)
	fmt.Println(marriedStatus)
}
