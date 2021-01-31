package com.Durgesh.SpringExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+11}")
	private int x;
	
	@Value("#{12-43+4*32}")
	private int y;
	
	@Value("#{8>6 ? 88:99 }")
	private int z;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double S;
	
	@Value("#{T(java.lang.Math).E}")
	private double E;
	
	@Value("#{T(java.lang.Math).PI}")
	private double PI;
	
	@Value("#{ new java.lang.String('Dipendra jaiswal')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getS() {
		return S;
	}

	public void setS(double s) {
		S = s;
	}

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", S=" + S + ", E=" + E + ", PI=" + PI + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}
	
    
	
	
	
}
