package com.geisonbruno.demo.resource;

import com.geisonbruno.demo.dto.OrderDTO;
import com.geisonbruno.demo.entities.Order;
import com.geisonbruno.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    private final OrderService service;

    //  Injeção via construtor
    @Autowired
    public OrderResource(OrderService service) {
        this.service = service;
    }

    // Método para buscar todos os pedidos
    @GetMapping
    public ResponseEntity<List<OrderDTO>> findAll() {
        List<Order> list = service.findAll();

        List<OrderDTO> dtoList = list.stream()
                .map(OrderDTO::new).toList();

        return ResponseEntity.ok().body(dtoList);
    }

    // Método para buscar um pedido por ID
    @GetMapping("/{id}")
    public ResponseEntity<OrderDTO> findById(@PathVariable Long id) {
        Order order = service.findById(id);
        OrderDTO dto = new OrderDTO(order);
        return ResponseEntity.ok().body(dto);
    }
}
