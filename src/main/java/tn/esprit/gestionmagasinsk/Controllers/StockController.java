package tn.esprit.gestionmagasinsk.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionmagasinsk.Entities.Client;
import tn.esprit.gestionmagasinsk.Entities.Stock;
import tn.esprit.gestionmagasinsk.Services.IServiceStock;

import java.util.List;
@RestController
@RequestMapping("/stock")
public class StockController {
 @Autowired
    IServiceStock serviceStock;
    @GetMapping
    public List<Stock> GetAllStocks(){
        return serviceStock.retrieveAllStocks();
    }

    @PostMapping
    public Stock addStocks(@RequestBody Stock stock){
        return serviceStock.addStock(stock);
    }

    @PutMapping
    public Stock UpdateStock(@RequestBody Stock stock){
        return serviceStock.updateStock(stock);
    }
    @GetMapping("{idStock}")
    public Stock GetStock(@PathVariable Long idStock){
        return serviceStock.retrieveStock(idStock);
    }
    @GetMapping ("/ListProduits")
    public String retrieveStatusStock() {
        return serviceStock.retrieveStatusStock();
    }
    }
