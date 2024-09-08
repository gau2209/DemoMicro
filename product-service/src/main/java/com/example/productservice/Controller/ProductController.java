package com.example.productservice.Controller;

import com.example.productservice.Request.ProductRequest;
import com.example.productservice.Response.ProductResponse;
import com.example.productservice.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest product){
            productService.createProduct(product);
    }

    @GetMapping("/GetAllProd")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct(){
        return productService.getAllProduct();
    }

}
