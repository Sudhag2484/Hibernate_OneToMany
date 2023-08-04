package in.sudha.entities;


import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name="TBL_PRODUCT")
public class ProductEntity {

	@Id
	@Column(name="p_id")
	private Integer pId;
	
	@Column(name="p_name")
	private String pName;
	
	@Lob
	@Column(name="p_img")
	private byte[] productImgs;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public byte[] getProductImgs() {
		return productImgs;
	}

	public void setProductImgs(byte[] productImgs) {
		this.productImgs = productImgs;
	}

	@Override
	public String toString() {
		return "ProductEntity [pId=" + pId + ", pName=" + pName + ", productImgs=" + Arrays.toString(productImgs) + "]";
	}
	
	
}
