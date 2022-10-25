package com.rolandopalermo.facturacion.ec.service.custom_models;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@ApiModel(description = "Ficha Técnica de Comprobantes Electrónicos - Sección 6")
public class CertificadoDigitalCustomDTO implements Serializable {

    @NotEmpty
    @Size(max = 95)
    @ApiModelProperty(notes = "Contraseña del archivo de firma digital", required = true)
    private String password;

    @NotNull
    @ApiModelProperty(notes = "Archivo de firma PKCS#12 codificado en Base64", required = true)
    private byte[] certificado;

}
