package com.rolandopalermo.facturacion.ec.service;

import com.rolandopalermo.facturacion.ec.domain.DigitalCert;
import com.rolandopalermo.facturacion.ec.service.custom_models.CertificadoDigitalCustomDTO;

import java.util.Optional;

public interface DigitalCertService {

    DigitalCert save(String supplierNumber, CertificadoDigitalCustomDTO dtoObject);

    Optional<DigitalCert> findExisting(String supplierNumber);

    CertificadoDigitalCustomDTO toDTO(DigitalCert domain);

    DigitalCert toEntity(String supplierNumber, CertificadoDigitalCustomDTO dto);

}