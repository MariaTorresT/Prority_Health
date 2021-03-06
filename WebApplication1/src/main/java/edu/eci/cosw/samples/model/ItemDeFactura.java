package edu.eci.cosw.samples.model;
// Generated 9/10/2015 03:08:07 PM by Hibernate Tools 4.3.1


import edu.eci.cosw.samples.model.Factura;
import edu.eci.cosw.samples.model.MedicamentoPorProveedor;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ItemsDeFactura generated by hbm2java
 */
@Entity
@Table(name="ItemsDeFactura"
    ,catalog="cosw2"
)
public class ItemDeFactura  implements java.io.Serializable {


     private int idItemsDeFactura;
     private Factura facturas;
     private MedicamentoPorProveedor medicamentosPorProveedor;
     private Integer cantidad;
     private BigDecimal precioUnitario;
     private BigDecimal iva;

    public ItemDeFactura() {
    }

	
    public ItemDeFactura(int idItemsDeFactura) {
        this.idItemsDeFactura = idItemsDeFactura;
    }
    public ItemDeFactura(int idItemsDeFactura, Factura facturas, MedicamentoPorProveedor medicamentosPorProveedor, Integer cantidad, BigDecimal precioUnitario, BigDecimal iva) {
       this.idItemsDeFactura = idItemsDeFactura;
       this.facturas = facturas;
       this.medicamentosPorProveedor = medicamentosPorProveedor;
       this.cantidad = cantidad;
       this.precioUnitario = precioUnitario;
       this.iva = iva;
    }
   
     @Id 

    
    @Column(name="idItemsDeFactura", unique=true, nullable=false)
    public int getIdItemsDeFactura() {
        return this.idItemsDeFactura;
    }
    
    public void setIdItemsDeFactura(int idItemsDeFactura) {
        this.idItemsDeFactura = idItemsDeFactura;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idFactura")
    public Factura getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Factura facturas) {
        this.facturas = facturas;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MedicamentosPorProveedor")
    public MedicamentoPorProveedor getMedicamentosPorProveedor() {
        return this.medicamentosPorProveedor;
    }
    
    public void setMedicamentosPorProveedor(MedicamentoPorProveedor medicamentosPorProveedor) {
        this.medicamentosPorProveedor = medicamentosPorProveedor;
    }

    
    @Column(name="cantidad")
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    @Column(name="precioUnitario", precision=10)
    public BigDecimal getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    
    @Column(name="iva", precision=10)
    public BigDecimal getIva() {
        return this.iva;
    }
    
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }




}


