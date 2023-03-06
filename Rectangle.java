package GameEx_Final;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
/**
 * This class represents a 2D axis parallel rectangle.
 * Ex4: you should implement this class!
 * @author elay levi
 *
 */
public class Rectangle implements GeoShape {

	int x=0, y=0, dx=0, dy=0, red=0, green=0, blue=0;
	int width=0, height=0;
	static int wid,he;
	private int radius;

	/*
	 * Please, do not change this function!
	 *
	 */
	public Rectangle(int x,int y,int width,int height,int red,int green,int blue) {
		this.x=x;
		this.y=y;
		this.width=width;
		wid=width;
		this.height=height;
		he=height;
		this.red=red;
		this.green=green;
		this.blue=blue;
	}
	public void draw(Graphics g, Component c) {
		g.setColor(new Color(getRed(), getGreen(), getBlue()));
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.setColor(new Color(0, 0, 0));
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}

	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	@Override
	public void translateX() {
		// TODO Auto-generated method stub
		x+=dx;
	}

	@Override
	public void translateY() {
		// TODO Auto-generated method stub
		y+=dy;
	}

	@Override
	public void setColor(int r, int g, int b) {
		// TODO Auto-generated method stub
		red=r;
		green=g;
		blue=b;
	}

	@Override
	public boolean intersects(GeoShape g) {
		// TODO Auto-generated method stub

		int rx = g.getX()+g.getDx();
		int lx = g.getX()-g.getDx();
		int dwy= g.getY()-g.getDy();
		int uwy= g.getY()+g.getDy();

		int x1= this.x+width;


		if( (this.x == rx && rx == x1) || (this.x == lx && lx == x1) ) {
			return true;
		}
		else if(dwy== this.y || uwy== this.y ) {
			return true;
		}
		return false;
	}

	@Override
	public int getDx() {
		// TODO Auto-generated method stub
		return dx;
	}

	@Override
	public void setDx(int dx) {
		// TODO Auto-generated method stub
		this.dx=dx;
	}

	@Override
	public int getDy() {
		// TODO Auto-generated method stub
		return dy;
	}

	@Override
	public void setDy(int dy) {
		// TODO Auto-generated method stub
		this.dy=dy;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		this.x=x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		this.y=y;
	}

	@Override
	public int getRed() {
		// TODO Auto-generated method stub
		return red;
	}

	@Override
	public int getGreen() {
		// TODO Auto-generated method stub
		return green;
	}

	@Override
	public int getBlue() {
		// TODO Auto-generated method stub
		return blue;
	}
}
