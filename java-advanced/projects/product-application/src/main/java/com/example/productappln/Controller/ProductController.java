package com.example.productappln.Controller;

import com.example.productappln.Model.Product;
import com.example.productappln.Service.ProductService;
import com.example.productappln.exceptions.ProductNotFoundException;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/list")
    public String viewProducts(Model model) {
        model.addAttribute("products", service.getAllProducts());
        return "product-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "product-form";
    }

    @PostMapping("/save")
    public String saveProduct(@Valid @ModelAttribute("product") Product product, BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "product-form";
        }
        service.addProduct(product);
        status.setComplete();
        return "redirect:/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Product product = service.getProductById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found"));
        model.addAttribute("product", product);
        return "product-form";
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public String handleProductNotFound(ProductNotFoundException ex, Model model) {
        model.addAttribute("errorMessage", ex.getMessage());
        return "error-page";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return "redirect:/list";
    }
}
