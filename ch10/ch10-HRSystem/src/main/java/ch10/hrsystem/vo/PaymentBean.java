package ch10.hrsystem.vo;

import java.io.Serializable;

/**
 * Description: <br/>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a> <br/>
 * Copyright (C), 2001-2016, Yeeku.H.Lee <br/>
 * This program is protected by copyright laws. <br/>
 * Program Name: <br/>
 * Date:
 * 
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class PaymentBean implements Serializable {
	private static final long serialVersionUID = -9085504273550624640L;
	
	private String payMonth;
	private double amount;

	// 无参数的构造器
	public PaymentBean() {
	}

	// 初始化全部成员变量的构造器
	public PaymentBean(String payMonth, double amount) {
		this.payMonth = payMonth;
		this.amount = amount;
	}

	// payMonth的setter和getter方法
	public void setPayMonth(String payMonth) {
		this.payMonth = payMonth;
	}

	public String getPayMonth() {
		return this.payMonth;
	}

	// amount的setter和getter方法
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}

}