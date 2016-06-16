package com.gamaset.buscape.entity;

import com.gamaset.buscape.constants.DirectionConstants;

public class SubmarineEntity {

	private Integer axisX;
	private Integer axisY;
	private Integer axisZ;
	private DirectionConstants directionSubmarine;
	
	public SubmarineEntity() {

	}
	
	public SubmarineEntity(Integer axisX, Integer axisY, Integer axisZ, DirectionConstants directionSubmarine) {
		super();
		this.axisX = axisX;
		this.axisY = axisY;
		this.axisZ = axisZ;
		this.directionSubmarine = directionSubmarine;
	}

	public Integer getAxisX() {
		return axisX;
	}
	public void setAxisX(Integer axisX) {
		this.axisX = axisX;
	}
	public Integer getAxisY() {
		return axisY;
	}
	public void setAxisY(Integer axisY) {
		this.axisY = axisY;
	}
	public Integer getAxisZ() {
		return axisZ;
	}
	public void setAxisZ(Integer axisZ) {
		this.axisZ = axisZ;
	}
	
	public DirectionConstants getDirectionSubmarine() {
		return directionSubmarine;
	}
	public void setDirectionSubmarine(DirectionConstants directionSubmarine) {
		this.directionSubmarine = directionSubmarine;
	}
	
	@Override
	public String toString() {
		StringBuilder format = new StringBuilder();
		format.append("[").append(axisX).append(",").append(axisY).append(",").append(axisZ).append(",").append(directionSubmarine).append("]");
		return format.toString();
	}
}
