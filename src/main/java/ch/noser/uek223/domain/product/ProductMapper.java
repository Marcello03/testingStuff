package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.ProductSupplierDto;
import ch.noser.uek223.domain.product.dto.ProductCustomerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductCustomerDto productToProductCustomerDto(Product product);
    Product productCustomerDtoToProduct(ProductCustomerDto productCustomerDto);
    ProductSupplierDto productToProductSupplierDto(Product product);
    Product productSupplierDtoToProduct(ProductSupplierDto productSupplierDto);

}
