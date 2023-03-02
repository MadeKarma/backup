package main

import (
	"fmt"
)

func main() {
	var (
		ujian   = 88
		absensi = 88

		lulusUjian   = ujian > 88
		lulusAbsensi = absensi > 88

		lulus = lulusAbsensi && lulusUjian
	)
	fmt.Println(lulus)
	fmt.Println(ujian > 88 && absensi > 88)
}
