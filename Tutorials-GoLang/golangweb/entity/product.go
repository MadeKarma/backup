package entity

type Product struct {
	ID    int
	Name  string
	Price int
	Stock int
}

// mengecek ketika stok hampir habis
func (p Product) StockStatus() string {
	var status string
	if p.Stock < 3 {
		status = "Stook hampir habis"
	} else if p.Stock < 10 {
		status = "Stock terbatas"
	}
	return status
}
