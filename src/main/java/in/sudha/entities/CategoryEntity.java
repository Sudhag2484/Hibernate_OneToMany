package in.sudha.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TBL_CATEGORY")
public class CategoryEntity {

	@Id
	@Column(name="c_id")
	private Integer cId;
	
	@Column(name="c_name")
	private String cName;
	
	@OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name="c_id_fk")
	private List<ProductEntity> lstOfProducts;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<ProductEntity> getLstOfProducts() {
		return lstOfProducts;
	}

	public void setLstOfProducts(List<ProductEntity> lstOfProducts) {
		this.lstOfProducts = lstOfProducts;
	}

	@Override
	public String toString() {
		return "CategoryEntity [cId=" + cId + ", cName=" + cName + ", lstOfProducts=" + lstOfProducts + "]";
	}
	
	
}
