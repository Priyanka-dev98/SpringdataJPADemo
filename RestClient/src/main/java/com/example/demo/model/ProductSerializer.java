package com.example.demo.model;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@Component
public class ProductSerializer extends JsonSerializer<Product> {
    @Override
    public void serialize(Product product, JsonGenerator generator, SerializerProvider serializers) throws IOException {
        generator.writeStartObject();
        generator.writeStringField("name", product.getName());
        generator.writeStringField("description", product.getDescription());
        generator.writeNumberField("stock_available", product.getStockAvailable());
        generator.writeNumberField("price", product.getPrice());
        generator.writeEndObject();
    }
}