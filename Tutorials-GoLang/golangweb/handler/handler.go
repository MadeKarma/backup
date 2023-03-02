package handler

import (
	"golangweb/entity"
	"html/template"
	"log"
	"net/http"
	"path"
	"strconv"
)

func MyHandler(w http.ResponseWriter, r *http.Request) {
	log.Printf(r.URL.Path)

	if r.URL.Path != "/" {
		http.NotFound(w, r)
		return
	}

	// w.Write([]byte("Welcome to my website"))

	tmpl, err := template.ParseFiles(path.Join("views", "index.html"), path.Join("views", "layout.html"))

	// data := map[string]interface{}{
	// 	"title":   "I'm learning Golang Web",
	// 	"content": "I'm learning Golang Web with my self",
	// }

	// data := entity.Product{
	// 	ID:    1,
	// 	Name:  "Mobil",
	// 	Price: 22000000,
	// 	Stock: 3,
	// }

	data := []entity.Product{
		{
			ID:    1,
			Name:  "Mobile",
			Price: 22000000,
			Stock: 13,
		},
		{
			ID:    2,
			Name:  "Xpandder",
			Price: 42000000,
			Stock: 8,
		},
		{
			ID:    3,
			Name:  "Pajero",
			Price: 52000000,
			Stock: 1,
		},
	}

	if err != nil {
		// http.Error(w, err.Error(), http.StatusInternalServerError)
		log.Println(err)
		http.Error(w, "Error is happening, keep calm", http.StatusInternalServerError)
		return
	}

	err = tmpl.Execute(w, data)
	if err != nil {
		log.Println(err)
		http.Error(w, "Error is happening, keep calm", http.StatusInternalServerError)
		return
	} else {
		log.Println("berhasil")
	}

}

func HelloHandler(w http.ResponseWriter, r *http.Request) {
	w.Write([]byte("Halo dunia, saya sedang belajar Golang"))
}

func MarioHandler(w http.ResponseWriter, r *http.Request) {
	w.Write([]byte("Mario Bross from nitendo"))
}

func ProductHandler(w http.ResponseWriter, r *http.Request) {
	id := r.URL.Query().Get("id")

	idNumb, err := strconv.Atoi(id)

	if err != nil || idNumb < 1 {
		http.NotFound(w, r)
		return
	}

	// w.Write([]byte("product page"))

	// fmt.Fprintf(w, "Product page : %d", idNumb)
	tmpl, err := template.ParseFiles(path.Join("views", "product.html"), path.Join("views", "layout.html"))

	data := map[string]interface{}{
		"content": idNumb,
	}

	if err != nil {
		// http.Error(w, err.Error(), http.StatusInternalServerError)
		log.Println(err)
		http.Error(w, "Error is happening, keep calm", http.StatusInternalServerError)
		return
	}

	err = tmpl.Execute(w, data)
	if err != nil {
		log.Println(err)
		http.Error(w, "Error is happening, keep calm", http.StatusInternalServerError)
		return
	} else {
		log.Println("berhasil")
	}
}
