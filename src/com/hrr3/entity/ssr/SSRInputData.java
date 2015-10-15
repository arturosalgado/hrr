package com.hrr3.entity.ssr;

import java.math.BigDecimal;

public class SSRInputData extends ImportSSRData{
	
	private int isException;		
	private int isActual;
	private BigDecimal occpcnt;
	private BigDecimal totOcc;
	private String lrr;	
	private String oversellFactor;
	private BigDecimal rotbTrans;
	private BigDecimal rotbGroup;
	private BigDecimal grpPickedup;
	private BigDecimal grpRmsRem;
	private BigDecimal rotbCont;
	private BigDecimal grpDemandtd;
	private BigDecimal grpPricetd;
	private BigDecimal seasonalmarrate;
	private String marrate;
	
	
	public SSRInputData() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the isException
	 */
	public int getIsException() {
		return isException;
	}


	/**
	 * @param isException the isException to set
	 */
	public void setIsException(int isException) {
		this.isException = isException;
	}


	/**
	 * @return the isActual
	 */
	public int getIsActual() {
		return isActual;
	}


	/**
	 * @param isActual the isActual to set
	 */
	public void setIsActual(int isActual) {
		this.isActual = isActual;
	}


	/**
	 * @return the occpcnt
	 */
	public BigDecimal getOccpcnt() {
		return occpcnt;
	}


	/**
	 * @param occpcnt the occpcnt to set
	 */
	public void setOccpcnt(BigDecimal occpcnt) {
		this.occpcnt = occpcnt;
	}


	/**
	 * @return the totOcc
	 */
	public BigDecimal getTotOcc() {
		return totOcc;
	}


	/**
	 * @param totOcc the totOcc to set
	 */
	public void setTotOcc(BigDecimal totOcc) {
		this.totOcc = totOcc;
	}


	/**
	 * @return the lrr
	 */
	public String getLrr() {
		return lrr;
	}


	/**
	 * @param lrr the lrr to set
	 */
	public void setLrr(String lrr) {
		this.lrr = lrr;
	}


	/**
	 * @return the oversellFactor
	 */
	public String getOversellFactor() {
		return oversellFactor;
	}


	/**
	 * @param oversellFactor the oversellFactor to set
	 */
	public void setOversellFactor(String oversellFactor) {
		this.oversellFactor = oversellFactor;
	}


	/**
	 * @return the rotbTrans
	 */
	public BigDecimal getRotbTrans() {
		return rotbTrans;
	}


	/**
	 * @param rotbTrans the rotbTrans to set
	 */
	public void setRotbTrans(BigDecimal rotbTrans) {
		this.rotbTrans = rotbTrans;
	}


	/**
	 * @return the rotbGroup
	 */
	public BigDecimal getRotbGroup() {
		return rotbGroup;
	}


	/**
	 * @param rotbGroup the rotbGroup to set
	 */
	public void setRotbGroup(BigDecimal rotbGroup) {
		this.rotbGroup = rotbGroup;
	}


	/**
	 * @return the grpPickedup
	 */
	public BigDecimal getGrpPickedup() {
		return grpPickedup;
	}


	/**
	 * @param grpPickedup the grpPickedup to set
	 */
	public void setGrpPickedup(BigDecimal grpPickedup) {
		this.grpPickedup = grpPickedup;
	}


	/**
	 * @return the grpRmsRem
	 */
	public BigDecimal getGrpRmsRem() {
		return grpRmsRem;
	}


	/**
	 * @param grpRmsRem the grpRmsRem to set
	 */
	public void setGrpRmsRem(BigDecimal grpRmsRem) {
		this.grpRmsRem = grpRmsRem;
	}


	/**
	 * @return the rotbCont
	 */
	public BigDecimal getRotbCont() {
		return rotbCont;
	}


	/**
	 * @param rotbCont the rotbCont to set
	 */
	public void setRotbCont(BigDecimal rotbCont) {
		this.rotbCont = rotbCont;
	}


	/**
	 * @return the grpDemandtd
	 */
	public BigDecimal getGrpDemandtd() {
		return grpDemandtd;
	}


	/**
	 * @param grpDemandtd the grpDemandtd to set
	 */
	public void setGrpDemandtd(BigDecimal grpDemandtd) {
		this.grpDemandtd = grpDemandtd;
	}


	/**
	 * @return the grpPricetd
	 */
	public BigDecimal getGrpPricetd() {
		return grpPricetd;
	}


	/**
	 * @param grpPricetd the grpPricetd to set
	 */
	public void setGrpPricetd(BigDecimal grpPricetd) {
		this.grpPricetd = grpPricetd;
	}


	/**
	 * @return the seasonalmarrate
	 */
	public BigDecimal getSeasonalmarrate() {
		return seasonalmarrate;
	}


	/**
	 * @param seasonalmarrate the seasonalmarrate to set
	 */
	public void setSeasonalmarrate(BigDecimal seasonalmarrate) {
		this.seasonalmarrate = seasonalmarrate;
	}


	/**
	 * @return the marrate
	 */
	public String getMarrate() {
		return marrate;
	}


	/**
	 * @param marrate the marrate to set
	 */
	public void setMarrate(String marrate) {
		this.marrate = marrate;
	}


	@Override
	public String toString() {
		return "SSRInputData [isException=" + isException + ", isActual=" + isActual + ", occpcnt=" + occpcnt
				+ ", totOcc=" + totOcc + ", lrr=" + lrr + ", oversellFactor=" + oversellFactor + ", rotbTrans="
				+ rotbTrans + ", rotbGroup=" + rotbGroup + ", grpPickedup=" + grpPickedup + ", grpRmsRem=" + grpRmsRem
				+ ", rotbCont=" + rotbCont + ", grpDemandtd=" + grpDemandtd + ", grpPricetd=" + grpPricetd
				+ ", seasonalmarrate=" + seasonalmarrate + ", marrate=" + marrate + "]";
	}


	
}
