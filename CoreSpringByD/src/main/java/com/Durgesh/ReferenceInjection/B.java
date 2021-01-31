package com.Durgesh.ReferenceInjection;

public class B {

	private int y;
    private int z;
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
	public B(int y, int z) {
		super();
		this.y = y;
		this.z = z;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "B [y=" + y + ", z=" + z + "]";
	}
    
    
	
}
