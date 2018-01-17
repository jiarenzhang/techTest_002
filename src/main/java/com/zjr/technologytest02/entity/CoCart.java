package com.zjr.technologytest02.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import com.zjr.technologytest02.base.SuperEntity;

/**
 * <p>
 * 购物车
 * </p>
 *
 * @author Generator
 * @since 2018-01-17
 */
@TableName("co_cart")
public class CoCart extends SuperEntity<CoCart> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID(购物车ID)
     */
	@TableId(value="cart_id", type= IdType.AUTO)
	private Long cartId;
    /**
     * 用户id
     */
	@TableField("cust_id")
	private String custId;
    /**
     * 市场id
     */
	@TableField("market_id")
	private Long marketId;
    /**
     * 标志
     */
	private String flag;
    /**
     * 状态
     */
	private Integer status;
    /**
     * 类型
     */
	private Integer types;
    /**
     * 创建人
     */
	private String creator;
    /**
     * 创建时间
     */
	@TableField("created_at")
	private Date createdAt;
    /**
     * 最后更新时间
     */
	@TableField("last_update_time")
	private Date lastUpdateTime;
    /**
     * 最后更新人id
     */
	@TableField("last_updator_id")
	private String lastUpdatorId;
    /**
     * 最后更新人名称
     */
	@TableField("last_updator_name")
	private String lastUpdatorName;
    /**
     * 是否已删除
     */
	@TableField("is_delete")
	private Integer isDelete;
    /**
     * versionid
     */
	private Integer versionid;


	public Long getCartId() {
		return cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTypes() {
		return types;
	}

	public void setTypes(Integer types) {
		this.types = types;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getLastUpdatorId() {
		return lastUpdatorId;
	}

	public void setLastUpdatorId(String lastUpdatorId) {
		this.lastUpdatorId = lastUpdatorId;
	}

	public String getLastUpdatorName() {
		return lastUpdatorName;
	}

	public void setLastUpdatorName(String lastUpdatorName) {
		this.lastUpdatorName = lastUpdatorName;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getVersionid() {
		return versionid;
	}

	public void setVersionid(Integer versionid) {
		this.versionid = versionid;
	}

	@Override
	protected Serializable pkVal() {
		return this.cartId;
	}

	@Override
	public String toString() {
		return "CoCart{" +
			", cartId=" + cartId +
			", custId=" + custId +
			", marketId=" + marketId +
			", flag=" + flag +
			", status=" + status +
			", types=" + types +
			", creator=" + creator +
			", createdAt=" + createdAt +
			", lastUpdateTime=" + lastUpdateTime +
			", lastUpdatorId=" + lastUpdatorId +
			", lastUpdatorName=" + lastUpdatorName +
			", isDelete=" + isDelete +
			", versionid=" + versionid +
			"}";
	}
}
