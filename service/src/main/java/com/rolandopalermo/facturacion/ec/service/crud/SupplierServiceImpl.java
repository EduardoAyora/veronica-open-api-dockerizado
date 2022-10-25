package com.rolandopalermo.facturacion.ec.service.crud;

import com.rolandopalermo.facturacion.ec.domain.Supplier;
import com.rolandopalermo.facturacion.ec.dto.EmpresaDTO;
import com.rolandopalermo.facturacion.ec.persistence.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("supplierServiceImpl")
public class SupplierServiceImpl extends GenericCRUDServiceImpl<Supplier, EmpresaDTO> {

    @Autowired
    private SupplierRepository domainRepository;

    @Override
    public Supplier mapTo(EmpresaDTO empresaDTO) {
        Supplier supplier = new Supplier();
        supplier.setBusinessName(empresaDTO.getRazonSocial());
        supplier.setIdNumber(empresaDTO.getRucPropietario());
        supplier.setLogo(empresaDTO.getLogo());
        supplier.setDeleted(false);
        return supplier;
    }

    @Override
    public Optional<Supplier> findExisting(EmpresaDTO domainObject) {
        return domainRepository.findByIdNumber(domainObject.getRucPropietario());
    }

    @Override
    public EmpresaDTO build(Supplier domainObject) {
        EmpresaDTO dto = new EmpresaDTO();
        dto.setLogo(domainObject.getLogo());
        dto.setRucPropietario(domainObject.getIdNumber());
        dto.setRazonSocial(domainObject.getBusinessName());
        return dto;
    }

}