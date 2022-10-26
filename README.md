## Ejemplo de json para factura

```
{
   "id":"comprobante",
   "version":"1.0.0",
   "infoTributaria":{
      "ambiente":"1",
      "tipoEmision":"1",
      "razonSocial":"Alvarado Tintin Edhisson Daniel",
      "nombreComercial":"Alvarado Tintin Edhisson Daniel",
      "ruc":"0705481174001",
      "codDoc":"01",
      "estab":"001",
      "ptoEmi":"001",
      "secuencial":"000000404",
      "dirMatriz":"Enrique Guerrero Portilla OE1-34 AV. Galo Plaza Lasso"
   },
   "infoFactura":{
      "fechaEmision":"25/10/2022",
      "dirEstablecimiento":"Sebastian Moreno S/N Francisco Garcia",
      "obligadoContabilidad":"NO",
      "tipoIdentificacionComprador":"04",
      "razonSocialComprador":"PRUEBAS SERVICIO DE RENTAS INTERNAS",
      "identificacionComprador":"1713328506001",
      "direccionComprador":"salinas y santiago",
      "totalSinImpuestos":27.86,
      "totalDescuento":0.00,
      "totalImpuesto":[
         {
         	"codigo":"2",
         	"codigoPorcentaje":"2",
            "baseImponible":27.86,
            "valor":3.34
         }
      ],
      "propina":0,
      "importeTotal":31.20,
      "moneda":"DOLAR",
      "pagos":[
         {
            "formaPago":"01",
            "total":31.20
         }
      ]
   },
   "detalle":[
      {
         "codigoPrincipal":"125BJC-01",
         "codigoAuxiliar":"1234D56789-A",
         "descripcion":"servicios",
         "cantidad":1.00,
         "precioUnitario":10.00,
         "descuento":0.00,
         "precioTotalSinImpuesto":10.00,
         "impuesto":[
            {
               "codigo":"2",
               "codigoPorcentaje":"2",
               "tarifa":12.00,
               "baseImponible":10.00,
               "valor":1.20
            }
         ]
      },
      {
         "codigoPrincipal":"125BJC-02",
         "codigoAuxiliar":"1234D56789-B",
         "descripcion":"servicios 2",
         "cantidad":1.00,
         "precioUnitario":17.86,
         "descuento":0.00,
         "precioTotalSinImpuesto":17.86,
         "impuesto":[
            {
               "codigo":"2",
               "codigoPorcentaje":"2",
               "tarifa":12.00,
               "baseImponible":17.86,
               "valor":2.14
            }
         ]
      }
   ],
   "campoAdicional":[
      {
         "nombre":"Codigo Impuesto ISD",
         "value":"4580"
      },
      {
         "nombre":"Impuesto ISD",
         "value":"15.42x"
      }
   ]
}
```